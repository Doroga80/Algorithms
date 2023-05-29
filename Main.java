import java.util.Arrays;

public class Main {
    // возврат левого потомка `A[i]`
    private static int LIFT(int i) {
        return (2 * i + 1);
    }

    // возврат правого потомка `A[i]`
    private static int RIGHT(int i) {
        return (2 * i + 2);
    }

    // вспомогательная функция для замены двух индексов в массиве
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // рекурсивный алгоритм heapify-down. Узел с индексом `i` и два его прямых потомка нарушают свойство кучи
    private static void heapify(int[] A, int i, int size) {
        // получаем левый и правый потомки узла тндекса `i`
        int lift = LIFT(i);
        int right = RIGHT(i);

        int largest = i;

        // сравниваем `A[i]` с его правым и левым дочерними элементами и находи наибольшее значение
        if (lift < size && A[lift] > A[i]) {
            largest = lift;
        }

        if (right < size && A[right] > A[largest]) {
            largest = right;
        }

        // поменятся местами с потоком, имеющее большее значение и вызвать heapify-down для дочернего значения
        if (largest != i) {
            swap(A, i, largest);
            heapify(A, largest, size);
        }
    } 
    // функция для удаления элементов с наивысшим приоритетом (присутствует в корне)
    public static int pop(int[] A, int size) {
        // если в куче нет элементоа
        if (size <= 0) {
            return -1;
        }

        int top = A[0];

        // заменяем корень кучи послндним элементом
        A[0] = A[size - 1];

        // вызываем heapify-down на корнквом узле
        heapify(A, 0, size - 1);

        return top;
    }
    

    // функция для пирамидальной сорторовки массива `A` размер `n`
    public static void heapsort(int[] A) {
        // строим пирамидную очередь и инициализируем ее заданным массивом
        int n = A.length;

        // Build-heap: вызываем heapify, начиная с последнего внутреннего узла до корневого узла
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(A, i--, n);
        }

        // несколько раз извлекаем из кучи
        while (n > 0) {
            A[n - 1] = pop(A , n);
            n--;
        }
    }

    // реализация алгоритма Heapsort
    public static void main(String[] args) {
        int[] A = {14, 43, 2, 91, -27};

        // выполняем иерхарическую сортировку массива
        heapsort(A);

        // печатаем отсортированный массив
        System.out.println(Arrays.toString(A));
    }
}
