package chadenggg;

public class Find_Min_Max {

    
    public static void main (String [] args)

    {
        
        int [] numbers = {18 , 53 , 35 , 13 , 17 , 99 } ;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
            
            for(int a = 0 ; a<numbers.length ; a++)

            {
                
                if(numbers[a] < min )
                {
                       min = numbers[a] ;
                }
                if(numbers[a] > max )
                {
                        max = numbers[a];
                }
                
             System.out.println("SMALLEST NUMBER : " +min);
             System.out.println("LARGEST  NUMBER  : " +max);
                
                
            }    
   }
        
}
