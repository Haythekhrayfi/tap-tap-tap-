package id;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends jd.d<r<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f31619a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mc.d<? super jc.w> f31620b;

    @Override // jd.d
    public boolean a(r<?> rVar) {
        r<?> rVar2 = rVar;
        if (this.f31619a >= 0) {
            return false;
        }
        long j10 = rVar2.f31602j;
        if (j10 < rVar2.f31603k) {
            rVar2.f31603k = j10;
        }
        this.f31619a = j10;
        return true;
    }

    @Override // jd.d
    public mc.d[] b(r<?> rVar) {
        long j10 = this.f31619a;
        this.f31619a = -1L;
        this.f31620b = null;
        return rVar.v(j10);
    }
}
