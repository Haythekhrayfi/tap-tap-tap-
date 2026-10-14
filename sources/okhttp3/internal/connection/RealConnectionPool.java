package okhttp3.internal.connection;

import defpackage.a;
import fd.j0;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kc.l;
import okhttp3.Address;
import okhttp3.ConnectionPool;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.platform.Platform;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class RealConnectionPool {
    public static final Companion Companion = new Companion(null);
    private final TaskQueue cleanupQueue;
    private final RealConnectionPool$cleanupTask$1 cleanupTask;
    private final ConcurrentLinkedQueue<RealConnection> connections;
    private final long keepAliveDurationNs;
    private final int maxIdleConnections;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final RealConnectionPool get(ConnectionPool connectionPool) {
            j0.i(connectionPool, "connectionPool");
            return connectionPool.getDelegate$okhttp();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [okhttp3.internal.connection.RealConnectionPool$cleanupTask$1] */
    public RealConnectionPool(TaskRunner taskRunner, int i10, long j10, TimeUnit timeUnit) {
        j0.i(taskRunner, "taskRunner");
        j0.i(timeUnit, "timeUnit");
        this.maxIdleConnections = i10;
        this.keepAliveDurationNs = timeUnit.toNanos(j10);
        this.cleanupQueue = taskRunner.newQueue();
        final String strP = j0.p(Util.okHttpName, " ConnectionPool");
        this.cleanupTask = new Task(strP) { // from class: okhttp3.internal.connection.RealConnectionPool$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                return this.this$0.cleanup(System.nanoTime());
            }
        };
        this.connections = new ConcurrentLinkedQueue<>();
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(j0.p("keepAliveDuration <= 0: ", Long.valueOf(j10)).toString());
        }
    }

    private final int pruneAndGetAllocationCount(RealConnection realConnection, long j10) {
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(realConnection);
            throw new AssertionError(sbA.toString());
        }
        List<Reference<RealCall>> calls = realConnection.getCalls();
        int i10 = 0;
        while (i10 < calls.size()) {
            Reference<RealCall> reference = calls.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                StringBuilder sbA2 = a.a("A connection to ");
                sbA2.append(realConnection.route().address().url());
                sbA2.append(" was leaked. Did you forget to close a response body?");
                Platform.Companion.get().logCloseableLeak(sbA2.toString(), ((RealCall.CallReference) reference).getCallStackTrace());
                calls.remove(i10);
                realConnection.setNoNewExchanges(true);
                if (calls.isEmpty()) {
                    realConnection.setIdleAtNs$okhttp(j10 - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return calls.size();
    }

    public final boolean callAcquirePooledConnection(Address address, RealCall realCall, List<Route> list, boolean z10) {
        j0.i(address, "address");
        j0.i(realCall, "call");
        for (RealConnection realConnection : this.connections) {
            j0.h(realConnection, "connection");
            synchronized (realConnection) {
                if (z10) {
                    if (!realConnection.isMultiplexed$okhttp()) {
                    }
                }
                if (realConnection.isEligible$okhttp(address, list)) {
                    realCall.acquireConnectionNoEvents(realConnection);
                    return true;
                }
            }
        }
        return false;
    }

    public final long cleanup(long j10) {
        int i10 = 0;
        long j11 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i11 = 0;
        for (RealConnection realConnection2 : this.connections) {
            j0.h(realConnection2, "connection");
            synchronized (realConnection2) {
                if (pruneAndGetAllocationCount(realConnection2, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long idleAtNs$okhttp = j10 - realConnection2.getIdleAtNs$okhttp();
                    if (idleAtNs$okhttp > j11) {
                        realConnection = realConnection2;
                        j11 = idleAtNs$okhttp;
                    }
                }
            }
        }
        long j12 = this.keepAliveDurationNs;
        if (j11 < j12 && i10 <= this.maxIdleConnections) {
            if (i10 > 0) {
                return j12 - j11;
            }
            if (i11 > 0) {
                return j12;
            }
            return -1L;
        }
        j0.f(realConnection);
        synchronized (realConnection) {
            if (!realConnection.getCalls().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs$okhttp() + j11 != j10) {
                return 0L;
            }
            realConnection.setNoNewExchanges(true);
            this.connections.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.cancelAll();
            }
            return 0L;
        }
    }

    public final boolean connectionBecameIdle(RealConnection realConnection) {
        j0.i(realConnection, "connection");
        if (Util.assertionsEnabled && !Thread.holdsLock(realConnection)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(realConnection);
            throw new AssertionError(sbA.toString());
        }
        if (!realConnection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        realConnection.setNoNewExchanges(true);
        this.connections.remove(realConnection);
        if (!this.connections.isEmpty()) {
            return true;
        }
        this.cleanupQueue.cancelAll();
        return true;
    }

    public final int connectionCount() {
        return this.connections.size();
    }

    public final void evictAll() {
        Socket socket;
        Iterator<RealConnection> it = this.connections.iterator();
        j0.h(it, "connections.iterator()");
        while (it.hasNext()) {
            RealConnection next = it.next();
            j0.h(next, "connection");
            synchronized (next) {
                if (next.getCalls().isEmpty()) {
                    it.remove();
                    next.setNoNewExchanges(true);
                    socket = next.socket();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Util.closeQuietly(socket);
            }
        }
        if (this.connections.isEmpty()) {
            this.cleanupQueue.cancelAll();
        }
    }

    public final int idleConnectionCount() {
        boolean zIsEmpty;
        ConcurrentLinkedQueue<RealConnection> concurrentLinkedQueue = this.connections;
        int i10 = 0;
        if (!(concurrentLinkedQueue instanceof Collection) || !concurrentLinkedQueue.isEmpty()) {
            for (RealConnection realConnection : concurrentLinkedQueue) {
                j0.h(realConnection, "it");
                synchronized (realConnection) {
                    zIsEmpty = realConnection.getCalls().isEmpty();
                }
                if (zIsEmpty && (i10 = i10 + 1) < 0) {
                    l.h();
                    throw null;
                }
            }
        }
        return i10;
    }

    public final void put(RealConnection realConnection) {
        j0.i(realConnection, "connection");
        if (!Util.assertionsEnabled || Thread.holdsLock(realConnection)) {
            this.connections.add(realConnection);
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        } else {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST hold lock on ");
            sbA.append(realConnection);
            throw new AssertionError(sbA.toString());
        }
    }
}
