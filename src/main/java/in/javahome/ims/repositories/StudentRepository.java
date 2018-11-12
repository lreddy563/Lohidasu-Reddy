package in.javahome.ims.repositories;

import in.javahome.ims.entities.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
//	public Student findByEmail(String email);
}
