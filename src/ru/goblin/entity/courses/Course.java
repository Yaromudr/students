package ru.goblin.entity.courses;

import ru.goblin.entity.person.Professor;
import ru.goblin.entity.person.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.String.format;

/**
 * Created by Александр on 25.09.2016.
 */
public class Course {
    private String name;
    private Date start, finish;
    private List<Student> participants = new ArrayList<>();
    private Professor professor;

    public Course(String name, String start, String finish) {
        this.name = name;
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            this.start = format.parse(start);
            this.finish = format.parse(finish);
        } catch (ParseException e) {
            System.out.println("Use pattern dd.MM.yyyy for date");
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public List<Student> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Student> participants) {
        this.participants = participants;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;

        System.out.println(format("Professor %s gets course %s ", professor.getName(), name));

    }
}
