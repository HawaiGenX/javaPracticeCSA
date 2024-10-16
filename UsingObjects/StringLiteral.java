public class StringLiteral{
    public static void main(String[]args){
        //Using  + operator
        String firstName = "Julius";
        String lastName = "Caesar";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);


        //Using concatenation (concat()) 
        String fullName2 =firstName.concat(" ").concat(lastName);
        System.out.println(fullName2);


        String songTitle = "Universe";
        String artist = "BTS";
        String countryOrigin = "South Korea";
        String createAlbum = songTitle.concat(" ").concat(artist).concat(" ").concat(countryOrigin);
        System.out.println(createAlbum);
        System.out.println(createAlbum.length());

        //Using StringBuilder: going together with append() and toString()

        StringBuilder fullName3 = new StringBuilder();
        fullName3.append(firstName);
        fullName3.append(" ");
        fullName3.append(lastName);
        System.out.println(fullName3.toString());


        StringBuilder createAlbum2 = new StringBuilder();
        createAlbum2.append(songTitle).append(" ").append(artist).append(" ").append(countryOrigin);
        System.out.println(createAlbum2.toString());
        




    }
}