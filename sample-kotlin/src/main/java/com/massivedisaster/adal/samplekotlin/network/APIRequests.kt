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

package com.massivedisaster.adal.samplekotlin.network

import com.massivedisaster.adal.network.APIRequestCallback
import com.massivedisaster.adal.samplekotlin.model.Photo
import com.massivedisaster.adal.samplekotlin.model.Post
import retrofit2.Call

class APIRequests {

    companion object {
        private fun getAdapter(): IRequests {
            return RetrofitAdapter.getAccountAdapter()
        }

        fun getPosts(callObject: APIRequestCallback<ResponseList<Post>>): Call<ResponseList<Post>> {

            val call = getAdapter().getPosts()
            call.enqueue(callObject)

            return call
        }

        fun getPhotos(callObject: APIRequestCallback<ResponseList<Photo>>): Call<ResponseList<Photo>> {

            val call = getAdapter().getPhotos()
            call.enqueue(callObject)

            return call
        }
    }

}