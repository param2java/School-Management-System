package com.jrd.sms.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.jrd.sms.model.Admin;
import com.jrd.sms.model.Student;
import com.jrd.sms.service.AdminService;
import com.jrd.sms.service.StudentService;


@Controller
@Path("/admin")
public class AdminResource {
	
	@Autowired	
	private AdminService adminService;
	
	@Autowired	
	private StudentService studentService;
	
	
	 @GET
	 @Produces(MediaType.TEXT_PLAIN)
	  public String getIt() {
	       return "Admin Resource got it!";
	  }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	@Path("login")
    public String login(Admin admin) {
        return adminService.login(admin);
    }
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
    public void createAdmin(Admin admin) {
         adminService.createAdmin(admin);
    }
	
	
	@GET
	@Path("viewStudents")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
	
	@POST	
	@Path("/{studentRollNo}")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student createStudent(@PathParam("studentRollNo") Long rollNo,Student student) {
		student.setRollNo(rollNo);
        return studentService.createStudent(student);
    }
	
	@POST
	@Path("addStudent")
	@Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student createStudent(Student student) {
        return studentService.createStudent(student);
    }
	
}
