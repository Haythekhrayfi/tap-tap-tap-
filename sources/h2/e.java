package h2;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import g2.s;
import g2.t;
import g2.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f30499e = x1.m.e("EnqueueRunnable");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y1.g f30500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1.c f30501d = new y1.c();

    public e(y1.g gVar) {
        this.f30500c = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0207  */
    /* JADX WARN: Code duplicated, block: B:131:0x0245  */
    /* JADX WARN: Code duplicated, block: B:134:0x024e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0270  */
    /* JADX WARN: Code duplicated, block: B:141:0x0274  */
    /* JADX WARN: Code duplicated, block: B:150:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:157:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:197:0x0322 A[SYNTHETIC] */
    public static boolean a(y1.g gVar) {
        boolean zA;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        g2.r rVar;
        g2.l lVar;
        u uVar;
        int length;
        int i10;
        g2.c cVar;
        boolean z18;
        List listEmptyList;
        boolean z19;
        List<y1.g> list = gVar.f37999g;
        if (list != null) {
            zA = false;
            for (y1.g gVar2 : list) {
                if (gVar2.f38000h) {
                    x1.m.c().g(f30499e, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.f37997e)), new Throwable[0]);
                } else {
                    zA |= a(gVar2);
                }
            }
        } else {
            zA = false;
        }
        Set<String> setC = y1.g.c(gVar);
        y1.k kVar = gVar.f37993a;
        List<? extends x1.u> list2 = gVar.f37996d;
        String[] strArr = (String[]) setC.toArray(new String[0]);
        String str = gVar.f37994b;
        androidx.work.e eVar = gVar.f37995c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = kVar.f38010c;
        boolean z20 = strArr != null && strArr.length > 0;
        if (z20) {
            int length2 = strArr.length;
            int i11 = 0;
            z11 = false;
            z12 = false;
            z10 = true;
            while (true) {
                if (i11 < length2) {
                    String str2 = strArr[i11];
                    g2.p pVarI = ((g2.r) workDatabase.v()).i(str2);
                    if (pVarI == null) {
                        x1.m.c().b(f30499e, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    } else {
                        androidx.work.h hVar = pVarI.f29741b;
                        z10 &= hVar == androidx.work.h.SUCCEEDED;
                        if (hVar == androidx.work.h.FAILED) {
                            z11 = true;
                        } else if (hVar == androidx.work.h.CANCELLED) {
                            z12 = true;
                        }
                        i11++;
                    }
                }
                z13 = zA;
                z17 = true;
                z16 = false;
                gVar.f38000h = z17;
                return z13 | z16;
            }
        }
        z10 = true;
        z11 = false;
        z12 = false;
        boolean z21 = !TextUtils.isEmpty(str);
        if (z21 && !z20) {
            ArrayList arrayList = (ArrayList) ((g2.r) workDatabase.v()).j(str);
            if (arrayList.isEmpty()) {
                z13 = zA;
                z14 = false;
            } else if (eVar == androidx.work.e.APPEND || eVar == androidx.work.e.APPEND_OR_REPLACE) {
                g2.b bVarQ = workDatabase.q();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g2.p.a aVar = (g2.p.a) it.next();
                    String str3 = aVar.f29758a;
                    Iterator it2 = it;
                    g2.c cVar2 = (g2.c) bVarQ;
                    Objects.requireNonNull(cVar2);
                    g2.b bVar = bVarQ;
                    boolean z22 = zA;
                    j1.f fVarC = j1.f.c("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
                    if (str3 == null) {
                        fVarC.g(1);
                    } else {
                        fVarC.h(1, str3);
                    }
                    cVar2.f29718a.b();
                    Cursor cursorC = l1.b.c(cVar2.f29718a, fVarC, false, null);
                    try {
                        boolean z23 = cursorC.moveToFirst() && cursorC.getInt(0) != 0;
                        cursorC.close();
                        fVarC.release();
                        if (!z23) {
                            androidx.work.h hVar2 = aVar.f29759b;
                            boolean z24 = (hVar2 == androidx.work.h.SUCCEEDED) & z10;
                            if (hVar2 == androidx.work.h.FAILED) {
                                z19 = true;
                            } else if (hVar2 == androidx.work.h.CANCELLED) {
                                z19 = z11;
                                z12 = true;
                            } else {
                                z19 = z11;
                            }
                            arrayList2.add(aVar.f29758a);
                            z10 = z24;
                            z11 = z19;
                        }
                        it = it2;
                        bVarQ = bVar;
                        zA = z22;
                    } catch (Throwable th) {
                        cursorC.close();
                        fVarC.release();
                        throw th;
                    }
                }
                z13 = zA;
                z14 = false;
                if (eVar == androidx.work.e.APPEND_OR_REPLACE && (z12 || z11)) {
                    g2.r rVar2 = (g2.r) workDatabase.v();
                    Iterator it3 = ((ArrayList) rVar2.j(str)).iterator();
                    while (it3.hasNext()) {
                        rVar2.a(((g2.p.a) it3.next()).f29758a);
                    }
                    z18 = false;
                    z12 = false;
                    listEmptyList = Collections.emptyList();
                } else {
                    z18 = z11;
                    listEmptyList = arrayList2;
                }
                strArr = (String[]) listEmptyList.toArray(strArr);
                z11 = z18;
                z20 = strArr.length > 0;
            } else {
                if (eVar == androidx.work.e.KEEP) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            androidx.work.h hVar3 = ((g2.p.a) it4.next()).f29759b;
                            if (hVar3 == androidx.work.h.ENQUEUED || hVar3 == androidx.work.h.RUNNING) {
                                z13 = zA;
                                z17 = true;
                                z16 = false;
                                gVar.f38000h = z17;
                                return z13 | z16;
                            }
                        }
                    }
                }
                new c(kVar, str, false).run();
                g2.q qVarV = workDatabase.v();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((g2.r) qVarV).a(((g2.p.a) it5.next()).f29758a);
                }
                z13 = zA;
                z15 = true;
            }
            z15 = z14;
        } else {
            z13 = zA;
            z14 = false;
            z15 = z14;
        }
        for (x1.u uVar2 : list2) {
            g2.p pVar = uVar2.f37415b;
            try {
                if (!z20 || z10) {
                    if (pVar.c()) {
                        pVar.f29753n = 0L;
                    } else {
                        pVar.f29753n = jCurrentTimeMillis;
                    }
                    if (Build.VERSION.SDK_INT <= 25) {
                        b(pVar);
                    }
                    if (pVar.f29741b == androidx.work.h.ENQUEUED) {
                        z15 = true;
                    }
                    rVar = (g2.r) workDatabase.v();
                    rVar.f29760a.b();
                    rVar.f29760a.c();
                    rVar.f29761b.e(pVar);
                    rVar.f29760a.p();
                    rVar.f29760a.g();
                    if (z20) {
                        length = strArr.length;
                        i10 = 0;
                        while (i10 < length) {
                            String[] strArr2 = strArr;
                            g2.a aVar2 = new g2.a(uVar2.a(), strArr[i10]);
                            cVar = (g2.c) workDatabase.q();
                            cVar.f29718a.b();
                            cVar.f29718a.c();
                            try {
                                cVar.f29719b.e(aVar2);
                                cVar.f29718a.p();
                                cVar.f29718a.g();
                                i10++;
                                strArr = strArr2;
                            } catch (Throwable th2) {
                                cVar.f29718a.g();
                                throw th2;
                            }
                        }
                    }
                    String[] strArr3 = strArr;
                    for (String str4 : uVar2.f37416c) {
                        t tVarW = workDatabase.w();
                        s sVar = new s(str4, uVar2.a());
                        uVar = (u) tVarW;
                        uVar.f29771a.b();
                        uVar.f29771a.c();
                        try {
                            uVar.f29772b.e(sVar);
                            uVar.f29771a.p();
                            uVar.f29771a.g();
                        } catch (Throwable th3) {
                            uVar.f29771a.g();
                            throw th3;
                        }
                    }
                    if (z21) {
                        g2.k kVarT = workDatabase.t();
                        g2.j jVar = new g2.j(str, uVar2.a());
                        lVar = (g2.l) kVarT;
                        lVar.f29731a.b();
                        lVar.f29731a.c();
                        try {
                            lVar.f29732b.e(jVar);
                            lVar.f29731a.p();
                            lVar.f29731a.g();
                        } catch (Throwable th4) {
                            lVar.f29731a.g();
                            throw th4;
                        }
                    }
                    z10 = z10;
                    strArr = strArr3;
                } else {
                    pVar.f29741b = z11 ? androidx.work.h.FAILED : z12 ? androidx.work.h.CANCELLED : androidx.work.h.BLOCKED;
                }
                rVar.f29761b.e(pVar);
                rVar.f29760a.p();
                rVar.f29760a.g();
                if (z20) {
                    length = strArr.length;
                    i10 = 0;
                    while (i10 < length) {
                        String[] strArr4 = strArr;
                        g2.a aVar3 = new g2.a(uVar2.a(), strArr[i10]);
                        cVar = (g2.c) workDatabase.q();
                        cVar.f29718a.b();
                        cVar.f29718a.c();
                        cVar.f29719b.e(aVar3);
                        cVar.f29718a.p();
                        cVar.f29718a.g();
                        i10++;
                        strArr = strArr4;
                    }
                }
                String[] strArr5 = strArr;
                while (r1.hasNext()) {
                    t tVarW2 = workDatabase.w();
                    s sVar2 = new s(str4, uVar2.a());
                    uVar = (u) tVarW2;
                    uVar.f29771a.b();
                    uVar.f29771a.c();
                    uVar.f29772b.e(sVar2);
                    uVar.f29771a.p();
                    uVar.f29771a.g();
                }
                if (z21) {
                    g2.k kVarT2 = workDatabase.t();
                    g2.j jVar2 = new g2.j(str, uVar2.a());
                    lVar = (g2.l) kVarT2;
                    lVar.f29731a.b();
                    lVar.f29731a.c();
                    lVar.f29732b.e(jVar2);
                    lVar.f29731a.p();
                    lVar.f29731a.g();
                }
                z10 = z10;
                strArr = strArr5;
            } catch (Throwable th5) {
                rVar.f29760a.g();
                throw th5;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                b(pVar);
            }
            if (pVar.f29741b == androidx.work.h.ENQUEUED) {
                z15 = true;
            }
            rVar = (g2.r) workDatabase.v();
            rVar.f29760a.b();
            rVar.f29760a.c();
        }
        z16 = z15;
        z17 = true;
        gVar.f38000h = z17;
        return z13 | z16;
    }

    public static void b(g2.p pVar) {
        x1.b bVar = pVar.f29749j;
        String str = pVar.f29742c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f37383d || bVar.f37384e) {
            androidx.work.c.a aVar = new androidx.work.c.a();
            aVar.c(pVar.f29744e.f3119a);
            aVar.f3120a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f29742c = ConstraintTrackingWorker.class.getName();
            pVar.f29744e = aVar.a();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            y1.g gVar = this.f30500c;
            Objects.requireNonNull(gVar);
            if (y1.g.b(gVar, new HashSet())) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f30500c));
            }
            WorkDatabase workDatabase = this.f30500c.f37993a.f38010c;
            workDatabase.c();
            try {
                boolean zA = a(this.f30500c);
                workDatabase.p();
                workDatabase.g();
                if (zA) {
                    g.a(this.f30500c.f37993a.f38008a, RescheduleReceiver.class, true);
                    y1.k kVar = this.f30500c.f37993a;
                    y1.f.a(kVar.f38009b, kVar.f38010c, kVar.f38012e);
                }
                this.f30501d.a(x1.o.f37411a);
            } catch (Throwable th) {
                workDatabase.g();
                throw th;
            }
        } catch (Throwable th2) {
            this.f30501d.a(new x1.o.b.a(th2));
        }
    }
}
