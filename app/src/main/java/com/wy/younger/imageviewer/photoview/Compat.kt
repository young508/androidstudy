/*
 Copyright 2011, 2012 Chris Banes.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.wy.younger.imageviewer.photoview

import android.view.View

internal object Compat {

    //fps 每秒刷新60次是最低标准
    private val SIXTY_FPS_INTERVAL = 1000 / 60

    /**
     * 最低兼容api 19
     */

    fun postOnAnimation(view: View, runnable: Runnable) {
//        if (VERSION.SDK_INT >= VERSION_CODES.JELLY_BEAN) {
//            postOnAnimationJellyBean(view, runnable)
//        } else {
        view.postDelayed(runnable, SIXTY_FPS_INTERVAL.toLong())
//        }
    }

//    @TargetApi(16)
//    private fun postOnAnimationJellyBean(view: View, runnable: Runnable) {
//        view.postOnAnimation(runnable)
//    }
}
