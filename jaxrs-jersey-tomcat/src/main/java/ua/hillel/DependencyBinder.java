package ua.hillel;

import jakarta.inject.Singleton;
import org.glassfish.jersey.internal.inject.AbstractBinder;

public class DependencyBinder extends AbstractBinder {
    @Override
    protected void configure() {
        bind(OrderServiceMemory.class)
                .to(OrderService.class)
                .in(Singleton.class);
    }
}
