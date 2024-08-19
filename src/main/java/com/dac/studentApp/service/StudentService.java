package com.dac.studentApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.studentApp.model.Student;
import com.dac.studentApp.repository.StudentRepo;


@Service
public class StudentService {

		@Autowired
		private StudentRepo studentRepository;
		
		
		public List<Student> getAll() {
			return (List<Student>) studentRepository.findAll();
		}

		
		public Student getOne(int rollNo) {
			return studentRepository.findById(rollNo).orElse(null);
		}

		public void addNew(Student student) {
			studentRepository.save(student);
		}
		
		public void update(Student student) {
			studentRepository.save(student);
		}
		
		public void delete(int rollNo) {
			studentRepository.deleteById(rollNo);
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
