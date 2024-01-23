/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package uk.emarte.regurgitator.test;

import org.junit.Test;
import uk.emarte.regurgitator.extensions.JsonSchemaValidatorYmlLoader;
import uk.emarte.regurgitator.extensions.XmlSchemaValidatorYmlLoader;

import static uk.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.JsonSchemaValidator;
import static uk.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.XmlSchemaValidator;

public class JsonSchemaValidatorYmlLoaderTest extends YmlLoaderTest {
    public JsonSchemaValidatorYmlLoaderTest() {
        super(new JsonSchemaValidatorYmlLoader());
    }

    @Test
    public void testLoader() throws Exception {
        assertExpectation("classpath:/JsonSchemaValidator.yml", JsonSchemaValidator);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/JsonSchemaValidator_fullLoad.yml");
    }
}
