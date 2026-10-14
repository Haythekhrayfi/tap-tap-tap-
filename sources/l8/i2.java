package l8;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class i2 extends vc.l implements uc.l<Uri, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f32440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.g f32441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i8.k f32442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q8.d f32444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y9.d3 f32445h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(g2 g2Var, o8.g gVar, i8.k kVar, v9.d dVar, q8.d dVar2, y9.d3 d3Var) {
        super(1);
        this.f32440c = g2Var;
        this.f32441d = gVar;
        this.f32442e = kVar;
        this.f32443f = dVar;
        this.f32444g = dVar2;
        this.f32445h = d3Var;
    }

    @Override // uc.l
    public jc.w invoke(Uri uri) {
        fd.j0.i(uri, "it");
        g2 g2Var = this.f32440c;
        o8.g gVar = this.f32441d;
        i8.k kVar = this.f32442e;
        v9.d dVar = this.f32443f;
        q8.d dVar2 = this.f32444g;
        y9.d3 d3Var = this.f32445h;
        Objects.requireNonNull(g2Var);
        Uri uriB = d3Var.f39612w.b(dVar);
        if (fd.j0.d(uriB, gVar.getImageUrl$div_release())) {
            g2Var.c(gVar, dVar, d3Var.G, d3Var.H);
        } else {
            boolean zD = g2Var.d(dVar, gVar, d3Var);
            gVar.l();
            z7.e loadReference$div_release = gVar.getLoadReference$div_release();
            if (loadReference$div_release != null) {
                loadReference$div_release.cancel();
            }
            g2Var.b(gVar, kVar, dVar, d3Var, dVar2, zD);
            gVar.setImageUrl$div_release(uriB);
            z7.e eVarLoadImage = g2Var.f32389b.loadImage(uriB.toString(), new f2(kVar, gVar, g2Var, d3Var, dVar));
            fd.j0.h(eVarLoadImage, "private fun DivImageView…ference = reference\n    }");
            kVar.m(eVarLoadImage, gVar);
            gVar.setLoadReference$div_release(eVarLoadImage);
        }
        return jc.w.f31842a;
    }
}
