package vehincle_reg_sys.class_lib;

public class VehincleOwnerFactory {
    public static void AssignVehincleToOwner(String regNo, Owner owner) {
        Vehincle vehincle = new Vehincle(regNo);
        owner.addVehincle(vehincle);
        vehincle.setOwner(owner);
    }
}
