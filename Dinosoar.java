
/**
 * Abstract class Dinosoar - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 * General methods all fit here, only method that needs to be contained in the
 * individual's method is the attack method
 */
public abstract class Dinosoar
{
    private String type;
    private int age;
    private String gender;
    private int wins;
    private int battleCount;
    private int health; //0 is dead, 100 is full
    private int losses;
    public boolean isAlive;
    
    
    
    /**
     * Dinosoar constructor -- There is no default constructor because all
     * dinosaurs need their own specific type that needs to be assigned from
     * elsewhere. We can have common methods for everything but setting type
     * and attacking. 
     */
    public Dinosoar(String t)
    {
        this.type=t;
        this.age=0;
        this.wins=0;
        this.health=10;
        this.isAlive = true;
        if(Math.random()>0.5) 
            this.gender= "M";
        else 
            this.gender="F";
    }
    
    /************************Methods*****************************************
       */
    /**
     * Attack is abstract because it varies depending on what dinosaurs are
     * involved, different dinosaurs attack differently, and it needs to reflect
     * that fact.
     */
    
    
    public abstract boolean attack(Dinosoar def);
    
    public void ageUp()
    {
        this.age++; 
        if(this.age<10)
            {this.health=this.health+10;}
            
        else if(this.age>30)
            {this.health=this.health-20;}
        else if(this.age>25)
            {this.health=this.health-10;}
        
        this.checkHealth();
        
    }
    
    public void checkHealth()
    {
        if(this.health<= 0 && this.isAlive==true)
        {
            System.out.println("    "+this.toString()+" just died.");
            this.isAlive = false; 
            this.health=0; 
            
        }
        else if(this.health>100)
            {this.health=100;}
        
    }
    
    public void update(Dinosoar def,boolean winner)
    {
        this.battleCount++;
        def.setBattleCount(def.getBattleCount()+1);
        
        if(winner==true)
        {
            this.wins++;
            def.setHealth(def.getHealth()-20);
            def.setLosses(def.getLosses()+1);
        }
        else if(winner == false)
        {
            def.setWins(def.getWins()+1);
            this.health = this.health-20;
            this.losses=this.losses+1;
        }
    }
    
    public String toString()
    {
        String temp = "";
        
        temp = this.type+" "+this.age + " W-L "+this.wins+"-"
        + this.losses+" " +this.health;
        
        return temp;
    }

    
    /**************************** Getters************************************/
    
    public String getType()
    {
     return this.type;   
    }
    public int getAge()
    {
        return this.age;
    }
    public String getGender()
    {
        return this.gender;
    }
    public int getWins()
    {
        return this.wins;
    }
    public int getBattleCount()
    {
        return this.battleCount;
    }
    public int getHealth()
    {
        return this.health;
    }
    public boolean getIsAlive()
    {
        return this.isAlive;
    }
    public int getLosses()
    {
        return this.losses;
    }
    
    /**********************************Setters*******************************/
    
    public void setType(String t)
    {
        this.type=t;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setGender(String g)
    {
        this.gender=g;
    }
    public void setWins(int w)
    {
        this.wins=w;
    }
    public void setBattleCount(int bc)
    {
        this.battleCount=bc;
    }
    public void setHealth(int h)
    {
        this.health=h;
    }
    public void setIsAlive(boolean al)
    {
        this.isAlive=al;
    }
    public void setLosses(int l)
    {
        this.losses=l;
    }
    
    // public dinoVictory(String t)
    // {
        
    // }
    
    // public int agr;
    // public int def;
    // private int v;
    
    // public dinoBattle(String agr, String def, int v)
    // {
        
    
    
    
    
    
    
    
        // return v;
    }

