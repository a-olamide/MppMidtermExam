package vehincle_reg_sys.ext;

import vehincle_reg_sys.class_lib.Owner;
import vehincle_reg_sys.class_lib.Vehincle;
import vehincle_reg_sys.class_lib.VehincleOwnerFactory;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Olamide Akinoso");
        System.out.println(owner);
        VehincleOwnerFactory.AssignVehincleToOwner("123456", owner);
        System.out.println(owner);
        VehincleOwnerFactory.AssignVehincleToOwner("345678", owner);
        System.out.println(owner);
    }
}
