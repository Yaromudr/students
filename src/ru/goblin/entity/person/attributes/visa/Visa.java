package ru.goblin.entity.person.attributes.visa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Александр on 25.09.2016.
 */
public abstract class Visa {
    protected Date start, finish;
    /**
     * F: student Visa
     * J: professor Visa
     * H: professional Visa
     */
    protected char type;

    public Visa(String start, String finish, char type) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            this.start = format.parse(start);
            this.finish = format.parse(finish);
        } catch (ParseException e) {
            System.out.println("Use pattern dd.MM.yyyy for date");
            e.printStackTrace();
        }
        if ('F' == type || 'J' == type || 'H' == type) {
            this.type = type;
        } else {
            throw new RuntimeException("Use type for visa in [F, H, J]");
        }
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

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
