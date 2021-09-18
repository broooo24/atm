import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Card card = new Card(2347819,1234,5000);
        //card.getHistory();
        card.withdraw(200);
        card.deposit(100);
        System.out.println(card.getHistory());

    }
}
