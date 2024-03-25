import sys

n = sys.stdin.readline().strip()
tree = []
max_weight = 0

for i in range(int(n) - 1):
    input_list = list(map(int, sys.stdin.readline().strip().split()))
    tree.append(input_list)

""""# leaf node
leaf_node = []
last_parent_node = int(n) - tree[-1][0]

for j in range(last_parent_node - 1, int(n) - 1):
    leaf_node.append(tree[j])

first_parent = leaf_node[0][0]
last_parent = leaf_node[-1][0]
parent_node_count = last_parent - first_parent + 1

for k in range(parent_node_count):
    if leaf_node[k][0] == leaf_node[k + 1][0]:
        weight = leaf_node[0][2] if leaf_node[0][2] > leaf_node[1][2] else leaf_node[1][2]
    else:
        weight = leaf_node[k][2]"""

# def weight_node(tree, max_weight):