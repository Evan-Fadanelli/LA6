package edu.wmich.cs1120.efadanelli.LabQuizPMTTravel;

public interface ITrip {
		int getDistance();
		//Getter of distance
		void setDistance(int distance);
		//Setter of distance
		int getDuration();
		//Getter of duration
		void setDuration(int days);
		//Setter of duration
		int calculateCost();
		//Calculate the cost for this particular trip
}