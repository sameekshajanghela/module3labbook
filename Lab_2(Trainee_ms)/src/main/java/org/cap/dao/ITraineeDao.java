package org.cap.dao;

import java.util.List;

import java.util.Map;

import org.cap.entities.Admin;
import org.cap.entities.Trainee;


public interface ITraineeDao {
	Trainee add(Trainee trainee);
	void  delete(int traineeId);
	Trainee modify(Trainee trainee);
	Trainee retrieve (int traineeId);
	List<Trainee> fetchall();
    Admin findId (int id);
}
