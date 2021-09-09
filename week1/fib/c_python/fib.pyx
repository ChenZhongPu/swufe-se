cdef extern from "cfib.h":
    long cfib(int n)

def fib_with_c(n):
    return cfib(n)