public class InsertionSort {
//Сортировка вставками
    public static void main(String[] args) {
        int[] array = new int[] {
            4, 2, 5, 7, 8, 1, 9, 0, 5, 6
        } ;

        insertSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            
        }
        
    }
     
    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                
            }
            
        }
    }
}