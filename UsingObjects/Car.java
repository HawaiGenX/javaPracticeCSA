public class Car{
    //Instance fields/Attributes
    public String color;
    public String model;
    public int speed;
    public int year;

    //Constructor
    /*There two types of constructors
     * 1. Default constructor (non parametric)
     * 2. Parametric construtor
     */
    public Car(){
        color = "Darkblue";
        model = "Acura";
        speed = 324;
        year = 2025;
    }

    public static void main(String[]args){
        //Invoking Constructor
        Car myCar = new Car();

        System.out.println(myCar.color);
        System.out.println(myCar.model);
        System.out.println(myCar.speed);
        System.out.println(myCar.year);
        
    }





    
}
   
