package okhttp3;

import defpackage.a;
import fd.j0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kc.m;
import kc.t;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes3.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        j0.i(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        for (RealCall.AsyncCall asyncCall : this.runningAsyncCalls) {
            if (j0.d(asyncCall.getHost(), str)) {
                return asyncCall;
            }
        }
        for (RealCall.AsyncCall asyncCall2 : this.readyAsyncCalls) {
            if (j0.d(asyncCall2.getHost(), str)) {
                return asyncCall2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t10) {
        Runnable idleCallback;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            idleCallback = getIdleCallback();
        }
        if (promoteAndExecute() || idleCallback == null) {
            return;
        }
        idleCallback.run();
    }

    private final boolean promoteAndExecute() {
        int i10;
        boolean z10;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sbA = a.a("Thread ");
            sbA.append((Object) Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            j0.h(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                if (this.runningAsyncCalls.size() >= getMaxRequests()) {
                    break;
                }
                if (next.getCallsPerHost().get() < getMaxRequestsPerHost()) {
                    it.remove();
                    next.getCallsPerHost().incrementAndGet();
                    arrayList.add(next);
                    this.runningAsyncCalls.add(next);
                }
            }
            z10 = runningCallsCount() > 0;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((RealCall.AsyncCall) arrayList.get(i10)).executeOn(executorService());
        }
        return z10;
    }

    /* JADX INFO: renamed from: -deprecated_executorService, reason: not valid java name */
    public final ExecutorService m43deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getCall().cancel();
        }
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getCall().cancel();
        }
        Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall asyncCallFindExistingCallWithHost;
        j0.i(asyncCall, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
            if (!asyncCall.getCall().getForWebSocket() && (asyncCallFindExistingCallWithHost = findExistingCallWithHost(asyncCall.getHost())) != null) {
                asyncCall.reuseCallsPerHostFrom(asyncCallFindExistingCallWithHost);
            }
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall realCall) {
        j0.i(realCall, "call");
        this.runningSyncCalls.add(realCall);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(j0.p(Util.okHttpName, " Dispatcher"), false));
        }
        executorService = this.executorServiceOrNull;
        j0.f(executorService);
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        j0.i(asyncCall, "call");
        asyncCall.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, asyncCall);
    }

    public final void finished$okhttp(RealCall realCall) {
        j0.i(realCall, "call");
        finished(this.runningSyncCalls, realCall);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        List<Call> listUnmodifiableList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        ArrayList arrayList = new ArrayList(m.j(arrayDeque, 10));
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList);
        j0.h(listUnmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        List<Call> listUnmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        ArrayList arrayList = new ArrayList(m.j(arrayDeque2, 10));
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        listUnmodifiableList = Collections.unmodifiableList(t.z(arrayDeque, arrayList));
        j0.h(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i10) {
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(j0.p("max < 1: ", Integer.valueOf(i10)).toString());
        }
        synchronized (this) {
            this.maxRequests = i10;
        }
        promoteAndExecute();
    }

    public final void setMaxRequestsPerHost(int i10) {
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(j0.p("max < 1: ", Integer.valueOf(i10)).toString());
        }
        synchronized (this) {
            this.maxRequestsPerHost = i10;
        }
        promoteAndExecute();
    }
}
