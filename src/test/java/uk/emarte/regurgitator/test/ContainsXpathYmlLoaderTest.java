/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.ContainsXpathYmlLoader;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.*;

public class ContainsXpathYmlLoaderTest extends YmlLoaderTest {
    public ContainsXpathYmlLoaderTest() {
        super(new ContainsXpathYmlLoader());
    }

    @Test
    public void testMinimum() throws Exception {
        assertExpectation("classpath:/ContainsXpath_min.yml", ContainsXpathBehaviour_min);
    }

    @Test
    public void testMaximum() throws Exception {
        assertExpectation("classpath:/ContainsXpath_max.yml", ContainsXpathBehaviour_max);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad.yml", ContainsXpathBehaviour_fullLoad);
    }

    @Test
    public void testFullLoad_entityLookup() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad_entityLookup.yml", ContainsXpathBehaviour_fullLoad_entityLookup);
    }
}
