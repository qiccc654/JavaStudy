package day5.T.T12;

import java.util.Scanner;

public class StudentManagement {
    private  Scanner in;
    private Student[] stus;
    private int counter;

    public StudentManagement(){
        stus =new Student[100];
        in = new Scanner(System.in);
    }

    public StudentManagement(int size) {
        stus = new Student[size];
        in = new Scanner(System.in);
    }
    public void prompt(){
        System.out.println("********************");
        System.out.println("*Student Management*");
        System.out.println("********************");
        System.out.println("* 1)Add");
        System.out.println("* 2)Delete");
        System.out.println("* 3)Update");
        System.out.println("* 4)Select");
        System.out.println("* 0)Quit");
        System.out.println("********************");
        System.out.print("Please choose your operate:");
    }
    private int findStudent(){
        int index = -1;
        String name;
        System.out.print("Please input name:");
        //从键盘获取一个字符串
        name = in.next();
        //请补全下面核心代码
        //...
        for (int i = 0; i < counter; i++) {
            if (stus[i].getName().equals(name)){
                index=i;
            }
        }
        return index;
    }
    public void addStudent(){
        String name;
        int age;
        String gender;
        Student s;
        //判断 管理系统容量是否 已满
        if(counter >= stus.length){
            System.out.println("Add failure,too many student!");
            //扩容  数组拷贝，System.方法   Arrays.方法
            return;
        }
        System.out.print("Please input name:");
        name = in.next();
        System.out.print("Please input age:");
        age = in.nextInt();
        System.out.print("Please input gender:");
        gender = in.next();
        s = new Student(name,age,gender);
        //关键代码
        stus[counter] = s;
        counter++;
        System.out.println("Add student success!");

    }
    //请补全下面代码
    public void deleteStudent(){
        int i =findStudent();
        if (i>=0) {

            for (; i < stus.length-1; i++) {
                stus[i]=stus[i+1];
            }
            counter--;
        }

    }
    public void updateStudent(){
        int find =findStudent();
        if (find>=0){
            System.out.print("Please input name:");
            stus[find].setName(in.next());
            System.out.print("Please input age:");
            stus[find].setAge(in.nextInt());
            System.out.print("Please input gender:");
            stus[find].setGender(in.next());
            System.out.println("update success!");
        }
    }
    public void selectStudent(){
        int find =findStudent();
        if (find>=0){

            System.out.println(stus[find].toString());
        }


    }
    public static void main(String[] args){
        //实例化对象
        StudentManagement sm = new StudentManagement();
        //用户操作标志
        int option = -1;
        Loop: while(true){
            // 打印提示信息
            sm.prompt();
            //获取用户操作
            option = sm.in.nextInt();
            if(option < 0 || option > 4)
                continue;
            switch(option){//byte char short int
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.deleteStudent();
                    break;
                case 3:
                    sm.updateStudent();
                    break;
                case 4:
                    sm.selectStudent();
                    break;
                case 0:
                    break Loop;
            }//end switch
        }// end while
        System.out.println("游戏结束, byebye");
    }//end main
}//end class

