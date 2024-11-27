package io.codeforall.fanstatics;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "F1_Drivers")
public class Driver extends AbstractDriver {
    private String driverName;

    private int carNumber;


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }
}
