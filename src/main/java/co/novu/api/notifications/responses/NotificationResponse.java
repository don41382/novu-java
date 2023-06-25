package co.novu.api.notifications.responses;

import co.novu.api.notifications.pojos.Notification;
import co.novu.common.contracts.IResponse;
import lombok.Data;

@Data
public class NotificationResponse implements IResponse {
    private Notification data;
}