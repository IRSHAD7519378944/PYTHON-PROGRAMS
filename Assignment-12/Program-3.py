i=4
j=2
while i<=10:
    while j<i:
        if i%j==0:
            break
        j+=1
    if i==j:
        print(i,end=' ')
    i+=1
