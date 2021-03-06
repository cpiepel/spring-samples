package de.codecentric.batch.item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemProcessor;


/**
 * Dummy {@link ItemProcessor} which only logs data it receives.
 */
public class LogItemProcessor implements ItemProcessor<String,String> {

	private static final Log log = LogFactory.getLog(LogItemProcessor.class);

	private ExampleService exampleService;
	
	public String process(String item) throws Exception {
		log.info(item);
		return exampleService.echo(item);
	}
	
	public void setExampleService(ExampleService exampleService) {
		this.exampleService = exampleService;
	}

}
