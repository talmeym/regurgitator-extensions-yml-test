package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.JsonPathProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class JsonPathProcessorYmlLoaderTest extends YmlLoaderTest {
	public JsonPathProcessorYmlLoaderTest() {
		super(new JsonPathProcessorYmlLoader());
	}

	@Test
	public void testMinimumYml() throws Exception {
		assertExpectation("classpath:/JsonPathProcessor.yml", "com.emarte.regurgitator.extensions.JsonPathProcessor:['something.something']");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/JsonPathProcessor_fullLoad.yml");
	}
}
