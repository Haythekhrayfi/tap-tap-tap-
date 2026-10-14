package ua;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ComponentTracker;
import fd.g0;
import fd.i;
import fd.j0;
import fd.k;
import fd.s0;
import fd.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jc.w;
import kc.l;
import oc.e;
import oc.h;
import uc.p;
import vc.g;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static a f36180d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f36184b = new b(0, new HashMap(), false, null, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0427a f36179c = new C0427a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<String> f36181e = l.c("adsense.google.com", "adservice.google.ca", "adservice.google.co.in", "adservice.google.co.kr", "adservice.google.co.uk", "adservice.google.co.za", "adservice.google.com", "adservice.google.com.ar", "adservice.google.com.au", "adservice.google.com.br", "adservice.google.com.co", "adservice.google.com.gt", "adservice.google.com.mx", "adservice.google.com.pe", "adservice.google.com.ph", "adservice.google.com.pk", "adservice.google.com.tr", "adservice.google.com.tw", "adservice.google.com.vn", "adservice.google.de", "adservice.google.dk", "adservice.google.es", "adservice.google.fr", "adservice.google.nl", "adservice.google.no", "adservice.google.pl", "adservice.google.ru", "adservice.google.vg", "app-measurement.com", "doubleclick.com", "doubleclick.net", "doubleclickbygoogle.com", "googleadservices.com");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List<String> f36182f = l.c("ms.applvn.com", "applovin.com");

    /* JADX INFO: renamed from: ua.a$a, reason: collision with other inner class name */
    public static final class C0427a {
        public C0427a() {
        }

        public C0427a(g gVar) {
        }

        public final synchronized a a(Context context) {
            a aVar;
            try {
                aVar = a.f36180d;
                if (aVar == null && context == null) {
                    throw new IllegalArgumentException("On first call the context can't be null");
                }
                if (aVar == null) {
                    j0.f(context);
                    aVar = new a(context, null);
                    a.f36180d = aVar;
                    j0.f(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
            return aVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f36185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<String, Boolean> f36186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f36187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f36188d;

        public b(long j10, HashMap<String, Boolean> map, boolean z10, String str) {
            j0.i(map, "hostsStatus");
            j0.i(str, "privateDNS");
            this.f36185a = j10;
            this.f36186b = map;
            this.f36187c = z10;
            this.f36188d = str;
        }

        public /* synthetic */ b(long j10, HashMap map, boolean z10, String str, int i10, g gVar) {
            this(j10, map, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? "" : str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f36185a == bVar.f36185a && j0.d(this.f36186b, bVar.f36186b) && this.f36187c == bVar.f36187c && j0.d(this.f36188d, bVar.f36188d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        public int hashCode() {
            int iHashCode = (this.f36186b.hashCode() + (Long.hashCode(this.f36185a) * 31)) * 31;
            boolean z10 = this.f36187c;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            return this.f36188d.hashCode() + ((iHashCode + r10) * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("PhNetworkState(timestamp=");
            sbA.append(this.f36185a);
            sbA.append(", hostsStatus=");
            sbA.append(this.f36186b);
            sbA.append(", vpnActive=");
            sbA.append(this.f36187c);
            sbA.append(", privateDNS=");
            return s.a.a(sbA, this.f36188d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @e(c = "com.zipoapps.premiumhelper.network.NetworkStateMonitor", f = "NetworkStateMonitor.kt", l = {121}, m = "getAvailableDomainsRatio")
    public static final class c extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f36189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f36190d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f36192f;

        public c(mc.d<? super c> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f36190d = obj;
            this.f36192f |= Integer.MIN_VALUE;
            return a.this.a(this);
        }
    }

    @e(c = "com.zipoapps.premiumhelper.network.NetworkStateMonitor$getUnavailableDomains$2$3", f = "NetworkStateMonitor.kt", l = {}, m = "invokeSuspend")
    public static final class d extends h implements p<g0, mc.d<? super w>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i<List<String>> f36194d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(i<? super List<String>> iVar, mc.d<? super d> dVar) {
            super(2, dVar);
            this.f36194d = iVar;
        }

        @Override // oc.a
        public final mc.d<w> create(Object obj, mc.d<?> dVar) {
            return a.this.new d(this.f36194d, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super w> dVar) {
            d dVar2 = a.this.new d(this.f36194d, dVar);
            w wVar = w.f31842a;
            dVar2.invokeSuspend(wVar);
            return wVar;
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            h9.d.t(obj);
            a aVar2 = a.this;
            C0427a c0427a = a.f36179c;
            synchronized (aVar2) {
                HashMap map = new HashMap();
                for (String str : a.f36181e) {
                    map.put(str, Boolean.valueOf(gb.w.b(gb.w.f30411a, str, 0, 0, 6)));
                }
                for (String str2 : a.f36182f) {
                    map.put(str2, Boolean.valueOf(gb.w.b(gb.w.f30411a, str2, 0, 0, 6)));
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                gb.w wVar = gb.w.f30411a;
                aVar2.f36184b = new b(jCurrentTimeMillis, map, wVar.c(aVar2.f36183a), wVar.a(aVar2.f36183a));
                xe.a.f37601c.a("Status update of ad domains finished", new Object[0]);
            }
            if (this.f36194d.a()) {
                i<List<String>> iVar = this.f36194d;
                HashMap<String, Boolean> map2 = a.this.f36184b.f36186b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Boolean> entry : map2.entrySet()) {
                    if (!entry.getValue().booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                jc.i.a aVar3 = jc.i.f31813c;
                iVar.resumeWith(arrayList);
            }
            return w.f31842a;
        }
    }

    public a(Context context, g gVar) {
        this.f36183a = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(mc.d<? super Integer> dVar) {
        c cVar;
        a aVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f36192f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f36192f = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objB = cVar.f36190d;
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        int i11 = cVar.f36192f;
        if (i11 == 0) {
            h9.d.t(objB);
            if (this.f36184b.f36186b.isEmpty()) {
                return new Integer(100);
            }
            cVar.f36189c = this;
            cVar.f36192f = 1;
            objB = b(cVar);
            if (objB == aVar2) {
                return aVar2;
            }
            aVar = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) cVar.f36189c;
            h9.d.t(objB);
        }
        return new Integer(100 - ((int) ((((List) objB).size() / aVar.f36184b.f36186b.size()) * 100)));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a8  */
    public final Object b(mc.d<? super List<String>> dVar) {
        k kVar = new k(nc.b.c(dVar), 1);
        kVar.u();
        long jCurrentTimeMillis = System.currentTimeMillis();
        b bVar = this.f36184b;
        if (jCurrentTimeMillis - bVar.f36185a < ComponentTracker.DEFAULT_TIMEOUT) {
            Context context = this.f36183a;
            j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            boolean z10 = bVar.f36187c;
            gb.w wVar = gb.w.f30411a;
            if (!(z10 == wVar.c(context) && j0.d(bVar.f36188d, wVar.a(context)))) {
                c0.z(z.a(s0.f29620b), null, null, new d(kVar, null), 3, null);
            } else if (kVar.a()) {
                HashMap<String, Boolean> map = this.f36184b.f36186b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Boolean> entry : map.entrySet()) {
                    if (!entry.getValue().booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getKey());
                }
                jc.i.a aVar = jc.i.f31813c;
                kVar.resumeWith(arrayList);
            }
        } else {
            c0.z(z.a(s0.f29620b), null, null, new d(kVar, null), 3, null);
        }
        Object objR = kVar.r();
        nc.a aVar2 = nc.a.COROUTINE_SUSPENDED;
        return objR;
    }
}
