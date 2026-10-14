package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.x1 f32728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32729e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(View view, y9.x1 x1Var, v9.d dVar) {
        super(1);
        this.f32727c = view;
        this.f32728d = x1Var;
        this.f32729e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        b.n(this.f32727c, this.f32728d, this.f32729e);
        return jc.w.f31842a;
    }
}
