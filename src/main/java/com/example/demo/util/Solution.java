package com.example.demo.util;

import org.springframework.stereotype.Component;

@Component
public class Solution {

	public int result (String a, String b) {
		int result = 0;
		if(a != null && b !=null && !a.isBlank() && !b.isBlank()) {
			
			int first = stringToInteger(a);
			int second = stringToInteger(b);
			if(first < second) {
				result = count(first, second);
			}else {
				result = count(second, first);
			}
		}
		return result;
	}
	int stringToInteger (String in) {
		int value = 0;
		String regInt = "\\d+";
		if(in.matches(regInt)) {
			value = Integer.valueOf(in);
		}else {
			throw new NumberFormatException(in + " is not a number.");
		}
		return value;
	}
	int count(int start, int end) {
		
		int result = 0;
		int replace = 6;
		int nextStep = 2;
		if(start < replace && replace>end) {
			return result;
		}else if (start>replace) {
			replace = start%2==1? start+1: start;
		}
		
		int x = 3;
		while(replace/x >1 && replace <= end) {
			
			int quotient = (replace/x);
			if(quotient <= x && replace%x != 0) { //halfway - the other half is the same
				replace = x*(x-1);
				if(replace < start) {
					replace = x*(x+1);
					if(replace>end) {
						break;
					}
				}
				quotient = replace/x;
			}
			if(replace%x== 0 ) {
				
				if(quotient == x-1) {
					replace = (x+1)*x;
					
					result++;
				}else if (quotient == x+1) {
					replace = (x+1)*(x+nextStep);
					x += nextStep;
					result++;
				}else if (quotient > x+1) {
					x +=nextStep;
				}else {
					break;
				}
			}else {
				x +=nextStep;
			}
			
			
		}
		return result;
	}
	
}
