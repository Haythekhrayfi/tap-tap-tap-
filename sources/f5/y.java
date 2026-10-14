package f5;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public class y implements Callable<Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f29368c;

    public y(x xVar) {
        this.f29368c = xVar;
    }

    @Override // java.util.concurrent.Callable
    public Boolean call() throws Exception {
        q qVar = this.f29368c.f29357g;
        boolean z10 = true;
        if (qVar.f29321c.b().exists()) {
            c5.d.f3604c.e("Found previous crash marker.");
            qVar.f29321c.b().delete();
        } else {
            String strF = qVar.f();
            if (strF == null || !qVar.f29327i.c(strF)) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
