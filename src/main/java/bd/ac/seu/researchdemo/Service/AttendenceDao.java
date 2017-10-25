package bd.ac.seu.researchdemo.Service;

import bd.ac.seu.researchdemo.Models.Attendance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AttendenceDao extends CrudRepository<Attendance,Integer> {
}