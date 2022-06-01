from numpy import linalg as LA


# return the smallest eig value
def compute_eig(A):
    w = LA.eigvals(A)
    return w.min()
