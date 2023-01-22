
    import java.util.ArrayList;
 public class Main {


        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.remove(Integer.valueOf(5));
            numbers.set(2, Integer.valueOf(55));
            System.out.println(numbers.toString());

        }

    }




