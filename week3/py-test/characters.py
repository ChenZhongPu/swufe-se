def count_vowels(s: str) -> int:
    cnt = 0
    for c in s.lower():
        if c in ['a', 'e', 'i', 'o', 'u']:
            cnt += 1
    return cnt

def count_vowels2(s: str) -> int:
    return len([c for c in s if c in ['a', 'e', 'i', 'o', 'u']])