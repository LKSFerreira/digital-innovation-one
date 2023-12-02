package dio.webapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import dio.webapi.Repository.IUserRepository;
import dio.webapi.models.UserModel;

@Configuration
public class InjectionUserDB implements CommandLineRunner {

	@Autowired
	private IUserRepository userServiceImpl;

	@Override
	public void run(String... args) throws Exception {

		List<UserModel> users = new ArrayList<>(Arrays.asList(
				new UserModel("Administrador Atos", "admin", "admin", "admin@atos.net"),
				new UserModel("Usuario Atos", "user", "user", "user@atos.net"),
				new UserModel("Fulano de Tal", "fulano", "fulano", "fulano@atos.net"),
				new UserModel("Ciclano de Tal", "ciclano", "ciclano", "ciclano@anots.net"),
				new UserModel("Beltrano de Tal", "beltrano", "beltrano", "beltrano@atos.net")));

		userServiceImpl.saveAll(users);
	}

}