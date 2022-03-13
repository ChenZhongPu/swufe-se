import re
import time


def grep(pattern, file):
    with open(file, 'r') as f:
        for idx, line in enumerate(f.readlines()):
            pattern = re.compile(pattern)
            match = pattern.search(line)
            if match is not None:
                print("{}: {}".format(idx, line), end="")


# test: to find import
if __name__ == '__main__':
    start = time.time()
    for i in range(10000):
        grep('^import', 'main.py')
    print("total time is: {}".format(time.time() - start))