package com.applovin.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class j implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f7153b = -9223372036854775807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f7152a = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f7154c = false;

    private static void a(an anVar, long j10) {
        long jI = anVar.I() + j10;
        long jH = anVar.H();
        if (jH != -9223372036854775807L) {
            jI = Math.min(jI, jH);
        }
        anVar.a(Math.max(jI, 0L));
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a() {
        return !this.f7154c || this.f7152a > 0;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar) {
        anVar.w();
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar, int i10) {
        anVar.c(i10);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar, int i10, long j10) {
        anVar.a(i10, j10);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean a(an anVar, boolean z10) {
        anVar.a(z10);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean b() {
        return !this.f7154c || this.f7153b > 0;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean b(an anVar) {
        anVar.g();
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean b(an anVar, boolean z10) {
        anVar.b(z10);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean c(an anVar) {
        anVar.j();
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean d(an anVar) {
        if (!this.f7154c) {
            anVar.c();
            return true;
        }
        if (!a() || !anVar.o()) {
            return true;
        }
        a(anVar, -this.f7152a);
        return true;
    }

    @Override // com.applovin.exoplayer2.i
    public boolean e(an anVar) {
        if (!this.f7154c) {
            anVar.d();
            return true;
        }
        if (!b() || !anVar.o()) {
            return true;
        }
        a(anVar, this.f7153b);
        return true;
    }
}
