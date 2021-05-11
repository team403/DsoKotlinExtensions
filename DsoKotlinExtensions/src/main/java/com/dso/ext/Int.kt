/**
 * Copyright 2021 Moriafly
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dso.ext

import android.graphics.Color

/**
 * 多颜色混合
 */
fun Int.colorMix(vararg colors: Int): Int {
    var red = Color.red(this)
    var green = Color.green(this)
    var blue = Color.blue(this)
    colors.forEach {
        red += Color.red(it)
        green += Color.green(it)
        blue += Color.blue(it)
    }
    red /= (colors.size + 1)
    green /= (colors.size + 1)
    blue /= (colors.size + 1)
    return Color.rgb(red, green, blue)
}


