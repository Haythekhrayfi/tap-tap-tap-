package e8;

import android.graphics.Point;
import android.view.View;
import fd.j0;
import p7.c1;
import y9.x7;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f29091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f29092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x7 f29093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i8.k f29094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f8.d f29095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d f29096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y9.k f29097i;

    public f(View view, View view2, x7 x7Var, i8.k kVar, f8.d dVar, d dVar2, y9.k kVar2) {
        this.f29091c = view;
        this.f29092d = view2;
        this.f29093e = x7Var;
        this.f29094f = kVar;
        this.f29095g = dVar;
        this.f29096h = dVar2;
        this.f29097i = kVar2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        j0.i(view, "view");
        view.removeOnLayoutChangeListener(this);
        Point pointB = h.b(this.f29091c, this.f29092d, this.f29093e, this.f29094f.getExpressionResolver());
        if (!h.a(this.f29094f, this.f29091c, pointB)) {
            this.f29096h.c(this.f29093e.f44178e, this.f29094f);
            return;
        }
        this.f29095g.update(pointB.x, pointB.y, this.f29091c.getWidth(), this.f29091c.getHeight());
        d dVar = this.f29096h;
        i8.k kVar = this.f29094f;
        y9.k kVar2 = this.f29097i;
        View view2 = this.f29091c;
        dVar.d(kVar, kVar2);
        dVar.f29081c.d(kVar, view2, kVar2, (8 & 8) != 0 ? l8.b.A(kVar2.a()) : null);
        c1.a aVarB = this.f29096h.f29080b.b();
        if (aVarB == null) {
            return;
        }
        aVarB.c(this.f29092d, this.f29093e);
    }
}
