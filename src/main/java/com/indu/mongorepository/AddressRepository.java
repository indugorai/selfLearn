package com.indu.mongorepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.indu.model.Address;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {

	
}