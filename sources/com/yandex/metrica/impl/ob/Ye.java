package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Ye {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Map<N0, Integer> f15575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Ye f15576h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1610ef f15577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1809mf f15578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Ve f15579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Ze f15580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC1585df f15581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC1635ff f15582f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InterfaceC1610ef f15583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC1809mf f15584b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Ve f15585c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Ze f15586d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private InterfaceC1585df f15587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private InterfaceC1635ff f15588f;

        private b(Ye ye) {
            this.f15583a = ye.f15577a;
            this.f15584b = ye.f15578b;
            this.f15585c = ye.f15579c;
            this.f15586d = ye.f15580d;
            this.f15587e = ye.f15581e;
            this.f15588f = ye.f15582f;
        }

        public b a(Ve ve2) {
            this.f15585c = ve2;
            return this;
        }

        public b a(Ze ze) {
            this.f15586d = ze;
            return this;
        }

        public b a(InterfaceC1585df interfaceC1585df) {
            this.f15587e = interfaceC1585df;
            return this;
        }

        public b a(InterfaceC1610ef interfaceC1610ef) {
            this.f15583a = interfaceC1610ef;
            return this;
        }

        public b a(InterfaceC1635ff interfaceC1635ff) {
            this.f15588f = interfaceC1635ff;
            return this;
        }

        public b a(InterfaceC1809mf interfaceC1809mf) {
            this.f15584b = interfaceC1809mf;
            return this;
        }

        public Ye a() {
            return new Ye(this);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(N0.FIRST_OCCURRENCE, 1);
        map.put(N0.NON_FIRST_OCCURENCE, 0);
        map.put(N0.UNKNOWN, -1);
        f15575g = Collections.unmodifiableMap(map);
        f15576h = new Ye(new C1734jf(), new C1759kf(), new C1660gf(), new Cif(), new C1510af(), new C1535bf());
    }

    private Ye(b bVar) {
        this(bVar.f15583a, bVar.f15584b, bVar.f15585c, bVar.f15586d, bVar.f15587e, bVar.f15588f);
    }

    private Ye(InterfaceC1610ef interfaceC1610ef, InterfaceC1809mf interfaceC1809mf, Ve ve2, Ze ze, InterfaceC1585df interfaceC1585df, InterfaceC1635ff interfaceC1635ff) {
        this.f15577a = interfaceC1610ef;
        this.f15578b = interfaceC1809mf;
        this.f15579c = ve2;
        this.f15580d = ze;
        this.f15581e = interfaceC1585df;
        this.f15582f = interfaceC1635ff;
    }

    public static b a() {
        return new b();
    }

    public static Ye b() {
        return f15576h;
    }

    public Vf.d.a a(Xe xe2, C1736jh c1736jh) {
        Vf.d.a.C0178a c0178a;
        int iA;
        Vf.d.a aVar = new Vf.d.a();
        Vf.d.a.b bVarA = this.f15582f.a(xe2.f15498o, xe2.f15499p, xe2.f15492i, xe2.f15491h);
        Vf.b bVarA2 = this.f15581e.a(xe2.f15490g);
        String str = xe2.f15496m;
        try {
            if (TextUtils.isEmpty(str)) {
                c0178a = null;
            } else {
                com.yandex.metrica.i iVarA = C1694i.a(str);
                c0178a = new Vf.d.a.C0178a();
                if (!TextUtils.isEmpty(iVarA.f13583a)) {
                    c0178a.f15296b = iVarA.f13583a;
                }
                if (!TextUtils.isEmpty(iVarA.f13584b)) {
                    c0178a.f15297c = iVarA.f13584b;
                }
                if (!U2.b(iVarA.f13585c)) {
                    c0178a.f15298d = C2120ym.g(iVarA.f13585c);
                }
            }
        } catch (Throwable unused) {
        }
        if (bVarA != null) {
            aVar.f15279h = bVarA;
        }
        if (bVarA2 != null) {
            aVar.f15278g = bVarA2;
        }
        String strA = this.f15577a.a(xe2.f15484a);
        if (strA != null) {
            aVar.f15276e = strA;
        }
        aVar.f15277f = this.f15578b.a(xe2, c1736jh);
        String str2 = xe2.f15495l;
        if (str2 != null) {
            aVar.f15280i = str2;
        }
        if (c0178a != null) {
            aVar.f15281j = c0178a;
        }
        Integer numA = this.f15580d.a(xe2);
        if (numA != null) {
            aVar.f15275d = numA.intValue();
        }
        Integer num = xe2.f15486c;
        if (num != null) {
            aVar.f15273b = num.intValue();
        }
        Integer num2 = xe2.f15487d;
        if (num2 != null) {
            aVar.f15287p = num2.intValue();
        }
        Integer num3 = xe2.f15488e;
        if (num3 != null) {
            aVar.f15288q = num3.intValue();
        }
        Long l10 = xe2.f15489f;
        if (l10 != null) {
            aVar.f15274c = l10.longValue();
        }
        Integer num4 = xe2.f15497n;
        if (num4 != null) {
            aVar.f15282k = num4.intValue();
        }
        aVar.f15283l = this.f15579c.a(xe2.f15501r);
        String str3 = xe2.f15490g;
        if (str3 != null) {
            try {
                iA = new C1975t7().a(Boolean.valueOf(new C2120ym.a(str3).getBoolean("enabled")));
            } catch (Throwable unused2) {
                iA = -1;
            }
        } else {
            iA = -1;
        }
        aVar.f15284m = iA;
        String str4 = xe2.f15500q;
        if (str4 != null) {
            aVar.f15285n = str4.getBytes();
        }
        N0 n10 = xe2.f15502s;
        Integer num5 = n10 != null ? f15575g.get(n10) : null;
        if (num5 != null) {
            aVar.f15286o = num5.intValue();
        }
        M.b.a aVar2 = xe2.f15503t;
        if (aVar2 != null) {
            aVar.f15289r = C1572d2.a(aVar2);
        }
        Wc.a aVar3 = xe2.f15504u;
        int iA2 = aVar3 != null ? C1572d2.a(aVar3) : 3;
        Integer num6 = xe2.f15505v;
        if (num6 != null) {
            aVar.f15291t = num6.intValue();
        }
        aVar.f15290s = iA2;
        Integer num7 = xe2.f15506w;
        aVar.f15292u = num7 == null ? 0 : num7.intValue();
        I0 i10 = xe2.f15507x;
        if (i10 != null) {
            aVar.f15293v = i10.f14171a;
        }
        Boolean bool = xe2.f15508y;
        if (bool != null) {
            aVar.f15294w = bool.booleanValue();
        }
        Integer num8 = xe2.f15509z;
        if (num8 != null) {
            aVar.f15295x = num8.intValue();
        }
        return aVar;
    }
}
