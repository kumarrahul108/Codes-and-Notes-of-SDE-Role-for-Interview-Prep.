'''
    PROJECT 3 :
    
        LIBRARY MANAGEMENT SYSTEM 
        
                   Implement using : Student & Library Class
                   
                   Library Class Methods :-> displayBook, issueBook, returnBook,  
                   Student Class Methods :-> requestBook, returnBook 
    
'''


class Library:
    
    def __init__(self,list_of_books):
        self.books = list_of_books
        
    def displayBook(self):
        print("\n### Books Present in the Library : \n") 
        for book in self.books:
            print(" * ",book) 
            
    def issuesBook(self,bookname):
        
        if(bookname in self.books):
            print(f"\nYou have been issued {bookname}.Please keep it safe and return it within 15 days !")
            print("Thanks for Visiting our Library , Have a great day ahead !!")  
            self.books.remove(bookname)
            
            
        else:
            print("\nSoory ! This book is either Unavailable or been issued to someone else .")
            print(f"Please wait untill {bookname} is available in th Libraray !")  
            print("Thanks for Visiting the Library , Have a Great day ahead !!")    
                      
                      
    def returnBook(self,Bookname):
        self.books.append(Bookname)
        print("\nThanks for returning this Book ! \nHope you enjoyed reading it !") 
        print("Thanks for Visiting the Libarray , Have a Great day ahead !!") 
        
        
        
class Student:
    
    def requestBook(self):
        self.book = input("Enter the name of the Book you want to issue from the Library  :  ")
        return self.book 
    
    def returnBook(self): 
        self.book = input("\nEnter the name of the Book you want to return to the Library  :  ")
        return self.book
    
    
# Using Main Class 

if __name__ == "__main__":
    
    lib = Library(["Data Structure","Algorithm","Java","Python","Power BI","Excel","C++","Machine Learning","Django"]) 
    
    stu = Student()
    
    while(True):
        
        welcome = '''
            ### ** Welcome to Central Librray of University of Delhi ** ### 
            
            Please Choose an Option :
            1. Display aa the Books
            2. Issues a Book
            3. Add/Return a Book
            4. Exit the Library
            
        ''' 

        print(welcome)  
        
        a = int(input("Enter a Choice :  ")) 
        
        if(a == 1):
            lib.displayBook() 
        elif(a == 2):
            lib.issuesBook(stu.requestBook()) 
        elif(a == 3):
            lib.returnBook(stu.returnBook()) 
        elif(a == 4):
            print("Thanks for choosing Central Library ! Have a great day ahead !!")
            exit()  
        else:
            print("\nInvalid Choice !!")     