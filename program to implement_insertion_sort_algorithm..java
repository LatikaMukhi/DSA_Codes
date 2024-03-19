public class InsertionSort {

public static void main(String[] args) {
int[] array = {5, 2, 9, 1, 5, 6};

System.out.println("Original Array: ");
printArray(array);

insertionSort(array);

System.out.println("\nSorted Array: ");
printArray(array);
}

static void insertionSort(int[] array) {
int n = array.length;
for (int i = 1; i < n; i++) {
int key = array[i];
int j = i - 1;

while (j >= 0 && array[j] > key) {
array[j + 1] = array[j];
j = j - 1;
}
array[j + 1] = key;
}
}

static void printArray(int[] array) {
for (int i : array) {
System.out.print(i + " ");
}
System.out.println();
}
}
