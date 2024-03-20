def solution(str):
    lst = set()
    prev = ''
    for c in str:
        if c not in lst:
            lst.add(c)
        elif(c in lst and prev==c):
            continue
        else:
            return 0
        prev = c

    return 1

n=int(input())
result =0
for i in range(n):
    str = input()
    if solution(str):
        result +=1
print(result)

