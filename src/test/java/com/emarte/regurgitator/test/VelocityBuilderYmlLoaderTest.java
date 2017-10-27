/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.VelocityBuilderYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;

public class VelocityBuilderYmlLoaderTest extends YmlLoaderTest {
    public VelocityBuilderYmlLoaderTest() {
        super(new VelocityBuilderYmlLoader());
    }

    @Test
    public void testYml_file() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_file.yml", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],false]");
    }

    @Test
    public void testYml_source() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_source.yml", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[com.emarte.regurgitator.core.ContextLocation:['context:location'],null],false]");
    }

    @Test
    public void testYml_value() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_value.yml", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'<something>${something}</something>'],false]");
    }

    @Test
    public void testYml_allContexts() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_allContexts.yml", "com.emarte.regurgitator.extensions.VelocityBuilder:[com.emarte.regurgitator.core.ValueSource:[null,'something something'],true]");
    }

    @Test
    public void testFullLoadYml() throws RegurgitatorException {
        loadFile("classpath:/VelocityBuilder_fullLoad.yml");
    }
}
