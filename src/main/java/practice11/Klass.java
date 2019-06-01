package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;
    private Student leader;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student leader) {
        if (!students.contains(leader)) {
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = leader;
        if (teacher != null)
            System.out.print("I am " + teacher.getName() + ". I know " + leader.getName() + " become Leader of Class " + number + ".\n");
    }

    public void appendMember(Student student) {
        students.add(student);
        if (teacher != null)
            System.out.print("I am " + teacher.getName() + ". I know " + student.getName() + " has joined Class " + number + ".\n");
    }
}
