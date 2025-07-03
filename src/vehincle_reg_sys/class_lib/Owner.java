package vehincle_reg_sys.class_lib;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    private String name;
    private List<Vehincle> vehincles;

    public Owner(String name) {
        this.name = name;
        this.vehincles = new ArrayList<Vehincle>();
    }

    public String getName() {
        return name;
    }

    public List<Vehincle> getVehincles() {
        return vehincles;
    }
    public void addVehincle(Vehincle vehincle) {
        vehincles.add(vehincle);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", vehincles=" +  vehincles +
                '}';
    }
}
