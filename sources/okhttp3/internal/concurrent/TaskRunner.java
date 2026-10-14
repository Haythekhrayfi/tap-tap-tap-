package okhttp3.internal.concurrent;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.a;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kc.t;
import okhttp3.internal.Util;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class TaskRunner {
    public static final Companion Companion = new Companion(null);
    public static final TaskRunner INSTANCE = new TaskRunner(new RealBackend(Util.threadFactory(j0.p(Util.okHttpName, " TaskRunner"), true)));
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private final Runnable runnable;

    public interface Backend {
        void beforeTask(TaskRunner taskRunner);

        void coordinatorNotify(TaskRunner taskRunner);

        void coordinatorWait(TaskRunner taskRunner, long j10);

        void execute(Runnable runnable);

        long nanoTime();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Logger getLogger() {
            return TaskRunner.logger;
        }
    }

    public static final class RealBackend implements Backend {
        private final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
            j0.i(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void beforeTask(TaskRunner taskRunner) {
            j0.i(taskRunner, "taskRunner");
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(TaskRunner taskRunner) {
            j0.i(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(TaskRunner taskRunner, long j10) throws InterruptedException {
            j0.i(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(Runnable runnable) {
            j0.i(runnable, "runnable");
            this.executor.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        j0.h(logger2, "getLogger(TaskRunner::class.java.name)");
        logger = logger2;
    }

    public TaskRunner(Backend backend) {
        j0.i(backend, "backend");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task taskAwaitTaskToRun;
                while (true) {
                    TaskRunner taskRunner = this.this$0;
                    synchronized (taskRunner) {
                        taskAwaitTaskToRun = taskRunner.awaitTaskToRun();
                    }
                    if (taskAwaitTaskToRun == null) {
                        return;
                    }
                    TaskQueue queue$okhttp = taskAwaitTaskToRun.getQueue$okhttp();
                    j0.f(queue$okhttp);
                    TaskRunner taskRunner2 = this.this$0;
                    long jNanoTime = -1;
                    boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jNanoTime = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                        TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, "starting");
                    }
                    try {
                        taskRunner2.runTask(taskAwaitTaskToRun);
                        if (zIsLoggable) {
                            TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, j0.p("finished run in ", TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime)));
                        }
                    } catch (Throwable th) {
                        try {
                            taskRunner2.getBackend().execute(this);
                            throw th;
                        } catch (Throwable th2) {
                            if (zIsLoggable) {
                                TaskLoggerKt.log(taskAwaitTaskToRun, queue$okhttp, j0.p("failed a run in ", TaskLoggerKt.formatDuration(queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime)));
                            }
                            throw th2;
                        }
                    }
                }
            }
        };
    }

    private final void afterRun(Task task, long j10) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        j0.f(queue$okhttp);
        if (!(queue$okhttp.getActiveTask$okhttp() == task)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean cancelActiveTask$okhttp = queue$okhttp.getCancelActiveTask$okhttp();
        queue$okhttp.setCancelActiveTask$okhttp(false);
        queue$okhttp.setActiveTask$okhttp(null);
        this.busyQueues.remove(queue$okhttp);
        if (j10 != -1 && !cancelActiveTask$okhttp && !queue$okhttp.getShutdown$okhttp()) {
            queue$okhttp.scheduleAndDecide$okhttp(task, j10, true);
        }
        if (!queue$okhttp.getFutureTasks$okhttp().isEmpty()) {
            this.readyQueues.add(queue$okhttp);
        }
    }

    private final void beforeRun(Task task) {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        task.setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue queue$okhttp = task.getQueue$okhttp();
        j0.f(queue$okhttp);
        queue$okhttp.getFutureTasks$okhttp().remove(task);
        this.readyQueues.remove(queue$okhttp);
        queue$okhttp.setActiveTask$okhttp(task);
        this.busyQueues.add(queue$okhttp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runTask(Task task) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.getName());
        try {
            long jRunOnce = task.runOnce();
            synchronized (this) {
                afterRun(task, jRunOnce);
            }
        } finally {
            synchronized (this) {
                afterRun(task, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final List<TaskQueue> activeQueues() {
        List<TaskQueue> listZ;
        synchronized (this) {
            listZ = t.z(this.busyQueues, this.readyQueues);
        }
        return listZ;
    }

    public final Task awaitTaskToRun() {
        boolean z10;
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        while (!this.readyQueues.isEmpty()) {
            long jNanoTime = this.backend.nanoTime();
            long jMin = RecyclerView.FOREVER_NS;
            Iterator<TaskQueue> it = this.readyQueues.iterator();
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Task task2 = it.next().getFutureTasks$okhttp().get(0);
                long jMax = Math.max(0L, task2.getNextExecuteNanoTime$okhttp() - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        z10 = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                beforeRun(task);
                if (z10 || (!this.coordinatorWaiting && (!this.readyQueues.isEmpty()))) {
                    this.backend.execute(this.runnable);
                }
                return task;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jNanoTime) {
                    this.backend.coordinatorNotify(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jNanoTime + jMin;
            try {
                try {
                    this.backend.coordinatorWait(this, jMin);
                } catch (InterruptedException unused) {
                    cancelAll();
                }
                this.coordinatorWaiting = false;
            } catch (Throwable th) {
                this.coordinatorWaiting = false;
                throw th;
            }
        }
        return null;
    }

    public final void cancelAll() {
        int size = this.busyQueues.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        int size2 = this.readyQueues.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            TaskQueue taskQueue = this.readyQueues.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(size2);
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    public final Backend getBackend() {
        return this.backend;
    }

    public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
        j0.i(taskQueue, "taskQueue");
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        if (taskQueue.getActiveTask$okhttp() == null) {
            if (!taskQueue.getFutureTasks$okhttp().isEmpty()) {
                Util.addIfAbsent(this.readyQueues, taskQueue);
            } else {
                this.readyQueues.remove(taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    public final TaskQueue newQueue() {
        int i10;
        synchronized (this) {
            i10 = this.nextQueueName;
            this.nextQueueName = i10 + 1;
        }
        return new TaskQueue(this, j0.p("Q", Integer.valueOf(i10)));
    }
}
