package b5;

import f5.f;
import f5.g;
import f5.q;
import f5.r;
import f5.s;
import f5.x;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f3317a;

    public d(x xVar) {
        this.f3317a = xVar;
    }

    public static d a() {
        u4.d dVarB = u4.d.b();
        dVarB.a();
        d dVar = (d) dVarB.f36014d.a(d.class);
        Objects.requireNonNull(dVar, "FirebaseCrashlytics component is not present.");
        return dVar;
    }

    public void b(String str) {
        x xVar = this.f3317a;
        Objects.requireNonNull(xVar);
        long jCurrentTimeMillis = System.currentTimeMillis() - xVar.f29354d;
        q qVar = xVar.f29357g;
        qVar.f29322d.b(new r(qVar, jCurrentTimeMillis, str));
    }

    public void c(Throwable th) {
        q qVar = this.f3317a.f29357g;
        Thread threadCurrentThread = Thread.currentThread();
        Objects.requireNonNull(qVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        f fVar = qVar.f29322d;
        fVar.b(new g(fVar, new s(qVar, jCurrentTimeMillis, th, threadCurrentThread)));
    }
}
