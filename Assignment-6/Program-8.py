a=float(input("Enter value of a "))
b=float(input("Enter value of b "))
c=float(input("Enter value of c "))
d=(b*b-4*a*c)
if d>=0:
    if d>0:
        print("two real & distinct roots")
    else:
        print("real & equal roots")
else:
    print("imaginary roots")