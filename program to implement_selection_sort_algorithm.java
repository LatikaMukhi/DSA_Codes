public class SelectionSort {

public static void main(String[] args) {             
int[] array = {64, 25, 12, 22, 11};

System.out.println("Original Array: ");
printArray(array);

selectionSort(array);

System.out.println("\nSorted Array: ");
printArray(array);
}

static void selectionSort(int[] array) {
int n = array.length;

for (int i = 0; i < n - 1; i++) {

int minIndex = i;
for (int j = i + 1; j < n; j++) {
if (array[j] < array[minIndex]) {
minIndex = j;
}
}

int temp = array[minIndex];
array[minIndex] = array[i];
array[i] = temp;
}
}

static void printArray(int[] array) {
for (int i : array) {
System.out.print(i + " ");
}
System.out.println();
}
}
