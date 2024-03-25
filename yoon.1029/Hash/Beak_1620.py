import sys

n, m = map(int, sys.stdin.readline().split()) # 공백 문자로 구별

list = []
answer_list = []
for i in range(int(n)):
    poketmon = sys.stdin.readline().strip() # 앞뒤 공백 제거
    list.append(poketmon)

# print("\n{}".format(list))

for j in range(m): # 맞춰야 하는 문제의 수만큼 반복
    problem = sys.stdin.readline().strip()  # problem의 타입 = str

    for check in range(int(n)):
        if problem == list[check]:  # 입력받은 문제가 문자인 경우, problem은 1~26이지만 list는 0~25
            answer_list.append(check + 1)   # 리스트의 인덱스는 0부터 시작하지만 포켓몬 번호는 1부터 시작하기 때문에 1을 더한다.
        elif problem == str(check): # 입력받은 문제가 숫자인 경우
            answer_list.append(list[check - 1]) # 리스트의 인덱스는 0부터 시작하지만 포켓몬 번호는 1부터 시작하기 때문에 1을 뺀다.

#print("\n{}".format(answer_list))

for k in range(len(answer_list)):
    print(answer_list[k])

# 백준 제출했을 때 시간 초과 발생