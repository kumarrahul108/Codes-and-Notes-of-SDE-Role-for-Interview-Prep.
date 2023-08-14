
# Opps in Python 

 
# -> Railway Class  
                        
class RailwayForm:
    
    form = "Railway Jorney Ticket\n" 
    
    def displayDetails(self):
        print(f"Name   :   {self.name}")
        print(f"Train  :   {self.train}") 
        
   
rk = RailwayForm()   # --> object Instantiation 

rk.name = "Rahul Kumar" 
rk.train = "Poorva Express" 

print(rk.form) 
rk.displayDetails()        
 
 
 
#  --> Employee Class 

print("\n\nEmployee \n") 

class Employee:
    
    company = "Microsoft\n"   # -> class attribute  
    salary = 500
    
    @staticmethod   # --> self is no required 
    def greet():
        print("Good Morning !!\n") 
        

# Object Instantiation   
rahul = Employee()    
aryan = Employee()

rahul.greet()   # --> updating class attributes for rahul object 
print(rahul.company) 
print("Rahul Salary :  ",rahul.salary)
print("Aryan Salary : ",aryan.salary) 

rahul.salary = 700 
print("Updated Rahul's Salary : ",rahul.salary) 
print("Aryan Salary : ",aryan.salary)    


# --> Constructor 


print("\nUsing Constructor :  \n")  

class Railway :
    
    def __init__(self,name,train,platform,birth):
        self.name = name 
        self.train = train 
        self.platform = platform 
        self.birth = birth 
        
    @staticmethod
    def greet():
        print("** Welcome to the Inian Railways ** \n")    
        
    
    def printDetails(self):
        print(f"Name of the Passenger  :  {self.name}")    
        print(f"Name of the Train : {self.train}")
        print(f"Pltform Number : {self.platform}") 
        print(f"Seat Number : {self.birth}") 
        
        
tr1 = Railway("Rahul","Vikramshila","P-2","56") 
tr1 .greet() 
tr1.printDetails()    


print("\n\n")           

tr2 = Railway("Vikaram","Rajdhani","P-4","70")
tr2.greet() 
tr2.printDetails() 