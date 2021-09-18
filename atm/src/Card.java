import java.util.ArrayList;

public class Card {
    private int cardNumber;
    private int PIN;
    private int money;
    public ArrayList<Integer> history = new ArrayList<>();

    public Card(int cardNumber, int PIN, int money) {
        this.cardNumber = cardNumber;
        this.PIN = PIN;
        this.money = money;
    }

    public ArrayList<Integer> getHistory() {
        return history;
    }

    public void withdraw(int amount){
        if (history.size()==0)history.add(money);
        this.money -= amount;
        history.add(money);
    }

    public void deposit(int amount){
        if (history.size()==0)history.add(money);
        this.money -= amount;
        history.add(money);
    }

    public void transfer(int amount){
        if (history.size()==0)history.add(money);
        this.money -= amount;
        history.add(money);
    }

    public void quit(){
        System.exit(0);
    }
}
