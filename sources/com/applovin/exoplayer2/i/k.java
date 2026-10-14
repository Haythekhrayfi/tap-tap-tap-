package com.applovin.exoplayer2.i;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends com.applovin.exoplayer2.c.i implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f7133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7134d;

    @Override // com.applovin.exoplayer2.i.f
    public int a(long j10) {
        return ((f) com.applovin.exoplayer2.l.a.b(this.f7133c)).a(j10 - this.f7134d);
    }

    @Override // com.applovin.exoplayer2.i.f
    public long a(int i10) {
        return ((f) com.applovin.exoplayer2.l.a.b(this.f7133c)).a(i10) + this.f7134d;
    }

    @Override // com.applovin.exoplayer2.c.a
    public void a() {
        super.a();
        this.f7133c = null;
    }

    public void a(long j10, f fVar, long j11) {
        ((com.applovin.exoplayer2.c.i) this).f4765a = j10;
        this.f7133c = fVar;
        if (j11 != RecyclerView.FOREVER_NS) {
            j10 = j11;
        }
        this.f7134d = j10;
    }

    @Override // com.applovin.exoplayer2.i.f
    public List<a> b(long j10) {
        return ((f) com.applovin.exoplayer2.l.a.b(this.f7133c)).b(j10 - this.f7134d);
    }

    @Override // com.applovin.exoplayer2.i.f
    public int f_() {
        return ((f) com.applovin.exoplayer2.l.a.b(this.f7133c)).f_();
    }
}
