package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f32950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.l6 f32951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(View view, v vVar, y9.l6 l6Var, v9.d dVar) {
        super(1);
        this.f32949c = view;
        this.f32950d = vVar;
        this.f32951e = l6Var;
        this.f32952f = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        l10.longValue();
        b.k(this.f32949c, this.f32950d.f(this.f32951e), this.f32952f);
        return jc.w.f31842a;
    }
}
