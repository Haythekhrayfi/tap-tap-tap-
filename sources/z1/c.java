package z1;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.h;
import c2.d;
import g2.p;
import h2.i;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import x1.m;
import y1.e;
import y1.k;

/* JADX INFO: loaded from: classes.dex */
public class c implements e, c2.c, y1.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f45006k = m.e("GreedyScheduler");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f45007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f45008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f45009e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f45011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f45012h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f45014j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set<p> f45010f = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f45013i = new Object();

    public c(Context context, androidx.work.b bVar, j2.a aVar, k kVar) {
        this.f45007c = context;
        this.f45008d = kVar;
        this.f45009e = new d(context, aVar, this);
        this.f45011g = new b(this, bVar.f3099e);
    }

    public c(Context context, k kVar, d dVar) {
        this.f45007c = context;
        this.f45008d = kVar;
        this.f45009e = dVar;
    }

    @Override // y1.e
    public void a(p... pVarArr) {
        if (this.f45014j == null) {
            this.f45014j = Boolean.valueOf(i.a(this.f45007c, this.f45008d.f38009b));
        }
        if (!this.f45014j.booleanValue()) {
            m.c().d(f45006k, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f45012h) {
            this.f45008d.f38013f.a(this);
            this.f45012h = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long jA = pVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (pVar.f29741b == h.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    b bVar = this.f45011g;
                    if (bVar != null) {
                        Runnable runnableRemove = bVar.f45005c.remove(pVar.f29740a);
                        if (runnableRemove != null) {
                            ((y1.a) bVar.f45004b).f37973a.removeCallbacks(runnableRemove);
                        }
                        a aVar = new a(bVar, pVar);
                        bVar.f45005c.put(pVar.f29740a, aVar);
                        ((y1.a) bVar.f45004b).f37973a.postDelayed(aVar, pVar.a() - System.currentTimeMillis());
                    }
                } else if (pVar.b()) {
                    x1.b bVar2 = pVar.f29749j;
                    if (bVar2.f37382c) {
                        m.c().a(f45006k, String.format("Ignoring WorkSpec %s, Requires device idle.", pVar), new Throwable[0]);
                    } else if (bVar2.a()) {
                        m.c().a(f45006k, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar), new Throwable[0]);
                    } else {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f29740a);
                    }
                } else {
                    m.c().a(f45006k, String.format("Starting work for %s", pVar.f29740a), new Throwable[0]);
                    k kVar = this.f45008d;
                    ((j2.b) kVar.f38011d).f31695a.execute(new h2.k(kVar, pVar.f29740a, null));
                }
            }
        }
        synchronized (this.f45013i) {
            if (!hashSet.isEmpty()) {
                m.c().a(f45006k, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f45010f.addAll(hashSet);
                this.f45009e.b(this.f45010f);
            }
        }
    }

    @Override // c2.c
    public void b(List<String> list) {
        for (String str : list) {
            m.c().a(f45006k, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f45008d.h(str);
        }
    }

    @Override // y1.e
    public boolean c() {
        return false;
    }

    @Override // y1.b
    public void d(String str, boolean z10) {
        synchronized (this.f45013i) {
            for (p pVar : this.f45010f) {
                if (pVar.f29740a.equals(str)) {
                    m.c().a(f45006k, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f45010f.remove(pVar);
                    this.f45009e.b(this.f45010f);
                    break;
                }
            }
        }
    }

    @Override // y1.e
    public void e(String str) {
        Runnable runnableRemove;
        if (this.f45014j == null) {
            this.f45014j = Boolean.valueOf(i.a(this.f45007c, this.f45008d.f38009b));
        }
        if (!this.f45014j.booleanValue()) {
            m.c().d(f45006k, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f45012h) {
            this.f45008d.f38013f.a(this);
            this.f45012h = true;
        }
        m.c().a(f45006k, String.format("Cancelling work ID %s", str), new Throwable[0]);
        b bVar = this.f45011g;
        if (bVar != null && (runnableRemove = bVar.f45005c.remove(str)) != null) {
            ((y1.a) bVar.f45004b).f37973a.removeCallbacks(runnableRemove);
        }
        this.f45008d.h(str);
    }

    @Override // c2.c
    public void f(List<String> list) {
        for (String str : list) {
            m.c().a(f45006k, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            k kVar = this.f45008d;
            ((j2.b) kVar.f38011d).f31695a.execute(new h2.k(kVar, str, null));
        }
    }
}
