package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class f0 extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f32365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.l6 f32366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32367f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(View view, v vVar, y9.l6 l6Var, v9.d dVar) {
        super(1);
        this.f32364c = view;
        this.f32365d = vVar;
        this.f32366e = l6Var;
        this.f32367f = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        l10.longValue();
        b.l(this.f32364c, this.f32365d.g(this.f32366e), this.f32367f);
        return jc.w.f31842a;
    }
}
