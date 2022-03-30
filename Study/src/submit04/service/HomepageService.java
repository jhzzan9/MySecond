package submit04.service;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import submit04.dao.HomepageDao;
import submit04.jdbc.ConnectionPool;
import submit04.model.BoardVO;
import submit04.model.MemberVO;

public class HomepageService {
	private static HomepageService instance = new HomepageService();
	private HomepageDao dao = HomepageDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();

	private HomepageService() {}

	public static HomepageService getInstance() {
		if (instance == null) {
			instance = new HomepageService();
	}
		return instance;
	}
	
	// 회원 가입
	public int registMem(String id, String pw) {
		Connection conn = cp.getConnection();
		try {
			return dao.registMem(conn, id, pw);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null)
				cp.releaseConnection(conn);
		}
		return 0;
	}
	
	// 중복 체크
	public MemberVO getMem(String id) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.getMem(conn, id);
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null)
				cp.releaseConnection(conn);
		}
		return new MemberVO();
	}
	
	// 글 저장
	public int saveBoard(BoardVO board) {
		
		Connection conn = cp.getConnection();
		try {
			return dao.saveBoard(conn, board);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return 0;
	}
	
	// 글 번호를 받고 그 글을 보여주는 리스트
	public BoardVO getBoard(int boardNo){
		Connection conn = cp.getConnection();
		
		try {
			return dao.getBoard(conn, boardNo);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return new BoardVO();
	}
	
	// 글을 보여주는 리스트
	public ArrayList<BoardVO> showBoard(){
		Connection conn = cp.getConnection();
		
		try {
			return dao.showBoard(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return new ArrayList<BoardVO>();
	}
	

		
	}
	


