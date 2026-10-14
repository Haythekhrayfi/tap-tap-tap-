package com.yandex.mobile.ads.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class fy0 implements uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final uk f20915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cj f20916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20917d;

    public fy0(Context context, wp wpVar, uk ukVar) {
        this.f20914a = context;
        this.f20915b = ukVar;
        this.f20916c = wpVar;
    }

    public final void a() {
        this.f20917d = true;
        this.f20916c.a();
    }

    @Override // com.yandex.mobile.ads.impl.uk
    public final void e() {
        if (this.f20917d) {
            this.f20915b.e();
        } else {
            this.f20916c.a(this.f20914a);
        }
    }
}
