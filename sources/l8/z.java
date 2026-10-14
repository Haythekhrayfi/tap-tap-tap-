package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends vc.l implements uc.l<y9.o.d, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i8.t f32993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f32994d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(i8.t tVar, View view) {
        super(1);
        this.f32993c = tVar;
        this.f32994d = view;
    }

    @Override // uc.l
    public jc.w invoke(y9.o.d dVar) {
        fd.j0.i(dVar, "it");
        u1.a.u(this.f32993c, this.f32994d);
        return jc.w.f31842a;
    }
}
