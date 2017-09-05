package com.list.reddit.redditlist.remote

import com.list.reddit.redditlist.domain.RedditNews
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by denyskravchenko on 05.09.17.
 */


interface GetRedditNews {
    @GET("/top.json")
    fun getNews(@Query("after") after: String,
                @Query("limit") limit: String)
            : Call<RedditNews>;
}
