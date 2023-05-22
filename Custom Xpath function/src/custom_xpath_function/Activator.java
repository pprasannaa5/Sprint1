package custom_xpath_function;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
@SuppressWarnings("serial")
public class Activator extends AbstractAction {

	// The plug-in ID
	public static final String PLUGIN_ID = "Custom_Xpath_function"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 * @param <ImageDescriptor>
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	@SuppressWarnings({ "hiding", "unchecked" })
	public static <ImageDescriptor> ImageDescriptor getImageDescriptor(String path) {
		return (ImageDescriptor) imageDescriptorFromPlugin(PLUGIN_ID, path);
	}

	private static ImageDescriptor imageDescriptorFromPlugin(String pluginId,
			String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
