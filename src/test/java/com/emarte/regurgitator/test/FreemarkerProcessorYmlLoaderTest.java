/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.FreemarkerProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.FreemarkerProcessor_file;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.FreemarkerProcessor_value;

public class FreemarkerProcessorYmlLoaderTest extends YmlLoaderTest {
    public FreemarkerProcessorYmlLoaderTest() {
        super(new FreemarkerProcessorYmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_value.yml", FreemarkerProcessor_value);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/FreemarkerProcessor_file.yml", FreemarkerProcessor_file);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/FreemarkerProcessor_fullLoad.yml");
    }
}
