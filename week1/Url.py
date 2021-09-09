import requests
from bs4 import BeautifulSoup


def get_urls():
    response = requests.get('https://www.baidu.com')
    s = BeautifulSoup(response.content, 'html.parser')
    urls = []
    for url in s.find_all('a'):
        urls.append(url['href'])
    print(urls)


if __name__ == '__main__':
    get_urls()
