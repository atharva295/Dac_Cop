package com.acts;

import java.util.Comparator;

public class CourseComparator implements Comparator<JobSeeker>{
	@Override
	public int compare(JobSeeker o1, JobSeeker o2) {
		return o1.getDegree().compareTo(o2.getDegree());
	}
}


