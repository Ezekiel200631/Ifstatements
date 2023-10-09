public class ForLoops

{

    
    
    public void run() {   
        
               
       for (int i = 0; i >= 15; i++)  {
            System.out.println("i is greater than or equal to "+i); 
            
       }
    
     
       for (int j = 10; j == 10;  j = j + (-2))  {
            System.out.println("j is equal to " +j);
        
       } 
       
    
       for (int k = 10; k == 10;   k = k + -(3))  {
            System.out.println("k is equal to " +k); 
           
       } 


        System.out.println("Hello World!");
    }
    
    
    public static void main(String[] args)
    {        
        ForLoops hw = new ForLoops();
        hw.run();
    }
    }  
