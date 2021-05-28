package guru.springframework.spring5webapp.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Publisher {

    @Id
    @GeneratedValue
    private Long id;


    private String name;
    private String addressLine1;
    private String city;
    private String state;
    private String zip;

    public Publisher(String name, String addressLine1, String city, String state, String zip) {
        this.name = name;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        if (!getId().equals(publisher.getId())) return false;
        if (!getName().equals(publisher.getName())) return false;
        if (!getAddressLine1().equals(publisher.getAddressLine1())) return false;
        if (!getCity().equals(publisher.getCity())) return false;
        if (!getState().equals(publisher.getState())) return false;
        return getZip().equals(publisher.getZip());
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getAddressLine1().hashCode();
        result = 31 * result + getCity().hashCode();
        result = 31 * result + getState().hashCode();
        result = 31 * result + getZip().hashCode();
        return result;
    }
}
