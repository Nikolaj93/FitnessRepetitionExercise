package kea;

public class Member extends Person {

    private boolean isBasic;

    public Member(String name, long cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }
}
