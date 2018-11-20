package edu.wmich.cs1120.efadanelli.LA6;

import java.io.*;
import java.util.*;

public class Encoder implements IEncoder {
//hello
	@Override
	public void encode(String inputFileName, String outputFilePath) {
		File file = new File(inputFileName);
		ArrayList<Character> message = new ArrayList<Character>();
		Scanner fileReader;
		try {
			fileReader = new Scanner(file);
			while(fileReader.hasNext()) {
				String fileLine = (fileReader.nextLine());
				for(int i = 0;i<fileLine.length();i++) {
					message.add(fileLine.charAt(i));
				}
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("The file path " + inputFileName + "could not be found. \nNo file will be encoded.");
		}
		
		Random generator = new Random();
		try {
			RandomAccessFile randomFile = new RandomAccessFile(outputFilePath,"rw");
			for(int i = 0; i<message.size()-1; i++) {
				randomFile.writeChar(message.get(i));
				int randomNum = generator.nextInt(20)+1;
				randomFile.writeInt(randomNum);
				for(int j = 0;j<(randomNum);j++)
				randomFile.writeByte(generator.nextInt(256));
			}
			randomFile.writeChar(message.get(message.size()-1));
			randomFile.writeInt(-1);
			randomFile.close();
		}catch (IOException e) {
			System.err.println("There was an error when writing to the file " + outputFilePath);
		}
	}
}