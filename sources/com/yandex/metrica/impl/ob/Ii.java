package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.IParamsCallback;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Ii implements Ki, InterfaceC1496a1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map<Hi, IParamsCallback.Reason> f14219j = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f14220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1821n2 f14221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ni f14222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f14223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Im f14224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ResultReceiverC1819n0.a f14225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f14226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<InterfaceC2116yi, List<String>> f14227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, String> f14228i;

    public class a extends HashMap<Hi, IParamsCallback.Reason> {
        public a() {
            put(Hi.UNKNOWN, IParamsCallback.Reason.UNKNOWN);
            put(Hi.NETWORK, IParamsCallback.Reason.NETWORK);
            put(Hi.PARSE, IParamsCallback.Reason.INVALID_RESPONSE);
        }
    }

    public class b implements ResultReceiverC1819n0.a {
        public b(Ii ii) {
        }

        @Override // com.yandex.metrica.impl.ob.ResultReceiverC1819n0.a
        public void a(int i10, Bundle bundle) {
        }
    }

    public Ii(Context context, C1821n2 c1821n2, F9 f10, Handler handler) {
        this(c1821n2, new Ni(context, f10), handler);
    }

    public Ii(C1821n2 c1821n2, Ni ni, Handler handler) {
        this.f14220a = Arrays.asList("yandex_mobile_metrica_uuid", "yandex_mobile_metrica_device_id", "appmetrica_device_id_hash", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        this.f14226g = new Object();
        this.f14227h = new WeakHashMap();
        this.f14221b = c1821n2;
        this.f14222c = ni;
        this.f14223d = handler;
        this.f14225f = new b(this);
    }

    private void a(InterfaceC2116yi interfaceC2116yi, Bundle bundle) {
        Hi hi;
        IParamsCallback.Reason reason;
        if (this.f14227h.containsKey(interfaceC2116yi)) {
            List<String> list = this.f14227h.get(interfaceC2116yi);
            HashMap map = null;
            if (this.f14222c.a((Collection<String>) list)) {
                if (list != null) {
                    map = new HashMap();
                    this.f14222c.a(list, map);
                }
                interfaceC2116yi.onReceive(map);
            } else {
                if (bundle.containsKey("startup_error_key_code")) {
                    int i10 = bundle.getInt("startup_error_key_code");
                    hi = Hi.UNKNOWN;
                    if (i10 == 1) {
                        hi = Hi.NETWORK;
                    } else if (i10 == 2) {
                        hi = Hi.PARSE;
                    }
                } else {
                    hi = null;
                }
                if (hi != null) {
                    reason = null;
                } else if (this.f14222c.a()) {
                    hi = Hi.UNKNOWN;
                    reason = null;
                } else {
                    Im im = this.f14224e;
                    if (im != null) {
                        im.c("Clids error. Passed clids: %s, and clids from server are empty.", this.f14228i);
                    }
                    reason = IParamsCallback.Reason.INCONSISTENT_CLIDS;
                }
                if (reason == null) {
                    Map<Hi, IParamsCallback.Reason> map2 = f14219j;
                    IParamsCallback.Reason reason2 = IParamsCallback.Reason.UNKNOWN;
                    IParamsCallback.Reason reason3 = map2.get(hi);
                    if (reason3 != null) {
                        reason2 = reason3;
                    }
                    reason = reason2;
                }
                if (list != null) {
                    map = new HashMap();
                    this.f14222c.a(list, map);
                }
                interfaceC2116yi.a(reason, map);
            }
            this.f14227h.remove(interfaceC2116yi);
            if (this.f14227h.isEmpty()) {
                this.f14221b.f();
            }
        }
    }

    private void f() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry<InterfaceC2116yi, List<String>> entry : this.f14227h.entrySet()) {
            List<String> value = entry.getValue();
            if (this.f14222c.a((Collection<String>) value)) {
                weakHashMap.put(entry.getKey(), value);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            InterfaceC2116yi interfaceC2116yi = (InterfaceC2116yi) ((Map.Entry) it.next()).getKey();
            if (interfaceC2116yi != null) {
                a(interfaceC2116yi, new Bundle());
            }
        }
        weakHashMap.clear();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1496a1
    public long a() {
        return this.f14222c.e();
    }

    public void a(Bundle bundle, InterfaceC2116yi interfaceC2116yi) {
        synchronized (this.f14226g) {
            this.f14222c.a(bundle);
            f();
            f();
            if (interfaceC2116yi != null) {
                a(interfaceC2116yi, bundle);
            }
        }
    }

    public void a(IIdentifierCallback iIdentifierCallback, List<String> list, Map<String, String> map) {
        C1912qi c1912qi = new C1912qi(iIdentifierCallback);
        synchronized (this.f14226g) {
            this.f14222c.a(map);
            if (this.f14227h.isEmpty()) {
                this.f14221b.g();
            }
            this.f14227h.put(c1912qi, list);
            if (this.f14222c.b(list)) {
                this.f14221b.a(list, new ResultReceiverC1819n0(this.f14223d, new Ji(this, c1912qi)), map);
            } else {
                a(c1912qi, new Bundle());
            }
        }
    }

    public void a(Im im) {
        this.f14224e = im;
    }

    public void a(Jl jl) {
        this.f14222c.a(jl);
    }

    public void a(String str) {
        synchronized (this.f14226g) {
            this.f14221b.a(str);
        }
    }

    public void a(List<String> list) {
        C1821n2 c1821n2;
        synchronized (this.f14226g) {
            List<String> listB = this.f14222c.b();
            if (U2.b(list)) {
                if (!U2.b(listB)) {
                    listB = null;
                    this.f14222c.a((List<String>) null);
                    c1821n2 = this.f14221b;
                    c1821n2.a(listB);
                }
            } else if (U2.a(list, listB)) {
                c1821n2 = this.f14221b;
                c1821n2.a(listB);
            } else {
                this.f14222c.a(list);
                this.f14221b.a(list);
            }
        }
    }

    public void a(Map<String, String> map) {
        if (U2.b(map)) {
            return;
        }
        synchronized (this.f14226g) {
            Map<String, String> mapI = C2120ym.i(map);
            this.f14228i = mapI;
            this.f14221b.a(mapI);
            this.f14222c.a(mapI);
        }
    }

    public String b() {
        return this.f14222c.c();
    }

    public void b(String str) {
        synchronized (this.f14226g) {
            this.f14221b.b(str);
        }
    }

    public Xa c() {
        return this.f14222c.d();
    }

    public Il d() {
        return this.f14222c.f();
    }

    public String e() {
        return this.f14222c.g();
    }

    public void g() {
        boolean zB;
        synchronized (this.f14226g) {
            Ni ni = this.f14222c;
            synchronized (ni) {
                zB = ni.b(Arrays.asList(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "yandex_mobile_metrica_device_id", "yandex_mobile_metrica_get_ad_url", "yandex_mobile_metrica_report_ad_url", "yandex_mobile_metrica_uuid"));
            }
            if (zB) {
                Map<String, String> map = this.f14228i;
                this.f14221b.a(this.f14220a, new ResultReceiverC1819n0(this.f14223d, this.f14225f), map);
            }
        }
    }
}
