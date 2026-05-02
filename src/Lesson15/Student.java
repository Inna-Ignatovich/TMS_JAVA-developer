package Lesson15;
import java.util.Arrays;
/**
 * @author Inna Ignatovich
 * @Date 02.05.2026
 */
public class Student {
    String name;
    String group;
    int uniCourse;
    double [] marks;

    public Student(String name, String group, int uniCourse, double[] marks) {
        this.name = name;
        this.group = group;
        this.uniCourse = uniCourse;
        this.marks = marks;
    }


    public int getUniCourse() {
        return uniCourse;
    }

    public double getAvgMark() {
        double temp = 0;
        for(double mark : marks) {
            temp += mark;
        }
        return temp / marks.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", uniCourse=" + uniCourse +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
