package l8;

import android.graphics.ColorFilter;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m2 extends vc.l implements uc.l<Object, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o8.g f32581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g2 f32582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v9.d f32583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.b<Integer> f32584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v9.b<y9.h0> f32585g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(o8.g gVar, g2 g2Var, v9.d dVar, v9.b<Integer> bVar, v9.b<y9.h0> bVar2) {
        super(1);
        this.f32581c = gVar;
        this.f32582d = g2Var;
        this.f32583e = dVar;
        this.f32584f = bVar;
        this.f32585g = bVar2;
    }

    @Override // uc.l
    public jc.w invoke(Object obj) {
        fd.j0.i(obj, "$noName_0");
        if (this.f32581c.j() || this.f32581c.k()) {
            this.f32582d.c(this.f32581c, this.f32583e, this.f32584f, this.f32585g);
        } else {
            g2 g2Var = this.f32582d;
            o8.g gVar = this.f32581c;
            Objects.requireNonNull(g2Var);
            gVar.setColorFilter((ColorFilter) null);
        }
        return jc.w.f31842a;
    }
}
