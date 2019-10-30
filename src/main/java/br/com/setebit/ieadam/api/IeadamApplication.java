package br.com.setebit.ieadam.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.setebit.ieadam.api.repository.UserRepository;
import br.com.setebit.ieadam.api.repository.UsuarioRepositorio;
import br.com.setebit.ieadam.api.security.entity.User;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.enums.ProfileEnum;

@SpringBootApplication
public class IeadamApplication implements CommandLineRunner{

	@Autowired
	UsuarioRepositorio rep;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(IeadamApplication.class, args);
	}

	/*
	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			initUsers(userRepository, passwordEncoder);
		};
	}

	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		User admin = new User();
		admin.setEmail("admin@helpdesk.com");
		admin.setPassword(passwordEncoder.encode("123456"));
		admin.setProfile(ProfileEnum.ROLE_ADMIN);

		User find = userRepository.findByEmail("admin@helpdesk.com");
		if (find == null) {
			userRepository.save(admin);
		}
	}
	*/

	private void addUsuarioAdm() {
		
		System.out.println("Senha="+passwordEncoder.encode("123"));

		Usuario usuario = new Usuario();
		usuario.setArea(true);
		usuario.setEmail("ieadam@gmail.com");
		usuario.setIn_privilegio(true);
		usuario.setLogin("ieadam");
		usuario.setNome("Administrador do Sistema");
		usuario.setNucleo(true);
		usuario.setProfile(ProfileEnum.ROLE_ADMIN);
		usuario.setSenha("$2a$10$0s1XgwwuJvycws.uUxKpheILhrOIfsmRcYJ6mEkzJunPN24rCgR7y");
		usuario.setStatus("A");
		usuario.setZona(true);
		usuario.setIdMembro(6963);
		usuario.setIdUsuario(1700);
		//1699

		Usuario find = rep.findByEmail("ieadam@gmail.com");
		if (find == null) {
			rep.save(usuario);
		}

	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		addUsuarioAdm();
		
	}
}