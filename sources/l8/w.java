package l8;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends vc.l implements uc.l<String, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f32919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.o f32920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32921e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(View view, y9.o oVar, v9.d dVar) {
        super(1);
        this.f32919c = view;
        this.f32920d = oVar;
        this.f32921e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(String str) {
        String str2 = str;
        fd.j0.i(str2, "description");
        View view = this.f32919c;
        v9.b<String> bVar = this.f32920d.f41709b;
        b.b(view, str2, bVar == null ? null : bVar.b(this.f32921e));
        return jc.w.f31842a;
    }
}
