package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface bc {

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yv f19163a;

        public a(zb.b bVar, yv yvVar) {
            super(bVar);
            this.f19163a = yvVar;
        }

        public a(String str, yv yvVar) {
            super(str);
            this.f19163a = yvVar;
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yv f19166c;

        public b(int i10, int i11, int i12, int i13, yv yvVar, boolean z10, RuntimeException runtimeException) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AudioTrack init failed ");
            sb2.append(i10);
            sb2.append(" ");
            sb2.append("Config(");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(i12);
            sb2.append(", ");
            sb2.append(i13);
            sb2.append(")");
            sb2.append(z10 ? " (recoverable)" : "");
            super(sb2.toString(), runtimeException);
            this.f19164a = i10;
            this.f19165b = z10;
            this.f19166c = yvVar;
        }
    }

    public interface c {
    }

    public static final class d extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public d(long j10, long j11) {
            StringBuilder sbA = i2.a.a("Unexpected audio track timestamp discontinuity: expected ", j11, ", got ");
            sbA.append(j10);
            super(sbA.toString());
        }
    }

    public static final class e extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f19167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f19168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final yv f19169c;

        public e(int i10, yv yvVar, boolean z10) {
            super(u60.a("AudioTrack write failed: ", i10));
            this.f19168b = z10;
            this.f19167a = i10;
            this.f19169c = yvVar;
        }
    }

    long a(boolean z10);

    void a(int i10);

    default void a(gr0 gr0Var) {
    }

    void a(oc ocVar);

    void a(ub ubVar);

    void a(yv yvVar, int[] iArr) throws a;

    void a(zq0 zq0Var);

    boolean a();

    boolean a(yv yvVar);

    boolean a(ByteBuffer byteBuffer, long j10, int i10) throws b, e;

    int b(yv yvVar);

    void b();

    void b(boolean z10);

    void c() throws e;

    boolean d();

    void e();

    void f();

    void flush();

    zq0 getPlaybackParameters();

    void pause();

    void play();

    void reset();

    void setVolume(float f10);
}
