package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XpathProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class XpathProcessorYmlLoaderTest extends YmlLoaderTest {
	public XpathProcessorYmlLoaderTest() {
		super(new XpathProcessorYmlLoader());
	}

	@Test
	public void testYml() throws Exception {
		assertExpectation("classpath:/XpathProcessor.yml", "com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}]");
	}

	@Test
	public void testMinimumYml() throws Exception {
		assertExpectation("classpath:/XpathProcessor_min.yml", "com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}]");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/XpathProcessor_fullLoad.yml");
	}
}
