package repository;

import java.util.List;

//UserDataRepository.java
import org.springframework.data.jpa.repository.JpaRepository;

import com.nemo.web.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Long> {

	List<UserData> findAll();
}

