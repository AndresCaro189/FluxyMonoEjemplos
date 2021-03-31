package com.example.demo;


import com.example.demo.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Learn how to merge flux.
 *
 */
public class Part05Merge {

	// TODO Fusionar valores de flux1 y flux2 con intercalación
	public Flux<User> mergeFluxWithInterleave(Flux<User> flux1, Flux<User> flux2) {
		return Flux.merge(flux1, flux2);
	}

	// TODO Fusionar valores de flux1 y flux2 sin intercalación (valores de flujo1 y luego valores de flujo2)
	public Flux<User> mergeFluxWithNoInterleave(Flux<User> flux1, Flux<User> flux2) {
		return Flux.mergeSequential(flux1, flux2);
	}

	// TODO Cree un flujo que contenga el valor de mono1 y luego el valor de mono2
	public Flux<User> createFluxFromMultipleMono(Mono<User> mono1, Mono<User> mono2) {
		return Flux.concat(mono1, mono2);
	}
}