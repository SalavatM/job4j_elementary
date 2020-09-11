package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean uni = data[0];
        for (boolean t: data) {
            if (t != uni) {
                result = false;
                break;
            }
        }
        return result;
    }
}
