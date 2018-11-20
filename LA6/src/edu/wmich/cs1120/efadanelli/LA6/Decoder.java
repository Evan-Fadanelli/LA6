package edu.wmich.cs1120.efadanelli.LA6;

public class Decoder implements IDecoder {
	
	@Override
	public void decode(String filePath) {
	char[] petter = filePath.toCharArray();
	char[] spaget= new char[65000];
	int index = 0;
	int indexPart2 = 0;
	
	do {
		spaget[indexPart2] = petter[index];
		int fire = petter[index+2].charValue();
		indexPart2++;
		index = index + fire;
			
	}while(fire != -1)
	for(int i = 0; i<spaget.lengths; i++)
	{
		System.out.print(spaget[i]);
		if(spaget[i-1].equals("/") && spaget[i].equals("n"))
		{
			System.out.println();
		}
	}
	}	
	
}