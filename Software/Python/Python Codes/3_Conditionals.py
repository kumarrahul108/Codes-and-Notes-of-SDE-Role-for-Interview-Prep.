
# Conditonals Statements 

a = 56

if(a > 80):
    print("Larger Number")
elif(a <= 80 and a >=60):
    print("Medium Number") 
else:
    print("Smaller Number") 
    
    
b = [5,8,9,12,45,67,89] 
print(b)
print(12 in b)  # -> checks whether 12 is presen in list b or not 

c = None 
if(c is None):
    print("True")
else:
    print("False") 

    
print("\n") 

names = ['mohan','sohan','geeta','tarun']
print("Names : " , names) 

name = input("\nENter name to be cheacked :  ")

if(name in names):
    print("True")
else:
    print("False")       
    