import java.util.*;

class Client {
    String name;
    int risk;

    Client(String name, int risk) {
        this.name = name;
        this.risk = risk;
    }
}

public class Problem02 {
    public static void main(String[] args) {

        Client[] arr = {
            new Client("A", 20),
            new Client("B", 50),
            new Client("C", 80)
        };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].risk > arr[j + 1].risk) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (Client c : arr) {
            System.out.println(c.name + " " + c.risk);
        }

        Arrays.sort(arr, (a, b) -> b.risk - a.risk);

        for (Client c : arr) {
            System.out.println(c.name + " " + c.risk);
        }
    }
}