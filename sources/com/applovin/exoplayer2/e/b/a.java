package com.applovin.exoplayer2.e.b;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.p;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class a extends com.applovin.exoplayer2.e.a {

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.b.a$a, reason: collision with other inner class name */
    public static final class C0084a implements com.applovin.exoplayer2.e.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p f5241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final m.a f5243c;

        private C0084a(p pVar, int i10) {
            this.f5241a = pVar;
            this.f5242b = i10;
            this.f5243c = new m.a();
        }

        private long a(i iVar) throws IOException {
            while (iVar.b() < iVar.d() - 6 && !m.a(iVar, this.f5241a, this.f5242b, this.f5243c)) {
                iVar.c(1);
            }
            if (iVar.b() < iVar.d() - 6) {
                return this.f5243c.f6107a;
            }
            iVar.c((int) (iVar.d() - iVar.b()));
            return this.f5241a.f6120j;
        }

        @Override // com.applovin.exoplayer2.e.a.f
        public com.applovin.exoplayer2.e.a.e a(i iVar, long j10) throws IOException {
            long jC = iVar.c();
            long jA = a(iVar);
            long jB = iVar.b();
            iVar.c(Math.max(6, this.f5241a.f6113c));
            long jA2 = a(iVar);
            long jB2 = iVar.b();
            if (jA > j10 || jA2 <= j10) {
                return jA2 <= j10 ? com.applovin.exoplayer2.e.a.e.b(jA2, jB2) : com.applovin.exoplayer2.e.a.e.a(jA, jC);
            }
            return com.applovin.exoplayer2.e.a.e.a(jB);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p pVar, int i10, long j10, long j11) {
        super(new d0.a(pVar), new C0084a(pVar, i10), pVar.a(), 0L, pVar.f6120j, j10, j11, pVar.b(), Math.max(6, pVar.f6113c));
        Objects.requireNonNull(pVar);
    }
}
