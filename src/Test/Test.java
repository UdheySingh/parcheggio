package Test;

public class Test 
{
    public static void main(String[] args) 
    {
        Parcheggio p = new Parcheggio(5);
        
        for (int i = 0; i < 10; i++) 
        {
            Macchina m = new Macchina("Auto : " + i, p);
        }
    }
    
}
