package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.IParamsCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class Ni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f14580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, C1646g1> f14581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f14582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f14583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f14584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Il f14586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Xa f14587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f14588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<Jl> f14589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final F9 f14590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final C1936ri f14591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final C1986ti f14592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2066wi f14593n;

    public Ni(Context context, F9 f10) {
        this(f10, new C1837ni(), new C1936ri(), Fj.a(context).a(context, new Ij(f10)), new C1986ti(), new C2066wi(), new C2041vi());
    }

    public Ni(F9 f10, C1837ni c1837ni, C1936ri c1936ri, Ej ej, C1986ti c1986ti, C2066wi c2066wi, C2041vi c2041vi) {
        HashSet hashSet = new HashSet();
        this.f14580a = hashSet;
        this.f14581b = new HashMap();
        this.f14589j = new ArrayList();
        hashSet.add("yandex_mobile_metrica_google_adv_id");
        hashSet.add("yandex_mobile_metrica_huawei_oaid");
        hashSet.add("yandex_mobile_metrica_yandex_adv_id");
        this.f14590k = f10;
        this.f14591l = c1936ri;
        this.f14592m = c1986ti;
        this.f14593n = c2066wi;
        a("yandex_mobile_metrica_uuid", ej.a());
        a("yandex_mobile_metrica_device_id", f10.k());
        a("appmetrica_device_id_hash", f10.j());
        a("yandex_mobile_metrica_get_ad_url", f10.e());
        a("yandex_mobile_metrica_report_ad_url", f10.f());
        b(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, f10.q());
        a("yandex_mobile_metrica_google_adv_id", f10.n());
        a("yandex_mobile_metrica_huawei_oaid", f10.o());
        a("yandex_mobile_metrica_yandex_adv_id", f10.u());
        c1986ti.a(f10.i());
        c2066wi.a(f10.m());
        this.f14582c = f10.h();
        String strJ = f10.j((String) null);
        this.f14583d = strJ != null ? C2120ym.a(strJ) : null;
        this.f14585f = f10.b(true);
        this.f14584e = f10.d(0L);
        this.f14586g = f10.s();
        this.f14587h = f10.l();
        this.f14588i = f10.p();
        h();
    }

    private void a(String str, C1646g1 c1646g1) {
        if (b(c1646g1)) {
            return;
        }
        this.f14581b.put(str, c1646g1);
    }

    private boolean a(C1646g1 c1646g1) {
        return c1646g1 == null || c1646g1.f16160a == null;
    }

    private void b(String str, C1646g1 c1646g1) {
        if (a(c1646g1)) {
            return;
        }
        this.f14581b.put(str, c1646g1);
    }

    private boolean b(C1646g1 c1646g1) {
        return c1646g1 == null || TextUtils.isEmpty(c1646g1.f16160a);
    }

    private void h() {
        this.f14590k.i(this.f14581b.get("yandex_mobile_metrica_uuid")).e(this.f14581b.get("yandex_mobile_metrica_device_id")).d(this.f14581b.get("appmetrica_device_id_hash")).a(this.f14581b.get("yandex_mobile_metrica_get_ad_url")).b(this.f14581b.get("yandex_mobile_metrica_report_ad_url")).h(this.f14584e).h(this.f14581b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)).q(C2120ym.c(this.f14583d)).a(this.f14586g).a(this.f14587h).f(this.f14581b.get("yandex_mobile_metrica_google_adv_id")).g(this.f14581b.get("yandex_mobile_metrica_huawei_oaid")).j(this.f14581b.get("yandex_mobile_metrica_yandex_adv_id")).d(this.f14585f).c(this.f14592m.a()).g(this.f14588i).a(this.f14593n.a()).c();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca A[Catch: all -> 0x0141, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0006, B:22:0x0071, B:23:0x0072, B:24:0x0084, B:43:0x00b3, B:44:0x00b4, B:45:0x00b8, B:47:0x00bb, B:48:0x00bc, B:55:0x00da, B:57:0x00e3, B:60:0x00ee, B:61:0x00fc, B:71:0x0129, B:72:0x012a, B:76:0x0136, B:77:0x0137, B:58:0x00e8, B:51:0x00ca, B:53:0x00d0, B:54:0x00d6, B:79:0x0139, B:80:0x013a, B:82:0x013c, B:83:0x013d, B:85:0x013f, B:86:0x0140, B:62:0x00fd, B:64:0x0103, B:66:0x0109, B:67:0x0111, B:69:0x0117, B:70:0x0123, B:46:0x00b9, B:25:0x0085, B:27:0x008f, B:29:0x0097, B:32:0x009a, B:33:0x009b, B:34:0x009c, B:36:0x00a6, B:38:0x00ae, B:41:0x00b1, B:42:0x00b2, B:5:0x0007, B:7:0x001b, B:10:0x0023, B:12:0x0029, B:14:0x0030, B:16:0x003a, B:18:0x0041, B:20:0x004b, B:21:0x0050), top: B:92:0x0001, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0 A[Catch: all -> 0x0141, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0006, B:22:0x0071, B:23:0x0072, B:24:0x0084, B:43:0x00b3, B:44:0x00b4, B:45:0x00b8, B:47:0x00bb, B:48:0x00bc, B:55:0x00da, B:57:0x00e3, B:60:0x00ee, B:61:0x00fc, B:71:0x0129, B:72:0x012a, B:76:0x0136, B:77:0x0137, B:58:0x00e8, B:51:0x00ca, B:53:0x00d0, B:54:0x00d6, B:79:0x0139, B:80:0x013a, B:82:0x013c, B:83:0x013d, B:85:0x013f, B:86:0x0140, B:62:0x00fd, B:64:0x0103, B:66:0x0109, B:67:0x0111, B:69:0x0117, B:70:0x0123, B:46:0x00b9, B:25:0x0085, B:27:0x008f, B:29:0x0097, B:32:0x009a, B:33:0x009b, B:34:0x009c, B:36:0x00a6, B:38:0x00ae, B:41:0x00b1, B:42:0x00b2, B:5:0x0007, B:7:0x001b, B:10:0x0023, B:12:0x0029, B:14:0x0030, B:16:0x003a, B:18:0x0041, B:20:0x004b, B:21:0x0050), top: B:92:0x0001, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6 A[Catch: all -> 0x0141, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0006, B:22:0x0071, B:23:0x0072, B:24:0x0084, B:43:0x00b3, B:44:0x00b4, B:45:0x00b8, B:47:0x00bb, B:48:0x00bc, B:55:0x00da, B:57:0x00e3, B:60:0x00ee, B:61:0x00fc, B:71:0x0129, B:72:0x012a, B:76:0x0136, B:77:0x0137, B:58:0x00e8, B:51:0x00ca, B:53:0x00d0, B:54:0x00d6, B:79:0x0139, B:80:0x013a, B:82:0x013c, B:83:0x013d, B:85:0x013f, B:86:0x0140, B:62:0x00fd, B:64:0x0103, B:66:0x0109, B:67:0x0111, B:69:0x0117, B:70:0x0123, B:46:0x00b9, B:25:0x0085, B:27:0x008f, B:29:0x0097, B:32:0x009a, B:33:0x009b, B:34:0x009c, B:36:0x00a6, B:38:0x00ae, B:41:0x00b1, B:42:0x00b2, B:5:0x0007, B:7:0x001b, B:10:0x0023, B:12:0x0029, B:14:0x0030, B:16:0x003a, B:18:0x0041, B:20:0x004b, B:21:0x0050), top: B:92:0x0001, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3 A[Catch: all -> 0x0141, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0006, B:22:0x0071, B:23:0x0072, B:24:0x0084, B:43:0x00b3, B:44:0x00b4, B:45:0x00b8, B:47:0x00bb, B:48:0x00bc, B:55:0x00da, B:57:0x00e3, B:60:0x00ee, B:61:0x00fc, B:71:0x0129, B:72:0x012a, B:76:0x0136, B:77:0x0137, B:58:0x00e8, B:51:0x00ca, B:53:0x00d0, B:54:0x00d6, B:79:0x0139, B:80:0x013a, B:82:0x013c, B:83:0x013d, B:85:0x013f, B:86:0x0140, B:62:0x00fd, B:64:0x0103, B:66:0x0109, B:67:0x0111, B:69:0x0117, B:70:0x0123, B:46:0x00b9, B:25:0x0085, B:27:0x008f, B:29:0x0097, B:32:0x009a, B:33:0x009b, B:34:0x009c, B:36:0x00a6, B:38:0x00ae, B:41:0x00b1, B:42:0x00b2, B:5:0x0007, B:7:0x001b, B:10:0x0023, B:12:0x0029, B:14:0x0030, B:16:0x003a, B:18:0x0041, B:20:0x004b, B:21:0x0050), top: B:92:0x0001, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8 A[Catch: all -> 0x0141, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0006, B:22:0x0071, B:23:0x0072, B:24:0x0084, B:43:0x00b3, B:44:0x00b4, B:45:0x00b8, B:47:0x00bb, B:48:0x00bc, B:55:0x00da, B:57:0x00e3, B:60:0x00ee, B:61:0x00fc, B:71:0x0129, B:72:0x012a, B:76:0x0136, B:77:0x0137, B:58:0x00e8, B:51:0x00ca, B:53:0x00d0, B:54:0x00d6, B:79:0x0139, B:80:0x013a, B:82:0x013c, B:83:0x013d, B:85:0x013f, B:86:0x0140, B:62:0x00fd, B:64:0x0103, B:66:0x0109, B:67:0x0111, B:69:0x0117, B:70:0x0123, B:46:0x00b9, B:25:0x0085, B:27:0x008f, B:29:0x0097, B:32:0x009a, B:33:0x009b, B:34:0x009c, B:36:0x00a6, B:38:0x00ae, B:41:0x00b1, B:42:0x00b2, B:5:0x0007, B:7:0x001b, B:10:0x0023, B:12:0x0029, B:14:0x0030, B:16:0x003a, B:18:0x0041, B:20:0x004b, B:21:0x0050), top: B:92:0x0001, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee A[Catch: all -> 0x0141, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0006, B:22:0x0071, B:23:0x0072, B:24:0x0084, B:43:0x00b3, B:44:0x00b4, B:45:0x00b8, B:47:0x00bb, B:48:0x00bc, B:55:0x00da, B:57:0x00e3, B:60:0x00ee, B:61:0x00fc, B:71:0x0129, B:72:0x012a, B:76:0x0136, B:77:0x0137, B:58:0x00e8, B:51:0x00ca, B:53:0x00d0, B:54:0x00d6, B:79:0x0139, B:80:0x013a, B:82:0x013c, B:83:0x013d, B:85:0x013f, B:86:0x0140, B:62:0x00fd, B:64:0x0103, B:66:0x0109, B:67:0x0111, B:69:0x0117, B:70:0x0123, B:46:0x00b9, B:25:0x0085, B:27:0x008f, B:29:0x0097, B:32:0x009a, B:33:0x009b, B:34:0x009c, B:36:0x00a6, B:38:0x00ae, B:41:0x00b1, B:42:0x00b2, B:5:0x0007, B:7:0x001b, B:10:0x0023, B:12:0x0029, B:14:0x0030, B:16:0x003a, B:18:0x0041, B:20:0x004b, B:21:0x0050), top: B:92:0x0001, inners: #2, #3, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0103 A[Catch: all -> 0x0135, TryCatch #2 {, blocks: (B:62:0x00fd, B:64:0x0103, B:66:0x0109, B:67:0x0111, B:69:0x0117, B:70:0x0123), top: B:93:0x00fd, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0117 A[Catch: all -> 0x0135, LOOP:0: B:67:0x0111->B:69:0x0117, LOOP_END, TryCatch #2 {, blocks: (B:62:0x00fd, B:64:0x0103, B:66:0x0109, B:67:0x0111, B:69:0x0117, B:70:0x0123), top: B:93:0x00fd, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public synchronized void a(Bundle bundle) {
        U u10;
        long jM;
        Map<String, String> map;
        String str;
        HashMap<String, String> mapD;
        boolean zEquals;
        Il ilN;
        Iterator<Jl> it;
        u10 = new U(bundle);
        synchronized (this) {
            C1646g1 c1646g1O = u10.o();
            if (b(this.f14581b.get("yandex_mobile_metrica_uuid")) && !b(c1646g1O) && !b(c1646g1O)) {
                this.f14581b.put("yandex_mobile_metrica_uuid", c1646g1O);
            }
            C1646g1 c1646g1C = u10.c();
            if (!b(c1646g1C)) {
                this.f14581b.put("yandex_mobile_metrica_device_id", c1646g1C);
            }
            C1646g1 c1646g1D = u10.d();
            if (!b(c1646g1D)) {
                this.f14581b.put("appmetrica_device_id_hash", c1646g1D);
            }
            this.f14581b.put("yandex_mobile_metrica_google_adv_id", u10.g());
            this.f14581b.put("yandex_mobile_metrica_huawei_oaid", u10.i());
            this.f14581b.put("yandex_mobile_metrica_yandex_adv_id", u10.p());
        }
        jM = u10.m();
        synchronized (this) {
            this.f14584e = jM;
        }
        C1936ri c1936ri = this.f14591l;
        map = this.f14583d;
        str = u10.a().f16160a;
        if (str == null) {
            mapD = null;
        } else if (str.isEmpty()) {
            mapD = new HashMap<>();
        } else {
            mapD = C2120ym.d(str);
        }
        Objects.requireNonNull(c1936ri);
        if (U2.b(map)) {
            zEquals = U2.b(mapD);
        } else {
            zEquals = map.equals(mapD);
        }
        if (zEquals) {
            this.f14581b.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, u10.l());
            this.f14585f = false;
        }
        synchronized (this) {
            ilN = u10.n();
            if (ilN != null && ilN.a()) {
                this.f14586g = ilN;
                it = this.f14589j.iterator();
                while (it.hasNext()) {
                    it.next().a(this.f14586g);
                }
            }
            this.f14587h = u10.e();
        }
        this.f14588i = u10.j();
        h();
        this.f14592m.a(u10.b());
        this.f14593n.a(u10.f());
        synchronized (this) {
            C1646g1 c1646g1H = u10.h();
            if (!a(c1646g1H)) {
                synchronized (this) {
                    this.f14581b.put("yandex_mobile_metrica_get_ad_url", c1646g1H);
                }
            }
            C1646g1 c1646g1K = u10.k();
            if (a(c1646g1K)) {
                jM = u10.m();
                synchronized (this) {
                    this.f14584e = jM;
                    C1936ri c1936ri2 = this.f14591l;
                    map = this.f14583d;
                    str = u10.a().f16160a;
                    if (str == null) {
                        mapD = null;
                    } else if (str.isEmpty()) {
                        mapD = new HashMap<>();
                    } else {
                        mapD = C2120ym.d(str);
                    }
                    Objects.requireNonNull(c1936ri2);
                    if (U2.b(map)) {
                        zEquals = U2.b(mapD);
                    } else {
                        zEquals = map.equals(mapD);
                    }
                    if (zEquals) {
                        this.f14581b.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, u10.l());
                        this.f14585f = false;
                    }
                    synchronized (this) {
                        ilN = u10.n();
                        if (ilN != null) {
                            this.f14586g = ilN;
                            it = this.f14589j.iterator();
                            while (it.hasNext()) {
                                it.next().a(this.f14586g);
                            }
                        }
                        this.f14587h = u10.e();
                        this.f14588i = u10.j();
                        h();
                    }
                }
            } else {
                synchronized (this) {
                    this.f14581b.put("yandex_mobile_metrica_report_ad_url", c1646g1K);
                    jM = u10.m();
                    synchronized (this) {
                        this.f14584e = jM;
                        C1936ri c1936ri3 = this.f14591l;
                        map = this.f14583d;
                        str = u10.a().f16160a;
                        if (str == null) {
                            mapD = null;
                        } else if (str.isEmpty()) {
                            mapD = new HashMap<>();
                        } else {
                            mapD = C2120ym.d(str);
                        }
                        Objects.requireNonNull(c1936ri3);
                        if (U2.b(map)) {
                            zEquals = U2.b(mapD);
                        } else {
                            zEquals = map.equals(mapD);
                        }
                        if (zEquals) {
                            this.f14581b.put(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, u10.l());
                            this.f14585f = false;
                        }
                        synchronized (this) {
                            ilN = u10.n();
                            if (ilN != null) {
                                this.f14586g = ilN;
                                it = this.f14589j.iterator();
                                while (it.hasNext()) {
                                    it.next().a(this.f14586g);
                                }
                            }
                            this.f14587h = u10.e();
                            this.f14588i = u10.j();
                            h();
                        }
                    }
                }
            }
            throw th;
        }
    }

    public synchronized void a(Jl jl) {
        this.f14589j.add(jl);
    }

    public void a(List<String> list) {
        this.f14582c = list;
        this.f14590k.b(list);
    }

    public synchronized void a(List<String> list, Map<String, C1646g1> map) {
        for (String str : list) {
            C1646g1 c1646g1 = this.f14581b.get(str);
            if (c1646g1 != null) {
                map.put(str, c1646g1);
            }
        }
        this.f14592m.a(list, map);
        this.f14593n.a(list, map);
    }

    public void a(Map<String, String> map) {
        if (U2.b(map) || U2.a(map, this.f14583d)) {
            return;
        }
        this.f14583d = new HashMap(map);
        this.f14585f = true;
        h();
    }

    public boolean a() {
        C1646g1 c1646g1 = this.f14581b.get(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS);
        if (!a(c1646g1) && c1646g1.f16160a.isEmpty()) {
            return U2.b(this.f14583d);
        }
        return true;
    }

    public synchronized boolean a(Collection<String> collection) {
        for (String str : collection) {
            C1646g1 c1646g1A = this.f14581b.get(str);
            if (c1646g1A == null) {
                c1646g1A = this.f14592m.b().get(str);
            }
            if (c1646g1A == null) {
                c1646g1A = this.f14593n.a(str);
            }
            if (IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS.equals(str)) {
                if (this.f14585f || a(c1646g1A) || (c1646g1A.f16160a.isEmpty() && !U2.b(this.f14583d))) {
                    return false;
                }
            } else if (IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED.equals(str)) {
                if (c1646g1A == null) {
                    return false;
                }
            } else if (b(c1646g1A)) {
                return false;
            }
        }
        return true;
    }

    public List<String> b() {
        return this.f14582c;
    }

    public synchronized boolean b(List<String> list) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean zA;
        z10 = true;
        z11 = !a(Oi.a(list));
        synchronized (this) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z12 = false;
                    break;
                }
                if (this.f14580a.contains(it.next())) {
                    z12 = true;
                    break;
                }
            }
        }
        boolean z13 = !(il != null && il.a());
        if (!z11 && !z12 && !zA && !this.f14585f && !z13) {
            z10 = false;
        }
        return z10;
        zA = Oi.a(this.f14588i);
        synchronized (this) {
            Il il = this.f14586g;
            boolean z14 = !(il != null && il.a());
            if (!z11) {
                z10 = false;
            }
        }
        return z10;
    }

    public String c() {
        C1646g1 c1646g1 = this.f14581b.get("yandex_mobile_metrica_device_id");
        if (c1646g1 == null) {
            return null;
        }
        return c1646g1.f16160a;
    }

    public Xa d() {
        return this.f14587h;
    }

    public long e() {
        return this.f14584e;
    }

    public Il f() {
        return this.f14586g;
    }

    public String g() {
        C1646g1 c1646g1 = this.f14581b.get("yandex_mobile_metrica_uuid");
        if (c1646g1 == null) {
            return null;
        }
        return c1646g1.f16160a;
    }
}
