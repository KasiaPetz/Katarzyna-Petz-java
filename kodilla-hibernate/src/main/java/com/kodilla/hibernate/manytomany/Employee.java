package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@NamedQuery(
        name = "Employee.retrieveEmployeeByLastName",
        query = "FROM Employee WHERE lastname = :LASTNAME"
)
@Entity
@Table(name = "EMPLOYEES")
public class Employee {
    private int id;
    private String fitstName;
    private String lastname;
    private List<Company> companies = new ArrayList<>();

    public Employee() {
    }

    public Employee(String fitstName, String lastname) {
        this.fitstName = fitstName;
        this.lastname = lastname;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "EMPLOYEE_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "FIRSTNAME")
    public String getFitstName() {
        return fitstName;
    }

    @NotNull
    @Column(name = "LASTNAME")
    public String getLastname() {
        return lastname;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (
            name = "JOIN_COMPANY_EMPLOYEE",
            joinColumns = {@JoinColumn(name = "EMPLOYEE_ID", referencedColumnName = "EMPLOYEE_ID")},
            inverseJoinColumns = {@JoinColumn(name = "COMPANY_ID", referencedColumnName = "COMPANY_ID")}
    )
    public List<Company> getCompanies() {
        return companies;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFitstName(String fitstName) {
        this.fitstName = fitstName;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
