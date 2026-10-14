package com.applovin.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.applovin.exoplayer2.common.base.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface an {

    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4256a = new C0071a().a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g.a<a> f4257b = com.applovin.exoplayer2.a.p.f3992h;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.m f4258c;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.an$a$a, reason: collision with other inner class name */
        public static final class C0071a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final int[] f4259a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final com.applovin.exoplayer2.l.m.a f4260b = new com.applovin.exoplayer2.l.m.a();

            public C0071a a(int i10) {
                this.f4260b.a(i10);
                return this;
            }

            public C0071a a(int i10, boolean z10) {
                this.f4260b.a(i10, z10);
                return this;
            }

            public C0071a a(a aVar) {
                this.f4260b.a(aVar.f4258c);
                return this;
            }

            public C0071a a(int... iArr) {
                this.f4260b.a(iArr);
                return this;
            }

            public a a() {
                return new a(this.f4260b.a());
            }
        }

        private a(com.applovin.exoplayer2.l.m mVar) {
            this.f4258c = mVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b(0));
            if (integerArrayList == null) {
                return f4256a;
            }
            C0071a c0071a = new C0071a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                c0071a.a(integerArrayList.get(i10).intValue());
            }
            return c0071a.a();
        }

        private static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean a(int i10) {
            return this.f4258c.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f4258c.equals(((a) obj).f4258c);
            }
            return false;
        }

        public int hashCode() {
            return this.f4258c.hashCode();
        }
    }

    @Deprecated
    public interface b {
        default void a(ab abVar, int i10) {
        }

        default void a(ac acVar) {
        }

        default void a(ak akVar) {
        }

        default void a(am amVar) {
        }

        default void a(a aVar) {
        }

        default void a(e eVar, e eVar2, int i10) {
        }

        default void a(an anVar, c cVar) {
        }

        default void a(ba baVar, int i10) {
        }

        default void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.h hVar) {
        }

        @Deprecated
        default void a(boolean z10, int i10) {
        }

        @Deprecated
        default void b() {
        }

        default void b(int i10) {
        }

        default void b(ak akVar) {
        }

        default void b(boolean z10, int i10) {
        }

        default void b_(boolean z10) {
        }

        default void c(int i10) {
        }

        @Deprecated
        default void c(boolean z10) {
        }

        default void d(int i10) {
        }

        default void d(boolean z10) {
        }

        @Deprecated
        default void e(int i10) {
        }

        default void e(boolean z10) {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.m f4261a;

        public c(com.applovin.exoplayer2.l.m mVar) {
            this.f4261a = mVar;
        }

        public boolean a(int i10) {
            return this.f4261a.a(i10);
        }

        public boolean a(int... iArr) {
            return this.f4261a.a(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f4261a.equals(((c) obj).f4261a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4261a.hashCode();
        }
    }

    public interface d extends b {
        default void a() {
        }

        default void a(float f10) {
        }

        default void a(int i10, int i11) {
        }

        default void a(int i10, boolean z10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(ab abVar, int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(ac acVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(ak akVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(am amVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(a aVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(e eVar, e eVar2, int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(an anVar, c cVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(ba baVar, int i10) {
        }

        default void a(com.applovin.exoplayer2.g.a aVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void a(com.applovin.exoplayer2.h.ad adVar, com.applovin.exoplayer2.j.h hVar) {
        }

        default void a(com.applovin.exoplayer2.m.o oVar) {
        }

        default void a(o oVar) {
        }

        default void a(List<com.applovin.exoplayer2.i.a> list) {
        }

        default void a_(boolean z10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void b(int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void b(ak akVar) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void b(boolean z10, int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void b_(boolean z10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void c(int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void d(int i10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void d(boolean z10) {
        }

        @Override // com.applovin.exoplayer2.an.b
        default void e(boolean z10) {
        }
    }

    public static final class e implements g {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final g.a<e> f4262j = k0.f7558i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f4263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ab f4265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f4266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f4268f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f4269g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f4270h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f4271i;

        public e(Object obj, int i10, ab abVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f4263a = obj;
            this.f4264b = i10;
            this.f4265c = abVar;
            this.f4266d = obj2;
            this.f4267e = i11;
            this.f4268f = j10;
            this.f4269g = j11;
            this.f4270h = i12;
            this.f4271i = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e a(Bundle bundle) {
            return new e(null, bundle.getInt(a(0), -1), (ab) com.applovin.exoplayer2.l.c.a(ab.f4046g, bundle.getBundle(a(1))), null, bundle.getInt(a(2), -1), bundle.getLong(a(3), -9223372036854775807L), bundle.getLong(a(4), -9223372036854775807L), bundle.getInt(a(5), -1), bundle.getInt(a(6), -1));
        }

        private static String a(int i10) {
            return Integer.toString(i10, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f4264b == eVar.f4264b && this.f4267e == eVar.f4267e && this.f4268f == eVar.f4268f && this.f4269g == eVar.f4269g && this.f4270h == eVar.f4270h && this.f4271i == eVar.f4271i && Objects.equal(this.f4263a, eVar.f4263a) && Objects.equal(this.f4266d, eVar.f4266d) && Objects.equal(this.f4265c, eVar.f4265c);
        }

        public int hashCode() {
            return Objects.hashCode(this.f4263a, Integer.valueOf(this.f4264b), this.f4265c, this.f4266d, Integer.valueOf(this.f4267e), Integer.valueOf(this.f4264b), Long.valueOf(this.f4268f), Long.valueOf(this.f4269g), Integer.valueOf(this.f4270h), Integer.valueOf(this.f4271i));
        }
    }

    long A();

    long B();

    long C();

    am D();

    int F();

    int G();

    long H();

    long I();

    long J();

    boolean K();

    int L();

    int M();

    long N();

    long O();

    com.applovin.exoplayer2.h.ad P();

    com.applovin.exoplayer2.j.h Q();

    ac R();

    ba S();

    com.applovin.exoplayer2.m.o T();

    List<com.applovin.exoplayer2.i.a> V();

    void a(int i10, long j10);

    void a(long j10);

    void a(SurfaceView surfaceView);

    void a(TextureView textureView);

    void a(d dVar);

    void a(boolean z10);

    boolean a();

    boolean a(int i10);

    void b(SurfaceView surfaceView);

    void b(TextureView textureView);

    void b(d dVar);

    void b(boolean z10);

    void c();

    void c(int i10);

    void d();

    ak e();

    void g();

    void j();

    boolean o();

    Looper r();

    a s();

    int t();

    int u();

    void w();

    boolean x();

    int y();

    boolean z();
}
