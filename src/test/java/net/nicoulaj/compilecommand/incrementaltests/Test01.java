/*
 * Hotspot compile command annotations - http://compile-command-annotations.nicoulaj.net
 * Copyright © 2014-2019 Hotspot compile command annotations contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.nicoulaj.compilecommand.incrementaltests;

import net.nicoulaj.compilecommand.annotations.DontInline;
import net.nicoulaj.compilecommand.annotations.Inline;
import net.nicoulaj.compilecommand.annotations.Option;
import net.nicoulaj.compilecommand.annotations.Options;
import net.nicoulaj.compilecommand.annotations.Quiet;

@Quiet
public class Test01 {
    @Inline
    public void foo() {
    }

    @DontInline
    @Options({"option_a", "option_b"})
    public void bar() {
    }

    @Inline
    @Option("some_option")
    public void abc() {
    }

    @Quiet
    public void quietIsQuiet() {
    }
}