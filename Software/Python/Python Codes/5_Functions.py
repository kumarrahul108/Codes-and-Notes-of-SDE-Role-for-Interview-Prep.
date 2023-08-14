
# Functions in Python 

def name(n):
    print("Hello ," + n) 

name("Rahul Aryan") 

print("\n") 
nm = input("Enter any Name :  ") 
name(nm) 


def conversion(n):
    return n * 2.25

print("Converted  Value :  ", conversion(3))

St = "    Rahul Kumar    "
print("Name after Stripping : ",St.strip())     
print("Name after Removing : " , St.replace("Kumar","Aryan")) 