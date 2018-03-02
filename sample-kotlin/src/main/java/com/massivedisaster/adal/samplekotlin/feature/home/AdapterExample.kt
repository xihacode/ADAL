/*
 * ADAL - A set of Android libraries to help speed up Android development.
 *
 * Copyright (c) 2018 ADAL
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.massivedisaster.adal.samplekotlin.feature.home

import android.support.v4.app.Fragment
import com.massivedisaster.adal.adapter.AbstractLoadMoreBaseAdapter
import com.massivedisaster.adal.adapter.BaseViewHolder
import com.massivedisaster.adal.samplekotlin.R
import java.util.*
import kotlin.reflect.KClass

class AdapterExample(private val lstItems: TreeMap<String, KClass<out Fragment>>) : AbstractLoadMoreBaseAdapter<String>(R.layout.adapter_example, ArrayList(lstItems.keys) as List<String>?) {
    override fun bindItem(holder: BaseViewHolder, item: String) {
        holder.setText(R.id.txtName, item)
    }

    override fun bindError(holder: BaseViewHolder, loadingError: Boolean) {

    }
}