

class Vec:
    
    def __init__(self,i,j):
        self.icap = i
        self.jcap = j 
        
    def __str__(self):
        return f"{self.icap}i + {self.jcap}j" 
    

class Vec3d(Vec):
    
    def __init__(self,i,j,k):
        super().__init__(i,j)
        self.kcap = k 
        
    def __str__(self):
        return f"{self.kcap}i + {self.jcap}j + {self.kcap}k"
    
    
v1 = Vec(1,2)

v2 = Vec3d(3,5,7) 

print("\n")
print("2-D Vector  :  ",v1)
print("\n") 
print("3-D Vector  :  ",v2)                