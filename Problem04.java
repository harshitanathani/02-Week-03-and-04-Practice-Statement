import java.util.*;

class Asset {
    String name;
    int value;

    Asset(String name, int value) {
        this.name = name;
        this.value = value;
    }
}

public class Problem04 {
    public static void main(String[] args) {

        Asset[] arr = {
            new Asset("AAPL", 12),
            new Asset("TSLA", 8),
            new Asset("GOOG", 15)
        };

        Arrays.sort(arr, (a, b) -> a.value - b.value);

        for (Asset a : arr) {
            System.out.println(a.name + " " + a.value);
        }

        Arrays.sort(arr, (a, b) -> b.value - a.value);

        for (Asset a : arr) {
            System.out.println(a.name + " " + a.value);
        }
    }
}