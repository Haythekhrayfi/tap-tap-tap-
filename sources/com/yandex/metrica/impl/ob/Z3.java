package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Z3 implements InterfaceC1723j4, Li, InterfaceC1773l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1549c4 f15613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fi f15614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Si f15615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C2052w4 f15616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1607ec f15617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1700i5<AbstractC1675h5, Z3> f15618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Q2<Z3> f15619h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1574d4<H4> f15621j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private C1785lg f15622k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final V f15623l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Wg f15624m;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<C1621f1> f15620i = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f15625n = new Object();

    public class a implements Eg {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ResultReceiver f15626a;

        public a(Z3 z10, ResultReceiver resultReceiver) {
            this.f15626a = resultReceiver;
        }

        @Override // com.yandex.metrica.impl.ob.Eg
        public void a(Fg fg) {
            ResultReceiver resultReceiver = this.f15626a;
            int i10 = Gg.f14099b;
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                bundle.putByteArray("referrer", fg == null ? null : fg.a());
                resultReceiver.send(1, bundle);
            }
        }
    }

    public Z3(Context context, Fi fi, C1549c4 c1549c4, X3 x10, C2052w4 c2052w4, Ug ug, C1574d4<H4> c1574d4, C1524b4 c1524b4, W w10, C1607ec c1607ec, Wg wg) {
        Context applicationContext = context.getApplicationContext();
        this.f15612a = applicationContext;
        this.f15613b = c1549c4;
        this.f15614c = fi;
        this.f15616e = c2052w4;
        this.f15621j = c1574d4;
        this.f15618g = c1524b4.a(this);
        Si siA = fi.a(applicationContext, c1549c4, x10.f15446a);
        this.f15615d = siA;
        this.f15617f = c1607ec;
        c1607ec.a(applicationContext, siA.c());
        this.f15623l = w10.a(siA, c1607ec, applicationContext);
        this.f15619h = c1524b4.a(this, siA);
        this.f15624m = wg;
        fi.a(c1549c4, this);
    }

    private void a(ResultReceiver resultReceiver, Map<String, String> map) {
        U uA = this.f15623l.a(map);
        int i10 = ResultReceiverC1819n0.f16905b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            uA.c(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    public X3.a a() {
        return this.f15616e.a();
    }

    public void a(ResultReceiver resultReceiver) {
        this.f15624m.a(new a(this, resultReceiver));
    }

    public synchronized void a(H4 h10) {
        this.f15621j.a(h10);
        h10.a(this.f15623l.a(C2120ym.a(this.f15615d.c().w())));
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public void a(Hi hi, Qi qi) {
        synchronized (this.f15625n) {
            for (C1621f1 c1621f1 : this.f15620i) {
                ResultReceiver resultReceiverC = c1621f1.c();
                U uA = this.f15623l.a(c1621f1.a());
                int i10 = ResultReceiverC1819n0.f16905b;
                if (resultReceiverC != null) {
                    Bundle bundle = new Bundle();
                    hi.a(bundle);
                    uA.c(bundle);
                    resultReceiverC.send(2, bundle);
                }
            }
            this.f15620i.clear();
        }
    }

    @Override // com.yandex.metrica.impl.ob.Li
    public void a(Qi qi) {
        this.f15617f.a(qi);
        synchronized (this.f15625n) {
            Iterator it = this.f15621j.a().iterator();
            while (it.hasNext()) {
                ((T) it.next()).a(this.f15623l.a(C2120ym.a(qi.w())));
            }
            ArrayList arrayList = new ArrayList();
            for (C1621f1 c1621f1 : this.f15620i) {
                if (c1621f1.a(qi)) {
                    a(c1621f1.c(), c1621f1.a());
                } else {
                    arrayList.add(c1621f1);
                }
            }
            this.f15620i = new ArrayList(arrayList);
            if (!arrayList.isEmpty()) {
                this.f15619h.d();
            }
        }
        if (this.f15622k == null) {
            this.f15622k = P0.i().n();
        }
        this.f15622k.a(qi);
    }

    public void a(X3.a aVar) {
        this.f15616e.a(aVar);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1773l4
    public void a(X3 x10) {
        this.f15615d.a(x10.f15446a);
        this.f15616e.a(x10.f15447b);
    }

    public void a(C1621f1 c1621f1) {
        ResultReceiver resultReceiverC;
        Map<String, String> map = new HashMap<>();
        List<String> listB = null;
        if (c1621f1 != null) {
            listB = c1621f1.b();
            resultReceiverC = c1621f1.c();
            map = c1621f1.a();
        } else {
            resultReceiverC = null;
        }
        boolean zA = this.f15615d.a(listB, map);
        if (!zA) {
            a(resultReceiverC, map);
        }
        if (!this.f15615d.d()) {
            if (zA) {
                a(resultReceiverC, map);
            }
        } else {
            synchronized (this.f15625n) {
                if (zA && c1621f1 != null) {
                    this.f15620i.add(c1621f1);
                }
            }
            this.f15619h.d();
        }
    }

    public void a(C1744k0 c1744k0, H4 h10) {
        this.f15618g.a(c1744k0, h10);
    }

    public Context b() {
        return this.f15612a;
    }

    public synchronized void b(H4 h10) {
        this.f15621j.b(h10);
    }
}
