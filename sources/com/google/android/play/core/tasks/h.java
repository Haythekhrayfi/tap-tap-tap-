package com.google.android.play.core.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
final class h<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f12544a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<g<ResultT>> f12545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12546c;

    public final void a(Task<ResultT> task) {
        g<ResultT> gVarPoll;
        synchronized (this.f12544a) {
            if (this.f12545b != null && !this.f12546c) {
                this.f12546c = true;
                while (true) {
                    synchronized (this.f12544a) {
                        gVarPoll = this.f12545b.poll();
                        if (gVarPoll == null) {
                            this.f12546c = false;
                            return;
                        }
                    }
                    gVarPoll.a(task);
                }
            }
        }
    }

    public final void a(g<ResultT> gVar) {
        synchronized (this.f12544a) {
            if (this.f12545b == null) {
                this.f12545b = new ArrayDeque();
            }
            this.f12545b.add(gVar);
        }
    }
}
