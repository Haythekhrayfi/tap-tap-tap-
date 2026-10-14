package y1;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import g2.o;
import g2.p;
import g2.q;
import g2.r;
import g2.t;
import g2.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class n implements Runnable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f38023v = x1.m.e("WorkerWrapper");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f38024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<e> f38026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WorkerParameters.a f38027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f38028g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j2.a f38030i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.work.b f38032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f2.a f38033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WorkDatabase f38034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public q f38035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g2.b f38036o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t f38037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<String> f38038q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f38039r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f38042u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ListenableWorker.a f38031j = new ListenableWorker.a.C0046a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i2.d<Boolean> f38040s = new i2.d<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t4.a<ListenableWorker.a> f38041t = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ListenableWorker f38029h = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f38043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f2.a f38044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j2.a f38045c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.work.b f38046d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public WorkDatabase f38047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f38048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<e> f38049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public WorkerParameters.a f38050h = new WorkerParameters.a();

        public a(Context context, androidx.work.b bVar, j2.a aVar, f2.a aVar2, WorkDatabase workDatabase, String str) {
            this.f38043a = context.getApplicationContext();
            this.f38045c = aVar;
            this.f38044b = aVar2;
            this.f38046d = bVar;
            this.f38047e = workDatabase;
            this.f38048f = str;
        }
    }

    public n(a aVar) {
        this.f38024c = aVar.f38043a;
        this.f38030i = aVar.f38045c;
        this.f38033l = aVar.f38044b;
        this.f38025d = aVar.f38048f;
        this.f38026e = aVar.f38049g;
        this.f38027f = aVar.f38050h;
        this.f38032k = aVar.f38046d;
        WorkDatabase workDatabase = aVar.f38047e;
        this.f38034m = workDatabase;
        this.f38035n = workDatabase.v();
        this.f38036o = this.f38034m.q();
        this.f38037p = this.f38034m.w();
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            x1.m.c().d(f38023v, String.format("Worker result SUCCESS for %s", this.f38039r), new Throwable[0]);
            if (!this.f38028g.c()) {
                this.f38034m.c();
                try {
                    ((r) this.f38035n).p(androidx.work.h.SUCCEEDED, this.f38025d);
                    ((r) this.f38035n).n(this.f38025d, ((ListenableWorker.a.c) this.f38031j).f3079a);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (String str : (ArrayList) ((g2.c) this.f38036o).a(this.f38025d)) {
                        if (((r) this.f38035n).f(str) == androidx.work.h.BLOCKED && ((g2.c) this.f38036o).b(str)) {
                            x1.m.c().d(f38023v, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                            ((r) this.f38035n).p(androidx.work.h.ENQUEUED, str);
                            ((r) this.f38035n).o(str, jCurrentTimeMillis);
                        }
                    }
                    this.f38034m.p();
                    return;
                } finally {
                    this.f38034m.g();
                    f(false);
                }
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            x1.m.c().d(f38023v, String.format("Worker result RETRY for %s", this.f38039r), new Throwable[0]);
            d();
            return;
        } else {
            x1.m.c().d(f38023v, String.format("Worker result FAILURE for %s", this.f38039r), new Throwable[0]);
            if (!this.f38028g.c()) {
                h();
                return;
            }
        }
        e();
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((r) this.f38035n).f(str2) != androidx.work.h.CANCELLED) {
                ((r) this.f38035n).p(androidx.work.h.FAILED, str2);
            }
            linkedList.addAll(((g2.c) this.f38036o).a(str2));
        }
    }

    public void c() {
        if (!i()) {
            this.f38034m.c();
            try {
                androidx.work.h hVarF = ((r) this.f38035n).f(this.f38025d);
                ((o) this.f38034m.u()).a(this.f38025d);
                if (hVarF == null) {
                    f(false);
                } else if (hVarF == androidx.work.h.RUNNING) {
                    a(this.f38031j);
                } else if (!hVarF.isFinished()) {
                    d();
                }
                this.f38034m.p();
                this.f38034m.g();
            } catch (Throwable th) {
                this.f38034m.g();
                throw th;
            }
        }
        List<e> list = this.f38026e;
        if (list != null) {
            Iterator<e> it = list.iterator();
            while (it.hasNext()) {
                it.next().e(this.f38025d);
            }
            f.a(this.f38032k, this.f38034m, this.f38026e);
        }
    }

    public final void d() {
        this.f38034m.c();
        try {
            ((r) this.f38035n).p(androidx.work.h.ENQUEUED, this.f38025d);
            ((r) this.f38035n).o(this.f38025d, System.currentTimeMillis());
            ((r) this.f38035n).l(this.f38025d, -1L);
            this.f38034m.p();
        } finally {
            this.f38034m.g();
            f(true);
        }
    }

    public final void e() {
        this.f38034m.c();
        try {
            ((r) this.f38035n).o(this.f38025d, System.currentTimeMillis());
            ((r) this.f38035n).p(androidx.work.h.ENQUEUED, this.f38025d);
            ((r) this.f38035n).m(this.f38025d);
            ((r) this.f38035n).l(this.f38025d, -1L);
            this.f38034m.p();
        } finally {
            this.f38034m.g();
            f(false);
        }
    }

    public final void f(boolean z10) {
        ListenableWorker listenableWorker;
        this.f38034m.c();
        try {
            r rVar = (r) this.f38034m.v();
            Objects.requireNonNull(rVar);
            j1.f fVarC = j1.f.c("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            rVar.f29760a.b();
            Cursor cursorC = l1.b.c(rVar.f29760a, fVarC, false, null);
            try {
                boolean z11 = cursorC.moveToFirst() && cursorC.getInt(0) != 0;
                cursorC.close();
                fVarC.release();
                if (!z11) {
                    h2.g.a(this.f38024c, RescheduleReceiver.class, false);
                }
                if (z10) {
                    ((r) this.f38035n).p(androidx.work.h.ENQUEUED, this.f38025d);
                    ((r) this.f38035n).l(this.f38025d, -1L);
                }
                if (this.f38028g != null && (listenableWorker = this.f38029h) != null && listenableWorker.isRunInForeground()) {
                    f2.a aVar = this.f38033l;
                    String str = this.f38025d;
                    d dVar = (d) aVar;
                    synchronized (dVar.f37987m) {
                        dVar.f37982h.remove(str);
                        dVar.h();
                    }
                }
                this.f38034m.p();
                this.f38034m.g();
                this.f38040s.j(Boolean.valueOf(z10));
            } catch (Throwable th) {
                cursorC.close();
                fVarC.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f38034m.g();
            throw th2;
        }
    }

    public final void g() {
        androidx.work.h hVarF = ((r) this.f38035n).f(this.f38025d);
        if (hVarF == androidx.work.h.RUNNING) {
            x1.m.c().a(f38023v, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f38025d), new Throwable[0]);
            f(true);
        } else {
            x1.m.c().a(f38023v, String.format("Status for %s is %s; not doing any work", this.f38025d, hVarF), new Throwable[0]);
            f(false);
        }
    }

    public void h() {
        this.f38034m.c();
        try {
            b(this.f38025d);
            androidx.work.c cVar = ((ListenableWorker.a.C0046a) this.f38031j).f3078a;
            ((r) this.f38035n).n(this.f38025d, cVar);
            this.f38034m.p();
        } finally {
            this.f38034m.g();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.f38042u) {
            return false;
        }
        x1.m.c().a(f38023v, String.format("Work interrupted for %s", this.f38039r), new Throwable[0]);
        androidx.work.h hVarF = ((r) this.f38035n).f(this.f38025d);
        if (hVarF == null) {
            f(false);
        } else {
            f(!hVarF.isFinished());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00be A[Catch: all -> 0x02e0, TryCatch #0 {all -> 0x02e0, blocks: (B:14:0x0055, B:16:0x0063, B:17:0x007d, B:38:0x00f6, B:18:0x0081, B:20:0x0087, B:21:0x00a9, B:23:0x00af, B:25:0x00b5, B:40:0x0100, B:30:0x00be, B:35:0x00d1, B:37:0x00d9), top: B:98:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    @Override // java.lang.Runnable
    public void run() {
        p pVar;
        boolean z10;
        androidx.work.c cVarA;
        List<String> listA = ((u) this.f38037p).a(this.f38025d);
        this.f38038q = listA;
        StringBuilder sb2 = new StringBuilder("Work [ id=");
        sb2.append(this.f38025d);
        sb2.append(", tags={ ");
        boolean z11 = true;
        boolean z12 = true;
        for (String str : listA) {
            if (z12) {
                z12 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        sb2.append(" } ]");
        this.f38039r = sb2.toString();
        if (i()) {
            return;
        }
        this.f38034m.c();
        try {
            p pVarI = ((r) this.f38035n).i(this.f38025d);
            this.f38028g = pVarI;
            if (pVarI != null) {
                androidx.work.h hVar = pVarI.f29741b;
                androidx.work.h hVar2 = androidx.work.h.ENQUEUED;
                if (hVar == hVar2) {
                    if (pVarI.c()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        pVar = this.f38028g;
                        if (pVar.f29753n == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            x1.m.c().a(f38023v, String.format("Delaying execution for %s because it is being executed before schedule.", this.f38028g.f29742c), new Throwable[0]);
                            f(true);
                        }
                    } else {
                        p pVar2 = this.f38028g;
                        if (pVar2.f29741b == hVar2 && pVar2.f29750k > 0) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            pVar = this.f38028g;
                            if (pVar.f29753n == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10 && jCurrentTimeMillis2 < pVar.a()) {
                                x1.m.c().a(f38023v, String.format("Delaying execution for %s because it is being executed before schedule.", this.f38028g.f29742c), new Throwable[0]);
                                f(true);
                            }
                        }
                    }
                    this.f38034m.p();
                    this.f38034m.g();
                    if (!this.f38028g.c()) {
                        x1.i iVar = this.f38032k.f3098d;
                        String str2 = this.f38028g.f29743d;
                        x1.g gVarA = iVar.a(str2);
                        if (gVarA == null) {
                            String str3 = x1.g.f37402a;
                            try {
                                gVarA = (x1.g) Class.forName(str2).newInstance();
                            } catch (Exception e10) {
                                x1.m.c().b(x1.g.f37402a, i.f.a("Trouble instantiating + ", str2), e10);
                                gVarA = null;
                            }
                        }
                        if (gVarA == null) {
                            x1.m.c().b(f38023v, String.format("Could not create Input Merger %s", this.f38028g.f29743d), new Throwable[0]);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(this.f38028g.f29744e);
                            q qVar = this.f38035n;
                            String str4 = this.f38025d;
                            r rVar = (r) qVar;
                            Objects.requireNonNull(rVar);
                            j1.f fVarC = j1.f.c("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                            if (str4 == null) {
                                fVarC.g(1);
                            } else {
                                fVarC.h(1, str4);
                            }
                            rVar.f29760a.b();
                            Cursor cursorC = l1.b.c(rVar.f29760a, fVarC, false, null);
                            try {
                                ArrayList arrayList2 = new ArrayList(cursorC.getCount());
                                while (cursorC.moveToNext()) {
                                    arrayList2.add(androidx.work.c.a(cursorC.getBlob(0)));
                                }
                                cursorC.close();
                                fVarC.release();
                                arrayList.addAll(arrayList2);
                                cVarA = gVarA.a(arrayList);
                            } catch (Throwable th) {
                                cursorC.close();
                                fVarC.release();
                                throw th;
                            }
                        }
                        h();
                        return;
                    }
                    cVarA = this.f38028g.f29744e;
                    androidx.work.c cVar = cVarA;
                    UUID uuidFromString = UUID.fromString(this.f38025d);
                    List<String> list = this.f38038q;
                    WorkerParameters.a aVar = this.f38027f;
                    int i10 = this.f38028g.f29750k;
                    androidx.work.b bVar = this.f38032k;
                    WorkerParameters workerParameters = new WorkerParameters(uuidFromString, cVar, list, aVar, i10, bVar.f3095a, this.f38030i, bVar.f3097c, new h2.q(this.f38034m, this.f38030i), new h2.o(this.f38034m, this.f38033l, this.f38030i));
                    if (this.f38029h == null) {
                        this.f38029h = this.f38032k.f3097c.b(this.f38024c, this.f38028g.f29742c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f38029h;
                    if (listenableWorker == null) {
                        x1.m.c().b(f38023v, String.format("Could not create Worker %s", this.f38028g.f29742c), new Throwable[0]);
                    } else {
                        if (!listenableWorker.isUsed()) {
                            this.f38029h.setUsed();
                            this.f38034m.c();
                            try {
                                if (((r) this.f38035n).f(this.f38025d) == androidx.work.h.ENQUEUED) {
                                    ((r) this.f38035n).p(androidx.work.h.RUNNING, this.f38025d);
                                    ((r) this.f38035n).k(this.f38025d);
                                } else {
                                    z11 = false;
                                }
                                this.f38034m.p();
                                this.f38034m.g();
                                if (!z11) {
                                    g();
                                    return;
                                }
                                if (i()) {
                                    return;
                                }
                                i2.d dVar = new i2.d();
                                h2.n nVar = new h2.n(this.f38024c, this.f38028g, this.f38029h, workerParameters.f3091j, this.f38030i);
                                ((j2.b) this.f38030i).f31697c.execute(nVar);
                                i2.d<Void> dVar2 = nVar.f30522c;
                                dVar2.a(new l(this, dVar2, dVar), ((j2.b) this.f38030i).f31697c);
                                dVar.a(new m(this, dVar, this.f38039r), ((j2.b) this.f38030i).f31695a);
                                return;
                            } catch (Throwable th2) {
                                this.f38034m.g();
                                throw th2;
                            }
                        }
                        x1.m.c().b(f38023v, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f38028g.f29742c), new Throwable[0]);
                    }
                    h();
                    return;
                }
                g();
                this.f38034m.p();
                x1.m.c().a(f38023v, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f38028g.f29742c), new Throwable[0]);
                this.f38034m.g();
            }
            x1.m.c().b(f38023v, String.format("Didn't find WorkSpec for id %s", this.f38025d), new Throwable[0]);
            f(false);
            this.f38034m.p();
            this.f38034m.g();
        } catch (Throwable th3) {
            this.f38034m.g();
            throw th3;
        }
    }
}
