package edu.wmich.cs1120.efadanelli.LabQuizPMTTravel;

import java.util.ArrayList;

public interface ITravelManagment {
	ArrayList<ITrip> getTripRequests();
	//Getter of the trip list
	void setTripRequests(ArrayList<ITrip> tripRequests);
	//Setter of the trip list
	int calculateTotalCost();
	//Return the total cost of all the trip in the list.
}
