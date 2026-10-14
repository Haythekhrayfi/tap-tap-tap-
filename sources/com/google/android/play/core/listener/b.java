package com.google.android.play.core.listener;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.av;
import com.google.android.play.core.splitcompat.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<StateT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af f12305a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IntentFilter f12307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f12308d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<StateUpdatedListener<StateT>> f12306b = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f12309e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f12310f = false;

    public b(af afVar, IntentFilter intentFilter, Context context) {
        this.f12305a = afVar;
        this.f12307c = intentFilter;
        this.f12308d = p.a(context);
    }

    private final void c() {
        a aVar;
        if ((this.f12310f || !this.f12306b.isEmpty()) && this.f12309e == null) {
            a aVar2 = new a(this);
            this.f12309e = aVar2;
            this.f12308d.registerReceiver(aVar2, this.f12307c);
        }
        if (this.f12310f || !this.f12306b.isEmpty() || (aVar = this.f12309e) == null) {
            return;
        }
        this.f12308d.unregisterReceiver(aVar);
        this.f12309e = null;
    }

    public final synchronized void a() {
        this.f12305a.c("clearListeners", new Object[0]);
        this.f12306b.clear();
        c();
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void a(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f12305a.c("registerListener", new Object[0]);
        av.a(stateUpdatedListener, "Registered Play Core listener should not be null.");
        this.f12306b.add(stateUpdatedListener);
        c();
    }

    public final synchronized void a(StateT statet) {
        Iterator it = new HashSet(this.f12306b).iterator();
        while (it.hasNext()) {
            ((StateUpdatedListener) it.next()).onStateUpdate(statet);
        }
    }

    public final synchronized void a(boolean z10) {
        this.f12310f = z10;
        c();
    }

    public final synchronized void b(StateUpdatedListener<StateT> stateUpdatedListener) {
        this.f12305a.c("unregisterListener", new Object[0]);
        av.a(stateUpdatedListener, "Unregistered Play Core listener should not be null.");
        this.f12306b.remove(stateUpdatedListener);
        c();
    }

    public final synchronized boolean b() {
        return this.f12309e != null;
    }
}
