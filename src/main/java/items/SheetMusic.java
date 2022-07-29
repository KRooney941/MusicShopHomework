package items;

public class SheetMusic extends item {

    private String artist;
    private String album;


    public SheetMusic(int buyPrice, int sellPrice, String artist, String album) {
        super(buyPrice, sellPrice);
        this.artist = artist;
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
