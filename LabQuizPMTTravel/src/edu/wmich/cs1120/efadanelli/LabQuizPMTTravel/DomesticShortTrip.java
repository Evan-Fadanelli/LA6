package edu.wmich.cs1120.efadanelli.LabQuizPMTTravel;

public class DomesticShortTrip implements ITrip {

	int distance;
	int duration;
	
	public DomesticShortTrip() {
		this.distance = 0;
		this.duration = 0;
	}
	
	public DomesticShortTrip(int distance, int duration) {
		this.distance = distance;
		this.duration = duration;
	}
	
	@Override
	public int getDistance() {
		return distance;
	}

	@Override
	public void setDistance(int distance) {
		// TODO Auto-generated method stub
		this.distance = distance;
	}

	@Override
	public int getDuration() {
		// TODO Auto-generated method stub
		return duration;
	}

	@Override
	public void setDuration(int days) {
		// TODO Auto-generated method stub
		this.duration = days;
	}

	@Override
	public int calculateCost() {
		return ((distance * 3) + (duration * 150));
	}
}