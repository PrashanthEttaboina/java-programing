package NamedJdbcTemplate;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.support.JdbcAccessor;

@Configuration
public class Configure {
	@Bean
	public DataSource datasource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/lotus");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;

	}

	@Bean
	public NamedParameterJdbcTemplate jdbcTemplate() {
		NamedParameterJdbcTemplate jt = new NamedParameterJdbcTemplate(datasource());
		return jt;
	}

	@Bean
	public InsertLogic insertbean() {

		InsertLogic il = new InsertLogic();
		il.setJdbcTemplate(jdbcTemplate());
		return il;
	}

	@Bean
	public UpdateLogic updatebean() {

		UpdateLogic ul = new UpdateLogic();
		ul.setJdbcTemplate(jdbcTemplate());
		return ul;
	}

	@Bean
	public DisplayLogic displaybean() {

		DisplayLogic dl = new DisplayLogic();
		dl.setJdbcTemplate(jdbcTemplate());
		return dl;
	}

	@Bean
	public DeleteLogic deletebean() {

		DeleteLogic dl = new DeleteLogic();
		dl.setJdbcTemplate(jdbcTemplate());
		return dl;
	}
}
