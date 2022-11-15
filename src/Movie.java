public class Movie {
    private String title;
    private MovieGenre genre;
    private int price;
    private String director;

    public Movie(String title, MovieGenre genre, int price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = "U/A";
    }

    public Movie(String title, MovieGenre genre, int price, String director) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printMovieDetails(){
        System.out.println("\nTitle: " + getTitle());
        System.out.println("Genre: " + getGenre().toString().substring(0,1).toUpperCase() + getGenre().toString().substring(1).toLowerCase());
        System.out.println("Price: " + getPrice() + ":-");
        if (!getDirector().equals("U/A")){
            System.out.println("Director: " + getDirector());
        }
    }
}
