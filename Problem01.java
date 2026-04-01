import java.util.*;

class Transaction {
    String id;
    double fee;

    Transaction(String id, double fee) {
        this.id = id;
        this.fee = fee;
    }
}

public class Problem01 {
    public static void main(String[] args) {

        ArrayList<Transaction> list = new ArrayList<>();
        list.add(new Transaction("id1", 10.5));
        list.add(new Transaction("id2", 25.0));
        list.add(new Transaction("id3", 5.0));

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).fee > list.get(j + 1).fee) {
                    Transaction temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        for (Transaction t : list) {
            System.out.println(t.id + " " + t.fee);
        }

        for (Transaction t : list) {
            if (t.fee > 50) {
                System.out.println("High: " + t.id);
            }
        }
    }
}