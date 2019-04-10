/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.core.RegurgitatorException;
import com.emarte.regurgitator.extensions.JsonParameterYmlLoader;
import org.junit.Test;

import java.io.IOException;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class JsonParameterYmlLoaderTest extends YmlLoaderTest {
    public JsonParameterYmlLoaderTest() {
        super(new JsonParameterYmlLoader());
    }

    @Test
    public void testMinimum() throws IOException, RegurgitatorException {
        assertExpectation("classpath:/JsonParameter_min.yml", JsonParameter_min);
    }

    @Test
    public void testMaximum() throws IOException, RegurgitatorException {
        assertExpectation("classpath:/JsonParameter_max.yml", JsonParameter_max);
    }

    @Test
    public void testMaximumFlat() throws IOException, RegurgitatorException {
        assertExpectation("classpath:/JsonParameter_maxFlat.yml", JsonParameter_maxFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/JsonParameter_fullLoad.yml");
    }
}
