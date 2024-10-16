public class Song{
    //Attributes 
    public String name;
    public String artist;
    public int starRated;
    public String album;
    public int year;
    public boolean isAwardWining;

    public Song(String name, String artist, int starRated, String album, int year, boolean isAwardWining){
        this.name = name;
        this.artist = artist;
        this.starRated = starRated;
        this.album = album;
        this.year = year;
            this.isAwardWining = isAwardWining;
        }
    //Instantiation (Storing objects)

    public static void main(String[]args){
        Song myFavoriteSong = new Song("Under the influence", "Chris Brown", 5, "indigo", 2019, true );
        System.out.println(myFavoriteSong.artist);
        System.out.println(myFavoriteSong.name);
        System.out.println(myFavoriteSong.starRated);
        System.out.println(myFavoriteSong.album);
        System.out.println(myFavoriteSong.year);
        System.out.println(myFavoriteSong.isAwardWining);

    }
}