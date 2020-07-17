/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ide.konan

import com.intellij.testFramework.ParsingTestCase
import org.jetbrains.kotlin.test.KotlinRoot
import org.jetbrains.kotlin.test.util.slashedPath

class NativeDefinitionsParsingTest : ParsingTestCase("", "def", NativeDefinitionsParserDefinition()) {

    fun testAllProperties() = doTest(true)

    fun testBadDefinitions() = doTest(true)

    override fun getTestDataPath(): String = KotlinRoot.DIR.resolve("native/testData/colorHighlighting").slashedPath

    override fun skipSpaces(): Boolean = false

    override fun includeRanges(): Boolean = true
}