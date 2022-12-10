package com.dailycodebuffer.department.service;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@Slf4j
public class DepartmentService {
	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	public Department saveDepartment(Department department) {
		log.info("Inside sveDepartment of DepartmentService");
		return departmentRepository.save(department);
	}

	@GetMapping("{/id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
