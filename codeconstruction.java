package epam.Exception_logging;
import java.util.Scanner;
import java.util.logging.Logger;

public class codeconstruction {
		static Logger log = Logger.getLogger(codeconstruction.class.getName());
		public static void costPrediction() {
			Scanner sc = new Scanner(System.in);
			log.info("Construction cost prediction");
			log.info("1. Standard materials");
			log.info("2. Above standard materials");
			log.info("3. High standard materials");
			log.info("4. High standard materials and fully automated");
			log.info("Enter your choice (1-4): ");
			try {
			int ch = sc.nextInt();
			log.info("Enter Area of house");
			switch(ch)
			{
			case 1:
				log.info("price = "+sc.nextDouble() * 1200 +" INR");
				break;
			case 2:
				log.info("price = "+sc.nextDouble() * 1500 +" INR");
				break;
			case 3:
				log.info("price = "+sc.nextDouble() * 1800 +" INR");
				break;
			case 4:
				log.info("price = "+sc.nextDouble() * 2500 +" INR");
				break;
			default:
				log.info("Entered invalid input");
			}
			} catch (Exception e) {
				log.info("Entered invalid input");
			}
		}
}
