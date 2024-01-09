/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.extensions.VelocityBuilderYmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class VelocityBuilderYmlLoaderTest extends YmlLoaderTest {
    public VelocityBuilderYmlLoaderTest() {
        super(new VelocityBuilderYmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_value.yml", VelocityBuilder_value);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_file.yml", VelocityBuilder_file);
    }

    @Test
    public void testSource() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_source.yml", VelocityBuilder_source);
    }

    @Test
    public void testAllContexts() throws Exception {
        assertExpectation("classpath:/VelocityBuilder_allContexts.yml", VelocityBuilder_allContexts);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/VelocityBuilder_fullLoad.yml");
    }
}
