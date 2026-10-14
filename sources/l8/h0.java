package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f32414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.l6 f32415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32416f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(View view, v vVar, y9.l6 l6Var, v9.d dVar) {
        super(1);
        this.f32413c = view;
        this.f32414d = vVar;
        this.f32415e = l6Var;
        this.f32416f = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        l10.longValue();
        b.j(this.f32413c, this.f32414d.f(this.f32415e), this.f32416f);
        return jc.w.f31842a;
    }
}
