#this quetion is the number2 question for coding test book

#declare list
a1 =[4,2,2,1,3,4]
a2 =[2,1,1,3,2,5,4]

def deleteArray(x):
    y=[]
    for i in range(len(x)):
        for j in range(len(x)):         
            if x[i]==x[j]:
                y.append(x[j])
                
    return y

def arr(a):
    b=a
    for i in range(len(b)):
        for j in range(len(b)):
                x = b[i]
                y = b[j]
                if b[i]>b[j]:
                    b[i]=y
                    b[j]=x
    return b

#arangement

print(arr(deleteArray(a1)))
print(arr(deleteArray(a2)))