package xml.FilesForSerialization;

import java.io.Serializable;

public class Person  implements Serializable {
    private String firstName;
    private String lastName;
    private PhoneNumbers phoneNumbers;
    private Address.Addresses addresses;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(PhoneNumbers value) {
        this.phoneNumbers = value;
    }

    public Address.Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Address.Addresses value) {
        this.addresses = value;
    }
}
