package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class ub implements wf {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ub f25579g = new d().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f25585f;

    public static final class a {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setAllowedCapturePolicy(i10);
        }
    }

    public static final class b {
        public static void a(AudioAttributes.Builder builder, int i10) {
            builder.setSpatializationBehavior(i10);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes f25586a;

        private c(ub ubVar) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(ubVar.f25580a).setFlags(ubVar.f25581b).setUsage(ubVar.f25582c);
            int i10 = da1.f19803a;
            if (i10 >= 29) {
                a.a(usage, ubVar.f25583d);
            }
            if (i10 >= 32) {
                b.a(usage, ubVar.f25584e);
            }
            this.f25586a = usage.build();
        }

        public /* synthetic */ c(ub ubVar, int i10) {
            this(ubVar);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f25587a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25588b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25589c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f25590d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f25591e = 0;

        public final ub a() {
            return new ub(this.f25587a, this.f25588b, this.f25589c, this.f25590d, this.f25591e, 0);
        }

        public final void a(int i10) {
            this.f25590d = i10;
        }

        public final void b(int i10) {
            this.f25587a = i10;
        }

        public final void c(int i10) {
            this.f25588b = i10;
        }

        public final void d(int i10) {
            this.f25591e = i10;
        }

        public final void e(int i10) {
            this.f25589c = i10;
        }
    }

    static {
        yn1 yn1Var = yn1.D;
    }

    private ub(int i10, int i11, int i12, int i13, int i14) {
        this.f25580a = i10;
        this.f25581b = i11;
        this.f25582c = i12;
        this.f25583d = i13;
        this.f25584e = i14;
    }

    public /* synthetic */ ub(int i10, int i11, int i12, int i13, int i14, int i15) {
        this(i10, i11, i12, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ub a(Bundle bundle) {
        d dVar = new d();
        if (bundle.containsKey(Integer.toString(0, 36))) {
            dVar.b(bundle.getInt(Integer.toString(0, 36)));
        }
        if (bundle.containsKey(Integer.toString(1, 36))) {
            dVar.c(bundle.getInt(Integer.toString(1, 36)));
        }
        if (bundle.containsKey(Integer.toString(2, 36))) {
            dVar.e(bundle.getInt(Integer.toString(2, 36)));
        }
        if (bundle.containsKey(Integer.toString(3, 36))) {
            dVar.a(bundle.getInt(Integer.toString(3, 36)));
        }
        if (bundle.containsKey(Integer.toString(4, 36))) {
            dVar.d(bundle.getInt(Integer.toString(4, 36)));
        }
        return dVar.a();
    }

    public final c a() {
        if (this.f25585f == null) {
            this.f25585f = new c(this, 0);
        }
        return this.f25585f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ub.class != obj.getClass()) {
            return false;
        }
        ub ubVar = (ub) obj;
        return this.f25580a == ubVar.f25580a && this.f25581b == ubVar.f25581b && this.f25582c == ubVar.f25582c && this.f25583d == ubVar.f25583d && this.f25584e == ubVar.f25584e;
    }

    public final int hashCode() {
        return ((((((((this.f25580a + 527) * 31) + this.f25581b) * 31) + this.f25582c) * 31) + this.f25583d) * 31) + this.f25584e;
    }
}
