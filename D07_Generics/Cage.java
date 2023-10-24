public class Cage<T> {
    private T occupant;

    public Cage(T occupant) {
        this.occupant = occupant;
    }

    public void swapInCage(T occupant) {
        this.occupant = occupant;
    }

    public T examineCage() {
        return this.occupant;
    }

    public String toString() {
        return occupant.toString();
    }

}
// public class Cage {
//     private Object occupant;

//     public Cage(Object occupant) {
//         this.occupant = occupant;
//     }

//     public void swapInCage(Object occupant) {
//         this.occupant = occupant;
//     }

//     public Object examineCage() {
//         return this.occupant;
//     }

//     public String toString() {
//         return occupant.toString();
//     }

// }

