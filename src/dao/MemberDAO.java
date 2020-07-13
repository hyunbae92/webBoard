package dao;

import java.sql.*;
import java.util.Map;

import common.Connector;

public class MemberDAO {

	public int insertMember(Map<String,String> params) {
		String sql = "insert into member(num,name,id,password,joindate,etc)\r\n" + 
				"values(seq_member_num.nextval, ?,?,?,sysdate,?)";
		try {
			Connection conn = Connector.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, params.get("name"));
			ps.setString(2, params.get("id"));
			ps.setString(3, params.get("password"));
			ps.setString(4, params.get("etc"));
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Connector.close();
		}
		return 0;
	}
}
