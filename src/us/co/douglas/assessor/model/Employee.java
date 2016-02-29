package us.co.douglas.assessor.model;

/**
 * Created by mdronamr on 2/23/16.
 */
import org.codehaus.jackson.annotate.JsonProperty;

public class Employee {
    private String employeeId;
    private String type;
    private String firstName;
    private String lastName;
    private Parcel parcel;

    @JsonProperty
    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    @JsonProperty("_id")
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @JsonProperty("first-name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("last-name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", type=" + type
                + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}