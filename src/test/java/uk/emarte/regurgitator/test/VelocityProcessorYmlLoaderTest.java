/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import uk.emarte.regurgitator.extensions.VelocityProcessorYmlLoader;
import org.junit.Test;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.VelocityProcessor_file;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.VelocityProcessor_value;

public class VelocityProcessorYmlLoaderTest extends YmlLoaderTest {
    public VelocityProcessorYmlLoaderTest() {
        super(new VelocityProcessorYmlLoader());
    }

    @Test
    public void testValue() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_value.yml", VelocityProcessor_value);
    }

    @Test
    public void testFile() throws Exception {
        assertExpectation("classpath:/VelocityProcessor_file.yml", VelocityProcessor_file);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/VelocityProcessor_fullLoad.yml");
    }
}
