package es.pildoras.pruebaanotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ComercialExperimentado implements Empleados {

	@Autowired
	@Qualifier("informeFinancieroTrim2")
	private CreacionInformeFinanciero nuevoInforme;
	
	//Ejecución de código después de creación del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras la creación del Bean. \n");
	}
	
	//Ejecución de código después de apagado contenedor Spring
	@PreDestroy
	public void ejecutaAntes(){
		System.out.println("Ejecutado antes de la destrucción del Bean. \n");
	}

//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
//	@Autowired
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	

	@Override
	public String getTareas() {
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInforme() {
//		return "Este es un informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}

}
