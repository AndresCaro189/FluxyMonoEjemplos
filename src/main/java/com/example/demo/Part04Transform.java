package com.example.demo;


import com.example.demo.domain.User;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


public class Part04Transform {


	// TODO Escriba con mayúscula el nombre de usuario, el nombre y el apellido del usuario
	Mono<User> capitalizeOne(Mono<User> mono) {
		return mono.map(u -> new User(u.getUsername().toUpperCase(), u.getFirstname().toUpperCase(),
				u.getLastname().toUpperCase()));
	}

	// TODO Escriba con mayúscula el nombre de usuario, el nombre y el apellido de los usuarios
	Flux<User> capitalizeMany(Flux<User> flux) {
		return flux.map(u -> new User(u.getUsername().toUpperCase(), u.getFirstname().toUpperCase(),
				u.getLastname().toUpperCase()));
	}


	// TODO Escriba en mayúscula el nombre de usuario, el nombre y el apellido de los usuarios con #asyncCapitalizeUser
	Flux<User> asyncCapitalizeMany(Flux<User> flux) {
		return flux.flatMap(user -> asyncCapitalizeUser(user));
	}


	Mono<User> asyncCapitalizeUser(User u) {
		return Mono.just(new User(u.getUsername().toUpperCase(), u.getFirstname().toUpperCase(), u.getLastname().toUpperCase()));
	}

}