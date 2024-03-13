input = input().split()
a=str(input[0])[::-1]
b=str(input[1])[::-1]
if a>b:
    print(a)
else:
    print(b)