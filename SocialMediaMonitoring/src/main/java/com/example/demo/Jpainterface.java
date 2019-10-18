package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Jpainterface extends JpaRepository<Bean, Long>
{
	   @Query(value = "SELECT count(*) from twitterdata where journey = 'billing' " , nativeQuery = true)
	   int billing();
	   @Query(value = "SELECT count(*) from twitterdata where journey = 'plumbing' " , nativeQuery = true)
	   int plumbing();
}
