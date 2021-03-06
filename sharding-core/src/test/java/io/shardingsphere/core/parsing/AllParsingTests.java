/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
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
 * </p>
 */

package io.shardingsphere.core.parsing;

import io.shardingsphere.core.parsing.integrate.AllParsingIntegrateTests;
import io.shardingsphere.core.parsing.lexer.AllLexerTests;
import io.shardingsphere.core.parsing.parser.constant.DerivedColumnTest;
import io.shardingsphere.core.parsing.parser.context.OrderItemTest;
import io.shardingsphere.core.parsing.parser.sql.AllSQLTests;
import io.shardingsphere.core.parsing.parser.sql.AllStatementParserTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AllLexerTests.class, 
        AllStatementParserTests.class, 
        AllSQLTests.class, 
        SQLJudgeEngineTest.class, 
        OrderItemTest.class,
        DerivedColumnTest.class, 
        AllParsingIntegrateTests.class
    })
public final class AllParsingTests {
}
