package org.cap.service;

import java.util.List;

import java.util.Map;

import javax.transaction.Transactional;

import org.cap.dao.ITraineeDao;
import org.cap.entities.Admin;
import org.cap.entities.Trainee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Transactional
@Service
public class TraineeServiceImpl implements ITraineeService {
	private ITraineeDao traineeDao;

	public ITraineeDao getTraineeDao() {
		return traineeDao;
	}
	@Autowired
	public void setTraineeDao(ITraineeDao traineeDao) {
		this.traineeDao = traineeDao;
	}
	@Override
	public Trainee add(Trainee trainee) {
		trainee = traineeDao.add(trainee);
		return trainee;
	}
	@Override
	public void delete(int traineeId) {
		traineeDao.delete(traineeId);
		
	}
	@Override
	public Trainee modify(Trainee trainee) {
		return traineeDao.modify(trainee);
	}
	@Override
	public Trainee retrieve(int traineeId) {
		Trainee trainee = traineeDao.retrieve(traineeId);
		return trainee;
	}
	@Override
	public List<Trainee> fetchall() {
	 List<Trainee>store=traineeDao.fetchall();
	 return store;
		
	}
	
	@Override
	public Admin findId(int id) {
		Admin admin1 = traineeDao.findId(id);
		return admin1;
	}
}
