package com.mindandmotion.app.data.quotes

data class QuoteDto(
    val id: Int,
    val quote: String,
    val author: String
)

data class QuotesResponseDto(
    val quotes: List<QuoteDto>,
    val total: Int,
    val skip: Int,
    val limit: Int
)
