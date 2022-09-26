n=int(input("Enter value of N "))
c=0
temp=n
while n!=0:
    n=n//10
    c+=1
print(temp," is ",c,"digit")