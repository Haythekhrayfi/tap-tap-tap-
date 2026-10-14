package l8;

import android.util.DisplayMetrics;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q4 extends vc.l implements uc.l<y9.v1, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p4 f32771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.p f32772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(p4 p4Var, o8.p pVar, v9.d dVar) {
        super(1);
        this.f32771c = p4Var;
        this.f32772d = pVar;
        this.f32773e = dVar;
    }

    @Override // uc.l
    public jc.w invoke(y9.v1 v1Var) {
        y9.v1 v1Var2 = v1Var;
        fd.j0.i(v1Var2, "style");
        p4 p4Var = this.f32771c;
        o8.p pVar = this.f32772d;
        v9.d dVar = this.f32773e;
        Objects.requireNonNull(p4Var);
        DisplayMetrics displayMetrics = pVar.getResources().getDisplayMetrics();
        fd.j0.h(displayMetrics, "resources.displayMetrics");
        pVar.setThumbSecondaryDrawable(b.S(v1Var2, displayMetrics, dVar));
        return jc.w.f31842a;
    }
}
