package l8;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 extends vc.l implements uc.l<Uri, jc.w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.a f32953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o8.e f32954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i8.k f32955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v9.d f32956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y9.w2 f32957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q8.d f32958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.yandex.div.core.view2.divs.a aVar, o8.e eVar, i8.k kVar, v9.d dVar, y9.w2 w2Var, q8.d dVar2) {
        super(1);
        this.f32953c = aVar;
        this.f32954d = eVar;
        this.f32955e = kVar;
        this.f32956f = dVar;
        this.f32957g = w2Var;
        this.f32958h = dVar2;
    }

    @Override // uc.l
    public jc.w invoke(Uri uri) {
        fd.j0.i(uri, "it");
        com.yandex.div.core.view2.divs.a aVar = this.f32953c;
        o8.e eVar = this.f32954d;
        i8.k kVar = this.f32955e;
        v9.d dVar = this.f32956f;
        y9.w2 w2Var = this.f32957g;
        q8.d dVar2 = this.f32958h;
        int i10 = com.yandex.div.core.view2.divs.a.f13421e;
        Objects.requireNonNull(aVar);
        Uri uriB = w2Var.f43710r.b(dVar);
        if (!fd.j0.d(uriB, eVar.getGifUrl$div_release())) {
            eVar.l();
            z7.e loadReference$div_release = eVar.getLoadReference$div_release();
            if (loadReference$div_release != null) {
                loadReference$div_release.cancel();
            }
            i8.z zVar = aVar.f13424c;
            v9.b<String> bVar = w2Var.f43718z;
            zVar.a(eVar, dVar2, bVar == null ? null : bVar.b(dVar), w2Var.f43716x.b(dVar).intValue(), false, new t1(eVar), new u1(eVar));
            eVar.setGifUrl$div_release(uriB);
            z7.e eVarLoadImageBytes = aVar.f13423b.loadImageBytes(uriB.toString(), new v1(kVar, aVar, eVar));
            fd.j0.h(eVarLoadImageBytes, "private fun DivGifImageV…ference = reference\n    }");
            kVar.m(eVarLoadImageBytes, eVar);
            eVar.setLoadReference$div_release(eVarLoadImageBytes);
        }
        return jc.w.f31842a;
    }
}
