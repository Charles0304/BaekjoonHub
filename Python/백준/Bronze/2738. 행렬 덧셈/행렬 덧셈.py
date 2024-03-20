n,m = list(map(int,input().split()))
a=[]
b=[]

for i in range(n):
    a.append(list(map(int,input().split())))
for i in range(n):
    b.append(list(map(int,input().split())))

for i in range(len(a)):
    for j in range(len(a[0])):
        print(a[i][j]+b[i][j],end=" ")
    print()