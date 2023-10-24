public class DucksInARow {
    public static void main(String[] args) {
        LinearNode<Duck> first = new LinearNode<Duck>(new Duck("Daffy", "Duck"));
        // Duck first = new Duck("Daffy", "Duck");
        // Duck second = new Duck("Donald", "Duck");
        // Duck third = new Duck("Scrooge", "McDuck");
        // Duck fourth = new Duck("Darkwing", "Duck");

        first.setNext(new LinearNode<Duck>(new Duck("Donald", "Duck")));
        first.getNext().setNext(new LinearNode<Duck>(new Duck("Scrooge", "McDuck")));
        first.getNext().getNext().setNext(new LinearNode<Duck>(new Duck("Darkwing", "Duck")));

        // Add Howard to the front of the collection
        LinearNode<Duck> temp = new LinearNode<Duck>(new Duck("Howard", "the Duck"));
        temp.setNext(first);
        first = temp;
        temp = null; // Make sure only the collection points to Howard

        // Remove Howard the Duck from the front of the collection
        first = first.getNext();

        // first -> Daffy -> Donald -> Scrooge -> Darkwing -> null

        // System.out.println(first); // Daffy
        // System.out.println(first.getNext()); // Donald
        // System.out.println(first.getNext().getNext()); // Scrooge
        // System.out.println(first.getNext().getNext().getNext()); // Darkwing

        // How you loop through a linearly-linked structure
        LinearNode<Duck> current = first;
        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }


    }
}
