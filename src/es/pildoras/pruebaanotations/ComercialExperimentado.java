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
	
	//Ejecuci�n de c�digo despu�s de creaci�n del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras la creaci�n del Bean. \n");
	}
	
	//Ejecuci�n de c�digo despu�s de apagado contenedor Spring
	@PreDestroy
	public void ejecutaAntes(){
		System.out.println("Ejecutado antes de la destrucci�n del Bean. \n");
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
		return "Vender, vender y vender m�s!";
	}

	@Override
	public String getInforme() {
//		return "Este es un informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}

}
