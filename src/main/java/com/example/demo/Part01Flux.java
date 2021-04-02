package com.example.demo;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

/**
 *
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

	// TODO Return  empty Flux
	public Flux<String> emptyFlux() {
		return Flux.empty();
	}

	//TODO Devuelve un Flux que contiene 2 valores "foo" y "bar" sin usar una matriz o una colección
	public Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo", "bar");
	}

	// TODO Cree un flujo a partir de una lista que contenga 2 valores "foo" y "bar"
	public Flux<String> fooBarFluxFromList() {
		return Flux.fromIterable(Arrays.asList("foo", "bar","fob"));
	}

	// TODO Cree un flujo que emita una IllegalStateException
	public Flux<String> errorFlux() {
		return Flux.error(new IllegalStateException());
	}

	// TODO Cree un flujo que emita valores crecientes de 0 a 9 cada 100 ms
	public Flux<Long> counter() {
		return Flux.interval(Duration.ofSeconds(1)).take(10);
	}
}