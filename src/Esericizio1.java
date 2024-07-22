public class Esericizio1 {
    public static void main(String[] args) {

        System.out.println(multiply(6,5));
        System.out.println(concat("Ciao", "sono Andrea"));

        String[] array = {"C", "i", "s", "o", "t"};
        String[] a = {"P"};
        System.out.println(insertInArray( array, a));


    }
        public static int multiply(int num1, int num2) {
            return num1 * num2;
        };
        public static String concat(String a, String b){
            return a +" "+ b;
        }

        public static String[] insertInArray(String[] array, String[] a) {
            array = new String[5];
            a = new String[1];
            array[2] += a;
            return array;
            }

        }



