package ch.qos.logback.core.net;

import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes.dex */
public class QueueFactory {
    public <E> LinkedBlockingDeque<E> newLinkedBlockingDeque(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        return new LinkedBlockingDeque<>(i10);
    }
}
