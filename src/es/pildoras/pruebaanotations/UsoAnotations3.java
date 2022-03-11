package es.pildoras.pruebaanotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnotations3 {

	public static void main(String[] args) {
		
		//Cargar class de configuración
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		// Pedir un Bean al contenedor

		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getTareas()+"\n"+empleado.getInforme()+"\n");

		// Cerrar el contexto
		contexto.close();

	}

}
