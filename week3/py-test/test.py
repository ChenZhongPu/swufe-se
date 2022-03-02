import unittest
from unittest import main
from characters import count_vowels, count_vowels2

class Test(unittest.TestCase):
    def test_count_vowels(self):
        self.assertEqual(count_vowels('apple'), 2)
    
    def test_count_vowles2(self):
        self.assertEqual(count_vowels2('China'), 2)

if __name__ == '__main__':
    unittest.main()