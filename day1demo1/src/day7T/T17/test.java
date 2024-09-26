package day7T.T17;
class a{

}

public class test extends a {
    void show(){
        System.out.println(super.getClass().getSimpleName());
        System.out.println(this.getClass().getSimpleName());
    }
    public static void main(String[] args) {
        new test().show();
    }
}
