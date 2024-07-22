public class Esercizio3 {
    public static void main(String[] args) {


        System.out.println("La lunghezza del rettangolo e' di: " + perimetroRettangolo(5.4, 6.9));
        System.out.println("Il numero inserito e' : " + oddEven(4));
        System.out.println("L'area del trinagolo e': " + perimetroTriangolo(4.5, 5.5,6.5));

    }

    public static  double perimetroRettangolo(double lungLato1, double lungLato2) {
        return lungLato1 + lungLato2;
    }

    public static  int oddEven(int num) {
        if(num % 2 == 0 ) {
            return 0;
        }
        else return 1;
    }

    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        double p = (lato1 + lato2 + lato3) / 2;
        double areaNotSqrt = p * (p- lato1) * (p-lato2) * (p-lato3);
        return Math.sqrt(areaNotSqrt);
    }
}
