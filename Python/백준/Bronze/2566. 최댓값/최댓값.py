
a=[]
max=0
x=0
y=0

for i in range(9):
    a.append(list(map(int,input().split())))


for i in range(len(a)):
    for j in range(len(a[0])):
        if a[i][j]>=max:
            max=a[i][j]
            x=i+1
            y=j+1

print(max)
print(x,y)