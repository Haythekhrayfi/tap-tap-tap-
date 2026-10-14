package l8;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public final class s3 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3 f32825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.l f32826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.r4 f32827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SparseArray<Float> f32829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(o3 o3Var, o8.l lVar, y9.r4 r4Var, v9.d dVar, SparseArray<Float> sparseArray) {
        super(1);
        this.f32825c = o3Var;
        this.f32826d = lVar;
        this.f32827e = r4Var;
        this.f32828f = dVar;
        this.f32829g = sparseArray;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        o3.a(this.f32825c, this.f32826d, this.f32827e, this.f32828f);
        o3.b(this.f32825c, this.f32826d, this.f32827e, this.f32828f, this.f32829g);
        return jc.w.f31842a;
    }
}
