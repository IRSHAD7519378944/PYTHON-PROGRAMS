a=int(input("Enter 1st number "))
b=int(input("Enter 2nd number "))
min=a if a<b else b
i=min
while i>=1:
    if a%i==0 and b%i==0:
        break
    i-=1
if i==1:
    print("co-Prime")
else:
    print("Not co-Prime")