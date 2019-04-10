/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import org.junit.Test;

import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.ContainsJsonPathBehaviour_fullLoad;

public class ContainsJsonPathBehaviourYmlLoaderTest extends YmlLoaderTest {
    public ContainsJsonPathBehaviourYmlLoaderTest() {
        super(null);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsJsonPathBehaviour_fullLoad.yml", ContainsJsonPathBehaviour_fullLoad);
    }
}
