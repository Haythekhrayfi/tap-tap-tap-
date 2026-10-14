package q8;

import fd.j0;
import uc.p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements p7.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f34804c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f34805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f34806e;

    public /* synthetic */ c(d dVar, p pVar) {
        this.f34805d = dVar;
        this.f34806e = pVar;
    }

    public /* synthetic */ c(h hVar, uc.l lVar) {
        this.f34805d = hVar;
        this.f34806e = lVar;
    }

    @Override // p7.d, java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        switch (this.f34804c) {
            case 0:
                d dVar = (d) this.f34805d;
                p pVar = (p) this.f34806e;
                j0.i(dVar, "this$0");
                j0.i(pVar, "$observer");
                dVar.f34807a.remove(pVar);
                break;
            default:
                h hVar = (h) this.f34805d;
                uc.l lVar = (uc.l) this.f34806e;
                j0.i(hVar, "this$0");
                j0.i(lVar, "$observer");
                hVar.f34816b.remove(lVar);
                break;
        }
    }
}
