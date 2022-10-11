package com.Hooks;

import com.Baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookscls extends BaseClass {

	@Before
	public void bef() {
		browserLaunch();
		getUrl("https://www.facebook.com");

	}
	
	@Before(order=2)
	public void bef2() {
		System.out.println("Bef2<<<<<<<<<");

	}
	@Before(order=1)
	public void bef1() {
		System.out.println("Bef1<<<<<<<<<");

	}
	@Before(order=3)
	public void bef3() {
		System.out.println("Bef3<<<<<<<<<");

	}
	@After(order=1)
	public void aft1() {
		System.out.println(">>>>>>>>>after1");

	}
	
	@After(order=3)
	public void aft3() {
		System.out.println(">>>>>>>>>after3");

	}
	
	@After(order=2)
	public void aft2() {
		System.out.println(">>>>>>>>>after2");

	}
	
	
	
	
	
	
	
	
	
}
