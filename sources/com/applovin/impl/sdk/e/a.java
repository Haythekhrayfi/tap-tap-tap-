package com.applovin.impl.sdk.e;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Callable<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.applovin.impl.sdk.o f10497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.applovin.impl.sdk.y f10499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10500d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f10501e = com.applovin.impl.sdk.o.au();

    public a(String str, com.applovin.impl.sdk.o oVar) {
        this.f10498b = str;
        this.f10497a = oVar;
        this.f10499c = oVar.F();
    }

    public Context a() {
        return this.f10501e;
    }

    public void a(boolean z10) {
        this.f10500d.set(z10);
    }
}
