package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class nn1 implements an1, pm1.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static nn1 f23513f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f23514a = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kn1 f23515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final om1 f23516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private en1 f23517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private fm1 f23518e;

    public nn1(kn1 kn1Var, om1 om1Var) {
        this.f23515b = kn1Var;
        this.f23516c = om1Var;
    }

    public static nn1 a() {
        if (f23513f == null) {
            f23513f = new nn1(new kn1(), new om1());
        }
        return f23513f;
    }

    public final void a(float f10) {
        this.f23514a = f10;
        if (this.f23518e == null) {
            this.f23518e = fm1.a();
        }
        Iterator<em1> it = this.f23518e.c().iterator();
        while (it.hasNext()) {
            hn1.a(it.next().i().e(), f10);
        }
    }

    public final void a(Context context) {
        Objects.requireNonNull(this.f23516c);
        dm1 dm1Var = new dm1();
        kn1 kn1Var = this.f23515b;
        Handler handler = new Handler();
        Objects.requireNonNull(kn1Var);
        this.f23517d = new en1(handler, context, dm1Var, this);
    }

    public final void b() {
        pm1.a().a(this);
        pm1.a().b();
        Objects.requireNonNull(i81.g());
        i81.a();
        this.f23517d.a();
    }

    public final void c() {
        i81.g().b();
        pm1.a().c();
        this.f23517d.b();
    }

    public final float d() {
        return this.f23514a;
    }
}
