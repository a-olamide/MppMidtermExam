package vehincle_reg_sys.class_lib;

public class Vehincle {
    private String regNo;
    private Owner owner;

    Vehincle(String regNo) {
        this.regNo = regNo;
    }
    public String getRegNo() {
        return regNo;
    }
    public void setOwner(Owner owner) {
        if (this.owner == null) { //ensure we can't add owner more than once
            this.owner = owner;
        }
    }
    public Owner getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Vehincle{" + "regNo=" + regNo + '}';
    }
}
