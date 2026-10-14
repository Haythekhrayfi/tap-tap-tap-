package h2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1.c f30498c = new y1.c();

    public void a(y1.k kVar, String str) {
        WorkDatabase workDatabase = kVar.f38010c;
        g2.q qVarV = workDatabase.v();
        g2.b bVarQ = workDatabase.q();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            g2.r rVar = (g2.r) qVarV;
            androidx.work.h hVarF = rVar.f(str2);
            if (hVarF != androidx.work.h.SUCCEEDED && hVarF != androidx.work.h.FAILED) {
                rVar.p(androidx.work.h.CANCELLED, str2);
            }
            linkedList.addAll(((g2.c) bVarQ).a(str2));
        }
        y1.d dVar = kVar.f38013f;
        synchronized (dVar.f37987m) {
            x1.m.c().a(y1.d.f37976n, String.format("Processor cancelling %s", str), new Throwable[0]);
            dVar.f37985k.add(str);
            y1.n nVarRemove = dVar.f37982h.remove(str);
            boolean z10 = nVarRemove != null;
            if (nVarRemove == null) {
                nVarRemove = dVar.f37983i.remove(str);
            }
            y1.d.b(str, nVarRemove);
            if (z10) {
                dVar.h();
            }
        }
        Iterator<y1.e> it = kVar.f38012e.iterator();
        while (it.hasNext()) {
            it.next().e(str);
        }
    }

    public void b(y1.k kVar) {
        y1.f.a(kVar.f38009b, kVar.f38010c, kVar.f38012e);
    }

    public abstract void c();

    @Override // java.lang.Runnable
    public void run() {
        try {
            c();
            this.f30498c.a(x1.o.f37411a);
        } catch (Throwable th) {
            this.f30498c.a(new x1.o.b.a(th));
        }
    }
}
