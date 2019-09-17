package br.com.setebit.ieadam.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.setebit.ieadam.api.repository.UserRepository;
import br.com.setebit.ieadam.api.security.entity.User;
import br.com.setebit.ieadam.api.security.enums.ProfileEnum;


@SpringBootApplication
public class IeadamApplication {

	public static void main(String[] args) {
		SpringApplication.run(IeadamApplication.class, args);
	}
	
    @Bean
    CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return args -> {
            initUsers(userRepository, passwordEncoder);
        };
    }
    
	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        User admin = new User();
        admin.setEmail("claudemirramosferreira@gmal.com");
        admin.setPassword(passwordEncoder.encode("123"));
        admin.setProfile(ProfileEnum.ROLE_ADMIN);

        User find = userRepository.findByEmail("claudemirramosferreira@gmal.com");
        if (find == null) {
            userRepository.save(admin);
        }
    }
}