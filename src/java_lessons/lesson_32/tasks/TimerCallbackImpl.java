package java_lessons.lesson_32.tasks;

import java.util.Timer;

public class TimerCallbackImpl implements TimerCallback {

    private final Timer timer;

    public TimerCallbackImpl(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void stopTimer() {
        timer.cancel();
        timer.purge();
    }
}
