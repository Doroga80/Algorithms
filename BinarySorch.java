public class BinarySorch {
//Бинарный поиск
    public static void main(String[] args) {
        int[] array = new int[] {
            1, 2, 3, 4, 5, 6, 7, 8, 9
        } ;

        System.out.println(binarySorch(array, 19, 0, array.length -1));

        
    }

    public static int binarySorch(int[] array, int value, int min, int max){
       int midpoint;
       
       if(max < min){
           return -1;
       }else {
           midpoint = (max - min) /2 + min;
       }

       if(array[midpoint] < value) {
        return binarySorch(array, value, midpoint +1, max);
       }else {
        if (array[midpoint] > value) {
            return binarySorch(array, value, min, midpoint -1);
        }else {
            return midpoint;
        }
       }
    }
    
}
