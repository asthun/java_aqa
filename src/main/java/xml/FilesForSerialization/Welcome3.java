package xml.FilesForSerialization;

// Welcome3.java


import java.io.Serializable;

public class Welcome3 implements Serializable {
    private Person person;

    public Person getPerson() { return person; }
    public void setPerson(Person value) { this.person = value; }
}

