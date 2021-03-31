package com.example.demo;


import com.example.demo.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Part07Errors {


	public Mono<User> betterCallSaulForBogusMono(Mono<Object> error) {
		return null;
	}

	public Flux<User> betterCallSaulAndJesseForBogusFlux(Flux<Object> error) {
		return null;
	}

	public Flux<User> capitalizeMany(Flux<User> just) {
		return null;
	}

	public class GetOutOfHereException extends Exception{
	}
}