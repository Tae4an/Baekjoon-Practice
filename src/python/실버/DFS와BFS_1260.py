from collections import deque

def dfs(graph, start):
    visited = []
    stack = [start]
    
    while stack:
        node = stack.pop()
        if node not in visited:
            visited.append(node)
            # 정점 번호가 작은 것을 먼저 방문하도록 정렬
            stack.extend(sorted(graph[node], reverse=True))
    return visited

def bfs(graph, start):
    visited = []
    queue = deque([start])
    
    while queue:
        node = queue.popleft()
        if node not in visited:
            visited.append(node)
            # 정점 번호가 작은 것을 먼저 방문하도록 정렬
            queue.extend(sorted(graph[node]))
    return visited

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    M = int(data[1])
    V = int(data[2])
    
    edges = data[3:]
    
    graph = {i: [] for i in range(1, N + 1)}
    
    for i in range(M):
        u = int(edges[2 * i])
        v = int(edges[2 * i + 1])
        graph[u].append(v)
        graph[v].append(u)
    
    dfs_result = dfs(graph, V)
    bfs_result = bfs(graph, V)
    
    print(' '.join(map(str, dfs_result)))
    print(' '.join(map(str, bfs_result)))

if __name__ == "__main__":
    main()
