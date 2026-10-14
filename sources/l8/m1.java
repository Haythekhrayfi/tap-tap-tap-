package l8;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 extends vc.l implements uc.l<y9.v1, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uc.l<Drawable, jc.w> f32578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f32579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32580e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m1(uc.l<? super Drawable, jc.w> lVar, ViewGroup viewGroup, v9.d dVar) {
        super(1);
        this.f32578c = lVar;
        this.f32579d = viewGroup;
        this.f32580e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.v1 v1Var) {
        y9.v1 v1Var2 = v1Var;
        fd.j0.i(v1Var2, "it");
        uc.l<Drawable, jc.w> lVar = this.f32578c;
        DisplayMetrics displayMetrics = this.f32579d.getResources().getDisplayMetrics();
        fd.j0.h(displayMetrics, "view.resources.displayMetrics");
        lVar.invoke(b.S(v1Var2, displayMetrics, this.f32580e));
        return jc.w.f31842a;
    }
}
