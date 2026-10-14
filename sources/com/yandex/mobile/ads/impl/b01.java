package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class b01 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final CopyOnWriteArrayList<h01> f19077e = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f19078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f19079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h01.a f19080d;

    public class a implements h01.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h01 f19081a;

        public a(h01 h01Var) {
            this.f19081a = h01Var;
        }

        @Override // com.yandex.mobile.ads.impl.h01.a
        public final void a(d8 d8Var, wr wrVar) {
            b01.f19077e.remove(this.f19081a);
            b01.this.f19080d.a(d8Var, wrVar);
        }

        @Override // com.yandex.mobile.ads.impl.h01.a
        public final void a(t2 t2Var) {
            b01.f19077e.remove(this.f19081a);
            b01.this.f19080d.a(t2Var);
        }
    }

    public b01(Context context, Executor executor, h01.a aVar) {
        this.f19078b = context.getApplicationContext();
        this.f19079c = executor;
        this.f19080d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h01 h01Var = new h01(this.f19078b, this.f19079c, new w3());
        f19077e.add(h01Var);
        h01Var.a(new a(h01Var));
    }
}
