package xml.FilesForSerialization;

import java.io.Serializable;

public class PhoneNumbers  implements Serializable {
    private String[] phoneNumbers;

    public String[] getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String[] value) {
        this.phoneNumbers = value;
    }
}
