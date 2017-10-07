/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.XmlParameterYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class XmlParameterYmlLoaderTest extends YmlLoaderTest {
	public XmlParameterYmlLoaderTest() {
		super(new XmlParameterYmlLoader());
	}

	@Test
	public void testYml() throws Exception {
		assertExpectation("classpath:/XmlParameter_min.yml", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],null]");
	}

	@Test
	public void testMaximumYml() throws Exception {
		assertExpectation("classpath:/XmlParameter_max.yml", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testMaximumFlatYml() throws Exception {
		assertExpectation("classpath:/XmlParameter_maxFlat.yml", "com.emarte.regurgitator.extensions.XmlParameter:['xml-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.XpathProcessor:['xpath/xpath',{prefix2=uri2, prefix1=uri1}],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testFullLoad() throws RegurgitatorException {
		loadFile("classpath:/XmlParameter_fullLoad.yml");
	}
}
