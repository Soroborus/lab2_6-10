public class Book {
    protected int year=2022;
    protected String name="Unknown";
    protected String Author="Unknown";
    Book(String name,String Author,int year){
        this.Author=Author;
        this.name=name;
        this.year=year;
    }
    Book(){

    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return (this.name+" "+this.Author+","+this.year);
    }
}
