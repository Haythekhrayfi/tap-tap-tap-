package n8;

import y9.f7;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7.f f33686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.d f33687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t9.s f33688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f7.f fVar, v9.d dVar, t9.s sVar) {
        super(1);
        this.f33686c = fVar;
        this.f33687d = dVar;
        this.f33688e = sVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        int i10;
        long jLongValue = this.f33686c.f40046h.b(this.f33687d).longValue();
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            int i11 = e9.a.f29114a;
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        l8.b.d(this.f33688e, i10, this.f33686c.f40047i.b(this.f33687d));
        l8.b.g(this.f33688e, this.f33686c.f40053o.b(this.f33687d).doubleValue(), i10);
        t9.s sVar = this.f33688e;
        v9.b<Long> bVar = this.f33686c.f40054p;
        l8.b.h(sVar, bVar == null ? null : bVar.b(this.f33687d), this.f33686c.f40047i.b(this.f33687d));
        return jc.w.f31842a;
    }
}
