/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.ContainsXpathYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class ContainsXpathYmlLoaderTest extends YmlLoaderTest {
    public ContainsXpathYmlLoaderTest() {
        super(new ContainsXpathYmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/ContainsXpath_min.yml", ContainsXpath_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/ContainsXpath_max.yml", ContainsXpath_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad.yml", ContainsXpath_fullLoad);
    }

    @Test
    public void testFullLoad_entityLookup() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad_entityLookup.yml", ContainsXpath_fullLoad_entityLookup);
    }
}
