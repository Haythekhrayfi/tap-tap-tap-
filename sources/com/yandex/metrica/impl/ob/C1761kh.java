package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1761kh extends C1662gh {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<String> f16760o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<String> f16761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f16762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f16763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<String, String> f16764s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private P3.a f16765t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<String> f16766u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f16767v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f16768w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f16769x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f16770y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Ug f16771z;

    /* JADX WARN: Unexpected interfaces in signature: [com.yandex.metrica.impl.ob.ch<com.yandex.metrica.impl.ob.kh$b, com.yandex.metrica.impl.ob.kh$b>] */
    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kh$b */
    public static class b extends C1587dh.a<b, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f16772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f16773e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Map<String, String> f16774f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f16775g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<String> f16776h;

        public b() {
            this(null, null, null, null, null, null, false, null);
        }

        public b(T3 t10) {
            this(t10.b().f13444c.getAsString("CFG_DEVICE_SIZE_TYPE"), t10.b().f13444c.getAsString("CFG_APP_VERSION"), t10.b().f13444c.getAsString("CFG_APP_VERSION_CODE"), t10.a().d(), t10.a().e(), t10.a().a(), t10.a().j(), t10.a().b());
        }

        public b(String str, String str2, String str3, String str4, String str5, Map<String, String> map, boolean z10, List<String> list) {
            super(str, str2, str3);
            this.f16772d = str4;
            this.f16773e = str5;
            this.f16774f = map;
            this.f16775g = z10;
            this.f16776h = list;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1562ch
        public b a(b bVar) {
            String str = this.f15968a;
            String str2 = bVar.f15968a;
            if (str != null) {
                str2 = str;
            }
            String str3 = this.f15969b;
            String str4 = bVar.f15969b;
            if (str3 != null) {
                str4 = str3;
            }
            String str5 = this.f15970c;
            String str6 = bVar.f15970c;
            if (str5 != null) {
                str6 = str5;
            }
            String str7 = this.f16772d;
            String str8 = bVar.f16772d;
            if (str7 != null) {
                str8 = str7;
            }
            String str9 = this.f16773e;
            String str10 = bVar.f16773e;
            if (str9 != null) {
                str10 = str9;
            }
            Map<String, String> map = this.f16774f;
            Map<String, String> map2 = bVar.f16774f;
            if (map != null) {
                map2 = map;
            }
            return new b(str2, str4, str6, str8, str10, map2, this.f16775g || bVar.f16775g, bVar.f16775g ? bVar.f16776h : this.f16776h);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC1562ch
        public /* bridge */ /* synthetic */ boolean b(Object obj) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.kh$c */
    public static class c extends C1662gh.a<C1761kh, b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Q f16777d;

        public c(Context context, String str) {
            this(context, str, new Wn(), P0.i().e());
        }

        public c(Context context, String str, Wn wn, Q q10) {
            super(context, str, wn);
            this.f16777d = q10;
        }

        @Override // com.yandex.metrica.impl.ob.C1587dh.b
        public C1587dh a() {
            return new C1761kh();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yandex.metrica.impl.ob.C1587dh.d
        public C1587dh a(Object obj) {
            C1587dh.c cVar = (C1587dh.c) obj;
            C1761kh c1761khA = a(cVar);
            Qi qi = cVar.f15973a;
            c1761khA.c(qi.t());
            c1761khA.b(qi.s());
            String str = ((b) cVar.f15974b).f16772d;
            if (str != null) {
                C1761kh.a(c1761khA, str);
                C1761kh.b(c1761khA, ((b) cVar.f15974b).f16773e);
            }
            Map<String, String> map = ((b) cVar.f15974b).f16774f;
            c1761khA.a(map);
            c1761khA.a(this.f16777d.a(new P3.a(map, E0.APP)));
            c1761khA.a(((b) cVar.f15974b).f16775g);
            c1761khA.a(((b) cVar.f15974b).f16776h);
            c1761khA.b(cVar.f15973a.r());
            c1761khA.h(cVar.f15973a.g());
            c1761khA.b(cVar.f15973a.p());
            return c1761khA;
        }
    }

    private C1761kh() {
        this(P0.i().o());
    }

    public C1761kh(Ug ug) {
        this.f16765t = new P3.a(null, E0.APP);
        this.f16770y = 0L;
        this.f16771z = ug;
    }

    public static void a(C1761kh c1761kh, String str) {
        c1761kh.f16762q = str;
    }

    public static void b(C1761kh c1761kh, String str) {
        c1761kh.f16763r = str;
    }

    public P3.a C() {
        return this.f16765t;
    }

    public Map<String, String> D() {
        return this.f16764s;
    }

    public String E() {
        return this.f16769x;
    }

    public String F() {
        return this.f16762q;
    }

    public String G() {
        return this.f16763r;
    }

    public List<String> H() {
        return this.f16766u;
    }

    public Ug I() {
        return this.f16771z;
    }

    public List<String> J() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!U2.b(this.f16760o)) {
            linkedHashSet.addAll(this.f16760o);
        }
        if (!U2.b(this.f16761p)) {
            linkedHashSet.addAll(this.f16761p);
        }
        linkedHashSet.add("https://startup.mobile.yandex.net/");
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        if (!TextUtils.isEmpty("")) {
            linkedHashSet.add("");
        }
        return new ArrayList(linkedHashSet);
    }

    public List<String> K() {
        return this.f16761p;
    }

    public boolean L() {
        return this.f16767v;
    }

    public boolean M() {
        return this.f16768w;
    }

    public long a(long j10) {
        if (this.f16770y == 0) {
            this.f16770y = j10;
        }
        return this.f16770y;
    }

    public void a(P3.a aVar) {
        this.f16765t = aVar;
    }

    public void a(List<String> list) {
        this.f16766u = list;
    }

    public void a(Map<String, String> map) {
        this.f16764s = map;
    }

    public void a(boolean z10) {
        this.f16767v = z10;
    }

    public void b(long j10) {
        if (this.f16770y == 0) {
            this.f16770y = j10;
        }
    }

    public void b(List<String> list) {
        this.f16761p = list;
    }

    public void b(boolean z10) {
        this.f16768w = z10;
    }

    public void c(List<String> list) {
        this.f16760o = list;
    }

    public void h(String str) {
        this.f16769x = str;
    }

    @Override // com.yandex.metrica.impl.ob.C1662gh
    public String toString() {
        StringBuilder sbA = defpackage.a.a("StartupRequestConfig{mStartupHostsFromStartup=");
        sbA.append(this.f16760o);
        sbA.append(", mStartupHostsFromClient=");
        sbA.append(this.f16761p);
        sbA.append(", mDistributionReferrer='");
        l1.c.a(sbA, this.f16762q, CoreConstants.SINGLE_QUOTE_CHAR, ", mInstallReferrerSource='");
        l1.c.a(sbA, this.f16763r, CoreConstants.SINGLE_QUOTE_CHAR, ", mClidsFromClient=");
        sbA.append(this.f16764s);
        sbA.append(", mNewCustomHosts=");
        sbA.append(this.f16766u);
        sbA.append(", mHasNewCustomHosts=");
        sbA.append(this.f16767v);
        sbA.append(", mSuccessfulStartup=");
        sbA.append(this.f16768w);
        sbA.append(", mCountryInit='");
        l1.c.a(sbA, this.f16769x, CoreConstants.SINGLE_QUOTE_CHAR, ", mFirstStartupTime=");
        sbA.append(this.f16770y);
        sbA.append(", mReferrerHolder=");
        sbA.append(this.f16771z);
        sbA.append("} ");
        sbA.append(super.toString());
        return sbA.toString();
    }
}
