package com.cts.trainings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.cts.trainings.model.Trainings;

public interface TrainingsRepository extends CrudRepository<Trainings,Long> {
	
	public List<Trainings> findBymentorIdIn(List<Long> list);
	
	@Query(value="select * from trainings where userId=?1 and status='In_Progress'",nativeQuery=true)
	public List<Trainings> showcurrent(Long userId);
	@Query(value="select * from trainings where userId=?1 and status='Completed'",nativeQuery=true)
	public List<Trainings> showcompleted(Long userId);
}