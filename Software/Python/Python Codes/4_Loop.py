
# Loops in Python 

i = 1
while i<=5:
    print("Rahul Kumar") 
    # i++  -> wrong syntax
    i += 1 
    
print("\n") 

fruits = ['Banana','Mango','Guavava','Coconut','Litchi']
j = 0
while j < len(fruits):
    print(fruits[j])
    j += 1 
    
print("\n") 

fruits = ['Banana','Mango','Guavava','Coconut','Litchi']
for item in fruits:
    print(item)     
        

print("\n")         

for i in range(1,11,1):  # 1 to 10 with gap of 1 
    print(i) 
    
print("\n")     

for i in range(1,11):  # -> by default takes gap of 1 
    print(i)  
    
# Continue Statement
print("\n")

for i in range(1,11): 
    if(i == 5):
        continue 
    print(i) 
    
    
print("\nTables of 15 :  \n") 
for i in range(1,11):
    print(f"15 X {i} = {15 * i}") 
    

print("\n\n")     
l1 = ['Sachin','Vinay','Rohan','Geeta','Seeta'] 
for n in l1:
    if(n.startswith('S')):
        print("Hello , " + n) 
        
        
print("\nPrime Number Checking  :   ")         
num = int(input("Enter any Number :  ")) 
i = 2
p = True 
while (i < num):
    if(num % 2 == 0):
        p = False
        break 
    i += 1 
    
if(p == True):
    print(f" {num} is a Prime Number")
else:
    print(f" {num} is Not a Prime Number")
        
 
print("\n")  

print("\nMy Name is Rahul ",end="")  # -> to prevent going to next line after printing the statement  
print("Kumar") 