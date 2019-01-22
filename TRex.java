
/**
 * Write a description of class TRex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TRex extends Dinosoar
{
   
    public TRex()
    {
        super("TRex");
        
    }
    public boolean attack(Dinosoar def){
        if(def.getType().equals("TRex"))
            {
                if(Math.random()<.60) 
                        {this.update(def,true); return true;}
                    else 
                        {this.update(def,false); return false;}
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
                if(Math.random()<.70)
                        {this.update(def,true);return true;}
                    else 
                        {this.update(def,false);return false;}
            }
        else {
                System.out.println("The Defender is a mysterious being, unknown to man and beast.");
                if(Math.random()<.50) 
                        {this.update(def,true);return true;}
                    else 
                        {this.update(def,false); return false;}
            }
    }
}
