package com.mindandmotion.app.data.quotes

class QuotesRepository(private val api: QuotesApiService) {

    suspend fun getRandomQuote(): Result<QuoteDto> = runCatching {
        api.getRandomQuote()
    }

    suspend fun getQuotes(limit: Int = 20, skip: Int = 0): Result<List<QuoteDto>> = runCatching {
        api.getQuotes(limit = limit, skip = skip).quotes
    }
}
