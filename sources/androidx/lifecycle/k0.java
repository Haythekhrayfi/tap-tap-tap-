package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f2221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f2222b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f2223c;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q f2224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i.b f2225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2226e = false;

        public a(q qVar, i.b bVar) {
            this.f2224c = qVar;
            this.f2225d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2226e) {
                return;
            }
            this.f2224c.f(this.f2225d);
            this.f2226e = true;
        }
    }

    public k0(p pVar) {
        this.f2221a = new q(pVar);
    }

    public final void a(i.b bVar) {
        a aVar = this.f2223c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f2221a, bVar);
        this.f2223c = aVar2;
        this.f2222b.postAtFrontOfQueue(aVar2);
    }
}
