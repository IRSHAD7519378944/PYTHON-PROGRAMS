a=float(input("Enter 1st number "))
b=float(input("Enter 2nd number "))
c=float(input("Enter 3rd number "))
max=0
if a>=b and a>=c:
    max=a
elif b>=c:
    max=b
else:
    max=c
print("Greatest number is ",max)
