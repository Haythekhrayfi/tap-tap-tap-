package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Configuration;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashSet f24285a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f24286b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24287c;

    public q0(Context context) {
        this.f24287c = a(context);
    }

    private static int a(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    public final void a() {
        Iterator it = this.f24286b.iterator();
        while (it.hasNext()) {
            ((r0) it.next()).b();
        }
    }

    public final void a(Configuration configuration) {
        int i10 = configuration.orientation;
        if (i10 != this.f24287c) {
            Iterator it = this.f24285a.iterator();
            while (it.hasNext()) {
                ((x0) it.next()).a();
            }
            this.f24287c = i10;
        }
    }

    public final void a(r0 r0Var) {
        this.f24286b.add(r0Var);
    }

    public final void b() {
        Iterator it = this.f24286b.iterator();
        while (it.hasNext()) {
            ((r0) it.next()).a();
        }
    }

    public final void b(r0 r0Var) {
        this.f24286b.remove(r0Var);
    }
}
