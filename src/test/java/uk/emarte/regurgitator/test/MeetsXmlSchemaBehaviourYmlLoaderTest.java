/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.MeetsXmlSchemaBehaviour_fullLoad;

public class MeetsXmlSchemaBehaviourYmlLoaderTest extends YmlLoaderTest {
    public MeetsXmlSchemaBehaviourYmlLoaderTest() {
        super(null);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/MeetsXmlSchemaBehaviour_fullLoad.yml", MeetsXmlSchemaBehaviour_fullLoad);
    }
}
