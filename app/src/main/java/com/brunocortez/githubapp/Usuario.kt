package com.brunocortez.githubapp

import com.google.gson.annotations.SerializedName

data class Usuario (
    @SerializedName("name") val name: String?,
    @SerializedName("avatar_url") val avatarUrl: String?
)