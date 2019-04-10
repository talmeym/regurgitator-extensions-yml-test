/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.XmlParameterYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class XmlParameterYmlLoaderTest extends YmlLoaderTest {
    public XmlParameterYmlLoaderTest() {
        super(new XmlParameterYmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/XmlParameter_min.yml", XmlParameter_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/XmlParameter_max.yml", XmlParameter_max);
    }

    @Test
    public void testMaximumFlat() throws Exception {
        assertExpectation("classpath:/XmlParameter_maxFlat.yml", XmlParameter_maxFlat);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/XmlParameter_fullLoad.yml");
    }
}
