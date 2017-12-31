//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		for (int i = 0; i < 1000; i++) {
			/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */
String Animal =JOptionPane.showInputDialog("What animal do you want to hear?");
		/* 2. Make it so that the user can keep entering new animals. */

if(Animal .equalsIgnoreCase ("cow")) {
	playMoo();
}
else if(Animal .equalsIgnoreCase ("duck")) {
	playQuack();
}
else if(Animal .equalsIgnoreCase ("dog")) {
	playWoof();
}
else if(Animal .equalsIgnoreCase ("cat")) {
	playMeow();
}
else if(Animal .equalsIgnoreCase ("llama")) {
	playLlama();
}
else {
	JOptionPane.showMessageDialog(null, "I don't have that animal in my farm so here's a llama sound.");
	playLlama();
}
	}
		}
		

void playMoo() {
		playNoise(mooFile);
	}	

	

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	
	void playMeow() {
		playNoise(meowFile);
	}
	
	void playLlama() {
		playNoise(llamaFile);
	}

	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}


