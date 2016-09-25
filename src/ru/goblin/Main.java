package ru.goblin;

import ru.goblin.entity.courses.Course;
import ru.goblin.entity.person.Professor;
import ru.goblin.entity.person.Student;
import ru.goblin.entity.person.attributes.address.Address;
import ru.goblin.entity.person.attributes.address.USAddress;
import ru.goblin.entity.person.attributes.visa.Visa;
import ru.goblin.entity.person.attributes.visa.VisaF;
import ru.goblin.entity.person.attributes.visa.VisaH;
import ru.goblin.entity.person.attributes.visa.VisaJ;

public class Main {


    public static void main(String[] args) {
        Course course1 = new Course("Informatics", "01.07.1800", "01.08.1810");
        Course course2 = new Course("Chemistry", "01.07.1900", "01.05.1910");


        Address USaddress = new USAddress("NY", "NY", "Lenin st", "12");
        Address RUaddress = new Address("Russia", "Moscow", "Moscow", "Arbat st", "21");
        Visa visaF = new VisaF("05.06.1800", "05.08.1810");

        for (int i = 0; i < 15; i++) {
            Student person = new Student("Aleks Pushkin", i, "+74951234567", USaddress, RUaddress, visaF);

            //No, because payment
            person.applyToCourse(course1);
            person.setHasPayment(true);
            //No, because visa time
            person.applyToCourse(course2);
            //Yes
            person.applyToCourse(course1);
        }

        Address USaddress2 = new USAddress("NY", "NY", "Lenin st", "12");
        Address RUaddress2 = new Address("Russia", "St Peterbugr", "St Peterbugr", "Nevsky Prospect", "21");
        Visa visaJ = new VisaJ("05.06.1800", "05.08.1810");

        Professor person2 = new Professor("Peter Romanov", 21, "+78127654321", USaddress2, RUaddress2, visaJ);
        //Yes
        person2.applyToCourse(course1);


        Address USaddress3 = new USAddress("NY", "NY", "Lenin st", "12");
        Address RUaddress3 = new Address("Russia", "St Peterbugr", "St Peterbugr", "Nevsky Prospect", "21");
        Visa visaH = new VisaH("05.06.1800", "05.06.1810");

        Professor person3 = new Professor("Mikail Lomonosov", 22, "+74959393010", USaddress3, RUaddress3, visaH);
        //No, because visa time
        person3.applyToCourse(course1);




        Address USaddress4 = new USAddress("NY", "NY", "Lenin st", "12");
        Address RUaddress4 = new Address("Russia", "St Peterbugr", "St Peterbugr", "Nevsky Prospect", "21");
        Visa visaH2 = new VisaH("05.06.1800", "05.06.1810");

        Professor person4 = new Professor("Dmitry Mendeleev", 23, "+74959393010", USaddress4, RUaddress4, visaH2);
        //No, because course participants = 0
        person4.applyToCourse(course2);


    }
}
