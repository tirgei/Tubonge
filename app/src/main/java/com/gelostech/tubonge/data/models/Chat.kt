package com.gelostech.tubonge.data.models

data class Chat(
    var id: String? = null,
    var time: Long? = null,
    var message: String? = null,
    var avatar: Int? = null,
    var username: String? = null
)