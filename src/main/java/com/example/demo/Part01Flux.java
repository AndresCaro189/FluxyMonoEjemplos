package com.example.demo;

import reactor.core.publisher.Flux;

public class Part01Flux {
	
		// TODO Return  empty Flux
		Flux<String> emptyFlux() {
			return null;
		}
	

		//TODO Devuelve un Flux que contiene 2 valores "foo" y "bar" sin usar una matriz o una colección
		Flux<String> fooBarFluxFromValues() {
			return null;
		}
		

		// TODO Cree un flujo a partir de una lista que contenga 2 valores "foo" y "bar"
		Flux<String> fooBarFluxFromList() {
			return null;
		}
		

		// TODO Cree un flujo que emita una IllegalStateException
		Flux<String> errorFlux() {
			return null;
		}
		

		// TODO Cree un flujo que emita valores crecientes de 0 a 9 cada 100 ms
		Flux<Long> counter() {
			return null;
		}
	

	}