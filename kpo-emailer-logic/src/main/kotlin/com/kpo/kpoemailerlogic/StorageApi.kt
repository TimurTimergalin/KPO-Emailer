package com.kpo.kpoemailerlogic

import kotlinx.serialization.Serializable
import org.springframework.stereotype.Component

@Serializable
data class StorageApiResponse(val data: String, val type: String)

interface StorageApi {
    fun getFile(filename: String): StorageApiResponse
}

@Component
class StorageApiAdapter: StorageApi {
    override fun getFile(filename: String): StorageApiResponse {
        return StorageApiResponse("{\"a\": \"b\"}", "json")
    }
}