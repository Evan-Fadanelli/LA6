package edu.wmich.cs1120.efadanelli.LabQuizPMTTravel;

import java.util.ArrayList;

public class TravelManager implements ITravelManagment {

	ArrayList<ITrip> listOfTrips;
	
	@Override
	public ArrayList<ITrip> getTripRequests() {
		return listOfTrips;
	}

	@Override
	public void setTripRequests(ArrayList<ITrip> tripRequests) {
		// TODO Auto-generated method stub
		this.listOfTrips = tripRequests;
	}

	@Override
	public int calculateTotalCost() {
		int totalCost = 0;
		for(int i=0;i<listOfTrips.size();i++) {
			totalCost = totalCost + listOfTrips.get(i).calculateCost();
		}
		return totalCost;
	}
}
