package publishercustomercomplain;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration complainRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println(" Customer Complain Publisher has Started\n");
		CustomerComplainPublish CustomerComplainPublish = new CustomerComplainPublishImpl();
		complainRegistration = context.registerService(CustomerComplainPublish.class.getName(), CustomerComplainPublish, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Customer Complain Publisher has Stopped\n");
		complainRegistration.unregister();
	}

}
