package edu.eci.cvds.ParcialT3.persistency.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edu.eci.cvds.ParcialT3.persistency.entity.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, Integer> {

}
