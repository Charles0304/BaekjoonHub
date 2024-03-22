
a=[]
max=0

for i in range(5):
    str = input()
    a.append(str)
    if max<len(str):
        max=len(str)

for i in range(max):
    for str in a:
        if(len(str)>i):
            print(str[i], end="")