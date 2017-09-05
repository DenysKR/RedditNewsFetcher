package com.list.reddit.redditlist.remote

import com.list.reddit.redditlist.domain.RedditChildData
import com.list.reddit.redditlist.domain.RedditNews
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

/**
 * Created by denyskravchenko on 05.09.17.
 */
object RedditClient {

    val retrofit by lazy {
        Retrofit.Builder()
                .baseUrl("https://www.reddit.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
    }

    val redditApi by lazy {
        retrofit.create(GetRedditNews::class.java)
    }

    fun fetchRedditNews(after: String, limit: String): Call<RedditNews> {
        return redditApi.getNews(after, limit)
    }
}