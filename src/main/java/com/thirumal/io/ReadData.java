package com.thirumal.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReadData {

	public static void main(String[] str) {
		readData();
	}

	public static void readData() {
		List<SolidStateDrive> ssd = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("SSD.txt"))) {
			ssd = br.lines().map(s-> {
				String[] tmp = s.split("\\s+");
				return new SolidStateDrive(tmp[0], tmp[1], Integer.parseInt(tmp[2]));
			}).collect(Collectors.toList());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		ssd.stream().forEach(System.out::println);
	}

}

class SolidStateDrive {
	
	String brand;
	String model;
	int capacityInGB;

	public SolidStateDrive(String brand, String model, int capacityInGB) {
		super();
		this.brand = brand;
		this.model = model;
		this.capacityInGB = capacityInGB;
	}

	@Override
	public String toString() {
		return "SolidStateDrive [brand=" + brand + ", model=" + model + ", capacityInGB=" + capacityInGB + "]";
	}
}