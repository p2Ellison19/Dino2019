
/**
 * Write a description of class DinoDriver3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class DinoDriver3
{
    public static void main( String [] args)
    {
        ArrayList<Dinosoar> myPop = new ArrayList<Dinosoar>();
    
        System.out.println("What is the starting size of the population?");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        
        for(int i=0; i<s;i++)
        {
            double temp =(double)((Math.random()));
            if(temp<0.33){myPop.add(new TRex());}
            else if(temp<0.67){myPop.add(new Bronta());}
            else{myPop.add(new Triceratops());}
        }
        
        
        for (Dinosoar d:myPop)
        {
            int rand = (int)((Math.random()*25)+2);
            for(int j=0; j<rand; j++)
                {
                    d.ageUp();
                }
        }
      
        for(Dinosoar d:myPop)
            { System.out.println(d); }
        
        int winCount=0; int battleNum=0; int deadDinos=0; int rndCount=0;
        int deadCount=0; int pastPop=myPop.size();
        
        while(myPop.size()>1)
       {
           System.out.println("**********************************************************************");
           System.out.println(s-myPop.size()+" are dead, only "+
           myPop.size()+" are left.");
           
           pastPop=myPop.size();
           
           for(Dinosoar d:myPop)
            {
                Dinosoar defend = myPop.get(DinoDriver3.getDefender(myPop,d));
                battleNum++;
                if(d.attack(defend))
                     {winCount++;d.checkHealth();defend.checkHealth();}
                else { d.checkHealth();defend.checkHealth();}
            }
            
           
           
           for(Dinosoar d:myPop)
            { 
              d.ageUp();
            } 
           DinoDriver3.removeDeadDinos(myPop);
           
           
           
            rndCount++; deadDinos=pastPop-myPop.size();
           System.out.println("End of round "+rndCount+". In "+battleNum+" battles, "+deadDinos+ " dinosaurs died. ");
           deadCount=deadCount+deadDinos; deadDinos=0; battleNum=0;

           for(Dinosoar d:myPop)
           {
               if(DinoDriver3.weddingBells(DinoDriver3.danceCard(myPop),d)==true)
               {
                   for(int i=0; i<5; i++)
                   {
                       if ({myPop.add(new TRex());}
                
                   }
               }
           }
        }
       
       if(myPop.size()==0)
       {
           System.out.println("No one survived this brutal melee, glory to the ancestors!");
       }
       else if(myPop.size()<2)
       {
           System.out.println(myPop + " is the Victor, Huzzah!");
       }
       
    }
    
    
    public static int livingDinos(ArrayList<Dinosoar>myPop)
    {
        int living =0;
        for(Dinosoar d:myPop)
        {
            if(d.getIsAlive()==true)
            {living++;}
        }
        return living;
    }
    
    public static int getDefender(ArrayList<Dinosoar>myPop,Dinosoar attacker)
       {
        Dinosoar def;
        int temp;
        
        do
            {
                int rand = (int)(Math.random()*myPop.size());
                def=myPop.get(rand);
                temp=rand;
            }
        while(def==attacker);
        
        return temp;
       }
    
    public static void removeDeadDinos(ArrayList<Dinosoar>p)
        {
            for(int i=0; i<p.size(); i++)
            {
                if(p.get(i).getIsAlive()==false)
                {
                    p.remove(i);
                    i--;
                }
            }
        }

    public static boolean mateable(Dinosoar d)
    {
        if(d.getHealth()>=20 && d.getAge()>32 && d.getAge()<7)
            {return true;}
        else 
            {return false;}
    }
    
    public static ArrayList danceCard(ArrayList<Dinosoar>myPop)
    {
        ArrayList<Dinosoar> danceCard = new ArrayList<Dinosoar>();
        while(danceCard.size()<(myPop.size()*.10))
        {
            int temp =(int)((Math.random()*myPop.size()));
            danceCard.add(myPop.get(temp));
        }
        return danceCard;
    }
    
    public static boolean weddingBells(ArrayList<Dinosoar>danceCard, Dinosoar d)
    {
        boolean temp=false;
        if(DinoDriver3.mateable(d)==true)
        {
            for(Dinosoar m:danceCard)
            {
                if(DinoDriver3.mateable(m)==true && !(m.getGender().equals(d.getGender())) && !(m.getType().equals(d.getType())))                 
                {
                    temp=true;
                }
            }
        }
        return temp;
  }
}
