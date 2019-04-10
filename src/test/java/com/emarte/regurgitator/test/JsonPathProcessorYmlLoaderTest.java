/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.JsonPathProcessorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPathProcessor;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPathProcessor_fullLoad;

public class JsonPathProcessorYmlLoaderTest extends YmlLoaderTest {
    public JsonPathProcessorYmlLoaderTest() {
        super(new JsonPathProcessorYmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/JsonPathProcessor.yml", JsonPathProcessor);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/JsonPathProcessor_fullLoad.yml", JsonPathProcessor_fullLoad);
    }
}
