public class Sorting {

    public static <E extends Comparable<E>> void selectionSort(E[] data) {
        int minIndex;
        E temp;

        for (int i = 0; i < data.length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            swap(data, minIndex, i);
        }
    }

    private static <E extends Comparable<E>> void swap(E[] data, int firstIndex, int secondIndex) {
        E temp = data[firstIndex];
        data[firstIndex] = data[secondIndex];
        data[secondIndex] = temp;
    }

    // public static <E extends Comparable<E>> void bubbleSort(E[] data) {
    //     boolean swapped = true;
    //     int j = 0;
    //     E temp;

    //     while (swapped) {
    //         swapped = false;
    //         j++;

    //         for (int i = 0; i < data.length - j; i++) {
    //             if (data[i].compareTo(data[i + 1]) > 0) {
    //                 swap(data, i, i + 1);
    //                 swapped = true;
    //             }
    //         }
    //     }
    // }

    /**
     * Sorts an array of elements using the Bubble Sort algorithm.
     * 
     * @param <E> the type of elements in the array, must implement the Comparable interface
     * @param data the array to be sorted
     */
    public static <E extends Comparable<E>> void bubbleSort(E[] data) {
        for(int waterline = data.length - 1; waterline >= 0; waterline--) {
            for(int net = 0; net < waterline; net++) {
                if(data[net].compareTo(data[net + 1]) > 0) {
                    swap(data, net, net + 1);
                }
            }
        }
    }

    public static <E extends Comparable<E>> void quickSort(E[] data, int min, int max) {
        if (min >= max) {
            return; //base case
        }

        // partition into two subarrays using midpoint as pivot
        // result in the new index of the pivot
        int indexOfPartition = partition(data, min, max);

        // quickSort left subarray [min -> pivot - 1]
        quickSort(data, 0, indexOfPartition- 1);

        // quickSort right subarray [pivot + 1 -> max]
        quickSort(data, indexOfPartition+1, max);
    }

    private static <E extends Comparable<E>> int partition(E[] data, int min, int max) {
        E partitionElement;
        int left, right;
        int midpoint = (min + max) / 2;

        // use the midpoint data value as the partition element
        partitionElement = data[midpoint];

        // move it out of the way for now
        swap(data, midpoint, min);

        left = min;
        right = max;


        while (left < right) {
            // search for an element that is > the partition element
            while (left < max && data[left].compareTo(partitionElement) <= 0) {
                left++;
            }

            // search for an element that is < the partition element
            while (right > min && data[right].compareTo(partitionElement) > 0) {
                right--;
            }

            // swap the elements
            if (left < right) {
                swap(data, left, right);
            }
        }

        // move the partition element into place
        swap(data, min, right);

        return right;
    }
}