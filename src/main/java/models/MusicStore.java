package models;

/**
 * Created by Guest on 7/31/17.
 */
public class MusicStore {
    public String artistName;
    public String albumName;
    public int year;
    public int price;

    public MusicStore(String artistName , String albumName, int year, int price ){
        this.artistName = artistName;
        this.albumName = albumName;
        this.year =year;
        this.price =price;

    }

    public boolean askForPrice(int maxPriceBudget){
        return (price < maxPriceBudget);
    }

    public boolean askForArtist(String artistNameByUser){
        return artistName.equals(artistNameByUser) ;
    }

    public boolean askForYear(int yearInput){
        return year <= yearInput ;
    }


}
