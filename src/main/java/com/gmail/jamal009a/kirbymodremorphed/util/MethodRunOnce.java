package com.gmail.jamal009a.kirbymodremorphed.util;

import java.util.concurrent.atomic.AtomicBoolean;

public class MethodRunOnce {
    private final AtomicBoolean done = new AtomicBoolean();

    public void run(Runnable task) {
        if (done.get()) return;
        if (done.compareAndSet(false, true)) {task.run();}
    }

    public void reset(){done.set(false);}
}
