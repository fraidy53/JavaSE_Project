public class Movie {
    public String title = "Å·Äá";
    public String director = "ÇÇÅÍ Àè½¼";
    public String starring = "³ª¿À¹Ì ¿ÓÃ÷";
    public int rating = 15;

    public void setTitle( String newTitle ) {
         title = newTitle;
    }

    public String getTitle() {
        return title;
    }

    public void playMovie() {
         System.out.println( title +
                                     "¸¦ »ó¿µÇÕ´Ï´Ù.");
    }

}