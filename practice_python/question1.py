#this quetion is the number1 quetion for coding test book

a = [1,-5,2,4,3]

for i in range(len(a)):
    for j in range(len(a)):
        x = a[i]
        y = a[j]
        if a[i]<a[j]:
            a[i]=y
            a[j]=x
                        
print(a)