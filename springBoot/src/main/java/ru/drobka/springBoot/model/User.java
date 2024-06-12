package ru.drobka.springBoot.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Имя не может быть пустым")
    @Size(min = 2, max = 10, message = "Имя в пределах от 2 до 10 знаков")
    @Pattern(regexp = "^[\\p{L}]+(?: [\\p{L}]+)*$", message = "Имя может содержать только буквы и пробелы")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Фамилия не может быть пустой")
    @Size(min = 2, max = 15, message = "Фамилия в пределах от 2 до 15 знаков")
    @Pattern(regexp = "^[\\p{L}]+(?: [\\p{L}]+)*$", message = "Фамилия может содержать только буквы и пробелы")
    @Column(name = "last_name")
    private String lastname;

    @NotEmpty(message = "Почта не может быть пустой")
    @Email(message = "Почта должна быть валидная")
    @Column(name = "email")
    private String email;

    public User() {

    }

    public User(int id, String name, String lastname, String email) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
