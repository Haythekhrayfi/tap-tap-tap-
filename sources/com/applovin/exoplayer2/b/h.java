package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.am;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface h {

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f4450a;

        public a(String str, com.applovin.exoplayer2.v vVar) {
            super(str);
            this.f4450a = vVar;
        }

        public a(Throwable th, com.applovin.exoplayer2.v vVar) {
            super(th);
            this.f4450a = vVar;
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f4453c;

        public b(int i10, int i11, int i12, int i13, com.applovin.exoplayer2.v vVar, boolean z10, Exception exc) {
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
            super(sb2.toString(), exc);
            this.f4451a = i10;
            this.f4452b = z10;
            this.f4453c = vVar;
        }
    }

    public interface c {
        void a();

        void a(int i10, long j10, long j11);

        default void a(long j10) {
        }

        default void a(Exception exc) {
        }

        void a(boolean z10);

        default void b() {
        }

        default void b(long j10) {
        }
    }

    public static final class d extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4455b;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(long j10, long j11) {
            StringBuilder sbA = i2.a.a("Unexpected audio track timestamp discontinuity: expected ", j11, ", got ");
            sbA.append(j10);
            super(sbA.toString());
            this.f4454a = j10;
            this.f4455b = j11;
        }
    }

    public static final class e extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f4457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.applovin.exoplayer2.v f4458c;

        public e(int i10, com.applovin.exoplayer2.v vVar, boolean z10) {
            super(android.support.v4.media.a.a("AudioTrack write failed: ", i10));
            this.f4457b = z10;
            this.f4456a = i10;
            this.f4458c = vVar;
        }
    }

    long a(boolean z10);

    void a();

    void a(float f10);

    void a(int i10);

    void a(am amVar);

    void a(com.applovin.exoplayer2.b.d dVar);

    void a(c cVar);

    void a(k kVar);

    void a(com.applovin.exoplayer2.v vVar, int i10, int[] iArr) throws a;

    boolean a(com.applovin.exoplayer2.v vVar);

    boolean a(ByteBuffer byteBuffer, long j10, int i10) throws e, b;

    int b(com.applovin.exoplayer2.v vVar);

    void b();

    void b(boolean z10);

    void c() throws e;

    boolean d();

    boolean e();

    am f();

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();
}
