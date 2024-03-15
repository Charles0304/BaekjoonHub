input = input()
input=input.upper()
sset=set(input)
answer = []
for c in sset:
    answer.append(input.count(c))
if answer.count(max(answer))>1:
    print("?")
else:
    print(list(sset)[answer.index(max(answer))])