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

    public static <E extends Comparable<E>> void mergeSort(E[] data, int min, int max) {
        if (min == max) {
            return; //base case
        }

        int mid = (min + max) / 2;

        // sort left half
        mergeSort(data, min, mid);

        // sort right half
        mergeSort(data, mid + 1, max);

        // merge the sorted halves
        merge(data, min, mid, max);
    }

    private static <E extends Comparable<E>> void merge(E[] data, int first, int midPoint, int last) {
        E[] temp= (E[])(new Comparable[data.length]); //this is our playground array

        int firstLeft = first, lastLeft = midPoint; //index for the left subarray
        int firstRight = midPoint + 1, lastRight = last; //index for the right subarray

        int index = first; //index for the temp array

        while (firstLeft <= lastLeft && firstRight <= lastRight) {
            if (data[firstLeft].compareTo(data[firstRight]) < 0) { //left element is smaller
                temp[index] = data[firstLeft];
                firstLeft++;
            } else {
                temp[index] = data[firstRight];
                firstRight++;
            }

            index++;
        }

        // copy any remaining elements from the left half
        while (firstLeft <= lastLeft) {
            temp[index] = data[firstLeft];
            firstLeft++;
            index++;
        }

        // copy any remaining elements from the right half
        while (firstRight <= lastRight) {
            temp[index] = data[firstRight];
            firstRight++;
            index++;
        }

        // copy the merged data into the original array
        for (index = first; index <= last; index++) {
            data[index] = temp[index];
        }
    }
}