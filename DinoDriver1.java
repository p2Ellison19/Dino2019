
/**
 * Write a description of class DinoDriver1 here.
 *
 * @author (BETER)
 * @version (v4.20)
 */
public class DinoDriver1
{
   public static void main(String[] args)
   {
       Dinosoar d1 = new TRex();
       Dinosoar d2 = new Triceratops();
       Dinosoar d3 = new Bronta();
       d1.setHealth(100);
       d2.setHealth(100);
       d3.setHealth(100);
       
       int winCount = 0;
       //System.out.println(d1.toString()+"  ***  "+d2.toString());
       for(int i=0;i<10;i++)
       {
           if(d1.getIsAlive()== true && d2.getIsAlive() ==true)
           {
               d1.attack(d2);
               
                   //d1.ageUp(); 
               //System.out.println(d1.toString()+"  ***  "+d2.toString());
               d1.checkHealth();d2.checkHealth();
               
            }
       }    
    }
}
