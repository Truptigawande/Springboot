package Project.First;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin("http://localhost:8090") 
public class StudentController {

	@Autowired
	SessionFactory factory;

	List<Student> arrayList=null;

	StudentController()
	{
      
	}

	@GetMapping("students")
	
	List<Student> allStudents()
	{
		Session s = factory.openSession();

		List<Student> arrayList=s.createCriteria(Student.class).list();

		return arrayList;
	}

	// @PathVariable assign value of path variable to local variable

	@GetMapping("student/{rno}")
	
	public Student getStudent(@PathVariable int rno)
	{
		Session session = factory.openSession();

		Student s = session.load(Student.class, rno);

		return s;
	}

	@PostMapping("add")
	
	public List<Student>  addStudent(@RequestBody Student student)
	{
		Session s = factory.openSession();
		
		Transaction tt = s.beginTransaction();
		
		s.save(student);
		
		tt.commit();
		
		List<Student> list = allStudents();
		
		return list;
	}

	@PutMapping("update")
	
	List<Student> updateStudent(@RequestBody Student stu){

		Session s = factory.openSession();
		
		Transaction tt = s.beginTransaction();
		
		s.saveOrUpdate(stu);
		
		tt.commit();
		
		List<Student> list = allStudents();
		
		return list;
	}

	@DeleteMapping("delete/{rno}")
	
	List<Student> deleteStudent(@PathVariable int rno){

		Session s = factory.openSession();
		
		Student ss = s.load(Student.class, rno);
		
		Transaction tt = s.beginTransaction();
		
		s.delete(ss);
		
		tt.commit();

		List<Student> list = allStudents();
		
		return list;

	}

}
