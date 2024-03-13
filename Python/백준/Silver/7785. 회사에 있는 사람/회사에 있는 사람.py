n=int(input())
data = {}
answer =[]

for i in range(n):
    a,b=input().split()
    data[a]=b

for d in data:
    if data[d]=="enter":
        answer.append(d)

answer.sort(reverse=True)
for d in answer:
    print(d)
    