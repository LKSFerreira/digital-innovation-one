package dio.webapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dio.webapi.Repository.IUserRepository;
import dio.webapi.models.UserModel;

@Configuration
public class InjectionUserDB implements CommandLineRunner {

	@Autowired
	private IUserRepository userServiceImpl;

	@Override
	public void run(String... args) throws Exception {

		List<UserModel> users = new ArrayList<>();

		users.add(new UserModel("Administrador", "admin", "admin", "admin@test.net"));
		users.add(new UserModel("Fulano de Tal", "fulano", "123456", "fulano@test.net"));
		users.add(new UserModel("Ciclano de Tal", "ciclano", "123456", "ciclano@test.net"));
		users.add(new UserModel("Beltrano de Tal", "beltrano", "123456", "beltrano@test.net"));

		users.forEach(userServiceImpl::save);
	}

}