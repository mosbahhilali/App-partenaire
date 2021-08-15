package tn.esprit.spring;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

@SpringBootApplication
public class PartenaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartenaireApplication.class, args);
	}
	@Bean
	public MappingJackson2XmlHttpMessageConverter mappingJackson2XmlHttpMessageConverter(Jackson2ObjectMapperBuilder builder) {
		XmlMapper xmlMapper = builder.createXmlMapper(true).build();
		xmlMapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
		xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
		//xmlMapper.set;
		return new MappingJackson2XmlHttpMessageConverter(xmlMapper);
	}

}
