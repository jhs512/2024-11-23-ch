package com.ll.ch.domain.chat.chatRoom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/chat/rooms")
public class ApiV1ChatRoomController {
    @GetMapping
    public List<String> getChatRooms() {
        return List.of(
                "room1",
                "room2",
                "room3"
        );
    }
}
