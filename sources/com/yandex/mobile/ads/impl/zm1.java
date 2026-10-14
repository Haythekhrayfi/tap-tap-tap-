package com.yandex.mobile.ads.impl;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zm1 implements um1.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<um1> f27371b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private um1 f27372c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f27370a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private void b() {
        um1 um1VarPoll = this.f27371b.poll();
        this.f27372c = um1VarPoll;
        if (um1VarPoll != null) {
            um1VarPoll.executeOnExecutor(this.f27370a, new Object[0]);
        }
    }

    public final void a() {
        this.f27372c = null;
        b();
    }

    public final void a(um1 um1Var) {
        um1Var.a(this);
        this.f27371b.add(um1Var);
        if (this.f27372c == null) {
            b();
        }
    }
}
