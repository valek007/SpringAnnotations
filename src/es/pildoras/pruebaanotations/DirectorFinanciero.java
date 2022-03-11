package es.pildoras.pruebaanotations;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	private CreacionInformeFinanciero informeFinanciero;

	@Value("${email}")
	private String email;

	@Value("${nombreEmpresa}")
	private String nombreEmpresa;

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		return "Gestión y dirección de las operaciones financieras de la empresa. \n";
	}

	@Override
	public String getInforme() {
		return informeFinanciero.getInformeFinanciero();
	}

	public String getEmail() {
		return email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

}
