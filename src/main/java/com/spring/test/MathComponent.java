package com.spring.test;

import org.springframework.stereotype.Service;

@Service("mc")
public class MathComponent {
	public int add(int x, int y) {
		return x + y;
	}
}
