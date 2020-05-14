package Enum;

public enum YesNoEnum {
    YES(true),
    NO(false),
    TAK(true),
    NIE(false),
    T(true),
    N(false);

    private Boolean isPositive;

    YesNoEnum(Boolean value){
        this.isPositive = value;
    }

    public Boolean getPositive() {
        return isPositive;
    }
}
