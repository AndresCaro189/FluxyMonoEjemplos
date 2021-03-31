package com.example.demo;

import reactor.core.publisher.Mono;

/**
 *
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html">Mono Javadoc</a>
 */
public class Part02Mono {

	// TODO Return  empty Mono
	public Mono<String> emptyMono() {
		return Mono.empty();
	}

	// TODO Devuelve un Mono que nunca emite ninguna señal.
	public Mono<String> monoWithNoSignal() {
		return Mono.never();
	}

	// TODO Devuelve un Mono que contiene un valor "foo"
	public Mono<String> fooMono() {
		return Mono.just("foo");
	}

	// TODO Crea un Mono que emita una IllegalStateException
	public Mono<String> errorMono() {
		return Mono.error(new IllegalStateException());
	}
}