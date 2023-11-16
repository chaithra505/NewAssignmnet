package com.sonata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonata.model.User;
import com.sonata.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired 
	private UserRepo userRepo;
	
	

    public User getById(int userId) {
		return userRepo.findById(userId).orElse(null);
	}

	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	public User save(User user) {
		return userRepo.save(user);
	}
    
	
	public User updateUser(User updatedUser) {
        User existingUser = userRepo.findById(updatedUser.getUserId()).orElse(null);
           //fetching the existing user details
        
        if (existingUser != null) {
            existingUser.setUserName(updatedUser.getUserName());
            existingUser.setPhoneNumber(updatedUser.getPhoneNumber());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setPassword(updatedUser.getPassword());

            // Save the updated user
            return userRepo.save(existingUser);
        } else {
            return null; // User not found
        }
    }
	
	
	 public boolean deleteUser(int userId) { 
	        if (userRepo.existsById(userId)) {
	            userRepo.deleteById(userId);
	            return true;
	        } else {
	            return false; 
	        }
	    }
    
    

    
	

}
