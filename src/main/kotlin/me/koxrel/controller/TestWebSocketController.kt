package me.koxrel.controller

import io.micronaut.websocket.WebSocketSession
import io.micronaut.websocket.annotation.OnMessage
import io.micronaut.websocket.annotation.ServerWebSocket
import kotlinx.coroutines.delay

@ServerWebSocket("/demo/ws")
class TestWebSocketController {
    @OnMessage
    suspend fun messageHandler(message: String, session: WebSocketSession) {
        delay(5_000)
        session.sendSync(message)
    }
}
