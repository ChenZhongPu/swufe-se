import requests
from bs4 import BeautifulSoup

@profile
def get_urls():
    response = requests.get('http://www.swufe.edu.cn/')
    s = BeautifulSoup(response.content, 'html.parser')
    urls = []
    for url in s.find_all('a'):
        urls.append(url['href'])


if __name__ == '__main__':
    get_urls()
