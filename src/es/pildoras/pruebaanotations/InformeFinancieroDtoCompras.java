package es.pildoras.pruebaanotations;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presentación del informe financiero del Ddepartamento de compras del año 2018. ";
	}

}
