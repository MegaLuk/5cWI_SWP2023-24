import java.util.Arrays;
import java.util.Random;

public class sort {

        public static void main(String[] args) {
            // Array mit 10 verschiedenen zufälligen Zahlen erstellen
            int[] array = generateRandomArray(10);

            // Ursprüngliches Array ausgeben
            System.out.println("Ursprüngliches Array: " + Arrays.toString(array));

            // Array mit Selection Sort sortieren
            selectionSort(array);

            // Sortiertes Array ausgeben
            System.out.println("Sortiertes Array: " + Arrays.toString(array));
        }

        // Methode zum Generieren eines Arrays mit zufälligen Zahlen
        private static int[] generateRandomArray(int length) {
            int[] array = new int[length];
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                array[i] = random.nextInt(100); // Zufällige Zahlen von 0 bis 99
            }
            return array;
        }

        // Methode zum Sortieren des Arrays mit Selection Sort
        private static void selectionSort(int[] array) {
            int n = array.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Suche das Minimum im unsortierten Teil des Arrays
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }

                // Tausche das gefundene Minimum mit dem ersten Element im unsortierten Teil
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }


}
