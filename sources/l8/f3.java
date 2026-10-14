package l8;

/* JADX INFO: loaded from: classes2.dex */
public final class f3 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.h f32374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.b<Long> f32375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32376e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(o8.h hVar, v9.b<Long> bVar, v9.d dVar) {
        super(1);
        this.f32374c = hVar;
        this.f32375d = bVar;
        this.f32376e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        int i10;
        fd.j0.i(obj, "$noName_0");
        o8.h hVar = this.f32374c;
        long jLongValue = this.f32375d.b(this.f32376e).longValue();
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            int i11 = e9.a.f29114a;
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        hVar.setMaxLines(i10);
        return jc.w.f31842a;
    }
}
