public class Searching {
    
    public static <E extends Comparable<E>> boolean linearSearch(E[] data, E target) {
        return linearSearch(data, 0, data.length - 1, target);
    }

    public static <E extends Comparable<E>> boolean linearSearch(E[] data, int min, int max, E target){
        // check if min and max are valid
        if (min < 0 || max >= data.length || min > max) { return false; }

        for (int i = min; i <= max; i++) {
            if (data[i].compareTo(target) == 0) {
                return true;
            }
        }
        return false;
    }

    public static <E extends Comparable<E>> boolean binarySearch(E[] data, E target) {
        return binarySearch(data, 0, data.length - 1, target);
    }

    public static <E extends Comparable<E>> boolean binarySearch(E[] data, int min, int max, E target) {
        if (min < 0 || max >= data.length || min > max) { return false; }

        int midPoint = (min + max) / 2;

        if (data[midPoint].compareTo(target) == 0) {
            return true;
        } else if (data[midPoint].compareTo(target) > 0) {
            return binarySearch(data, min, midPoint - 1, target);
        } else {
            return binarySearch(data, midPoint + 1, max, target);
        }
    }
}
