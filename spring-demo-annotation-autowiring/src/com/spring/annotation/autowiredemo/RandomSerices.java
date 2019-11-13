package com.spring.annotation.autowiredemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomSerices implements FortuneServices {

	private String fileName = "E:\\Programming\\java9\\Spring-java\\spring-demo-annotation-autowiring\\src\\randomFortunes.txt";
	private List<String> theFortunes;

	// create a random number generator
	private Random myRandom = new Random();

	public RandomSerices() {
		File theFile = new File(fileName);
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());

		// initialize array list
		theFortunes = new ArrayList<>();

		// read fortunes from file
		try (BufferedReader br = new BufferedReader(new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());
		return  theFortunes.get(index);
	}

}
