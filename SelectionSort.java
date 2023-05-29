public class SelectionSort {
//Сортировка выбором
    public static void main(String[] args) {
        int[] array = new int[] {
            4, 2, 5, 7, 8, 1, 9, 0, 5, 6
        } ;

        directSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            
        }
        
    }

    public static void directSort(int[] array){
        for (int i = 0; i < array.length -1; i++) {
            int minPosition = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minPosition]) {
                    minPosition = j;
                }
                
            }
            if(i !=minPosition){
                int temp = array[i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
            
        }
    }
}
