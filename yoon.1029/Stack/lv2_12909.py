def solution(s):
    stack = []
    length = len(s)

    for i in range(length):
        stack.append(s[i])

    left_round = 0

    if stack[0] == ')':
        return False
    left_round += 1
    for j in range(1, length):
        if stack[j] == '(':
            left_round += 1
        else:
            left_round -= 1

        if left_round < 0:
            return False

    if left_round != 0:
        return False
    else:
        return True