package com.yandex.mobile.ads.nativeads;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f27708b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a0 f27709c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakHashMap f27710a = new WeakHashMap();

    public static a0 a() {
        if (f27709c == null) {
            synchronized (f27708b) {
                if (f27709c == null) {
                    f27709c = new a0();
                }
            }
        }
        return f27709c;
    }

    public final l0 a(View view) {
        l0 l0Var;
        synchronized (f27708b) {
            l0Var = (l0) this.f27710a.get(view);
        }
        return l0Var;
    }

    public final void a(View view, l0 l0Var) {
        synchronized (f27708b) {
            this.f27710a.put(view, l0Var);
        }
    }

    public final boolean a(l0 l0Var) {
        Iterator it = this.f27710a.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((l0) ((Map.Entry) it.next()).getValue()) == l0Var) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
