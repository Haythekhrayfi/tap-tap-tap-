package l8;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class t2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r2 f32852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.h f32853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.s3 f32854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32855f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(r2 r2Var, o8.h hVar, y9.s3 s3Var, v9.d dVar) {
        super(1);
        this.f32852c = r2Var;
        this.f32853d = hVar;
        this.f32854e = s3Var;
        this.f32855f = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        int i10;
        fd.j0.i(obj, "$noName_0");
        r2 r2Var = this.f32852c;
        o8.h hVar = this.f32853d;
        y9.s3 s3Var = this.f32854e;
        v9.d dVar = this.f32855f;
        Objects.requireNonNull(r2Var);
        long jLongValue = s3Var.f42536l.b(dVar).longValue();
        long j10 = jLongValue >> 31;
        if (j10 == 0 || j10 == -1) {
            i10 = (int) jLongValue;
        } else {
            int i11 = e9.a.f29114a;
            i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        b.d(hVar, i10, s3Var.f42537m.b(dVar));
        b.g(hVar, s3Var.f42545u.b(dVar).doubleValue(), i10);
        return jc.w.f31842a;
    }
}
