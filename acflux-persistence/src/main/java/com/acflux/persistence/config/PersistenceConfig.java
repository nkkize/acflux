/**
 * 
 */
package com.acflux.persistence.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author narenderk
 *
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.acflux.persistence"})
public class PersistenceConfig {

}
