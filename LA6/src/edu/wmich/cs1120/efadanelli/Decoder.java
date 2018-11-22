package edu.wmich.cs1120.efadanelli.LA6;

import java.io.*;

public class Decoder implements IDecoder {
	
	@Override
	public void decode(String filePath) {
		try {
			RandomAccessFile randomFile = new RandomAccessFile(filePath,"r");	//create a RandomAccessFile with filePath
			int nextLetterPos = 0;	//some ints to help us along on our decoder
			int numAfterLet = 0;
			int[] poop = new int[2];
			boolean bacon = false;
			do {
				boolean pizza = false;
				boolean meat = false;
				
				randomFile.seek(nextLetterPos);
				poop[0] = nextLetterPos;
				System.out.print(randomFile.readChar());
				if(bacon)
				{
					System.out.println();
					bacon = false;
				}
				nextLetterPos = nextLetterPos + 2;
				numAfterLet = randomFile.readInt();
				nextLetterPos = numAfterLet + nextLetterPos + 4;
				poop[1] = nextLetterPos;
				randomFile.seek(poop[0]);
				if(randomFile.readChar() == 92)
				{
					pizza = true;
				}
				randomFile.seek(poop[1]);
				if(randomFile.readChar() == 110)
				{
					meat = true;
				}
				
				if(pizza && meat)
				{
				//YUMMMMMMMMM!!!!!!
					bacon = true;
				}
			}while(numAfterLet != -1);//in the encoder, at the end of the file there is a -1 put in place just for the do-while loop to stop.
			randomFile.close();// close random file
		}catch(FileNotFoundException e) {
			System.err.print("The file specified in the input was not found. Please check the file to see if it is the correct one.");
		}catch(IOException e) {
			System.err.println("There was an error when reading the file. Please check to make sure the file exists or if it has been corrupted");
		}
	}	
}
		