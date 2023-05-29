import java.util.ArrayList;
import java.util.List;
//Алгортм поиска простых чисел
public class Simple {

    public static void main(String[] args) {
        List<Integer> availadDiviator = findSimpleNumbers(45);
        for (Integer integer : availadDiviator) {
            System.out.println(integer);
        }
        
    }
    
    public static List<Integer> findSimpleNumbers(int max) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    simple = false;

                }
            }
            if (simple){
                result.add(i);
            }
        }

        System.out.println("Counter: " + counter );
        return result;
    }
    
}
