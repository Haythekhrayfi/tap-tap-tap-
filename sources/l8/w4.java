package l8;

import android.util.DisplayMetrics;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class w4 extends vc.l implements uc.l<y9.v1, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p4 f32938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.p f32939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32940e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(p4 p4Var, o8.p pVar, v9.d dVar) {
        super(1);
        this.f32938c = p4Var;
        this.f32939d = pVar;
        this.f32940e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.v1 v1Var) {
        y9.v1 v1Var2 = v1Var;
        fd.j0.i(v1Var2, "style");
        p4 p4Var = this.f32938c;
        o8.p pVar = this.f32939d;
        v9.d dVar = this.f32940e;
        Objects.requireNonNull(p4Var);
        DisplayMetrics displayMetrics = pVar.getResources().getDisplayMetrics();
        fd.j0.h(displayMetrics, "resources.displayMetrics");
        pVar.setActiveTickMarkDrawable(b.S(v1Var2, displayMetrics, dVar));
        p4Var.c(pVar);
        return jc.w.f31842a;
    }
}
