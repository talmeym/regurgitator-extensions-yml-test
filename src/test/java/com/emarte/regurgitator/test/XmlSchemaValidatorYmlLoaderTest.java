/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.XmlSchemaValidatorYmlLoader;
import org.junit.Test;

import static com.emarte.regurgitator.core.ConfigurationFile.loadFile;
import static com.emarte.regurgitator.test.ExtensionsLoaderTestExpectations.XmlSchemaValidator;

public class XmlSchemaValidatorYmlLoaderTest extends YmlLoaderTest {
    public XmlSchemaValidatorYmlLoaderTest() {
        super(new XmlSchemaValidatorYmlLoader());
    }

    @Test
    public void testThis() throws Exception {
        assertExpectation("classpath:/XmlSchemaValidator.yml", XmlSchemaValidator);
    }

    @Test
    public void testFullLoad() throws Exception {
        loadFile("classpath:/XmlSchemaValidator_fullLoad.yml");
    }
}
