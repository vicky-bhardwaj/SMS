package com.dac.studentApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.studentApp.model.Student;
import com.dac.studentApp.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo student;
	
	List<Student> students=new ArrayList<>();
	
		public StudentService() {
		
		}
		
		public void addStudent(Student stu) {
			
			student.save(stu);
		}
		public List<Student> getStudents(){
			return student.findAll();
		}

//
//public List<Product> getProducts() {
//	
//    return product.findAll();
//}
//
//
//
//public Product getProductById(int prodId) {
//
//	return product.findById(prodId).orElse(new Product());
//}
//
//public void updateProduct(Product prod) {
//
//	product.save(prod);
//	
//}
//public Product deleteProductById(int prodId) {
//
//	Product prod=product.findById(prodId).orElseThrow();
//	product.deleteById(prodId);
//	return prod;
//
//}
}
