package com.indu.mongorepository.listner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;

import com.indu.model.User;
import com.indu.mongorepository.AddressRepository;

public class UserCascadeSaveMongoEventListener extends AbstractMongoEventListener<User> {
	
	
    @Autowired
	private AddressRepository repository;
 
    
    @Override
    public void onBeforeConvert(BeforeConvertEvent<User> event) { 
        Object source = event.getSource(); 
        if ((source instanceof User) && (((User) source).getAddress() != null)) {
        	repository.insert(((User) source).getAddress());
        }
    }
}