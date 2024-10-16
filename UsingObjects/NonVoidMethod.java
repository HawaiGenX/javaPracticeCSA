public class NonVoidMethod{
    public static void main(String[]args){
        int a = 5;
        int b = 7;
        int sum = findSum(a, b);
        System.out.println("The sum of " + a +" and " + b  + " is " + sum);


        String name = "John";
        String message = "Whats for dinner?";
        String text = sendMessage(name, message);
        System.out.println(text);

        String firstName = "Prince ";
        String lastName = "John";
        String fullName = printText(firstName, lastName);
        System.out.println("My name is " + fullName);


        String title = "bad by";
        String artist = "Michael Jackson";
        String favoriteSong = currentSong(title, artist);
        System.out.println("My favorite song is:" + favoriteSong);

    }

    public static int findSum(int a, int b){
        int sum = a + b; 
        return sum;
    }


    public static String sendMessage(String name, String message){
        return name + message;

    }


    public static String printText(String firstName, String lastName){

        return firstName + lastName;

    }


    public static String currentSong(String title, String artist){
        return title + artist;
    }



}