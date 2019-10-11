package com.cts.mentorsearch.service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.mentorsearch.model.MentorCalendar;
import com.cts.mentorsearch.model.MentorSkills;
import com.cts.mentorsearch.repository.MentorCalendarRepository;
import com.cts.mentorsearch.repository.MentorSkillsRepository;

@Service
@Transactional
public class MentorSearchService {
	
	@Autowired 
	MentorSkillsRepository mentorSkillsRepo;
	@Autowired 
	MentorCalendarRepository mentorCalendarRepo;
	

	public List<Long> getMentorIds(String name,String start,String end){
		List<Long> mentors = new ArrayList<Long>(getMentoridsByName(name));
		System.out.println(mentors);
		mentors.retainAll(getAllMentorsByTimings(start,end));
		System.out.println(mentors);
		return mentors;
		
	}
	
	
	public List<Long> getMentoridsByName(String name){
		return mentorSkillsRepo.getMentoridsByName(name);
	}
	
	public List<Long> getAllMentorsByTimings(String start,String end){
		return mentorCalendarRepo.getAllMentorsByTimings(start, end);
	}
	
	public MentorSkills addSkills(MentorSkills skill) {
		return mentorSkillsRepo.save(skill);
	}
	
	public MentorSkills upadteSkill(MentorSkills skill) {
		return mentorSkillsRepo.save(skill);
	}
	
	public MentorCalendar addCalendar(MentorCalendar calendar) {
		return mentorCalendarRepo.save(calendar);
	}
	
	public MentorCalendar updateCalendar(MentorCalendar calendar) {
		return mentorCalendarRepo.save(calendar);
	}
	
	/*public MentorSkills getSkillByID(Long mentorid) {
		return mentorSkillsRepo.findByMentorid(mentorid);
	}*/
	
	public Optional<MentorSkills> getById(Long id) {
		return mentorSkillsRepo.findById(id);
	}
	
	/*public MentorCalendar getCalendarById(Long mentorid) {
		return mentorCalendarRepo.findByMentorid(mentorid);
	}*/

}
