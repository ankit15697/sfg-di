package com.ankit.sfgdi;

import com.ankit.sfgdi.controllers.ConstructorInjectedController;
import com.ankit.sfgdi.controllers.I18NController;
import com.ankit.sfgdi.controllers.PropertyInjectedController;
import com.ankit.sfgdi.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx  = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println(" *** Property based ***");

		PropertyInjectedController controller = ctx.getBean(PropertyInjectedController.class);
		System.out.println(controller);
		System.out.println(controller.getGreeting());

		System.out.println(" *** Setter based ***");

		SetterBasedController setterBasedController = ctx.getBean(SetterBasedController.class);
		System.out.println(setterBasedController);
		System.out.println(setterBasedController.getGreeting());

		System.out.println(" *** Constructor based ***");

		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController);
		System.out.println(constructorInjectedController.getGreeting());

		I18NController i18NController = ctx.getBean(I18NController.class);
		System.out.println(i18NController);
		System.out.println(i18NController.getGreeting());
	}

}
