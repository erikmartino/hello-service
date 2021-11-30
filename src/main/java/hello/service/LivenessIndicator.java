package hello.service;

import io.micronaut.health.HealthStatus;
import io.micronaut.management.health.indicator.HealthIndicator;
import io.micronaut.management.health.indicator.HealthResult;
import io.micronaut.management.health.indicator.annotation.Liveness;
import jakarta.inject.Singleton;
import org.reactivestreams.FlowAdapters;
import org.reactivestreams.Publisher;

import static io.micronaut.core.async.publisher.Publishers.just;

@Singleton
@Liveness
class LivenessIndicator implements HealthIndicator {

    @Override
    public Publisher<HealthResult> getResult() {
        return just(HealthResult.builder("hello-service").status(HealthStatus.UP).build());
    }
}