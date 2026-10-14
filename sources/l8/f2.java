package l8;

import android.view.animation.Interpolator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f2 extends p7.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i8.k f32369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o8.g f32370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f32371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9.d3 f32372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(i8.k kVar, o8.g gVar, g2 g2Var, y9.d3 d3Var, v9.d dVar) {
        super(kVar);
        this.f32369a = kVar;
        this.f32370b = gVar;
        this.f32371c = g2Var;
        this.f32372d = d3Var;
        this.f32373e = dVar;
    }

    @Override // z7.c
    public void a() {
        this.f32370b.setImageUrl$div_release(null);
    }

    @Override // z7.c
    public void b(z7.b bVar) {
        this.f32370b.setCurrentBitmapWithoutFilters$div_release(bVar.f45158a);
        g2.a(this.f32371c, this.f32370b, this.f32372d.f39607r, this.f32369a, this.f32373e);
        g2 g2Var = this.f32371c;
        o8.g gVar = this.f32370b;
        y9.d3 d3Var = this.f32372d;
        v9.d dVar = this.f32373e;
        z7.a aVar = bVar.f45161d;
        Objects.requireNonNull(g2Var);
        gVar.animate().cancel();
        y9.b2 b2Var = d3Var.f39597h;
        float fDoubleValue = (float) d3Var.f39596g.b(dVar).doubleValue();
        if (b2Var == null || aVar == z7.a.MEMORY) {
            gVar.setAlpha(fDoubleValue);
        } else {
            long jLongValue = b2Var.f39140b.b(dVar).longValue();
            Interpolator interpolatorB = f8.b.b(b2Var.f39141c.b(dVar));
            gVar.setAlpha((float) b2Var.f39139a.b(dVar).doubleValue());
            gVar.animate().alpha(fDoubleValue).setDuration(jLongValue).setInterpolator(interpolatorB).setStartDelay(b2Var.f39142d.b(dVar).longValue());
        }
        this.f32370b.i();
        g2 g2Var2 = this.f32371c;
        o8.g gVar2 = this.f32370b;
        v9.d dVar2 = this.f32373e;
        y9.d3 d3Var2 = this.f32372d;
        g2Var2.c(gVar2, dVar2, d3Var2.G, d3Var2.H);
        this.f32370b.invalidate();
    }
}
