from distutils.core import setup, Extension
from Cython.Build import cythonize

ext = Extension(name="wrapper_cfib", sources=["fib.pyx", "cfib.c"])
setup(ext_modules=cythonize(ext))