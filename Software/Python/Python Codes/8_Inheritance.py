
# Inheritance in Pythons  


# --> Single / Multi-Level Inheritance 

class Employee:
    
    company = "Microsoft"
    
    def print(self):
        print("This is an Employee !!") 
        
 
class Programmer(Employee):
    
    language = "Java" 
    
    def print(self):
        print("This is a Programmer !!") 
        
class Rahul(Programmer):
    
    brand = "Microsoft - Office" 
    
    
e = Employee()
p = Programmer()
r = Rahul()

print(p.company)
print(r.company)
print(r.brand)
print(p.language)  

r.print()  # -> just above wala if that function no present 
p.print()  # -> only that class function  
e.print() 

print("\n") 




# --> Multiple Inheritance                  


class Employee:
    company = "Visa"
    ecode = 152
    

class Freelancer:
    company = "Fibre"     
    level = 2
    
    def upgradeLevel(self): 
        self.level = self.level + 1
 
 
class  Program(Freelancer,Employee):  # -> 1st written class will priority first than 2nd wala written class in box for inheritance 
          
    name = "Rahul Kumar" 
    
  
pr = Program()  
print(pr.company)  

print("\n") 


 
# --> super keyword 


class Person:
    country = "India" 
    
    def takeBreath(self):
        print("I am person .. I am breathing........") 
        
   
class Employee(Person):
    company = "Microsoft"
    
    def getSalary(self):
        print(f"Salary is {self.salary}") 
        
    def takeBreath(self):
        super().takeBreath()
        print("I am Employee .. I am luckily breathing .....") 
        
    
p = Person()             
e = Employee() 
e.takeBreath()   
e.salary = 700

print("Employee Salary :  ",end="")
e.getSalary()
print("Employee Company :  ",e.company) 