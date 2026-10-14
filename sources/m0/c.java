package m0;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f33123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f33124b;

    public c(n nVar, Handler handler) {
        this.f33123a = nVar;
        this.f33124b = handler;
    }

    public void a(k.a aVar) {
        int i10 = aVar.f33154b;
        if (!(i10 == 0)) {
            this.f33124b.post(new b(this, this.f33123a, i10));
        } else {
            this.f33124b.post(new a(this, this.f33123a, aVar.f33153a));
        }
    }
}
