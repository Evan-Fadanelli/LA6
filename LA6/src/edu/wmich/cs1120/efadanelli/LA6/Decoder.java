package edu.wmich.cs1120.efadanelli.LA6;

public class Decoder implements IDecoder {
	
	@Override
	public void decode(String filePath) {
	char[] petter = filePath.toCharArray();
	char[] spaget= new char[65000];
	int index = 0;
	int indexPart2 = 0;
	char[indexPart2] = spaget[index];
	do {
		spaget[indexPart2] = petter[index];
		int fire = petter[index+2].charValue();
		indexPart2++;
		index = index + fire;
		
		
		
	}while(fire != -1)
	
	}	
}