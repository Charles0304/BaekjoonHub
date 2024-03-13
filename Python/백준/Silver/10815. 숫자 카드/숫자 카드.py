data={}
n=input()
myList = map(int,input().split())
n=input()
cardList = map(int,input().split())
for m in myList:
    data[m]=1
for c in cardList:
    if c in data:
        print("1",end=" ")
    else:
        print("0",end=" ")