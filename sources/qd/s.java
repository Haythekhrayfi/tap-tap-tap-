package qd;

import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f34918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f34919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v f34920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f34921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f34923h;

    public s(f fVar) {
        j0.i(fVar, "upstream");
        this.f34918c = fVar;
        c cVarR = fVar.r();
        this.f34919d = cVarR;
        v vVar = cVarR.f34878c;
        this.f34920e = vVar;
        this.f34921f = vVar != null ? vVar.f34932b : -1;
    }

    @Override // qd.a0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f34922g = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    @Override // qd.a0
    public long read(c cVar, long j10) {
        v vVar;
        j0.i(cVar, "sink");
        boolean z10 = false;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(androidx.viewpager2.adapter.a.a("byteCount < 0: ", j10).toString());
        }
        if (!(!this.f34922g)) {
            throw new IllegalStateException("closed".toString());
        }
        v vVar2 = this.f34920e;
        if (vVar2 == null) {
            z10 = true;
        } else {
            v vVar3 = this.f34919d.f34878c;
            if (vVar2 == vVar3) {
                int i10 = this.f34921f;
                j0.f(vVar3);
                if (i10 == vVar3.f34932b) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f34918c.request(this.f34923h + 1)) {
            return -1L;
        }
        if (this.f34920e == null && (vVar = this.f34919d.f34878c) != null) {
            this.f34920e = vVar;
            j0.f(vVar);
            this.f34921f = vVar.f34932b;
        }
        long jMin = Math.min(j10, this.f34919d.f34879d - this.f34923h);
        this.f34919d.e(cVar, this.f34923h, jMin);
        this.f34923h += jMin;
        return jMin;
    }

    @Override // qd.a0
    public b0 timeout() {
        return this.f34918c.timeout();
    }
}
