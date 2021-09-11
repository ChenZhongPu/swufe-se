本周学习了面向对象设计的几个原则，包括“隔离变与不变”和“面向接口编程”。

# 本周作业
## 作业一（10分）
使用Python实现simDuck的策略模式。

## 作业二（10分）
用简洁的语言给不懂Java多线程的人解释下面的单例模式代码：

```java
public class Singleton {
    private volatile static Singleton uniqueInstance;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                uniqueInstance = new Singleton();
                }
            }
        }
    return uniqueInstance;
    }
}
```