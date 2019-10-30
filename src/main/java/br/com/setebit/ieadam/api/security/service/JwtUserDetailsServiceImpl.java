package br.com.setebit.ieadam.api.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.setebit.ieadam.api.security.entity.User;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.jwt.JwtUserFactory;
import br.com.setebit.ieadam.api.service.UserService;
import br.com.setebit.ieadam.api.service.UsuarioServico;

@Service
public class JwtUserDetailsServiceImpl  implements UserDetailsService {

    @Autowired
    private UsuarioServico userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

    	Usuario user = userService.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", email));
        } else {
            return JwtUserFactory.create(user);
        }
    }
}