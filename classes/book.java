package classes;

public class book {
    public String name;
    public Boolean banned;
    public String language;
    public String genre;
    
    public book(String name, Boolean banned, String language, String genre){
        this.name = name;
        this.banned = banned;
        this.language = language;
        this.genre = genre;
    }

    public void read(){
        System.out.println("LORUM IPSOM!");
    }

    public String getName(){
        return this.name;
    }
}
