package com.digitaldan.jomnilinkII;

import com.digitaldan.jomnilinkII.MessageTypes.ObjectStatus;
import com.digitaldan.jomnilinkII.MessageTypes.systemEvents.SystemEvent;

public interface NotificationListener {
	public void objectStatusNotification(ObjectStatus status);

	public void systemEventNotification(SystemEvent event);
}
