package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface et extends l71 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h71 f20318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f20319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20320c;

        public a() {
            throw null;
        }

        public a(int i10, h71 h71Var, int[] iArr) {
            if (iArr.length == 0) {
                p90.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f20318a = h71Var;
            this.f20319b = iArr;
            this.f20320c = i10;
        }
    }

    public interface b {
    }

    void a(float f10);

    default void a(boolean z10) {
    }

    void b();

    void c();

    yv d();

    void e();

    default void f() {
    }

    default void g() {
    }
}
