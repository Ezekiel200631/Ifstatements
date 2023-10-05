
/**
 * Write a description of class WhileLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WhileLoops 
{

    public WhileLoops()  {
       
        {
                int i = 0; 
            while ( i < 15 ) { 
                System.out.println("i is " + i + "but is less than 15");    
                i++;
            }
        } 
    
        {
            int k = 0; 
            while ( k > 5 )  {  
                System.out.println("k is " + k + " but is greater than 5"); 
                k++;
            }    
        } 
    
        {
            int a = 0;  
            int b = 0; 
            while ( a < 10  &&  b <= 20 )  {  
                System.out.println("a is " + a + " but is less than 10"); 
                a++; 
                System.out.println("b is " + a + " but is less than or equal to 20"); 
                b++;
         }  
    
        } 
        
     System.out.println("Hello World!");
    }
    
    
    public static void main(String[] args)
    {        
        WhileLoops hw = new WhileLoops();
        
    }
}
