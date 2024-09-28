package com.designpattern.prototype;

public class Computer {
	// Required parameters
	private final String CPU;
	private final String RAM;

	// Optional parameters
	private final int storage;
	private final boolean hasGraphicsCard;
	private final boolean hasBluetooth;
	private final String OS;

	private Computer(Builder builder) {
		this.CPU = builder.CPU;
		this.RAM = builder.RAM;
		this.storage = builder.storage;
		this.hasGraphicsCard = builder.hasGraphicsCard;
		this.hasBluetooth = builder.hasBluetooth;
		this.OS = builder.OS;
	}

	@Override
	public String toString() {
		return "Computer{" + "CPU='" + CPU + '\'' + ", RAM='" + RAM + '\'' + ", storage=" + storage
				+ ", hasGraphicsCard=" + hasGraphicsCard + ", hasBluetooth=" + hasBluetooth + ", OS='" + OS + '\''
				+ '}';
	}

	public static class Builder {
		// Required parameters
		private final String CPU;
		private final String RAM;

		// Optional parameters - initialize with default values
		private int storage = 256; // default storage
		private boolean hasGraphicsCard = false; // default no graphics card
		private boolean hasBluetooth = false; // default no bluetooth
		private String OS = "Windows 10"; // default OS

		public Builder(String CPU, String RAM) {
			this.CPU = CPU;
			this.RAM = RAM;
		}

		public Builder storage(int storage) {
			this.storage = storage;
			return this;
		}

		public Builder hasGraphicsCard(boolean hasGraphicsCard) {
			this.hasGraphicsCard = hasGraphicsCard;
			return this;
		}

		public Builder hasBluetooth(boolean hasBluetooth) {
			this.hasBluetooth = hasBluetooth;
			return this;
		}

		public Builder OS(String OS) {
			this.OS = OS;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}
	}
}
