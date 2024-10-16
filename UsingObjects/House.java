public class House{
//Attribute
public String color;
public int size;
public String streetName;
public int houseNumber;

//Parametric Constructor
public House(String houseColor, int houseSize, String houseStreetName, int houseNum){
  color = houseColor;
  size = houseSize;
  streetName = houseStreetName;
  houseNumber = houseNum;
}

//invoking constructor (Istantiation)
public static void main(String[]args){
    House myHouse = new House("Blue", 2600, "Davis", 2);
    System.out.println("My house color is: " + myHouse.color);
    System.out.println("My houese size is: " + myHouse.size);
    System.out.println("My houese street name is: " + myHouse.streetName);
    System.out.println("My houese number is: " + myHouse.houseNumber);

}

}