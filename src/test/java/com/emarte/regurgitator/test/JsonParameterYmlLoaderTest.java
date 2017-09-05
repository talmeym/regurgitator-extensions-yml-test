package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.JsonParameterYmlLoader;
import org.junit.Test;

import java.io.IOException;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class JsonParameterYmlLoaderTest extends YmlLoaderTest {
	public JsonParameterYmlLoaderTest() {
		super(new JsonParameterYmlLoader());
	}

	@Test
	public void testMin() throws IOException, RegurgitatorException {
		assertExpectation("classpath:/JsonParameter_min.yml", "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.StringType:[],com.emarte.regurgitator.core.ConflictPolicy:REPLACE],'parameters',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['location'],null],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],null]");
	}

	@Test
	public void testMax() throws IOException, RegurgitatorException {
		assertExpectation("classpath:/JsonParameter_max.yml", "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testMaxFlat() throws IOException, RegurgitatorException {
		assertExpectation("classpath:/JsonParameter_maxFlat.yml", "com.emarte.regurgitator.extensions.JsonParameter:['json-parameter-1',com.emarte.regurgitator.core.ParameterPrototype:['name',com.emarte.regurgitator.core.NumberType:[],com.emarte.regurgitator.core.ConflictPolicy:LEAVE],'context',com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],com.emarte.regurgitator.extensions.JsonPathProcessor:['jsonpath.jsonpath'],com.emarte.regurgitator.test.stuff.TestValueProcessor:[]]");
	}

	@Test
	public void testFullLoad() throws IOException, RegurgitatorException {
		loadFile("classpath:/JsonParameter_fullLoad.yml");
	}
}
