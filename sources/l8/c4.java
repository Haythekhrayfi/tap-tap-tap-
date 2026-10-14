package l8;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class c4 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v9.b<Long> f32301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.d f32302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.z5 f32303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o8.n f32304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(v9.b<Long> bVar, v9.d dVar, y9.z5 z5Var, o8.n nVar) {
        super(1);
        this.f32301c = bVar;
        this.f32302d = dVar;
        this.f32303e = z5Var;
        this.f32304f = nVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        long jLongValue = this.f32301c.b(this.f32302d).longValue();
        y9.n6 n6VarB = this.f32303e.f44656m.b(this.f32302d);
        o8.n nVar = this.f32304f;
        Long lValueOf = Long.valueOf(jLongValue);
        DisplayMetrics displayMetrics = this.f32304f.getResources().getDisplayMetrics();
        fd.j0.h(displayMetrics, "resources.displayMetrics");
        nVar.setLineHeight(b.c0(lValueOf, displayMetrics, n6VarB));
        b.h(this.f32304f, Long.valueOf(jLongValue), n6VarB);
        return jc.w.f31842a;
    }
}
