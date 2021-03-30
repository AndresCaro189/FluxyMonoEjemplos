package com.example.demo;

public class Part05Merge {

		// TODO Fusionar valores de flux1 y flux2 con intercalación
		Flux<User> mergeFluxWithInterleave(Flux<User> flux1, Flux<User> flux2) {
			return null;
		}	

		// TODO Fusionar valores de flux1 y flux2 sin intercalación (valores de flujo1 y luego valores de flujo2)
		Flux<User> mergeFluxWithNoInterleave(Flux<User> flux1, Flux<User> flux2) {
			return null;
		}	

		// TODO Cree un flujo que contenga el valor de mono1 y luego el valor de mono2
		Flux<User> createFluxFromMultipleMono(Mono<User> mono1, Mono<User> mono2) {
			return null;
		}
}