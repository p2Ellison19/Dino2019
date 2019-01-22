
/**
 * Write a description of class Bronta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bronta extends Dinosoar
{
   public Bronta()
   {
       super("Bronta");
   }
   public boolean attack(Dinosoar def)
   {
       if(def.getType().equals("TRex"))
            {
                if(Math.random()<.45) 
                        {this.update(def,true);return true;}
                    else 
                        {this.update(def,false);return false;}
            }
       else if(def.getType().equals("Triceratops"))
            {
                if(Math.random()<.45)
                        {this.update(def,true);return true;}
                    else 
                        {this.update(def,false);return false;}
            }
       else if(def.getType().equals("Bronta"))
            {
                if(Math.random()<.80)
                        {this.update(def,true);return true;}
                    else 
                        {this.update(def,false);return false;}
            }
        else {
                if(Math.random()<.50) 
                        {this.update(def,true);return true;}
                    else 
                        {this.update(def,false);return false;}
            }
   }
}

   
