/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.JsonPathProcessorYmlLoader;

import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPathProcessor;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonPathProcessor_fullLoad;

public class JsonPathProcessorYmlLoaderTest extends YmlLoaderTest {
    public JsonPathProcessorYmlLoaderTest() {
        super(new JsonPathProcessorYmlLoader());
    }

    @Test
    public void testLoader() throws Exception {
        assertExpectation("classpath:/JsonPathProcessor.yml", JsonPathProcessor);
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/JsonPathProcessor_fullLoad.yml", JsonPathProcessor_fullLoad);
    }
}
