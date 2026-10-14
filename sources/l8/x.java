package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.o f32947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(View view, y9.o oVar, v9.d dVar) {
        super(1);
        this.f32946c = view;
        this.f32947d = oVar;
        this.f32948e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "hint");
        View view = this.f32946c;
        v9.b<String> bVar = this.f32947d.f41708a;
        b.b(view, bVar == null ? null : bVar.b(this.f32948e), str2);
        return jc.w.f31842a;
    }
}
