package edu.eci.cvds.ParcialT3.persistency.entity;


import edu.eci.cvds.ParcialT3.users.DoctorSpeciality;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    @Test
    void getIdTest(){
        User user =new User(123,"Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.DIRECTOR,"123456");
        assertEquals(123,user.getId());
    }

    @Test
    void getNameTest(){
        User user =new User(123,"Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.DIRECTOR,"123456");
        assertEquals("Andres Silva",user.getName());
    }

    @Test
    void getEmailTest(){
        User user =new User(123,"Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.DIRECTOR,"123456");
        assertEquals("AndresSilva@gmail.com",user.getEmail());
    }

    @Test
    void getRoleTest(){
        User user =new User(123,"Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.DIRECTOR,"123456");
        Assertions.assertEquals(DoctorSpeciality.DIRECTOR,user.getRole());
    }

    @Test
    void getPasswordTest(){
        User user =new User(123,"Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.DIRECTOR,"123456");
        assertEquals("123456",user.getPassword());
    }

    @Test
    void setIdTest(){
        User user =new User(456,"Samuel Ortega","SamuelOrtega@gmail.com", DoctorSpeciality.CARDIOLOGO,"123456");
        user.setId(999);
        assertEquals(999,user.getId());
    }

    @Test
    void setPasswordTest(){
        User user =new User(456,"Samuel Ortega","SamuelOrtega@gmail.com", DoctorSpeciality.CARDIOLOGO,"123456");
        user.setPassword("999999");
        assertEquals("999999",user.getPassword());
    }

    @Test
    void setEmailTest(){
        User user =new User(456,"Samuel Ortega","SamuelOrtega@gmail.com", DoctorSpeciality.CARDIOLOGO,"123456");
        user.setEmail("SamuelOrtega@hotmail.com");
        assertEquals("SamuelOrtega@hotmail.com",user.getEmail());
    }

    @Test
    void setNameTest(){
        User user =new User(456,"Samuel Ortega","SamuelOrtega@gmail.com", DoctorSpeciality.CARDIOLOGO,"123456");
        user.setName("Ivan Torres");
        assertEquals("Ivan Torres",user.getName());
    }
    
    @Test
    void setRoleTest(){
        User user =new User(456,"Samuel Ortega","SamuelOrtega@gmail.com", DoctorSpeciality.CARDIOLOGO,"123456");
        user.setRole(DoctorSpeciality.DIRECTOR);
        Assertions.assertEquals(DoctorSpeciality.DIRECTOR,user.getRole());
    }
}
