package com.applovin.exoplayer2.k;

import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f7370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<aa> f7371b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f7373d;

    public e(boolean z10) {
        this.f7370a = z10;
    }

    public final void a(int i10) {
        l lVar = (l) ai.a(this.f7373d);
        for (int i11 = 0; i11 < this.f7372c; i11++) {
            this.f7371b.get(i11).a(this, lVar, this.f7370a, i10);
        }
    }

    @Override // com.applovin.exoplayer2.k.i
    public final void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        if (this.f7371b.contains(aaVar)) {
            return;
        }
        this.f7371b.add(aaVar);
        this.f7372c++;
    }

    public final void b(l lVar) {
        for (int i10 = 0; i10 < this.f7372c; i10++) {
            this.f7371b.get(i10).a(this, lVar, this.f7370a);
        }
    }

    public final void c(l lVar) {
        this.f7373d = lVar;
        for (int i10 = 0; i10 < this.f7372c; i10++) {
            this.f7371b.get(i10).b(this, lVar, this.f7370a);
        }
    }

    public final void d() {
        l lVar = (l) ai.a(this.f7373d);
        for (int i10 = 0; i10 < this.f7372c; i10++) {
            this.f7371b.get(i10).c(this, lVar, this.f7370a);
        }
        this.f7373d = null;
    }
}
