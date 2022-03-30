package lec14_jdbc_jsp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import lec14_jdbc_jsp.dao.StudentDao;
import lec14_jdbc_jsp.jdbc.ConnectionPool;
import lec14_jdbc_jsp.model.Student;

public class studentService {
	private static studentService instance = new studentService();
	private StudentDao dao = StudentDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();

	private studentService() {
	}

	public static studentService getInstance() {
		if (instance == null) {
			instance = new studentService();
		}
		return instance;
	}

	// 회원목록 조회 (SELECT)
	public ArrayList<Student> stuList() {
		Connection conn = cp.getConnection();

		try {
			return dao.stuList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) cp.releaseConnection(conn);
		}

		return new ArrayList<Student>();

	}

	// 회원 추가 (INSERT)
	public int insertStu(Student student) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.insertStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		
		return 0;
			
	}
	
	// 회원 삭제 (DELETE)
	public int deleteStu(Student student) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.deleteStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		
		return 0;
	}
	
	// 회원 전체 삭제 (DELETEALL)
	public int deleteAll(Student student) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.deleteAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		
		return 0;
	}
	
	// 회원 수정 (UPDATE)
	public int updateStu(Student student) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.updateStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		
		return 0;
	}
	
	}

