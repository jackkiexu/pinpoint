/*
 * Copyright 2014 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.profiler.modifier.db.mysql;

import com.navercorp.pinpoint.bootstrap.config.ProfilerConfig;
import com.navercorp.pinpoint.bootstrap.logging.PLoggerFactory;
import com.navercorp.pinpoint.common.ServiceType;
import com.navercorp.pinpoint.profiler.DefaultAgent;
import com.navercorp.pinpoint.profiler.logging.Slf4jLoggerBinder;
import com.navercorp.pinpoint.test.MockAgent;
import com.navercorp.pinpoint.test.TestClassLoader;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author emeroad
 */
public class MySQLConnectionImplTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private TestClassLoader loader;

    @Before
    public void setUp() throws Exception {
        PLoggerFactory.initialize(new Slf4jLoggerBinder());
        DefaultAgent agent = MockAgent.of("pinpoint.config");
        loader = new TestClassLoader(agent);
        loader.initialize();
    }

    @Test
    public void test() throws Throwable {
        System.out.println("");
        // This is an example of test which loads test class indirectly.  
//        loader.runTest("com.navercorp.pinpoint.profiler.modifier.db.mysql.MySQLConnectionImplModifierTest", "testModify");
    }


}
