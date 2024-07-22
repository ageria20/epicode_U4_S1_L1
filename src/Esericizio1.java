import java.util.Arrays;

public class Esericizio1 {
    public static void main(String[] args) {

        System.out.println(multiply(6,5));
        System.out.println(concat("Ciao", "sono Andrea"));

        String[] array = {"C", "i", "s", "o", "t"};
        String a = "P";
        System.out.println(Arrays.toString(insertInArray(array, a)));


    }
        public static int multiply(int num1, int num2) {
            return num1 * num2;
        };
        public static String concat(String a, String b){
            return a +" "+ b;
        }

        public static String[] insertInArray(String[] array, String a) {

            String[] newArray = new String[array.length + 1];

            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            newArray[2] = a;
            return newArray; 
        }
}



