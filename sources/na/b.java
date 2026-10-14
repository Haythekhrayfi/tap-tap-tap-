package na;

import com.android.billingclient.api.l;
import com.android.billingclient.api.n;
import fd.i;
import fd.j0;
import gb.x;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i<x<Integer>> f33758a;

    /* JADX WARN: Multi-variable type inference failed */
    public b(i<? super x<Integer>> iVar) {
        this.f33758a = iVar;
    }

    @Override // com.android.billingclient.api.l
    public void a(n nVar) {
        i<x<Integer>> iVar;
        Object bVar;
        j0.i(nVar, "result");
        if (this.f33758a.a()) {
            if (c0.v(nVar)) {
                iVar = this.f33758a;
                jc.i.a aVar = jc.i.f31813c;
                bVar = new x.c(Integer.valueOf(nVar.f3848a));
            } else {
                iVar = this.f33758a;
                jc.i.a aVar2 = jc.i.f31813c;
                bVar = new x.b(new IllegalStateException(String.valueOf(nVar.f3848a)));
            }
            iVar.resumeWith(bVar);
        }
    }

    @Override // com.android.billingclient.api.l
    public void b() {
        try {
            if (this.f33758a.a()) {
                i<x<Integer>> iVar = this.f33758a;
                jc.i.a aVar = jc.i.f31813c;
                iVar.resumeWith(new x.b(new IllegalStateException("-1")));
            }
        } catch (IllegalStateException e10) {
            xe.a.b("BillingConnection").c(e10);
        }
    }
}
