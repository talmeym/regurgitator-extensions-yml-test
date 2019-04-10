/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.FreemarkerBuilderYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class FreemarkerBuilderYmlLoaderTest extends YmlLoaderTest {
    public FreemarkerBuilderYmlLoaderTest() {
        super(new FreemarkerBuilderYmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_value.yml", FreemarkerBuilder_value);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_file.yml", FreemarkerBuilder_file);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_source.yml", FreemarkerBuilder_source);
    }

    @Test
    public void testAllContexts() throws Exception {
        assertExpectation("classpath:/FreemarkerBuilder_allContexts.yml", FreemarkerBuilder_allContexts);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/FreemarkerBuilder_fullLoad.yml");
    }
}
