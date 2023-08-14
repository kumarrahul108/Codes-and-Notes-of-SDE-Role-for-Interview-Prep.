
## List in Python 

print("List in Python :  \n ")
a = [45,89.98,34,6,True,None,"rahul"]

print(a) 

print(a[1:3])  # --> index : 1 to 3 

b = [4,7,23,11,67.8,15]
print("\n",b)

b.sort()
print("\nSorted List :  ",b) 

b.sort()
b.reverse()
b.pop(3)       # --> remove element from 3rd index position 
b.remove(23)   # --> remove value from list 
b.append(99)   # --> add element to list at the end  
b.insert(3,89) #--> add elemnet to 3rd index of the list 

print("\nUpdated List :  ",b) 



## Tuples in Python 

print("\nTuples in Python :  ") 
t = (5,7,6,12,56,8,8,4,9) 
print(t) 

'''
        t1 = ()  -> empty tuple 
        t2 = (1,) -> tuple with 1 element
'''

print("Index of element 9 in tuple : ",t.index(9))  
print("Occurance of 8 in tuple  : ",t.count(8))  


        
## Dictionary in Python 

print("\n\nDictionary in Python  \n") 
d = {
        "A" : "Hi" ,
        "B" : "Hello" ,
        "C" : "Kaise ho Bhai ",
        "D" : "Everything is fine bro " 
} 

print(d) 

print("Values of key -> B :  ",d["B"]) 

print(type(d)) 

print("\nValues :  ",d.values()) # -> all the values of dictionary only 
print("\nDictionary : ",d.items())   # -> all dictonary i.e. key + value

new_d = {
            "Beautiful Girl" : "Intelligent",
            "Preety Girl"    : "Smart"
}

d.update(new_d)   # -> adding new dictionary to older one 

print("\nUpdated Dictionary :  " ,d)


## Sets in Python 

print("\nSets in Python  \n") 

s = {1,4,7,8,12}

print(s)
print("Data Type of s :  ",type(s)) 

b = set()   # -> empty set represenattion 
print(b) 
print(type(b))

print("Length of set : ",len(s))

s.pop()  # -> remove any random element from set 
print(s)

s.clear() # -> remove all element from the set 
print(s)

print("\n\n") 

## Note :

myDict = {
            "Pankha" : "Fan" ,
            "Dabba"  : "Box" ,
            "Vastu"  : "Item" 
} 

print(myDict)

print(myDict.keys())
print(myDict.values())

print("\n\n") 

favLang = {}  # empty dictionary
a = input("Enter for s-1   :  ")
b = input("Enter for s-2   :  ") 

favLang["s-1"] = a
favLang["s-2"] = b

print(favLang) 