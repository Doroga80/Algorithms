import java.util.ArrayList;
import java.util.List;
//Алгоритм поиска допустимых делителей
public class Demo {

    public static void main(String[] args) {
        List<Integer> availadDivaider = findAvailadleDivider(12);
        for (Integer integer : availadDivaider) {
            System.out.println(integer);
        }
        
    }

    public static List<Integer> findAvailadleDivider(int number) {
        int counter = 0;
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            counter++;
            if (number % 1 == 0) {
                result.add(i);
            }
            
        }
        System.out.println("Counter: " + counter);
        return result;
    }


}




