package com.list.reddit.redditlist.domain

/**
 * Created by denyskravchenko on 05.09.17.
 */

data class RedditChildData(val title: String, val author: String, val thumbnail: String, val url: String,
                           val num_comments: Int,
                           val created: Long)
