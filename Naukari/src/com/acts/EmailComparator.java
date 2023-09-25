package com.acts;
import java.util.Comparator;
public class EmailComparator implements Comparator<JobSeeker>{
	@Override
	public int compare(JobSeeker o1, JobSeeker o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}
}

