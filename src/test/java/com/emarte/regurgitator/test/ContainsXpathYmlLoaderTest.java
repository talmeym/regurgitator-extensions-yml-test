/*
 * Copyright (C) 2017 Miles Talmey.
 * Distributed under the MIT License (license terms are at http://opensource.org/licenses/MIT).
 */
package com.emarte.regurgitator.test;

import com.emarte.regurgitator.extensions.ContainsXpathYmlLoader;
import org.junit.Test;

public class ContainsXpathYmlLoaderTest extends YmlLoaderTest {
    public ContainsXpathYmlLoaderTest() {
        super(new ContainsXpathYmlLoader());
    }

    @Test
    public void testMinYml() throws Exception {
        assertExpectation("classpath:/ContainsXpath_min.yml", "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]");
    }

    @Test
    public void testMaxYml() throws Exception {
        assertExpectation("classpath:/ContainsXpath_max.yml", "com.emarte.regurgitator.extensions.ContainsXpath:[{this=http://something.com}]");
    }

    @Test
    public void testFullLoad() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad.yml", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'/something/something',true,com.emarte.regurgitator.extensions.ContainsXpath:[{prefix2=url2, prefix1=url1}]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]");
    }

    @Test
    public void testFullLoad_entityLookup() throws Exception {
        assertExpectationFullLoad("classpath:/ContainsXpath_fullLoad_entityLookup.yml", "com.emarte.regurgitator.core.Sequence:['regurgitator-configuration-1',[com.emarte.regurgitator.core.Decision:['decision-1',[com.emarte.regurgitator.test.stuff.TestStep:['test-step-1']],[com.emarte.regurgitator.core.Rule:['rule-1',[com.emarte.regurgitator.core.Condition:['condition-1',com.emarte.regurgitator.core.ContextLocation:['context:location'],'/something/something',true,com.emarte.regurgitator.extensions.ContainsXpath:[{}]]],'test-step-1']],com.emarte.regurgitator.core.FirstMatchBehaviour:[],null]],null]");
    }
}
