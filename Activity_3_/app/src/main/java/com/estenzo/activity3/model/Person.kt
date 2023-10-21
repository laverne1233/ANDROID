package com.estenzo.activity3.model

data class Person(
    val name: String,
    val subject: String,
    val content: String
) {
    val truncatedContent: String
        get() {
            val maxLength = 30 // Set the maximum length you want to display
            return if (content.length > maxLength) {
                content.substring(0, maxLength) + "..."
            } else {
                content
            }
        }
}