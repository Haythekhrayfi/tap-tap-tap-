package okhttp3.internal.concurrent;

import fd.j0;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2Connection;
import uc.a;

/* JADX INFO: loaded from: classes3.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j10) {
        StringBuilder sb2;
        long j11;
        long j12;
        long j13;
        if (j10 > -999500000) {
            if (j10 > -999500) {
                if (j10 <= 0) {
                    sb2 = new StringBuilder();
                    j13 = j10 - ((long) 500);
                } else if (j10 < 999500) {
                    sb2 = new StringBuilder();
                    j13 = j10 + ((long) 500);
                } else if (j10 < 999500000) {
                    sb2 = new StringBuilder();
                    j12 = j10 + ((long) 500000);
                } else {
                    sb2 = new StringBuilder();
                    j11 = j10 + ((long) 500000000);
                }
                sb2.append(j13 / ((long) 1000));
                sb2.append(" µs");
                String str = String.format("%6s", Arrays.copyOf(new Object[]{sb2.toString()}, 1));
                j0.h(str, "format(format, *args)");
                return str;
            }
            sb2 = new StringBuilder();
            j12 = j10 - ((long) 500000);
            sb2.append(j12 / ((long) 1000000));
            sb2.append(" ms");
            String str2 = String.format("%6s", Arrays.copyOf(new Object[]{sb2.toString()}, 1));
            j0.h(str2, "format(format, *args)");
            return str2;
        }
        sb2 = new StringBuilder();
        j11 = j10 - ((long) 500000000);
        sb2.append(j11 / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
        sb2.append(" s ");
        String str3 = String.format("%6s", Arrays.copyOf(new Object[]{sb2.toString()}, 1));
        j0.h(str3, "format(format, *args)");
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.getName$okhttp());
        sb2.append(' ');
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        j0.h(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(task.getName());
        logger.fine(sb2.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, a<? extends T> aVar) {
        long jNanoTime;
        j0.i(task, "task");
        j0.i(taskQueue, "queue");
        j0.i(aVar, "block");
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T tInvoke = aVar.invoke();
            if (zIsLoggable) {
                String strP = j0.p("finished run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            return tInvoke;
        } finally {
            if (zIsLoggable) {
                log(task, taskQueue, j0.p("failed a run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime)));
            }
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, a<String> aVar) {
        j0.i(task, "task");
        j0.i(taskQueue, "queue");
        j0.i(aVar, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, aVar.invoke());
        }
    }
}
