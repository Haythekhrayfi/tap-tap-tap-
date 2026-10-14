package okhttp3.internal.concurrent;

import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import jc.w;
import kc.t;
import okhttp3.internal.Util;
import uc.a;

/* JADX INFO: loaded from: classes3.dex */
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    public static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            super(j0.p(Util.okHttpName, " awaitIdle"), false);
            this.latch = new CountDownLatch(1);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Task {
        public final /* synthetic */ a<w> $block;
        public final /* synthetic */ boolean $cancelable;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z10, a<w> aVar) {
            super(str, z10);
            this.$name = str;
            this.$cancelable = z10;
            this.$block = aVar;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.$block.invoke();
            return -1L;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.TaskQueue$schedule$2, reason: invalid class name */
    public static final class AnonymousClass2 extends Task {
        public final /* synthetic */ a<Long> $block;
        public final /* synthetic */ String $name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, a<Long> aVar) {
            super(str, false, 2, null);
            this.$name = str;
            this.$block = aVar;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            return this.$block.invoke().longValue();
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        j0.i(taskRunner, "taskRunner");
        j0.i(str, "name");
        this.taskRunner = taskRunner;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j10, boolean z10, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        j0.i(str, "name");
        j0.i(aVar, "block");
        taskQueue.schedule(new AnonymousClass1(str, z10, aVar), j10);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j10, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        j0.i(str, "name");
        j0.i(aVar, "block");
        taskQueue.schedule(new AnonymousClass2(str, aVar), j10);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        taskQueue.schedule(task, j10);
    }

    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sbA = defpackage.a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this.taskRunner) {
            if (cancelAllAndDecide$okhttp()) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            j0.f(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z10 = false;
        int size = this.futureTasks.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (this.futureTasks.get(size).getCancelable()) {
                    Task task2 = this.futureTasks.get(size);
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.log(task2, this, "canceled");
                    }
                    this.futureTasks.remove(size);
                    z10 = true;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return z10;
    }

    public final void execute(String str, long j10, boolean z10, a<w> aVar) {
        j0.i(str, "name");
        j0.i(aVar, "block");
        schedule(new AnonymousClass1(str, z10, aVar), j10);
    }

    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<Task> getScheduledTasks() {
        List<Task> listH;
        synchronized (this.taskRunner) {
            listH = t.H(getFutureTasks$okhttp());
        }
        return listH;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (getActiveTask$okhttp() == null && getFutureTasks$okhttp().isEmpty()) {
                return new CountDownLatch(0);
            }
            Task activeTask$okhttp = getActiveTask$okhttp();
            if (activeTask$okhttp instanceof AwaitIdleTask) {
                return ((AwaitIdleTask) activeTask$okhttp).getLatch();
            }
            for (Task task : getFutureTasks$okhttp()) {
                if (task instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask) task).getLatch();
                }
            }
            AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getLatch();
        }
    }

    public final void schedule(String str, long j10, a<Long> aVar) {
        j0.i(str, "name");
        j0.i(aVar, "block");
        schedule(new AnonymousClass2(str, aVar), j10);
    }

    public final void schedule(Task task, long j10) {
        j0.i(task, "task");
        synchronized (this.taskRunner) {
            if (!getShutdown$okhttp()) {
                if (scheduleAndDecide$okhttp(task, j10, false)) {
                    getTaskRunner$okhttp().kickCoordinator$okhttp(this);
                }
            } else if (task.getCancelable()) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j10, boolean z10) {
        String duration;
        String str;
        j0.i(task, "task");
        task.initQueue$okhttp(this);
        long jNanoTime = this.taskRunner.getBackend().nanoTime();
        long j11 = jNanoTime + j10;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j11) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j11);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            long j12 = j11 - jNanoTime;
            if (z10) {
                duration = TaskLoggerKt.formatDuration(j12);
                str = "run again after ";
            } else {
                duration = TaskLoggerKt.formatDuration(j12);
                str = "scheduled after ";
            }
            TaskLoggerKt.log(task, this, j0.p(str, duration));
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime$okhttp() - jNanoTime > j10) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z10) {
        this.cancelActiveTask = z10;
    }

    public final void setShutdown$okhttp(boolean z10) {
        this.shutdown = z10;
    }

    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sbA = defpackage.a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        synchronized (this.taskRunner) {
            setShutdown$okhttp(true);
            if (cancelAllAndDecide$okhttp()) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
        }
    }

    public String toString() {
        return this.name;
    }
}
