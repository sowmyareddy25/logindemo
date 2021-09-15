package com.example.logindemo;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.web.bind.annotation.RequestParam;

public interface UserDAO extends JpaRepository<UserDTO, Integer> {

	void findByName(String userName);



}
