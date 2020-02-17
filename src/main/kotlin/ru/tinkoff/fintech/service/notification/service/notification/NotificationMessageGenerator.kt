package ru.tinkoff.fintech.service.notification.service.notification

import ru.tinkoff.fintech.service.notification.model.NotificationMessageInfo

interface NotificationMessageGenerator {

    fun generateMessage(notificationMessageInfo: NotificationMessageInfo): String
}