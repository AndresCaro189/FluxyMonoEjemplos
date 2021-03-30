package com.example.demo;

import reactor.core.publisher.Mono;

public class Part02Mono {

		// TODO Return  empty Mono
		Mono<String> emptyMono() {
			return null;
		}	

		// TODO Devuelve un Mono que nunca emite ninguna señal.
		Mono<String> monoWithNoSignal() {
			return null;
		}	

		// TODO Devuelve un Mono que contiene un valor "foo"
		Mono<String> fooMono() {
			return null;
		}	

		// TODO Crea un Mono que emita una IllegalStateException
		Mono<String> errorMono() {
			return null;
		}
	
}