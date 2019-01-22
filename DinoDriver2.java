
/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{
    public static void main(String[] args)
    {
        int deadCount=0;
        
        Dinosoar [] pop = new Dinosoar[100];
       
       for(int i=0;i<33;i++)
       {
           pop[i] = new TRex();   
       }
       for(int i=33;i<66;i++)
       {
           pop[i] = new Triceratops();   
       }
       for(int i=66;i<pop.length;i++)
       {
           pop[i] = new Bronta();   
       }
       
       
       for(int i=0; i<pop.length;i++)
       {
           Dinosoar d = pop[i];
           int rand = (int)((Math.random()*25)+2);
           for(int j=0; j<rand; j++)
                {
                    d.ageUp();
                }
       }       
       
       int winCount=0; int battleNum=0; int deadDinos=0; int rndCount=0;
       while(DinoDriver2.livingDinos(pop)>1)
       {
           System.out.println(deadCount+" are dead, only "+
           DinoDriver2.livingDinos(pop)+" are left.");
               for(Dinosoar d:pop)
               {
                   if(d.getIsAlive()==true)
                   {
                       Dinosoar defend = DinoDriver2.getDefender(pop, d);
                       battleNum++;
                       if(d.attack(defend))
                            {winCount++;d.checkHealth();defend.checkHealth();}
                       else { d.checkHealth();defend.checkHealth();}
                       
                       
                  }
               }
               
               
               for(Dinosoar d:pop)
               {
                   d.ageUp();
                   if(d.getIsAlive()==false)
                        {deadDinos++;}
               }
               rndCount++; deadDinos=deadDinos-deadCount;
           System.out.println("End of round "+rndCount+". In "+battleNum+" battles, "+deadDinos+ " dinosaurs died. ");
           deadCount=deadCount+deadDinos; deadDinos=0; battleNum=0;
           
            }
       if(DinoDriver2.livingDinos(pop)==1)
       {
          System.out.println(DinoDriver2.getVictor(pop) +" is the Winner, Yeet.");
       }
    }
    
    public static int livingDinos(Dinosoar[]p)
    {
        int living =0;
        
        for(Dinosoar d:p)
        {
            if(d.getIsAlive()==true)
            {
                living++;
                
            }
        }
        
        return living;
    }
    
    public static Dinosoar getDefender(Dinosoar[] p,Dinosoar attacker)
       {
        Dinosoar def;
        
        do
            {
                int rand = (int)(Math.random()*p.length);
                def=p[rand];
            }
        while(def==attacker&&def.getIsAlive()==true);
            
        return def;
       }
    public static Dinosoar getVictor(Dinosoar[] p)
       {
           Dinosoar victor=null;
           
           for(Dinosoar d:p)
          {
            if(d.getIsAlive()==true)
            {
               victor = d;
                
            }
          }
           return victor;
       }
       
    }

