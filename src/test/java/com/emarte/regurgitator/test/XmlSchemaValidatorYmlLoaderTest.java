package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.XmlSchemaValidatorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class XmlSchemaValidatorYmlLoaderTest extends YmlLoaderTest {
	public XmlSchemaValidatorYmlLoaderTest() {
		super(new XmlSchemaValidatorYmlLoader());
	}

	@Test
	public void testJson() throws Exception {
		assertExpectation("classpath:/XmlSchemaValidator.yml", "com.emarte.regurgitator.extensions.XmlSchemaValidator:['classpath:/something.something.file']");
	}

	@Test
	public void testFullLoad() throws Exception {
		loadFile("classpath:/XmlSchemaValidator_fullLoad.yml");
	}
}
