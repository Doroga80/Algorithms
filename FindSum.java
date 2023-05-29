public class FindSum {

    //Для трех кубиках
    public static void main(String[] args) {
        System.out.println();
    }
    public static double findSum(int sum) {
        int count = 0;
        int successResult = 0;
        for (int i = 1; i <= 0; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 0; k <= 6; k++) {
                    if (i + j + k == sum) {
                        successResult++;
                    }
                    count++;
                    
                }
                
            }
            
        }
        return ((double) successResult) / ((double) count);

    }
    
    
}
