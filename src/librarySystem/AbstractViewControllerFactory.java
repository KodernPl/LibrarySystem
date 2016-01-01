package librarySystem;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

import controller.ControllerFactory;
import view.InternalFrameFactory;

public abstract class AbstractViewControllerFactory {
	
	public static void createViewController(String command, JDesktopPane desktop, ILibrary library,
			IUndoRedo undoObject) {
		JInternalFrame view = InternalFrameFactory.createFrameFactory(command, library);
		ControllerFactory.createController(view, library, undoObject);
		desktop.add(view);
		view.toFront();
	}
}
