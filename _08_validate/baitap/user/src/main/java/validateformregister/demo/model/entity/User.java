package validateformregister.demo.model.entity;

import javax.persistence.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Size(min = 5, max = 45)
    private String firstName;
    @Size(min = 5, max = 45)
    private String lastName;
    @Size(min = 10, max = 11)
    private String phone;
    @Min(18)
    private int age;
    @Email
    private String email;

    public User() {

    }

    public User(Integer id, @Size(min = 5, max = 45) String firstName, @Size(min = 5, max = 45) String lastName, @Size(min = 10, max = 11) String phone, @Min(18) int age, @Email String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
