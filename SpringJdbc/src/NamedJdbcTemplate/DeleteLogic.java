package NamedJdbcTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class DeleteLogic {

	Scanner sc = new Scanner(System.in);
	NamedParameterJdbcTemplate namedTemplate;

	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.namedTemplate = jdbcTemplate;
	}

	public void delete() {
		System.out.println("Enter the id of the record to be deleted");
		int id1 = sc.nextInt();

		String sql = "delete from pirates where id=:id";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id1);

		int x = namedTemplate.update(sql, map);
		if (x > 0)
			System.out.println("Record Deleted");
	}

}
