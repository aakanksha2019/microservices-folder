package com.cts.mentorsearch.repository;

import java.sql.Time;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.mentorsearch.model.MentorCalendar;

public interface MentorCalendarRepository extends JpaRepository<MentorCalendar,Long> {

	@Query(value="SELECT m.mentorid from mentorcalender m where start_time = ?1 AND  end_time = ?2",nativeQuery=true)
	public List<Long> getAllMentorsByTimings(String start_time,String end_time);
	
//	public MentorCalendar findByMentorid(Long mentorid);
}
