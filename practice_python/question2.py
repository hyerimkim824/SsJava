#this quetion is the number2 question for coding test book

#declare list
a1 =[4,2,2,1,3,4]
a2 =[2,1,1,3,2,5,4]

#make function for overlapped value of the list
def deleteArray(x):
    i=0
    y=[]
    while i<len(x):
        #to search of overlapped value in the input list
        for j in range(i+1,len(x)):
            if x[i]==x[j]:
                y.append(x[i])
            if j==len(x)-1:
                break

        i+=1
    for k in y:
        #remove the value
        x.remove(k)
    return x

#make function for arrangement
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