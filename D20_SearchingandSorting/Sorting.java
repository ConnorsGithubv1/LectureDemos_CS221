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
}