/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.FreemarkerProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class FreemarkerProcessorYmlLoaderTest extends YmlLoaderTest {
    public FreemarkerProcessorYmlLoaderTest() {
        super(new FreemarkerProcessorYmlLoader());
    }

    @Test
    public void testYml_value() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_value.yml", "com.emarte.regurgitator.extensions.FreemarkerProcessor:['something something']");
    }

    @Test
    public void testYml_file() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_file.yml", "com.emarte.regurgitator.extensions.FreemarkerProcessor:['something something']");
    }

    @Test
    public void testFullLoad() throws RegurgitatorException {
        loadFile("classpath:/FreemarkerProcessor_fullLoad.yml");
    }
}
