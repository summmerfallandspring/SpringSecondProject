package com.example;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Repository
public class BoardDAO {
    //Connection conn = null;
    //PreparedStatement stmt = null;
    //ResultSet rs = null;

    //private final String BOARD_INSERT = "insert into BOARD (title, writer, content, category) values (?,?,?,?)";
    //private final String BOARD_UPDATE = "update BOARD set title=?, writer=?, content=? where seq=?";
    //private final String BOARD_DELETE = "delete from BOARD where seq=?";
    @Autowired
    SqlSession sqlSession;
    public int insertBoard(BoardVO vo) {
        int count = sqlSession.insert("Board.insertBoard", vo);
        return count;
    }

    public int deleteBoard(int id) {
        int count = sqlSession.delete("Board.deleteBoard", id);
        return count;
    }

    public int updateBoard(BoardVO vo) {
        int count = sqlSession.update("Board.updateBoard", vo);
        return count;
    }

   public BoardVO getBoard(int seq){
        BoardVO one = sqlSession.selectOne("Board.getBoard", seq);
        return one;
   }

   public List<BoardVO> getBoardList(){
        List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
        return list;
   }



}
