package ru.goblin.entity.person;

import ru.goblin.entity.courses.Course;
import ru.goblin.entity.person.attributes.address.Address;
import ru.goblin.entity.person.attributes.visa.Visa;

import static java.lang.String.format;

/**
 * Created by Александр on 25.09.2016.
 */
public class Professor extends Person {

    public Professor(String name, int id, String phoneNumber, Address USAddress, Address ownCountryAddress, Visa visa) {
        super(name, id, phoneNumber, USAddress, ownCountryAddress, visa);
    }

    @Override
    public void applyToCourse(Course course) {
        if (course.getParticipants().size() >= 15) {
            if (course.getFinish().before(visa.getFinish()) && course.getStart().before(visa.getFinish())) {
                course.setProfessor(this);
            } else {
                System.out.println(format("Professor %s don't get course %s, because visa finish time after course finish time", name, course.getName()));
            }
        } else {
            System.out.println(format("Professor %s don't get course %s, because participants less 15 (actual %d)", name, course.getName(), course.getParticipants().size()));
        }
    }

}
