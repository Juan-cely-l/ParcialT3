package edu.eci.cvds.ParcialT3.persistency.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.eci.cvds.ParcialT3.users.DoctorSpeciality;

class UserDtoTest {
    
    @Test
    void getNameTest(){
        UserDto userDto =new UserDto("Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.TEACHER,"123456");
        assertEquals("Andres Silva",userDto.getName());
    }

    @Test
    void getEmailTest(){
        UserDto userDto =new UserDto("Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.ADMIN,"123456");
        assertEquals("AndresSilva@gmail.com",userDto.getEmail());
    }

    @Test
    void getRoleTest(){
        UserDto userDto =new UserDto("Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.TEACHER,"123456");
        assertEquals(DoctorSpeciality.TEACHER,userDto.getRole());
    }

    @Test
    void getPasswordTest(){
        UserDto userDto =new UserDto("Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.TEACHER,"123456");
        assertEquals("123456",userDto.getPassword());
    }

    @Test
    void setPasswordTest(){
        UserDto userDto =new UserDto("Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.TEACHER,"123456");
        userDto.setPassword("999999");
        assertEquals("999999",userDto.getPassword());
    }

    @Test
    void setEmailTest(){
        UserDto userDto =new UserDto("Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.TEACHER,"123456");
        userDto.setEmail("SamuelOrtega@hotmail.com");
        assertEquals("SamuelOrtega@hotmail.com",userDto.getEmail());
    }

    @Test
    void setNameTest(){
        UserDto userDto =new UserDto("Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.TEACHER,"123456");
        userDto.setName("Ivan Torres");
        assertEquals("Ivan Torres",userDto.getName());
    }
    
    @Test
    void setRoleTest(){
        UserDto userDto =new UserDto("Andres Silva","AndresSilva@gmail.com", DoctorSpeciality.TEACHER,"123456");
        userDto.setRole(DoctorSpeciality.ADMIN);
        assertEquals(DoctorSpeciality.ADMIN,userDto.getRole());
    }

}
