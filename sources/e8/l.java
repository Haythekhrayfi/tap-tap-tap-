package e8;

import fd.j0;
import p7.y0;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8.d f29107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y0.f f29108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29109c;

    public l(f8.d dVar, y9.k kVar, y0.f fVar, boolean z10) {
        j0.i(dVar, "popupWindow");
        j0.i(kVar, "div");
        this.f29107a = dVar;
        this.f29108b = fVar;
        this.f29109c = z10;
    }

    public /* synthetic */ l(f8.d dVar, y9.k kVar, y0.f fVar, boolean z10, int i10, vc.g gVar) {
        this(dVar, kVar, (i10 & 4) != 0 ? null : fVar, (i10 & 8) != 0 ? false : z10);
    }
}
