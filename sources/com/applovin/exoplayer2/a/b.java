package com.applovin.exoplayer2.a;

import android.util.SparseArray;
import com.applovin.exoplayer2.ab;
import com.applovin.exoplayer2.ac;
import com.applovin.exoplayer2.ak;
import com.applovin.exoplayer2.am;
import com.applovin.exoplayer2.an;
import com.applovin.exoplayer2.ba;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.h.ad;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f3928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ba f3929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.p.a f3931d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f3932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ba f3933f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f3934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.p.a f3935h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f3936i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f3937j;

        public a(long j10, ba baVar, int i10, com.applovin.exoplayer2.h.p.a aVar, long j11, ba baVar2, int i11, com.applovin.exoplayer2.h.p.a aVar2, long j12, long j13) {
            this.f3928a = j10;
            this.f3929b = baVar;
            this.f3930c = i10;
            this.f3931d = aVar;
            this.f3932e = j11;
            this.f3933f = baVar2;
            this.f3934g = i11;
            this.f3935h = aVar2;
            this.f3936i = j12;
            this.f3937j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3928a == aVar.f3928a && this.f3930c == aVar.f3930c && this.f3932e == aVar.f3932e && this.f3934g == aVar.f3934g && this.f3936i == aVar.f3936i && this.f3937j == aVar.f3937j && Objects.equal(this.f3929b, aVar.f3929b) && Objects.equal(this.f3931d, aVar.f3931d) && Objects.equal(this.f3933f, aVar.f3933f) && Objects.equal(this.f3935h, aVar.f3935h);
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f3928a), this.f3929b, Integer.valueOf(this.f3930c), this.f3931d, Long.valueOf(this.f3932e), this.f3933f, Integer.valueOf(this.f3934g), this.f3935h, Long.valueOf(this.f3936i), Long.valueOf(this.f3937j));
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.a.b$b, reason: collision with other inner class name */
    public static final class C0070b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.l.m f3938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f3939b;

        public C0070b(com.applovin.exoplayer2.l.m mVar, SparseArray<a> sparseArray) {
            this.f3938a = mVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(mVar.a());
            for (int i10 = 0; i10 < mVar.a(); i10++) {
                int iB = mVar.b(i10);
                sparseArray2.append(iB, (a) com.applovin.exoplayer2.l.a.b(sparseArray.get(iB)));
            }
            this.f3939b = sparseArray2;
        }
    }

    @Deprecated
    default void a(a aVar) {
    }

    default void a(a aVar, float f10) {
    }

    default void a(a aVar, int i10) {
    }

    default void a(a aVar, int i10, int i11) {
    }

    @Deprecated
    default void a(a aVar, int i10, int i11, int i12, float f10) {
    }

    default void a(a aVar, int i10, long j10) {
    }

    default void a(a aVar, int i10, long j10, long j11) {
    }

    @Deprecated
    default void a(a aVar, int i10, com.applovin.exoplayer2.c.e eVar) {
    }

    @Deprecated
    default void a(a aVar, int i10, com.applovin.exoplayer2.v vVar) {
    }

    @Deprecated
    default void a(a aVar, int i10, String str, long j10) {
    }

    default void a(a aVar, long j10) {
    }

    default void a(a aVar, long j10, int i10) {
    }

    default void a(a aVar, ab abVar, int i10) {
    }

    default void a(a aVar, ac acVar) {
    }

    default void a(a aVar, ak akVar) {
    }

    default void a(a aVar, am amVar) {
    }

    default void a(a aVar, an.a aVar2) {
    }

    default void a(a aVar, an.e eVar, an.e eVar2, int i10) {
    }

    default void a(a aVar, com.applovin.exoplayer2.c.e eVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.g.a aVar2) {
    }

    default void a(a aVar, ad adVar, com.applovin.exoplayer2.j.h hVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, boolean z10) {
    }

    default void a(a aVar, com.applovin.exoplayer2.h.m mVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.m.o oVar) {
    }

    @Deprecated
    default void a(a aVar, com.applovin.exoplayer2.v vVar) {
    }

    default void a(a aVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
    }

    default void a(a aVar, Exception exc) {
    }

    default void a(a aVar, Object obj, long j10) {
    }

    default void a(a aVar, String str) {
    }

    @Deprecated
    default void a(a aVar, String str, long j10) {
    }

    default void a(a aVar, String str, long j10, long j11) {
    }

    default void a(a aVar, boolean z10) {
    }

    @Deprecated
    default void a(a aVar, boolean z10, int i10) {
    }

    default void a(an anVar, C0070b c0070b) {
    }

    @Deprecated
    default void b(a aVar) {
    }

    default void b(a aVar, int i10) {
    }

    default void b(a aVar, int i10, long j10, long j11) {
    }

    @Deprecated
    default void b(a aVar, int i10, com.applovin.exoplayer2.c.e eVar) {
    }

    default void b(a aVar, com.applovin.exoplayer2.c.e eVar) {
    }

    default void b(a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
    }

    @Deprecated
    default void b(a aVar, com.applovin.exoplayer2.v vVar) {
    }

    default void b(a aVar, com.applovin.exoplayer2.v vVar, com.applovin.exoplayer2.c.h hVar) {
    }

    default void b(a aVar, Exception exc) {
    }

    default void b(a aVar, String str) {
    }

    @Deprecated
    default void b(a aVar, String str, long j10) {
    }

    default void b(a aVar, String str, long j10, long j11) {
    }

    default void b(a aVar, boolean z10) {
    }

    default void b(a aVar, boolean z10, int i10) {
    }

    @Deprecated
    default void c(a aVar) {
    }

    default void c(a aVar, int i10) {
    }

    default void c(a aVar, com.applovin.exoplayer2.c.e eVar) {
    }

    default void c(a aVar, com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar) {
    }

    default void c(a aVar, Exception exc) {
    }

    default void c(a aVar, boolean z10) {
    }

    default void d(a aVar) {
    }

    @Deprecated
    default void d(a aVar, int i10) {
    }

    default void d(a aVar, com.applovin.exoplayer2.c.e eVar) {
    }

    default void d(a aVar, Exception exc) {
    }

    @Deprecated
    default void d(a aVar, boolean z10) {
    }

    default void e(a aVar) {
    }

    default void e(a aVar, int i10) {
    }

    default void e(a aVar, boolean z10) {
    }

    default void f(a aVar) {
    }

    default void f(a aVar, int i10) {
    }

    default void g(a aVar) {
    }

    default void h(a aVar) {
    }
}
