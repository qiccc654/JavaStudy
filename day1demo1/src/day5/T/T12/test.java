package day5.T.T12;

public class test {
    public static void main(String[] args) {
        Student s = new Student("q", 12, "x");
        boolean b = s.getName() == "q";
        boolean q = s.getName().equals("q");
        System.out.println(b);
        System.out.println(q);

    }
}
