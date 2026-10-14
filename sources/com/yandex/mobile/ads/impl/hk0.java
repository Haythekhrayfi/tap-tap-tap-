package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class hk0 implements s20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wh0 f21445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g20 f21446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik0.a f21447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik0 f21448d;

    public hk0(ik0 ik0Var, wh0 wh0Var, eq0 eq0Var, nk0.b bVar) {
        this.f21448d = ik0Var;
        this.f21445a = wh0Var;
        this.f21446b = eq0Var;
        this.f21447c = bVar;
    }

    @Override // com.yandex.mobile.ads.impl.s20
    public final void a(Map<String, Bitmap> map) {
        this.f21448d.f21738a.a(v3.f25805h);
        this.f21448d.f21740c.a(this.f21445a, map);
        jb jbVar = this.f21448d.f21739b;
        wh0 wh0Var = this.f21445a;
        Objects.requireNonNull(jbVar);
        for (qh0 qh0Var : wh0Var.c().d()) {
            List<qa<?>> listB = qh0Var.b();
            if (listB != null && !listB.isEmpty()) {
                qh0Var.c(jbVar.a(listB, map));
            }
        }
        this.f21446b.a(map);
        ((nk0.b) this.f21447c).b();
    }
}
