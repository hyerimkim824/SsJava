#this quetion is the number3 question for coding test book

#make list
a1 = [2,1,3,4,1]
a2 = [5,0,2,7]

def plusftn(x):
    y = []
    for i in range(len(x)):
        for j in range(i+1,len(x)):
            sum = x[i]+x[j]
            y.append(sum)
    return y

#make function for overlapped value of the list
def deleteArray(x):
    result = []
    for i in x:
        if i not in result:
           result.append(i)
           
    return result



#make function for arrangement
def arr(a):
    b=a
    for i in range(len(b)):
        for j in range(len(b)):
                x = b[i]
                y = b[j]
                if b[i]<b[j]:
                    b[i]=y
                    b[j]=x
    return b

#arangement

print(arr(deleteArray(plusftn(a1))))
print(arr(deleteArray(plusftn(a2))))