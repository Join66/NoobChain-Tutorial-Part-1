package noobchain;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        Block block = new Block("0", "1");
        System.out.println(block);

        BigDecimal decimal = new BigDecimal(1);
        System.out.println(decimal.toString());
    }
}
