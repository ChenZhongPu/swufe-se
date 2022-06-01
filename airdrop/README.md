> 软件是编写是个妥协的过程。

由于文件的发送比较简单且直接（无论是单独客户端或者基于 Web），本文仅讨论 Clipboard。

## 理想方案

编写独立的服务端、客户端，这样的自由度是最大的。

由于需求是考虑手机到电脑的文本/文件共享，手机上开发独立应用（iOS、Android）即可。客户端的关键逻辑：

- 读取系统 clipboard 的文本内容
- 手动（点击按钮）或自动（监听事件）发送文本

服务端的关键逻辑：

- 读取来自网络的文本数据
- 将文本数据写入系统的 clipboard

但是这需要客户端编程技能，部分同学可能不具备；因此可以考虑下面的方案。

## 基于 Web 的方案

简单的说，通过网页取代原生客户端，通过异步的方法发送请求。优点是简单，缺点是受限于浏览器的功能。以读取[clipboard](https://developer.mozilla.org/en-US/docs/Mozilla/Add-ons/WebExtensions/Interact_with_the_clipboard)文本内容为例，其中一种方法是：

```js
const text = await navigator.clipboard.readText();
```

但是上述 API 的限制很大，不同浏览器的支持情况有所差异。以 Chrome 为例，除了用于调试的`localhost`之外，它只能支持在 https 协议下使用该 API。

（为了实现本地环境的签名，可以使用`keytool`或者`ssl`等工具。但该方法又要求客户端安装证书，这无疑对用户非常不友好。）

回到 JavaScript 对复制粘贴事件的支持问题，你可能想到可以使用更古老的 API：

```js
document.execCommand("paste");
```

当然，它是同步的，性能差；更不幸的是，它也被很多浏览器[废弃了](https://stackoverflow.com/questions/6969403/)。

因此，基本可以确定：局域网内采用基于 Web 的方案和 JavaScript 读取 Clipboard 两条技术路线是冲突的。于是新的方案可以妥协成：**手动粘贴内容，再点击按钮发送**。

## 基于 Web 的方案（2）

通过上面的分析，我们发现上述方案困扰我们的是*JavaScript 读取 Clipboard*，那么能否有效地规避这个呢？答案是：只要有可用的`https`即可。

其中一种方案是，将电脑和手机同时作为不同的客户端，设计一个第三方服务器作为云 Clipboard，部署在公网（有 https 支持）。为了简单，我实现了一个**仅针对单用户**的 copy-paste 的[网站](https://zp-spring.azurewebsites.net/)，部署在 Azure 上。如果需要支持多个用户，可以考虑加入 token 的验证，使用 Map 或者内存数据库等记录。

### 使用方法

- 机器 A 在复制了某些文本内容，点击“粘贴”按钮。
- 机器 B 点击“复制”按钮，即可得到文本内容。

**第一次使用时浏览器会询问 Clipboard 使用权限**，同意即可。