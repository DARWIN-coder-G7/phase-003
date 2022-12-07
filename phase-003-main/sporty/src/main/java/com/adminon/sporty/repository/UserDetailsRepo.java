package com.adminon.sporty.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.adminon.sporty.entity.UserDetails;
public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {

	
	@Query(value = "select * from user_details where uid =:keyword",nativeQuery=true)
	List<UserDetails>findbykeyword(@Param("keyword")String keyword);
}
