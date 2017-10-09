/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.FreemarkerBuilderYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class FreemarkerBuilderYmlLoaderTest extends YmlLoaderTest {
    public FreemarkerBuilderYmlLoaderTest() {
        super(new FreemarkerBuilderYmlLoader());
    }

    @Test
    public void testYml_file() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_file.yml", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],false]");
    }

    @Test
    public void testYml_source() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_source.yml", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]");
    }

    @Test
    public void testYml_allContexts() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_allContexts.yml", "com.emarte.regurgitator.extensions.FreemarkerBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something.something'],true]");
    }

    @Test
    public void testFullLoadYml() throws RegurgitatorException {
        loadFile("classpath:/FreemarkerBuilder_fullLoad.yml");
    }
}
