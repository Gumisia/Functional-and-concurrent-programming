package Enum;

public class Main {
    public static void main(String[] args) {
        YesNoEnum value = YesNoEnum.YES;
        Boolean isPositive = value.getPositive();

        for (YesNoEnum vall: YesNoEnum.values()) {
            System.out.println(vall);
        }

        //System.out.println(value);

    }
}
