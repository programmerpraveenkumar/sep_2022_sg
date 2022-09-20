 

//inherit the paret class using `extends`
class Child  {
    constructor()  
    {  
       let name;  
       let marks;  
    }  
        getName()  
        {  
          return this.name;  
        }  
      setName(name)  
      {  
        this.name=name;  
      }  
        
      getMarks()  
      {  
        return this.marks;  
      }  
    setMarks(marks)  
    {  
      this.marks=marks;  
    }  

}
var stud=new Child();
stud.name = "updaet"  
//stud.setName("John");  
stud.setMarks(80);  
     console.log(stud.getName()+" "+stud.getMarks());  
