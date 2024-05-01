package hr.fer.oop;

import java.time.LocalDate;

public class Reading {
	Integer deviceId;
	SensorReadingValue[] sensorReadings;
	LocalDate timeStamp;
	public Reading(Integer deviceId, SensorReadingValue[] sensorReadings, LocalDate timeStamp) {
		this.deviceId = deviceId;
		this.sensorReadings = sensorReadings;
		this.timeStamp = timeStamp;
	}
	public Integer getDeviceId() {
		return deviceId;
	}
	public SensorReadingValue[] getSensorReadings() {
		return sensorReadings;
	}
	public LocalDate getTimeStamp() {
		return timeStamp;
	}
	
}
