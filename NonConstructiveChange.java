import java.util.Arrays;

public class NonConstructiveChange {

    public static void main(String[] args) {
        int[] coins = {5,7,1,1,2,3,22};
        System.out.println(getNonConstructiveChange(coins));
    }

    private static int getNonConstructiveChange(int[] coins) {
        if(coins.length==0)
            return 1;

        Arrays.sort(coins);
        int change=0;

        for (int coin : coins) {
            if (coin > change + 1) {
                break;
            }
            change += coin;
        }

        return change+1;
    }
}
