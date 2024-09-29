package day8_T.T10;

import java.util.Objects;

public class Teacher /*implements Comparable*/{
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public Teacher(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && age == teacher.age && Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }

  /*  @Override
    public int compareTo(Object o) {
        Teacher o1 = (Teacher) o;
        int r = this.name.compareTo(o1.getName());
        if (r == 0) {
            r = this.age-o1.age;
            if (r == 0) {
                r = this.id-o1.id;
            }
        }
        return r;
    }*/
}
