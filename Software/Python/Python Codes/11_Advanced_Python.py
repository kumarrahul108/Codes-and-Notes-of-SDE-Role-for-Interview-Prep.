## Advanced Python 


# Exception Handling 

try:
    a = int(input("Enter any Number :  ")) 
    c = 1/a
    print(c) 
    
except Exception as e:
    print("Exception Occured !!")
    print(e) 
    
else:
    print("We are Successful !!")           
    
 
    
# Custom EXception 

def increment(num):
    try:
        return int(num) + 1 
    except :
        raise ValueError("Not Good Dear !!") 
    
    

# Enumeratie Function 

print("\nENumeratie Function : \n") 
list1 = [3,54,3,False,8.98,"Aryan"]

print("Index      Values") 
for index,item in enumerate(list1):
    print(index," --> ",item) 
    

    
# List Comprehension 

print("\nList Comprehension : \n") 
a = [2,5,7,89,46,22,678,56]

b = [i for i in a if i % 2 == 0]
print(b) 



# Lambda Function 

print("\nLambda Function : \n") 
'''
    def func(a):
        return a + 5
        
'''    

func = lambda a:a+5

x = 555
print(func(x)) 



# Join Method 

print("\nJoin Method : \n") 

list = ["Camera","Laptop","iPhone","iPad","Hard-Disk"]                 

for item in list:
    print(item," , ",end="") 
    
print("\n\n")     

sentence = " <--> ".join(list) 
print(sentence) 


# Map Method 

print("\nMap Method :  \n") 

def square(num):
    return num * num 

l1 = [1,2,3,4,5]

print(l1) 

print(list(map(square,l1)))