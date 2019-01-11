package com.digitaldan.jomnilinkII.MessageTypes.systemEvents;

public class Camera6TriggerEvent extends SystemEvent {

	/**
	 * CAMERA 6 TRIGGER
	 * 0000 0011 0001 0011
	 *
	 * @param event
	 */
	public Camera6TriggerEvent(int event) {
		super(event, SystemEventType.CAMERA_6_TRIGGER);
	}
}
