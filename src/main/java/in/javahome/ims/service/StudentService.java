package in.javahome.ims.service;

import in.javahome.ims.entities.Student;
import in.javahome.ims.repositories.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService implements IStudentService {
	@Autowired
	private StudentRepository repository;

	@Transactional
	public void addStudentDetails(Student student) {
		repository.save(student);
	}
}
