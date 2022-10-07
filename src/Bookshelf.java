public class Bookshelf {
    private Book shelf[]=new Book[500];
    private int size=0;
    Bookshelf(Book a[]){
        for (int i=0;i<a.length;i++){
            size++;
            this.shelf[i]=a[i];
        }
    }
    public void sortToDate(){
        Book min=new Book();
        int index=0;
        for (int i=0;i<size;i++){
            for (int j=i;j<size;j++){
                if (min.year>=this.shelf[j].year){
                    min=this.shelf[j];
                    index=j;
                }
            }
            min=this.shelf[i];
            this.shelf[i]=this.shelf[index];
            this.shelf[index]=min;
        }
    }
    public Book oldestBook(){
        Book min=this.shelf[0];
        for (int i=1;i<size;i++){
            if (min.year>this.shelf[i].year){
                min=this.shelf[i];
            }
        }
        return min;

    }
    public Book newestBook(){
        Book min=this.shelf[0];
        for (int i=1;i<size;i++){
            if (min.year<this.shelf[i].year){
                min=this.shelf[i];
            }
        }
        return min;
    }
    public void print(){
        for (int i=0;i<size;i++){
            System.out.println(shelf[i]);
        }
    }
    public void addBook(Book book){
        this.shelf[size]=book;
        this.size++;
    }
}
