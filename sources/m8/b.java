package m8;

import android.view.View;
import fd.j0;
import jc.w;
import uc.p;
import vc.l;
import y9.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends l implements p<View, k, w> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f33294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i8.k f33295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, i8.k kVar) {
        super(2);
        this.f33294c = aVar;
        this.f33295d = kVar;
    }

    @Override // uc.p
    public w invoke(View view, k kVar) {
        View view2 = view;
        k kVar2 = kVar;
        j0.i(view2, "itemView");
        j0.i(kVar2, "div");
        this.f33294c.a(view2, kc.k.a(kVar2), this.f33295d);
        return w.f31842a;
    }
}
