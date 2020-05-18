package code.pa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Entry {
    private String creationDate;
    private String message;
    private int id;

    void setCreationDate() {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        creationDate = df.format(dateobj);
    }

    void setMessage(String message){ this.message = message; }

    void setId(int id) {
        this.id = id;
    }

    String getCreationDate() {
        return creationDate;
    }

    String getMessage() {
        return message;
    }

    int getId() {
        return id;
    }


}
