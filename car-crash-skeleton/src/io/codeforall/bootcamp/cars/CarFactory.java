package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Field;

public class CarFactory {


    public static Car getNewCar() {
        int col = (int) Math.random() * Field.getWidth();
        int row = (int) Math.random() * Field.getHeight();

        if ((int) (Math.floor(Math.random() * 2)) == 0) {
            return new Fiat(col, row);
        }
        return new Mustang(col, row);
    }
}
