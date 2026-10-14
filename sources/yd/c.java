package yd;

import java.util.List;
import kc.k;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends l implements uc.a<List<? extends ge.b<?>>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ge.b f44886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ge.b bVar) {
        super(0);
        this.f44886c = bVar;
    }

    @Override // uc.a
    public List<? extends ge.b<?>> invoke() {
        return k.a(this.f44886c);
    }
}
