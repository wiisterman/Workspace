package question3;

import java.util.EventListener;

public interface SaveButtonListener extends EventListener {
	public void saveButtonClicked(SaveButtonEventObject ev);
}
