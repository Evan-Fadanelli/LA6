package edu.wmich.cs1120.efadanelli.LA6;

public interface IEncoder {
	// Given the paths of an input file and an output file, the encoder 
	// will read the message from the input file, encode the message 
	// as described above, and store it into a binary file with the
	// given path.
	// Include code to handle the IOException.
	
	/**
	 * The encode method takes an input file, makes an encoded version of that file with random bytes and
	 * stores the data in a binary file. 
	 * @param inputFileName - the name/path of the input file
	 * @param outputFilePath - the output path for the binary file made
	 */
	public void encode(String inputFileName, String outputFilePath);
}