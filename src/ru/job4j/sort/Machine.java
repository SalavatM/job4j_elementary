package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;

        int diff = money - price;
        while (diff > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (diff >= coins[i]) {
                    rsl[size] = coins[i];
                    size += 1;
                    diff -= coins[i];
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
