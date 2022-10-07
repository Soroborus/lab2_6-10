//testing all created classes
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //6
        System.out.println("Input 2 radiuses");
        Scanner c= new Scanner(System.in);
        double r= c.nextDouble();
        Circle a=new Circle(r);
        r= c.nextDouble();
        Circle b= new Circle(r);
        if(a.isEqual(b)){
            System.out.println("are equal");
        }
        else{
            System.out.println("aren't equal");
        }
        //7
        Book testBook= new Book();
        testBook.setAuthor("0");
        testBook.setName("Arthur white");
        testBook.setYear(1999);
        Book arr[]=new Book[2];
        arr[0]=testBook;
        arr[1]=new Book();
        arr[1].setYear(2012);
        arr[1].setName("1");
        arr[1].setAuthor("martha black");
        Bookshelf bookshelf=new Bookshelf(arr);
        System.out.println(bookshelf.newestBook()+" "+bookshelf.oldestBook());
    }
}