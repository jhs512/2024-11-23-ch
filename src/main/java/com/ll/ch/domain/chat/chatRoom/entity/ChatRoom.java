package com.ll.ch.domain.chat.chatRoom.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatRoom {
    private long id;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private String name;
}
