import sys
import heapq

n, m = map(int, sys.stdin.readline().split())

card_list = list(map(int, input().strip().split()))
sum = 0

"""
for i in range(m):
    card_list.sort()
    card_list[0] += card_list[1]
    card_list[1] = card_list[0]

for j in range(n):
    sum += card_list[j]

print(sum)
"""

heap = []
count = len(card_list)

for i in range(count):
    heapq.heappush(heap, card_list[i])

for j in range(m):
    new_node = heapq.heappop(heap)  # heapq.heappop(heap) : heap에서 가장 작은 원소를 pop & 리턴. 비어 있는 경우 IndexError가 호출됨.
    new_node += heapq.heappop(heap)
    heapq.heappush(heap, new_node)  # heapq.heappush(heap, item) : item을 heap에 추가
    heapq.heappush(heap, new_node)
    heapq.heapify(heap) # heapq.heapify(x) : 리스트 x를 즉각적으로 heap으로 변환함 (in linear time, O(N) )
    new_node = 0

for k in range(len(heap)):
    sum += heap[k]

print(sum)






