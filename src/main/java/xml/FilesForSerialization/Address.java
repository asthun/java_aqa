package xml.FilesForSerialization;

import java.io.Serializable;

public class Address  implements Serializable {
    private String streetName;
    private String city;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String value) {
        this.streetName = value;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }

static class Addresses  implements Serializable  {
        private Address[] address;

        public Address[] getAddress() { return address; }
        public void setAddress(Address[] value) { this.address = value; }
    }
}
