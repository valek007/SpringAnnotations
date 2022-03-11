package es.pildoras.pruebaanotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación del informe decierre del año. ";
	}

}
