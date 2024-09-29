package day8_T.T15;

import java.util.Objects;

public class Student15 implements Comparable{
    private int id ;
    private String name;
    private double score;

    public Student15() {
    }

    public Student15(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student15 student = (Student15) o;
        return id == student.id && Double.compare(score, student.score) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        Student15 o1 = (Student15) o;

        int r = (int) (o1.getScore()-this.score);
        if (r == 0){
            r = o1.getName().compareTo(this.name);
        }else if (r == 0) r = this.id - o1.getId();
        return r;
    }
}
