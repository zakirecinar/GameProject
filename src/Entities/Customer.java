package Entities;
import java.time.LocalDate;
public class Customer {
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String nationalityId;

    public Customer(String id, String email, String firstName, String lastName, LocalDate dateOfBirth, String nationalityId) {
        this.setId(id);
        this.setEmail(email);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setDateOfBirth(dateOfBirth);
        this.setNationalityId(nationalityId);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }
}
