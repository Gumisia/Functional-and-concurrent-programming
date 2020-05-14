package StringPool;

public class Main {
    public static void main(String[] args) {
        String string1 = "meow";
        String string2 = "meow";
        String string3 = new String("meow");

        System.out.println(string1+"=="+ string2+"= "+(string1==string2));
        System.out.println(string1+".equals("+string2+")= "+string1.equals(string2));
        System.out.println(string1+"=="+string3+"= "+(string1==string3)); // false
        System.out.println(string1+".equals("+string3+")= "+string1.equals(string3));
    }
}
