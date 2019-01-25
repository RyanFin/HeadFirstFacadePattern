package com.headfirst.facade;

import com.headfirst.subsystem.Amplifier;
import com.headfirst.subsystem.CdPlayer;
import com.headfirst.subsystem.DvdPlayer;
import com.headfirst.subsystem.PopcornPopper;
import com.headfirst.subsystem.Projector;
import com.headfirst.subsystem.Screen;
import com.headfirst.subsystem.TheatreLights;
import com.headfirst.subsystem.Tuner;

public class HomeTheatreFacade {
	// instance variables
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheatreLights lights;
	Screen screen;
	PopcornPopper popper;
	
	// composition in the constructor
	public HomeTheatreFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector,
			TheatreLights lights, Screen screen, PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}
	
	// additional methods
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theatre down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}

	

}
