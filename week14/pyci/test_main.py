from unittest import TestCase
import unittest
import numpy as np
from main import compute_eig


class Test(TestCase):
    def test_compute_eig(self):
        A = np.array([[3, -1], [-1, 3]])
        self.assertAlmostEqual(compute_eig(A), 3)


if __name__ == '__main__':
    unittest.main()
