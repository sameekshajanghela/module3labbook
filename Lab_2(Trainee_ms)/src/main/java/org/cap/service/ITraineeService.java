package org.cap.service;

import java.util.List;

import java.util.Map;

import org.cap.entities.Admin;
import org.cap.entities.Trainee;


public interface ITraineeService {
	Trainee add(Trainee trainee);
	void  delete(int traineeId);
	Trainee modify(Trainee trainee);
	Trainee retrieve (int traineeId);
	List<Trainee> fetchall();
	Admin findId(int id);
}
