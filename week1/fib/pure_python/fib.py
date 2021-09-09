def fib(n):
    """Return the n-th Fibonacci series."""
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
    return a