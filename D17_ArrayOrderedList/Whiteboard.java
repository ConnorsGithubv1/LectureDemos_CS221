import java.util.ArrayList;
import java.util.Iterator;


public class Whiteboard {
    
    public static void main(String[] args){
        ArrayList<String> mylist = new ArrayList<String>();
        mylist.add("tale of two cities");
        mylist.add("lord of the rings");
        mylist.add("1984");
        mylist.add("clear and present danger");
        mylist.add("jurassic park");

        //syntactic sugar
        // for(String book: mylist){
        //     System.out.println(book);
        // }

        //whats really happening
        Iterator<String> itr = mylist.iterator();
        while (itr.hasNext()) {
            String book = itr.next();
            System.out.println(book);
        }
    }
}
