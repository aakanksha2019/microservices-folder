package com.cts.mentorsearch.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.mentorsearch.model.MentorSkills;

public interface MentorSkillsRepository extends JpaRepository<MentorSkills,Long>{
	
	@Query(value="select s.mentorid from mentorskills s where name = ?1",nativeQuery=true)
	public List<Long> getMentoridsByName(String name);
	
//	public MentorSkills findByMentorid(Long mentorid);

}
