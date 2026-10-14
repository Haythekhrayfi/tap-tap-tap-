package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class z3 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y9.z5 f33005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.d f33006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o8.n f33007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(y9.z5 z5Var, v9.d dVar, o8.n nVar) {
        super(1);
        this.f33005c = z5Var;
        this.f33006d = dVar;
        this.f33007e = nVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        int i10;
        fd.j0.i(obj, "$noName_0");
        long jLongValue = this.f33005c.f44655l.b(this.f33006d).longValue();
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            int i11 = e9.a.f29114a;
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        b.d(this.f33007e, i10, this.f33005c.f44656m.b(this.f33006d));
        b.g(this.f33007e, this.f33005c.f44662s.b(this.f33006d).doubleValue(), i10);
        return jc.w.f31842a;
    }
}
