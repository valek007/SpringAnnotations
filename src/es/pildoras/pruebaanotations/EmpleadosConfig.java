package es.pildoras.pruebaanotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.pildoras.pruebaanotations")
@PropertySource("classpath:datosEmpresas.propiedades")
public class EmpleadosConfig {
	
	//Definir el Bean para InformeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { //Será el id del Bean inyectado
		return new InformeFinancieroDtoCompras();
	}
	
	//Definir el Bean para DirectorFinanciero e inyectar dependencias
	
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}

}
