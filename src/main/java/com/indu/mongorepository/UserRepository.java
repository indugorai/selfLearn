package com.indu.mongorepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.indu.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	//List<User> getAllUsers();
	
	@Query("{ 'username' : ?0, 'password' : ?1 }")
	User getUserByFirstName(String username, String password);
	
	//Boolean addUser(User user);
	
	//Boolean saveAddress(Address address);
	
}
