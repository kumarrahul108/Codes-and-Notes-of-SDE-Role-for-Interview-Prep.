'''
    Project 2 --> High Score Game 
    
    Generate any Random Number and make it guess by the user until user guesses it Right.
                   Also , print in how many guesses user gussed it Right. 
                   
                   If user enters a number higher than the random number --> print : Too High
                   If user enters a number lower than the random number --> print : Too Low 
                   
                   Store guesses in a text file "highscore" 
                   
'''  


import random 

ranNo = random.randint(1,100)   # --> 1 to 100 random numbers 
print(ranNo)  
guess = 0 

while(True):
    user = int(input("Enter any Number between 1 and 100 :   ")) 
    
    guess += 1 
    
    if(user == ranNo):
        print(f"Guessed in {guess} times \n") 
        print("Congrats , you guessed it right !!")
        break 
    
    if(user > ranNo):
        print("Too High Number than Actual ")
        print("Enter any lower number tha  this !!") 

    if(user < ranNo):
        print("Too Low Number than Actual ")
        print("Enter any higher number tha  this !!")  
        
        
with open("hiscore.txt","r") as f:
    data = int(f.read()) 
    
if(data > guess):
    with open("hiscore.txt","w") as f:
        f.write(str(guess))            
            