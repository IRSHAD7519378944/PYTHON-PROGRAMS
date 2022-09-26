n=int(input("E#nter value of N "))
i=2
for i in range(i,n+1):
    if n%i==0:
        break
if i==n:
    print("Prime")
else:
    print("not prime")