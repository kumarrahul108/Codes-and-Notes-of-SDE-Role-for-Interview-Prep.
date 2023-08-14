
# File Handling in Python 

print("\nContent of the File :  \n ") 

f = open('rk.txt','r')
data = f.read()
print(data)
f.close() 

print("\n") 

g = open('rk.txt')
d = g.read(10)  # -> 1st 10 character 
print(d) 
g.close() 

print("\nRead-Line Operation :  \n") 
h = open('rk.txt')
d1 = h.readline()  # -> 1 line at a time  
print(d1) 
d2 = h.readline() # -> 2nd lines at a time
print(d2) 
d3 = h.readline() 
print(d3)
h.close()


r = open('sample.txt','w')   # -> it will create this file if this file name doesn't exist here 
r.write("New File Creation ")
r.close() 

r = open('sample.txt','w') 
r.write("New File Hurrah !")  # -> it over-writes the content 
r.write("\nEnjoying my Coding !") 
r.close() 


print("\n") 

f = open('sample.txt') 
content = f.read()
print(content)
f.close() 


print("\nUsing with - Command :   ") 
        # -> No need to close the file manullay after its use 
with open('sample.txt', 'r') as f:
    data = f.read()
    print(data)
    

print("\nSensor Content  :   ") 

words =["donkey","dog","fool","kutta"]

with open("sensor.txt", "r") as f: 
    data = f.read()
    print(data)

for wd in words:
    data = data.replace(wd,"##$$**&&")
    with open("sensor.txt", "w") as f:
        f.write(data)
        
        
print("\n Tables :  ") 

i = 1
while(i <= 30):
    with open(f"Tables/Multiplication of {i}.txt", "w") as f:
        j = 1
        while(j <= 10):
            f.write(f"{i} X {j} = {i*j}") 
            if(j != 10):
                f.write("\n") 
            j += 1 
         
    i += 1                 