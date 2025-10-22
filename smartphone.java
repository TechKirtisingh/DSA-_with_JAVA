class smartphone1
{
    String model;
    String color;
    String brand_name;

 smartphone1(String model ,String color , String brand_name )   
 {
    this.brand_name = brand_name;
    this.color = color;
    this.model =  model;
 }
    
    void Switchon()
    {
        System.out.println("phoneis startted: ");
    }  
        void working()
    {
        System.out.println("Phone is working: ");
    }
    
    void Switchoff()
    {
        System.out.println("Phone is switchedoff");
    }
}

public class smartphone 
{
    public static void main(String[] args) 
    { 
        // creating constructor::

        smartphone1 n = new smartphone1 ("Sumsung","black","Sumsung 12");
        smartphone1 m = new smartphone1 ("vivo", "White","vivo 13" );

        n.Switchon();
        n.working();
        n.Switchoff();
        System.out.println("brand name of phone is: " +(n.brand_name));

        m.Switchon();
        n.working();
        n.Switchoff();
        System.out.println("Brand name of phone is : "+(m.brand_name));

    }
}

