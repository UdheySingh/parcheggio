package Test;

public class Macchina extends Thread
{
    private Parcheggio park;
    
    public Macchina(String nome, Parcheggio p)
    {
        super(nome);
        this.park = p;
        start();
    }
    
    public void run()
    {
        while(true)
        {
            try
            {
                sleep((int) (Math.random() * 20000));
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            synchronized(park)
            {
                park.entra();
                System.out.println(getName() + " : è entrata liberi : " + park.posti);
            }
            try
            {
                sleep((int)(Math.random() * 10000));
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            synchronized(park)
            {
                park.esce();
                System.out.println(getName() + " : è uscita liberi : " + park.posti);
            }
        }
    }
}
