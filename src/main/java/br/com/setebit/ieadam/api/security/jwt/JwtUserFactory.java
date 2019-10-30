package br.com.setebit.ieadam.api.security.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.enums.ProfileEnum;

public class JwtUserFactory {
	private JwtUserFactory() {
	}

	public static JwtUser create(Usuario user) {
		return new JwtUser(user.getIdUsuario(), user.getEmail(), user.getSenha(),
				mapToGrantedAuthorities(user.getProfile()));
	}

	private static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnum profileEnum) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(profileEnum.toString()));
		return authorities;
	}
}