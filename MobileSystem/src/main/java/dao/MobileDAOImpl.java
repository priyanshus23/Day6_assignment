package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pojo.MobileMapper;

import pojo.*;




@Component
public class MobileDAOImpl implements MobileDAO {

	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_MOBILE = "select * from mobile where id = ?";
	private final String SQL_DELETE_MOBILE = "delete from mobile where id = ?";
	private final String SQL_UPDATE_MOBILE = "update mobile set name = ?, price  = ?, quantity = ?, description = ? where id = ?";
	private final String SQL_GET_ALL = "select * from mobile";
	private final String SQL_INSERT_MOBILE = "insert into mobile(id, name, price, quantity, description) values(?,?,?,?,?)";

	@Autowired
	public MobileDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Mobile> getAllMobiles() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SQL_GET_ALL, new MobileMapper());
	}

	public boolean deleteMobile(Mobile mob) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_DELETE_MOBILE, mob.getId()) > 0;
	}

	public boolean updateMobile(Mobile mob) {
		return jdbcTemplate.update(SQL_UPDATE_MOBILE, mob.getName(), mob.getPrice(), mob.getQuantity(), mob.getDescription(), mob.getId() ) > 0;
		
	}

	public boolean createMobile(Mobile mob) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(SQL_INSERT_MOBILE, mob.getId(), mob.getName(), mob.getPrice(), mob.getQuantity(), mob.getDescription()) > 0;
	}

	public Mobile getMobileById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_FIND_MOBILE, new Object[] { id }, new MobileMapper());
	}
}