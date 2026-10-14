package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22290a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f22291b = new CopyOnWriteArrayList();

    public final void a(Context context) {
        ArrayList arrayList;
        synchronized (this.f22290a) {
            arrayList = new ArrayList(this.f22291b);
            this.f22291b.clear();
        }
        j8 j8VarA = j8.a(context);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j8VarA.a((o8) it.next());
        }
    }

    public final void a(Context context, o8 o8Var) {
        synchronized (this.f22290a) {
            this.f22291b.add(o8Var);
            j8.a(context).b(o8Var);
        }
    }
}
