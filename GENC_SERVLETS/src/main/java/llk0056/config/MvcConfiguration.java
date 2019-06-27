package llk0056.config;

import llk0056.dao.AuthorDao;
import llk0056.dao.AuthorDaoDatabase;
import llk0056.service.AuthorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages="llk0056")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer {

	@Bean
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");//prepend
		resolver.setSuffix(".jsp");//append
		return resolver;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public MultipartResolver multipartResolver(){
		return new CommonsMultipartResolver();
	}

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/casestudy?serverTimezone=America/Chicago&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		return dataSource;
	}
	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}

	@Bean
	public AuthorDao authorDao() {
		AuthorDaoDatabase p = new AuthorDaoDatabase();
		return p;
	}

	@Bean
	public AuthorService authorService() {
		AuthorService p = new AuthorService();
		return p;
	}
}
