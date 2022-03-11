package es.pildoras.pruebaanotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnotations2 {

	public static void main(String[] args) {

		// Cargar XML de configuración

        //ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		//Cargar class de configuración
		
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		// Pedir un Bean al contenedor

		Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		Empleados lucia = contexto.getBean("comercialExperimentado", Empleados.class);

		// Apuntan al mismo objeto en memoria?

		if (antonio == lucia)
			System.out.println("Apuntan al mismo lugar en la memória. \n" + antonio + "\n" + lucia);

		else
			System.out.println("No apuntan al mismo lugar en la memória. \n"+ antonio + "\n" + lucia);

		// Cerrar el contexto

		contexto.close();

	}

}
