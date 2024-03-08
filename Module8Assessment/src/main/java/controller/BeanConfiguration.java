/**
 * @author deondaigh - dmdaigh
 * CIS175 - Spring 2024
 * Mar 7, 2024
 */
package controller;

import org.springframework.context.annotation.Bean;

import dmacc.beans.Printers;

/**
 * 
 */
public class BeanConfiguration {
	@Bean
	public Printers printer() {
		Printers bean = new Printers();
		return bean;
		
	}
}
