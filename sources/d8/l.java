package d8;

import java.util.List;
import y9.q;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f28904c;

    public l(j jVar) {
        this.f28904c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<q> list = this.f28904c.f28896h;
        if (list == null) {
            return;
        }
        for (q qVar : list) {
            j jVar = this.f28904c;
            i8.k kVar = jVar.f28893e;
            if (kVar != null) {
                jVar.f28890b.handleAction(qVar, kVar);
            }
        }
    }
}
