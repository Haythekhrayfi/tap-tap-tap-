package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends vc.l implements uc.l<Long, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.g0 f32293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(View view, y9.g0 g0Var, v9.d dVar) {
        super(1);
        this.f32292c = view;
        this.f32293d = g0Var;
        this.f32294e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(Long l10) {
        l10.longValue();
        b.e(this.f32292c, this.f32293d, this.f32294e);
        return jc.w.f31842a;
    }
}
