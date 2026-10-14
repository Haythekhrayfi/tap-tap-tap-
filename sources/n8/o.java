package n8;

import android.util.DisplayMetrics;
import android.view.ViewGroup;
import fd.j0;
import y9.f7;
import y9.x1;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f7 f33680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v9.d f33681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t9.q<?> f33682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f7 f7Var, v9.d dVar, t9.q<?> qVar) {
        super(1);
        this.f33680c = f7Var;
        this.f33681d = dVar;
        this.f33682e = qVar;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        f7 f7Var = this.f33680c;
        f7.f fVar = f7Var.f40018y;
        x1 x1Var = fVar.f40055q;
        x1 x1Var2 = f7Var.f40019z;
        v9.b<Long> bVar = fVar.f40054p;
        Long lB = bVar == null ? null : bVar.b(this.f33681d);
        long jLongValue = x1Var2.f44032a.b(this.f33681d).longValue() + x1Var2.f44035d.b(this.f33681d).longValue() + x1Var.f44032a.b(this.f33681d).longValue() + x1Var.f44035d.b(this.f33681d).longValue() + (lB == null ? (long) (this.f33680c.f40018y.f40046h.b(this.f33681d).floatValue() * 1.3f) : lB.longValue());
        DisplayMetrics displayMetrics = this.f33682e.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = this.f33682e.getLayoutParams();
        Long lValueOf = Long.valueOf(jLongValue);
        j0.h(displayMetrics, "metrics");
        layoutParams.height = l8.b.Q(lValueOf, displayMetrics);
        return jc.w.f31842a;
    }
}
