package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class ql0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ll0 f24531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w3 f24532c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24530a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dm0 f24533d = new dm0();

    public interface a {
    }

    public static class b implements me1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f24534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final w3 f24535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f24536c;

        public b(w3 w3Var, int i10, nk0.b bVar) {
            this.f24534a = new AtomicInteger(i10);
            this.f24535b = w3Var;
            this.f24536c = bVar;
        }

        @Override // com.yandex.mobile.ads.impl.me1
        public final void a() {
            if (this.f24534a.decrementAndGet() == 0) {
                this.f24535b.a(v3.f25806i);
                ((nk0.b) this.f24536c).c();
            }
        }
    }

    public ql0(Context context, w3 w3Var) {
        this.f24531b = new ll0(context);
        this.f24532c = w3Var;
    }

    public final void a() {
        synchronized (this.f24530a) {
            this.f24531b.a();
        }
    }

    public final void a(wh0 wh0Var, nk0.b bVar) {
        synchronized (this.f24530a) {
            boolean zK = wh0Var.b().K();
            cj0 cj0VarC = wh0Var.c();
            Objects.requireNonNull(this.f24533d);
            HashSet hashSetA = dm0.a(cj0VarC);
            if (!zK || hashSetA.size() == 0) {
                bVar.c();
            } else {
                b bVar2 = new b(this.f24532c, hashSetA.size(), bVar);
                this.f24532c.b(v3.f25806i);
                Iterator it = hashSetA.iterator();
                while (it.hasNext()) {
                    this.f24531b.a((String) it.next(), bVar2);
                }
            }
        }
    }
}
