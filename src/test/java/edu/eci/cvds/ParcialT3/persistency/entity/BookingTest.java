package edu.eci.cvds.ParcialT3.persistency.entity;

import org.junit.jupiter.api.Test;
import edu.eci.cvds.ParcialT3.shedules.Hour;
import edu.eci.cvds.ParcialT3.bookings.BookingStatus;
import edu.eci.cvds.ParcialT3.Location.LocationName;
import edu.eci.cvds.ParcialT3.shedules.Day;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class BookingTest {
    @Test
    void getBookingIdTest() {
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        assertEquals(123, booking.getId());
    }

    @Test
    void getBookingUserIdTest(){
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        assertEquals(10000087,booking.getUserId());
    }

    @Test
    void getBookingLaboratoryNameTest(){
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        assertEquals(LocationName.HOSPITALSUR,booking.getLaboratoryName());
    }

    @Test
    void getBookingDayTest(){
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALNORTE, Day.MARTES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        assertEquals(Day.MARTES,booking.getDay());
    }

    @Test
    void getBookingStartHourTest(){
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALNORTE, Day.MARTES, Hour.OCHO_TREINTA, Hour.DIEZ, BookingStatus.AVAILABLE);
        assertEquals(Hour.OCHO_TREINTA,booking.getStartHour());
    }

    @Test
    void getBookingEndHourTest(){
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALNORTE, Day.MARTES, Hour.OCHO_TREINTA, Hour.DIEZ, BookingStatus.AVAILABLE);
        assertEquals(Hour.DIEZ,booking.getEndHour());
    }

    @Test
    void getBookingStatusTest(){
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALNORTE, Day.MARTES, Hour.ONCE_TREINTA, Hour.DIEZ, BookingStatus.UNAVAILABLE);
        assertEquals(BookingStatus.UNAVAILABLE,booking.getStatus());
    } 
    
    @Test
    void setBookingIdTest() {
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        booking.setId(456);
        assertEquals(456, booking.getId());
    }

    @Test
    void setBookingUserIdTest() {
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        booking.setUserId(20000099);
        assertEquals(20000099, booking.getUserId());
    }

    @Test
    void setBookingLaboratoryNameTest() {
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        booking.setLaboratoryName(LocationName.HOSPITALNORTE);
        assertEquals(LocationName.HOSPITALNORTE, booking.getLaboratoryName());
    }

    @Test
    void setBookingDayTest() {
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        booking.setDay(Day.MIERCOLES);
        assertEquals(Day.MIERCOLES, booking.getDay());
    }

    @Test
    void setBookingStartHourTest() {
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        booking.setStartHour(Hour.OCHO_TREINTA);
        assertEquals(Hour.OCHO_TREINTA, booking.getStartHour());
    }

    @Test
    void setBookingEndHourTest() {
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        booking.setEndHour(Hour.CUATRO);
        assertEquals(Hour.CUATRO, booking.getEndHour());
    }

    @Test
    void setBookingStatusTest() {
        Booking booking = new Booking(123, 10000087, LocationName.HOSPITALSUR, Day.LUNES, Hour.ONCE_TREINTA, Hour.UNA, BookingStatus.AVAILABLE);
        booking.setStatus(BookingStatus.UNAVAILABLE);
        assertEquals(BookingStatus.UNAVAILABLE, booking.getStatus());
    }
}