package com.nemo.web.statistics;

import java.util.List;

//UserDataRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.nemo.web.statistics.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Long> {

	List<UserData> findAll();
}

