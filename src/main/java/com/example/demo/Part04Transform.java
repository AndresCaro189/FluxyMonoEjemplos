package com.example.demo;

import reactor.core.publisher.Mono;

public class Part04Transform {

		// TODO Escriba con mayúscula el nombre de usuario, el nombre y el apellido del usuario
		Mono<User> capitalizeOne(Mono<User> mono) {
			return null;
		}	

		// TODO Escriba con mayúscula el nombre de usuario, el nombre y el apellido de los usuarios
		Flux<User> capitalizeMany(Flux<User> flux) {
			return null;
		}	

		// TODO Escriba en mayúscula el nombre de usuario, el nombre y el apellido de los usuarios con #asyncCapitalizeUser
		Flux<User> asyncCapitalizeMany(Flux<User> flux) {
			return null;
		}
	

		Mono<User> asyncCapitalizeUser(User u) {
			return Mono.just(new User(u.getUsername().toUpperCase(), u.getFirstname().toUpperCase(), u.getLastname().toUpperCase()));
		}
}