package container.LearnString;

public class LearnStringBuilder {

    public static void main(String[] args) {
        StringBuilder strbu = new StringBuilder("a");

        System.out.println(strbu.capacity());

        strbu.append("d123456");
        strbu.insert(0, 'y');
        System.out.println(strbu);

        strbu.deleteCharAt(0);
        strbu.delete(0, 2);
        System.out.println(strbu.charAt(strbu.length()-1));
        strbu.reverse();

        System.out.println(strbu);
    }
}
