package com.lifecycle.beans;

public class Robot {

	private String name;

	private SensorDriver sensorDriver;

	public void setName(String name) {

		System.out.println("----Setter----");
		this.name = name;
	}

	public Robot(SensorDriver sensorDriver) {

		System.out.println("----Constructor----");
		this.sensorDriver = sensorDriver;
	}

	public void start() {

		System.out.println("----started---");
	}

	public void show() {

		System.out.println("Robot name---" + name);

		System.out.println("Type of Driver---" + sensorDriver.getType());
	}

	public void release() {

		System.out.println("----release---");
	}

}
