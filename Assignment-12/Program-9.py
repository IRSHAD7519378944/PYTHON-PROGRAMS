a=int(input("Enter 1st number "))
b=int(input("Enter 2nd number "))
max=a if a>b else b
i=max
for i in range(i,a*b+1):
    if i%a==0 and i%b==0:
        break
print("LCM = ",i)