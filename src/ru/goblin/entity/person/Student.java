package ru.goblin.entity.person;

import ru.goblin.entity.courses.Course;
import ru.goblin.entity.person.attributes.address.Address;
import ru.goblin.entity.person.attributes.visa.Visa;

import static java.lang.String.format;

/**
 * Name, ID, Telephone Number, US Address and Address where they live in their own country.
 * Created by Александр on 25.09.2016.
 */
public class Student extends Person {
    private Boolean hasPayment = false;

    public Student(String name, int id, String phoneNumber, Address USAddress, Address ownCountryAddress, Visa visa) {
        super(name, id, phoneNumber, USAddress, ownCountryAddress, visa);
    }

    public Boolean getHasPayment() {
        return hasPayment;
    }

    public void setHasPayment(Boolean hasPayment) {
        this.hasPayment = hasPayment;
    }

    @Override
    public void applyToCourse(Course course) {
        if (hasPayment) {
            if(course.getFinish().before(visa.getFinish())){
                course.getParticipants().add(this);
            } else {
                System.out.println(format("Student %s (id = %d) don't apply course %s, because visa finish time after course finish time", name, id, course.getName()));
            }


        } else {
            System.out.println(format("Student %s (id = %d) don't pay all courses", name, id));
        }
    }
}
