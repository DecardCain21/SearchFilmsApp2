package com.example.searchfilmsapp.data

import com.example.searchfilmsapp.data.dto.Response

interface NetworkClient {

    fun doRequest(dto: Any): Response

}