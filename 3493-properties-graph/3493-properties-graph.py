class Solution:
    def numberOfComponents(self, properties: List[List[int]], k: int) -> int:
        from collections import defaultdict
        def intersect(a,b):
            return len(set(a)&set(b))
        n=len(properties)
        graph=defaultdict(list)
        for i in range(n):
            for j in range(i+1,n):
                if intersect(properties[i],properties[j])>=k:
                    graph[i].append(j)
                    graph[j].append(i)
        visited=set()
        def dfs(node):
            visited.add(node)
            for neighbor in graph[node]:
                if neighbor not in visited:
                    dfs(neighbor)
        connected_components=0
        for i in range(n):
            if i not in visited:
                connected_components+=1
                dfs(i)
        return connected_components