package todo2;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		try {
			
			Scanner scanner1 = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
			
			File song1 = new File("Song1.wav");
			File song2 = new File("Song2.wav");
			File song3 = new File("Song3.wav");
			Clip clip = AudioSystem.getClip();
			
			int input1 = 0;
			int input2 = 0;
			boolean switch1 = false;
			
			while(input1 != 4) {
				System.out.println("Menu Selection: ");
				System.out.println("1. Yume 2kki - Opening Theme");
				System.out.println("2. Mother 2 - Pokey Means Business!");
				System.out.println("3. Mother 3 - Natural Killer Cyborg");
				System.out.println("4. Quit");
				System.out.print("> ");
				
				input1 = scanner1.nextInt();
				
				switch(input1) {
					case(1): 
						AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(song1);
						clip.open(audioStream1);
						switch1 = true;
					break;
					case(2): 
						AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(song2);
						clip.open(audioStream2);
						switch1 = true;
					break;
					case(3): 
						AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(song3);
						clip.open(audioStream3);
						switch1 = true;
					break;
					case(4):
						System.out.println("Closing...");
						Thread.sleep(1000);
					break;
					default: 
						System.out.println("Invalid input.");
				}
				
				System.out.println();
			
				while(switch1 == true) {
					System.out.println("Song Menu: ");
					System.out.println("1. Play, 2. Pause, 3. Reset, 4. Quit");
					System.out.print("> ");
					
					input2 = scanner2.nextInt();
					
					switch(input2) {
						case(1): 
							clip.loop(Clip.LOOP_CONTINUOUSLY);
							clip.start();
						break;
						case(2): clip.stop();
						break;
						case(3): 
							clip.setMicrosecondPosition(0);
							clip.stop();
						break;
						case(4):
							clip.close();
							System.out.println("Closing...");
							Thread.sleep(1000);
							switch1 = false;
						break;
						default: System.out.println("Invalid input.");
					}
					
					System.out.println();
					
				}
				
			}
		
			System.out.println("Goodbye!");
			scanner1.close();
			scanner2.close();
		}
		
		catch(Exception e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
		
	}
	
}
