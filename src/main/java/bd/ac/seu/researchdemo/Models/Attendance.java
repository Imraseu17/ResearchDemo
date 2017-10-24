package bd.ac.seu.researchdemo.Models;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Attendance {
    @Id
    @GeneratedValue
    private  int id;
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "sectionId")
    private Section section;

    private  Type type;
    private Date date;

    public Attendance() {
    }

    public Attendance(int id, Student student, Section section, Date date, Type type) {
        this.id = id;
        this.student = student;
        this.section = section;
        this.date = date;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }


}
