package b9;

import android.os.Handler;
import android.os.Looper;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f3360a = new Handler(Looper.getMainLooper());

    @Override // b9.t
    public void a(uc.a<w> aVar) {
        if (j0.d(Looper.myLooper(), Looper.getMainLooper())) {
            ((d9.c.a) aVar).invoke();
        } else {
            this.f3360a.post(new c(aVar, 0));
        }
    }
}
