year=int(input("Enter an year "))
if year%100==0:
    if year%400==0:
        print("Leap year")
    else:
        print("Non leap year")
else :
    if year%4==0:
         print("Leap year")
    else:
        print("Non leap year")