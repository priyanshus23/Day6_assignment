package pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
public class MobileMapper implements RowMapper<Mobile>{
	
	public Mobile mapRow(ResultSet resultSet, int i) throws SQLException {

		Mobile mob = new Mobile();
		mob.setId(resultSet.getInt("id"));
		mob.setName(resultSet.getString("name"));
		mob.setPrice(resultSet.getInt("price"));
		mob.setQuantity(resultSet.getInt("quantity"));
		mob.setDescription(resultSet.getString("description"));
		return mob;

}
}