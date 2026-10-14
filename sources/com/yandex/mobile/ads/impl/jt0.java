package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class jt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f22143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22146d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b[] f22147a;

        public a(b... bVarArr) {
            this.f22147a = bVarArr;
        }

        public final b a() {
            return this.f22147a[0];
        }

        public final int b() {
            return this.f22147a.length;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f22148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f22149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f22150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f22151d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f22148a = i10;
            pa.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f22150c = fArr;
            this.f22151d = fArr2;
            this.f22149b = i11;
        }

        public final int a() {
            return this.f22150c.length / 3;
        }
    }

    public jt0() {
        throw null;
    }

    public jt0(a aVar, a aVar2, int i10) {
        this.f22143a = aVar;
        this.f22144b = aVar2;
        this.f22145c = i10;
        this.f22146d = aVar == aVar2;
    }
}
