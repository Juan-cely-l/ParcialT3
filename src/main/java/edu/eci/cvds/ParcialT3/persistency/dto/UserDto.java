package edu.eci.cvds.ParcialT3.persistency.dto;

import edu.eci.cvds.ParcialT3.users.DoctorSpeciality;

public class UserDto {

    private String name;

    private String email;

    private DoctorSpeciality role;

    private String password;

    public UserDto(String name, String email, DoctorSpeciality role, String password) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DoctorSpeciality getRole() {
        return role;
    }

    public void setRole(DoctorSpeciality role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
