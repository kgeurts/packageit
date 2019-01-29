import fruit.tropisch.*;
import fruit.aardbei;

public class Pakketjes {
    public static void main(String [] args) {
        System.out.println("Hallo");

        ananas ananas = new ananas();

        ananas.geefPrijsAnanas();

        ananas.ananasEmoji();

        aardbei aardbei = new aardbei();

        aardbei.geefPrijsAardbei();

        aardbei.aardbeiEmoji();
    }
}
