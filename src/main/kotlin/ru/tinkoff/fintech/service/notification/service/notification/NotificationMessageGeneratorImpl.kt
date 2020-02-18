package ru.tinkoff.fintech.service.notification.service.notification

import ru.tinkoff.fintech.service.notification.model.NotificationMessageInfo

class NotificationMessageGeneratorImpl(
    private val cardNumberMasker: CardNumberMasker
) : NotificationMessageGenerator {

    override fun generateMessage(notificationMessageInfo: NotificationMessageInfo): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}