package com.acts;
import java.util.Comparator;

public class DobComparator implements Comparator<JobSeeker>{
	@Override
	public int compare(JobSeeker o1, JobSeeker o2) {
		return o1.getDOB().compareTo(o2.getDOB());
	}
}
