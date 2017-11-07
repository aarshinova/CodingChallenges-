import java.util.ArrayList;
import java.util.List;

public class Purchase {
    double price;
    String  bueyr;
    List<String> users = new ArrayList<>();

    public Purchase(double price, String bueyr, List<String> users) {
        this.price = price;
        this.bueyr = bueyr;
        this.users = users;
    }
}
