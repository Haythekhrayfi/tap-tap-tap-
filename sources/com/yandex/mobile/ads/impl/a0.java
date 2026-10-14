package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f18749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k2 f18750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0 f18751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z f18752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private fw0.a f18753e;

    public a0(Context context, k2 k2Var, b0 b0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f18749a = applicationContext;
        this.f18750b = k2Var;
        this.f18751c = b0Var;
        this.f18752d = new z(applicationContext, k2Var, b0Var, null);
    }

    public final void a() {
        z zVar = this.f18752d;
        if (zVar != null) {
            zVar.a();
        }
    }

    public final void a(FalseClick falseClick) {
        this.f18752d = new z(this.f18749a, this.f18750b, this.f18751c, falseClick);
        fw0.a aVar = this.f18753e;
        if (aVar != null) {
            a(aVar);
        }
    }

    public final void a(fw0.a aVar) {
        this.f18753e = aVar;
        z zVar = this.f18752d;
        if (zVar != null) {
            zVar.a(aVar);
        }
    }

    public final void b() {
        z zVar = this.f18752d;
        if (zVar != null) {
            zVar.b();
        }
    }

    public final void c() {
        z zVar = this.f18752d;
        if (zVar != null) {
            zVar.c();
        }
    }

    public final void d() {
        z zVar = this.f18752d;
        if (zVar != null) {
            zVar.e();
        }
    }

    public final void e() {
        z zVar = this.f18752d;
        if (zVar != null) {
            zVar.f();
        }
    }

    public final void f() {
        z zVar = this.f18752d;
        if (zVar != null) {
            zVar.g();
        }
    }
}
