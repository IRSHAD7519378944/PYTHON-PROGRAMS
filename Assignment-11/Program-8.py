n=int(input("Enter value of N "))
s=0
while n!=0:
    s=s+n%10
    n=n//10
print("sum of digit is ",s)