package l8;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class q3 extends vc.l implements uc.l<y9.r4.f, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.l f32766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o3 f32767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.r4 f32768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SparseArray<Float> f32770g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(o8.l lVar, o3 o3Var, y9.r4 r4Var, v9.d dVar, SparseArray<Float> sparseArray) {
        super(1);
        this.f32766c = lVar;
        this.f32767d = o3Var;
        this.f32768e = r4Var;
        this.f32769f = dVar;
        this.f32770g = sparseArray;
    }

    @Override // uc.l
    public jc.w invoke(y9.r4.f fVar) {
        y9.r4.f fVar2 = fVar;
        fd.j0.i(fVar2, "it");
        this.f32766c.setOrientation(fVar2 == y9.r4.f.HORIZONTAL ? 0 : 1);
        o3.b(this.f32767d, this.f32766c, this.f32768e, this.f32769f, this.f32770g);
        o3.a(this.f32767d, this.f32766c, this.f32768e, this.f32769f);
        return jc.w.f31842a;
    }
}
