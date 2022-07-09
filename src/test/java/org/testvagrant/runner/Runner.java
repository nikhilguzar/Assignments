package org.testvagrant.runner;

import java.io.IOException;

import org.testvagrant.testcases.ValidateRole;
import org.testvagrant.testcases.ValidateTeam;




public class Runner {
	
	public static void main(String[] args) throws IOException 
	{
		
		ValidateTeam tc1 = new ValidateTeam();
		tc1.TC1();

		ValidateRole tc2 = new ValidateRole();
		tc2.TC2();
}
}
