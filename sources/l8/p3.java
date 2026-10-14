package l8;

import android.util.SparseArray;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class p3 extends vc.l implements uc.p<o3.d, Integer, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SparseArray<Float> f32736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.r4 f32737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(SparseArray<Float> sparseArray, y9.r4 r4Var, v9.d dVar) {
        super(2);
        this.f32736c = sparseArray;
        this.f32737d = r4Var;
        this.f32738e = dVar;
    }

    @Override // uc.p
    public jc.w invoke(o3.d dVar, Integer num) {
        o3.d dVar2 = dVar;
        int iIntValue = num.intValue();
        fd.j0.i(dVar2, "holder");
        Float f10 = this.f32736c.get(iIntValue);
        if (f10 != null) {
            y9.r4 r4Var = this.f32737d;
            v9.d dVar3 = this.f32738e;
            float fFloatValue = f10.floatValue();
            y9.r4.f fVarB = r4Var.f42309r.b(dVar3);
            y9.r4.f fVar = y9.r4.f.HORIZONTAL;
            View view = dVar2.itemView;
            if (fVarB == fVar) {
                view.setTranslationX(fFloatValue);
            } else {
                view.setTranslationY(fFloatValue);
            }
        }
        return jc.w.f31842a;
    }
}
