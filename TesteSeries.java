// uso de polimorfismo
public class TesteSeries {
    public static void main(String[] args) {
        Series serie2 = new MaisDois(); // polimorfismo usando interface Series como ref
        Series serie3 = new MaisTres(); // polimorfismo [...]

        serie2.setStart(0);
        System.out.println("Série de mais 2:");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie2.getNext()); // polimorfsmo
        }

        serie2.reset(); // polimorfismo
        System.out.println("\nSérie de mais 2 apos reset:");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie2.getNext()); // polimorfismo
        }

        serie3.setStart(0);
        System.out.println("\nSérie de mais 3:");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie3.getNext()); // polimorfismo
        }

        serie3.reset(); // polimorfismo
        System.out.println("\nSérie de mais 3 apos reset:");
        for (int i = 0; i < 5; i++) {
            System.out.println(serie3.getNext()); // polimorfismo
        }
    }
}