n,m=input().split()

cnt = 0
data = {}
for i in range(int(n)):
    data[input()]=1
for i in range(int(m)):
    if input() in data:
        cnt = cnt+1

print(cnt)