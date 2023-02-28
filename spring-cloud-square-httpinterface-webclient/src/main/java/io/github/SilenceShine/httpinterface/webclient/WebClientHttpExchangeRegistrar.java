package io.github.SilenceShine.httpinterface.webclient;

import io.github.SilenceShine.httpinterface.AbstractHttpExchangeRegistrar;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

/**
 * @author SilenceShine
 * @since 1.0
 */
public class WebClientHttpExchangeRegistrar extends AbstractHttpExchangeRegistrar {

    @Override
    protected Class<?> getAnnotationClass() {
        return EnableWebclientHttpExchanges.class;
    }

    @Override
    protected Class<?> getFactoryBeanClass() {
        return WebClientHttpExchangeFactoryBean.class;
    }

    @Override
    protected void buildDefinition(BeanDefinitionBuilder definition) {

    }

}
