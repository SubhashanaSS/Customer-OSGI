package consumercomplaincustomer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import publishercustomercomplain.CustomerComplainPublish;

public class Activator implements BundleActivator {

	ServiceReference ReferenceComplain;

	Scanner input = new Scanner(System.in);
	int command;

	public void start(BundleContext Context) throws Exception {
			ReferenceComplain = Context.getServiceReference(CustomerComplainPublish.class.getName());
			CustomerComplainPublish complainPublish = (CustomerComplainPublish) Context.getService(ReferenceComplain);
			
			
			System.out.println("\n---------- Customer Complains ----------\n");
	
			while (true) {
				
				System.out.println("Do you want to sent a Complain?");
				System.out.println("\n YES = 1 / NO = 0 ");
				System.out.print("\nInput the Command Please!: ");
				
				command = input.nextInt();
				
	
					
					if (command == 1) {
						
						System.out.println("\nEnter Complain Details\n");
						
						complainPublish.main();
						System.out.println("\n******* we will get back you *******\nCome Again! Thank You!\n");
					
				}else if (command == 0) {
					
					System.out.println("\n******* Come Again! Thank You! *******\n");
				
			}else {
					
					System.out.println("\n***Please Enter a valid command***\n");
			}
		
		}
	}

public void stop(BundleContext context) throws Exception {
		System.out.println("Come Again! Thank You!");
		context.ungetService(ReferenceComplain);
	}

}
