package com.example.demo;


import com.example.demo.domain.User;
import reactor.core.Exceptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Part07Errors {


	public Mono<User> betterCallSaulForBogusMono(Mono<User> error) {
		return error.onErrorReturn(User.SAUL);
	}

	public Flux<User> betterCallSaulAndJesseForBogusFlux(Flux<User> error) {
		return error.onErrorResume(e -> Flux.just(User.SAUL,User.JESSE));
	}

	public Flux<User> capitalizeMany(Flux<User> just) {
		return just.map(
				user -> {
					try {
						return capitalizeUser(user);
					} catch (GetOutOfHereException e) {
						throw Exceptions.propagate(e);
					}
				}
		);
	}

	User capitalizeUser(User user) throws GetOutOfHereException {
		if (user.equals(User.SAUL)) {
			throw new GetOutOfHereException();
		}
		return new User(user.getUsername(), user.getFirstname(), user.getLastname());
	}

	public class GetOutOfHereException extends Exception{
		private static final long serialVersionUID = 0L;
	}
}