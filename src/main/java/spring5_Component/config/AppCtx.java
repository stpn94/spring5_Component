package spring5_Component.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring5_Component.spring.VersionPrinter;

@Configuration
@ComponentScan(basePackages = {"spring5_Component.spring"})
public class AppCtx {

		
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
//		versionPrinter.setMajorVersion(5);
//		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
