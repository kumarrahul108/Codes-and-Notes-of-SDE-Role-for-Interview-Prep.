
# Property Decorator in Python 


# Method - 1

class Employee1:
    
    company = "Microsoft"
    salary = 560
    location = "New Delhi" 
    
    def changeSalary(self,sal):    # --> only changes salary in object attribute  
        self.salary = sal 
        
        
# Object Instantiation         
e1 = Employee1() 

print("\nMethod - 1:  \n")         
print("Company : ",e1.company)  
print("Older Salary :  ",e1.salary)  
e1.changeSalary(780)
print("Updated salary  :  ",e1.salary) 
print("Employee class Salary : ",Employee1.salary)    # class attribute doesn't changes 




# Method - 2 

class Employee2:
    
    company = "Microsoft"
    salary = 400 
    location = "USA" 
    
    def changeSalary(self,sal):
        self.__class__.salary = sal   # -> changes both class attributes
        
        
e2 = Employee2() 
print("\n\nMethod - 2 :  \n") 
print("Company : ",e2.company) 
print("Location :  ",e2.location) 
print("Older Salary :  ",e2.salary)         
e2.changeSalary(1500)
print("Updated Salary :  ",e2.salary)
print("Employee Class Salary  :  ",Employee2.salary) 
        



# Method - 3  

class Employee3:
    
    company = "Microsft"
    salary = 900
    location = "Sydney, Australia"
    
    @classmethod
    def changeSalary(self,sal):
        self.salary = sal
        

e3 = Employee3()
print("\n\nMethod - 3 : \n")   
print("Company : ",e3.company) 
print("Location : ",e3.location) 
print("Older Salary :  ",e3.salary) 
e3.changeSalary = 2100
print("Updated Salary  : ",e3.salary) 
print("Employee Class Salary  :  ",Employee3.salary)
      
 
      
      
# Getters - Setters in Python  


class BharatGas:
    
    company = "H.P"
    salary = 5000
    salaryBonus = 500 
    
    # Getter - Method 
    @property
    def totalSalary(self):
        return self.salary + self.salaryBonus
    
    # Setter - Method 
    @totalSalary.setter
    
    def totalSalary(self,sal):
        self.salaryBonus = sal - self.salary 
        
        
b = BharatGas() 

b.totalSalary = 7800 

print("\n\nGetter - Setter  :  \n\n")  
print("Total Salary  :  ",b.totalSalary) 
print("Salary  : ",b.salary) 
print("Bonus :  ",b.salaryBonus) 

# --> here , bonus is flucatuating in nature 




# Operators Overloading 

print("\nOperators Overloading\n")  

class Number:
    
    def __init__(self,num):
        self.num = num 
        
    def __add__(self,num2):
        print("Let's Add !!") 
        return self.num + num2.num 
    
    def __mul__(self,num2):
        return self.num * num2.num
    
    
n1 = Number(4)
n2 = Number(7) 

sum = n1 + n2 
print("Sum : ",sum)

mul = n1 * n2
print("Multiplication : ",mul)        
      