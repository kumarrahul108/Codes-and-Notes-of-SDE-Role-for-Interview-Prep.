
# Comments --> Single Line Comments 

'''
    Multiple Line Comments
''' 

a = "Rahul Kumar"

b = 67.89
                 
c = None 
d = True

print(a,b,c,d) 

print(type(b))

a1 = 67
a2 = 89.67

print("Sum of a1 & a2 :  ", a1 + a2)  # it will add a1 & a2 


## Type-Casting 

b1 = "768799"
print(b)
print(type(b))

b1 = int(b1) 
print(type(b1)) 
print(b1 + 78)

c1 = int(input("\nEnter any Number  "))
print(type(c1)) 

c2 = (input("\nEnter any Number  "))
print(type(c2)) 

print(a, " \n ", b)


## Strings 

name = "My name is kHan !!" 
print(name) 

n1 = 'Rohan'
n2 = ''' Ram and shyam ''' 

print(name[3])  # --> 3rd Index 
print(name[1:7])  # --> 1 to 6 Index 

print(name[0::3])  

story = "once upon a time there was a good coder who explored good new techniques !!" 

print(story)  

print("\nLength of the String :  ",len(story))

print("Checking the Conditions :  ", story.endswith("java")) 

print(story.capitalize())
print(story.find("Rahul"))     