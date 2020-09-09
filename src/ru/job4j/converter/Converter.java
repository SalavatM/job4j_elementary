package ru.job4j.converter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        //округление до центов
        float rsl = new BigDecimal(value / 60).setScale(2, RoundingMode.DOWN).floatValue();
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        expected = 2.33f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.33 dollar. Test result : " + passed);
    }
}