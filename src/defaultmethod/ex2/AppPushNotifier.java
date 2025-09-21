package defaultmethod.ex2;

import java.time.LocalDateTime;

public class AppPushNotifier implements Notifier {

	@Override
	public void notify(String message) {
		System.out.println("[APP] " + message);
	}

	@Override
	public void scheduleNotification(String message, LocalDateTime scheduledTime) {
		System.out.println("[EMAIL 전용 스케줄링] message: " + message + ", time: " + scheduledTime);
	}
}
