package com.bdqn.dao;

import com.bdqn.domain.Student;

public interface IStudentDAO {
	//����
	public boolean insertStudent(Student parStudent);
	//��ѯ
	public Student findByStuNo(String parStuNo);
}
