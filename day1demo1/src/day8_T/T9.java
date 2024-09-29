package day8_T;

import java.util.*;

/*9.使用TreeSet将学生按照成绩保存到集合中，并且名字叫tom的学生不管考多少分都位于班级的第一位。*/
class student{
    private String name;
    private int score;

    public student() {
    }

    public student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return score == student.score && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
public class T9 {
    public static void main(String[] args) {
        Set<student> students = new TreeSet<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                if (o1.getName().equals("tom"))return -1;
                if (o2.getName().equals("tom"))return 1;

                return Integer.compare(o2.getScore(),o1.getScore());
            }

        });
        students.add(new student("yy",100));
        students.add(new student("dm",28));
        students.add(new student("tom",33));
        students.add(new student("kk",70));
        System.out.println(students);
    }
}
