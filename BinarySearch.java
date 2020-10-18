
/* Бинарный поиск!
 Сложность в лучшем случае - константная, если находим сразу - O(1).

 Сложность в худшем случае - O(log(N))
 В худшем случае в ходе работы алгоритмы мы должны прийти от массива
 размером 'n' к подмассиву размера 1.
 Каждую итерацию массив уменьшался в 2 раза.
 Алгоритм делит массив размера 'n' на 2 столько раз (k),
 чтобы получить подмассив длины 1.
 'k' (количество итераций в алгоитме )- и есть оценка сложности алгоритма в худшем
 случае - сколько раз массив делится на подмассивы.
 Сколько раз надо делить 'n' на 2, чтобы получить 1 == Сколько раз надо умножить 2 на себя,
 чтобы получить 'n'.
 n = 2^k (Math.pow(2, k))
 Если число N не степень двойки - то выбирается такое наименьшее k, что 2^k > N (Math.pow(2, k) > N).
  */


import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int key = 5;
        int[] array = new int[16];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(binarySearch(key, array));
    }

    public static int binarySearch(int key, int[] array) {
        int low = 0;
        int mid;
        int high = array.length - 1;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key > array[mid]) {
                low = mid + 1;
            } else if (key < array[mid]) {
                high = mid - 1;
            } else {  //if (key == array[mid])
                return mid;
            }
        }
        return -1;
    }
}
