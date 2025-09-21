package defaultmethod.ex2;

import java.time.LocalDateTime;

public class EmailNotifier implements Notifier {
	@Override
	public void scheduleNotification(String message, LocalDateTime scheduledTime) {

	}

	@Override
	public void notify(String message) {
		System.out.println("[EMAIL] " + message);
	}
}
