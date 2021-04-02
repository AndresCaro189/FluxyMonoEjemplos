package com.example.demo;


import com.example.demo.domain.User;
import org.junit.jupiter.api.Test;
import reactor.core.Exceptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;


public class Part07ErrorsTest {

	Part07Errors workshop = new Part07Errors();


	@Test
	public void monoWithValueInsteadOfError() {
		Mono<User> mono = workshop.betterCallSaulForBogusMono(Mono.error(new IllegalStateException()));
		StepVerifier.create(mono)
				.expectNext(User.SAUL)
				.verifyComplete();

		mono = workshop.betterCallSaulForBogusMono(Mono.just(User.SKYLER));
		StepVerifier.create(mono)
				.expectNext(User.SKYLER)
				.verifyComplete();
	}


	@Test
	public void fluxWithValueInsteadOfError() {
		Flux<User> flux = workshop.betterCallSaulAndJesseForBogusFlux(Flux.error(new IllegalStateException()));
		StepVerifier.create(flux)
				.expectNext(User.SAUL, User.JESSE)
				.verifyComplete();

		flux = workshop.betterCallSaulAndJesseForBogusFlux(Flux.just(User.SKYLER, User.WALTER));
		StepVerifier.create(flux)
				.expectNext(User.SKYLER, User.WALTER)
				.verifyComplete();
	}

	@Test
	public void handleCheckedExceptions() {
		Flux<User> flux = workshop.capitalizeMany(Flux.just(User.SAUL, User.JESSE));

		StepVerifier.create(flux)
				.verifyError(Part07Errors.GetOutOfHereException.class);
	}

}