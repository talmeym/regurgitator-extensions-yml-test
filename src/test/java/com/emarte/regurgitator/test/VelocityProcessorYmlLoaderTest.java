/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.VelocityProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class VelocityProcessorYmlLoaderTest extends YmlLoaderTest {
	public VelocityProcessorYmlLoaderTest() {
		super(new VelocityProcessorYmlLoader());
	}

	@Test
	public void testYml_value() throws Exception {
		assertExpectation("classpath:/VelocityProcessor_value.yml", "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
	}

	@Test
	public void testYml_file() throws Exception {
		assertExpectation("classpath:/VelocityProcessor_file.yml", "com.emarte.regurgitator.extensions.VelocityProcessor:['something something']");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/VelocityProcessor_fullLoad.yml");
	}
}
