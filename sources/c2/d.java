package c2;

import android.content.Context;
import androidx.work.impl.constraints.controllers.ConstraintController;
import d2.e;
import d2.f;
import d2.g;
import d2.h;
import g2.p;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class d implements d2.c.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3542d = m.e("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConstraintController<?>[] f3544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3545c;

    public d(Context context, j2.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3543a = cVar;
        this.f3544b = new d2.c[]{new d2.a(applicationContext, aVar), new d2.b(applicationContext, aVar), new h(applicationContext, aVar), new d2.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.f3545c = new Object();
    }

    public boolean a(String str) {
        synchronized (this.f3545c) {
            for (d2.c cVar : this.f3544b) {
                T t10 = cVar.f28628b;
                if (t10 != 0 && cVar.c(t10) && cVar.f28627a.contains(str)) {
                    m.c().a(f3542d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void b(Iterable<p> iterable) {
        synchronized (this.f3545c) {
            for (d2.c cVar : this.f3544b) {
                if (cVar.f28630d != null) {
                    cVar.f28630d = null;
                    cVar.e(null, cVar.f28628b);
                }
            }
            for (d2.c cVar2 : this.f3544b) {
                cVar2.d(iterable);
            }
            for (d2.c cVar3 : this.f3544b) {
                if (cVar3.f28630d != this) {
                    cVar3.f28630d = this;
                    cVar3.e(this, cVar3.f28628b);
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void c() {
        synchronized (this.f3545c) {
            for (d2.c cVar : this.f3544b) {
                if (!cVar.f28627a.isEmpty()) {
                    cVar.f28627a.clear();
                    cVar.f28629c.b(cVar);
                }
            }
        }
    }
}
