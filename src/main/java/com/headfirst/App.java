package com.headfirst;

import com.headfirst.facade.HomeTheatreFacade;
import com.headfirst.subsystem.Amplifier;
import com.headfirst.subsystem.CdPlayer;
import com.headfirst.subsystem.DvdPlayer;
import com.headfirst.subsystem.PopcornPopper;
import com.headfirst.subsystem.Projector;
import com.headfirst.subsystem.Screen;
import com.headfirst.subsystem.TheatreLights;
import com.headfirst.subsystem.Tuner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Amplifier amp = new Amplifier();
    	Tuner tuner = new Tuner();
    	DvdPlayer dvd = new DvdPlayer();
    	CdPlayer cd = new CdPlayer();
    	Projector projector = new Projector();
    	TheatreLights lights = new TheatreLights();
    	Screen screen = new Screen();
    	PopcornPopper popper = new PopcornPopper();
    	
        HomeTheatreFacade homeTheatre = new HomeTheatreFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
        
        homeTheatre.watchMovie("Harry Potter and the Chamber of Secrets");
        homeTheatre.endMovie();
    }
}
