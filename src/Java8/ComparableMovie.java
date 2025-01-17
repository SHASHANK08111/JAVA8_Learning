package Java8;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMovie implements Comparable<ComparableMovie> {
	
		private double rating;
		private String name;
		private int year;

		// Used to sort movies by year
		public int compareTo(ComparableMovie m)
		{
			return this.year - m.year;
		}

		// Constructor
		public ComparableMovie(String nm, double rt, int yr)
		{
			this.name = nm;
			this.rating = rt;
			this.year = yr;
		}

		// Getter methods for accessing private data
		public double getRating() { return rating; }
		public String getName() { return name; }
		public int getYear()	 { return year; }
	}
	
