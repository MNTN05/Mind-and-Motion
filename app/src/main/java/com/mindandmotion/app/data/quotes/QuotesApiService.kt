package com.mindandmotion.app.data.quotes

import retrofit2.http.GET
import retrofit2.http.Query

interface QuotesApiService {

    @GET("quotes/random")
    suspend fun getRandomQuote(): QuoteDto

    @GET("quotes")
    suspend fun getQuotes(
        @Query("limit") limit: Int = 20,
        @Query("skip") skip: Int = 0
    ): QuotesResponseDto
}
