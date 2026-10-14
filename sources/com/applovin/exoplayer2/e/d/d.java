package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.w;
import com.applovin.exoplayer2.e.x;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f5320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f5321c;

    public d(long j10, j jVar) {
        this.f5320b = j10;
        this.f5321c = jVar;
    }

    @Override // com.applovin.exoplayer2.e.j
    public x a(int i10, int i11) {
        return this.f5321c.a(i10, i11);
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a() {
        this.f5321c.a();
    }

    @Override // com.applovin.exoplayer2.e.j
    public void a(final v vVar) {
        this.f5321c.a(new v() { // from class: com.applovin.exoplayer2.e.d.d.1
            @Override // com.applovin.exoplayer2.e.v
            public v.a a(long j10) {
                v.a aVarA = vVar.a(j10);
                w wVar = aVarA.f6135a;
                w wVar2 = new w(wVar.f6140b, d.this.f5320b + wVar.f6141c);
                w wVar3 = aVarA.f6136b;
                return new v.a(wVar2, new w(wVar3.f6140b, d.this.f5320b + wVar3.f6141c));
            }

            @Override // com.applovin.exoplayer2.e.v
            public boolean a() {
                return vVar.a();
            }

            @Override // com.applovin.exoplayer2.e.v
            public long b() {
                return vVar.b();
            }
        });
    }
}
