package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1739jk extends Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TelephonyManager f16481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PhoneStateListener f16482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f16483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Qi f16484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Uc f16485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O<Ak> f16486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final O<Collection<Vj>> f16487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f16488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f16489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Xj f16490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C2043vk f16491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Sj f16492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1783le f16493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C1634fe f16494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InterfaceC1814mk f16495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final InterfaceC1659ge f16496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final F3 f16497q;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jk$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1739jk.this.f16482b = new d(C1739jk.this, null);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jk$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1739jk.this.f16483c) {
                return;
            }
            C1739jk.this.f16483c = true;
            if (C1739jk.this.f16482b == null || C1739jk.this.f16481a == null) {
                return;
            }
            try {
                C1739jk.this.f16481a.listen(C1739jk.this.f16482b, 256);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jk$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1739jk.this.f16483c) {
                C1739jk.this.f16483c = false;
                C1739jk.this.f16497q.a(C1739jk.this);
                if (C1739jk.this.f16482b == null || C1739jk.this.f16481a == null) {
                    return;
                }
                try {
                    C1739jk.this.f16481a.listen(C1739jk.this.f16482b, 0);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.jk$d */
    public class d extends PhoneStateListener {
        private d() {
        }

        public /* synthetic */ d(C1739jk c1739jk, a aVar) {
            this();
        }

        @Override // android.telephony.PhoneStateListener
        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            C1739jk.a(C1739jk.this, signalStrength);
        }
    }

    public C1739jk(Context context, C1783le c1783le, C1634fe c1634fe, InterfaceExecutorC1966sn interfaceExecutorC1966sn, InterfaceC1814mk interfaceC1814mk, C1497a2 c1497a2, F3 f10) {
        TelephonyManager telephonyManager;
        this.f16483c = false;
        C1760kg.c cVar = O.f14598e;
        long j10 = cVar.f16613b;
        this.f16486f = new O<>(j10, j10 * 2);
        long j11 = cVar.f16613b;
        this.f16487g = new O<>(j11, 2 * j11);
        this.f16489i = context;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService("phone");
        } catch (Throwable unused) {
            telephonyManager = null;
        }
        this.f16481a = telephonyManager;
        this.f16496p = a(c1634fe, c1497a2);
        this.f16488h = interfaceExecutorC1966sn;
        ((C1941rn) interfaceExecutorC1966sn).execute(new a());
        this.f16490j = new Xj(this, c1634fe);
        this.f16491k = new C2043vk(this, c1634fe);
        this.f16492l = new Sj(this);
        this.f16493m = c1783le;
        this.f16494n = c1634fe;
        this.f16495o = interfaceC1814mk;
        this.f16497q = f10;
    }

    public C1739jk(Context context, C1783le c1783le, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(context, c1783le, new C1634fe(c1783le.a()), interfaceExecutorC1966sn, U2.a(17) ? new Tj() : new Uj(), new C1497a2(), F3.a());
    }

    public C1739jk(Context context, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this(context, new C1783le(), interfaceExecutorC1966sn);
    }

    private static InterfaceC1659ge a(C1634fe c1634fe, C1497a2 c1497a2) {
        return U2.a(29) ? c1497a2.c(c1634fe) : c1497a2.b(c1634fe);
    }

    public static void a(C1739jk c1739jk, SignalStrength signalStrength) {
        Vj vjB;
        int evdoDbm;
        synchronized (c1739jk) {
            if (!c1739jk.f16486f.b() && !c1739jk.f16486f.d() && (vjB = c1739jk.f16486f.a().b()) != null) {
                if (signalStrength.isGsm()) {
                    int gsmSignalStrength = signalStrength.getGsmSignalStrength();
                    evdoDbm = 99 == gsmSignalStrength ? -1 : (gsmSignalStrength * 2) - 113;
                } else {
                    int cdmaDbm = signalStrength.getCdmaDbm();
                    evdoDbm = signalStrength.getEvdoDbm();
                    if (-120 == evdoDbm) {
                        evdoDbm = cdmaDbm;
                    } else if (-120 != cdmaDbm) {
                        evdoDbm = Math.min(cdmaDbm, evdoDbm);
                    }
                }
                vjB.a(Integer.valueOf(evdoDbm));
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a() {
        ((C1941rn) this.f16488h).execute(new b());
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a(Bk bk) {
        if (bk != null) {
            bk.a(g());
        }
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public void a(Qi qi) {
        this.f16484d = qi;
        this.f16493m.a(qi);
        this.f16494n.a(this.f16493m.a());
        this.f16495o.a(qi.f());
        if (qi.d() != null) {
            this.f16486f.a(qi.d().f17139a, qi.d().f17139a * 2);
            this.f16487g.a(qi.d().f17139a, qi.d().f17139a * 2);
        }
    }

    @Override // com.yandex.metrica.impl.ob.Vc
    public synchronized void a(Uc uc2) {
        this.f16485e = uc2;
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void a(Wj wj) {
        List<CellInfo> allCellInfo;
        if (wj != null) {
            synchronized (this) {
                if (this.f16487g.b() || this.f16487g.d()) {
                    O<Collection<Vj>> o10 = this.f16487g;
                    ArrayList arrayList = new ArrayList();
                    List listUnmodifiableList = null;
                    if (U2.a(17) && this.f16496p.a(this.f16489i)) {
                        synchronized (this) {
                            Uc uc2 = this.f16485e;
                            if (uc2 != null && uc2.f15147k) {
                                TelephonyManager telephonyManager = this.f16481a;
                                if (telephonyManager != null) {
                                    try {
                                        allCellInfo = telephonyManager.getAllCellInfo();
                                    } catch (Throwable unused) {
                                        allCellInfo = null;
                                    }
                                } else {
                                    allCellInfo = null;
                                }
                                if (!U2.b(allCellInfo)) {
                                    for (int i10 = 0; i10 < allCellInfo.size(); i10++) {
                                        Vj vjA = this.f16495o.a(allCellInfo.get(i10));
                                        if (vjA != null) {
                                            arrayList.add(vjA);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int size = arrayList.size();
                    List listSingletonList = arrayList;
                    if (size >= 1) {
                        listUnmodifiableList = Collections.unmodifiableList(listSingletonList);
                    } else {
                        Vj vjB = g().b();
                        if (vjB != null) {
                            listSingletonList = Collections.singletonList(vjB);
                            listUnmodifiableList = Collections.unmodifiableList(listSingletonList);
                        }
                    }
                    o10.a(listUnmodifiableList);
                }
                wj.a(this.f16487g.a());
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public void a(boolean z10) {
        this.f16493m.a(z10);
        this.f16494n.a(this.f16493m.a());
    }

    @Override // com.yandex.metrica.impl.ob.Rj
    public synchronized void b() {
        ((C1941rn) this.f16488h).execute(new c());
    }

    public synchronized boolean c() {
        Uc uc2;
        uc2 = this.f16485e;
        return uc2 != null && uc2.f15148l;
    }

    public synchronized boolean d() {
        Qi qi;
        synchronized (this) {
            qi = this.f16484d;
        }
        return (qi != null) && qi.f().f17355t;
        return (qi != null) && qi.f().f17355t;
    }

    public Context e() {
        return this.f16489i;
    }

    public TelephonyManager f() {
        return this.f16481a;
    }

    public synchronized Ak g() {
        Vj vjB;
        if (this.f16486f.b() || this.f16486f.d()) {
            Ak ak = new Ak(this.f16490j, this.f16491k, this.f16492l);
            Vj vjB2 = ak.b();
            if (vjB2 != null && vjB2.p() == null && !this.f16486f.b() && (vjB = this.f16486f.a().b()) != null) {
                ak.b().a(vjB.p());
            }
            this.f16486f.a(ak);
        }
        return this.f16486f.a();
    }
}
