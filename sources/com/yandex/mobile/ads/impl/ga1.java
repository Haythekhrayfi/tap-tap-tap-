package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ga1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f20992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ka1 f20993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i01 f20994c = i01.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yb1 f20995d = new yb1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fa1 f20996e = new fa1();

    public ga1(Context context) {
        this.f20992a = context.getApplicationContext();
        this.f20993b = new ka1(context);
    }

    public final void a() {
        yb1 yb1Var = this.f20995d;
        Context context = this.f20992a;
        Objects.requireNonNull(yb1Var);
        if (u6.a(context) && this.f20994c.h() && this.f20996e.a(this.f20992a)) {
            this.f20993b.a();
        }
    }
}
