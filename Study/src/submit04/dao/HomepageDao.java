package submit04.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import submit04.model.BoardVO;
import submit04.model.MemberVO;

public class HomepageDao {
	private static HomepageDao instance = new HomepageDao();
	
	private HomepageDao() {}
	
	public static HomepageDao getInstance() {
		if(instance == null) {
			instance = new HomepageDao();
		}
	return instance;
	}
	
	// 회원가입
	public int registMem(Connection conn, String id, String pw) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO				");
		query.append("			member			");
		query.append("VALUES (					");
		query.append("		  ?					");
		query.append("		, ?					");
		query.append("		)					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		MemberVO temp = new MemberVO(id, pw);
		
		int idx = 1;
		ps.setString(idx++, temp.getMemId());
		ps.setString(idx++, temp.getMemPw());

		int cnt = ps.executeUpdate();
		
		if(ps!=null)ps.close();
		
		return cnt;
	}

	// 회원가입할 때 중복 체크
	public MemberVO getMem(Connection conn, String id) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT				");
		query.append("		mem_id  		");
		query.append("	  , mem_pw 			");
		query.append("FROM					");
		query.append("		member 			");
		query.append("WHERE 1=1				");
		query.append("AND mem_id = ?		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		MemberVO temp = new MemberVO();
		
		while (rs.next()) {

			temp.setMemId(rs.getString("mem_id"));
			temp.setMemPw(rs.getString("mem_pw"));
		}
		
		if(ps!=null)ps.close();
		if(rs!=null)ps.close();
		
		return temp;
	}
	
	// 글 저장 (Insert)
	public int saveBoard(Connection conn, BoardVO board) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO				");
		query.append("			board			");
		query.append("VALUES (					");
		query.append("		  seq_no.NEXTVAL	");
		query.append("		, ?					");
		query.append("		, ?					");
		query.append("		, ?					");
		query.append("		, ?					");
		query.append("		)					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, board.getBoardTitle());
		ps.setString(idx++, board.getBoardContent());
		ps.setString(idx++, board.getBoardId());
		ps.setString(idx++, board.getBoardDate());
		
		int cnt = ps.executeUpdate();
		
		if(ps!=null)ps.close();
		
		return cnt;
	}
	
	// 글의 번호를 입력해 그 글을 보여주는 것 (select)
	public BoardVO getBoard(Connection conn, int boardNo) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT				");
		query.append("		board_no 		");
		query.append("	  , board_title  	");
		query.append("	  , board_content  	");
		query.append("	  , board_id	  	");
		query.append("	  , board_date  	");
		query.append("FROM					");
		query.append("		board			");
		query.append("WHERE 1=1				");
		query.append("AND board_no = ?		");
		query.append("ORDER BY 				");
		query.append("			1			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setInt(1, boardNo);
	
		ResultSet rs = ps.executeQuery();
		
		BoardVO temp = new BoardVO();
		
		while(rs.next()) {
			temp.setBoardNo(rs.getInt("board_no"));
			temp.setBoardTitle(rs.getString("board_title"));
			temp.setBoardId(rs.getString("board_id"));
			temp.setBoardDate(rs.getString("board_date"));
			temp.setBoardContent(rs.getString("board_content"));
		} 
		if(ps!=null)ps.close();
		if(rs!=null)rs.close();
		
		return temp;
		
	}
	
	// 글 목록을 보여주는 것 (select)
		public ArrayList<BoardVO> showBoard(Connection conn) throws SQLException{
			StringBuffer query = new StringBuffer();
			query.append("SELECT				");
			query.append("		board_no 		");
			query.append("	  , board_title  	");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
			query.append("	  , board_id	  	");
			query.append("	  , board_date  	");
			query.append("FROM					");
			query.append("		board			");
			query.append("ORDER BY 				");
			query.append("			1			");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());		
			ResultSet rs = ps.executeQuery();
			
			ArrayList<BoardVO> result = new ArrayList<BoardVO>();
			
			while(rs.next()) {
				BoardVO temp = new BoardVO();
				
				temp.setBoardNo(rs.getInt("board_no"));
				temp.setBoardTitle(rs.getString("board_title"));
				temp.setBoardId(rs.getString("board_id"));
				temp.setBoardDate(rs.getString("board_date"));
				
				result.add(temp);
			}
			
			if(ps!=null)ps.close();
			if(rs!=null)rs.close();
			
			return result;
			
		}
	
	
		
	}


