/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
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
