package com.highmaster.whatsappclone.notification;

import com.highmaster.whatsappclone.message.MessageType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification {

    private  String chatId;
    private  String content;
    private  String senderId;
    private  String receiverId;
    private  String chatName;
    private  MessageType messageType;
    private  NotificationType type;
    private byte[] media;
}
