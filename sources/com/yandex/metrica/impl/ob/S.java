package com.yandex.metrica.impl.ob;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class S extends C1744k0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HashMap<a, Integer> f14982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Pn<String> f14983r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Pn<String> f14984s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Pn<String> f14985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Pn<byte[]> f14986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Pn<String> f14987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Pn<String> f14988w;

    public enum a {
        NAME,
        VALUE,
        USER_INFO
    }

    public S(Im im) {
        this.f14982q = new HashMap<>();
        a(im);
    }

    public S(String str, String str2, int i10, int i11, Im im) {
        this.f14982q = new HashMap<>();
        a(im);
        this.f16512b = h(str);
        this.f16511a = g(str2);
        this.f16515e = i10;
        this.f16516f = i11;
    }

    public S(String str, String str2, int i10, Im im) {
        this(str, str2, i10, 0, im);
    }

    public S(byte[] bArr, String str, int i10, Im im) {
        this.f14982q = new HashMap<>();
        a(im);
        a(bArr);
        this.f16511a = g(str);
        this.f16515e = i10;
    }

    public static C1744k0 a(String str, Im im) {
        S s10 = new S(im);
        s10.f16515e = EnumC1745k1.EVENT_TYPE_SET_USER_PROFILE_ID.b();
        return super.d(s10.f14987v.a(str));
    }

    private void a(Im im) {
        this.f14983r = new Nn(1000, "event name", im);
        this.f14984s = new Mn(245760, "event value", im);
        this.f14985t = new Mn(1024000, "event extended value", im);
        this.f14986u = new Dn(245760, "event value bytes", im);
        this.f14987v = new Nn(200, "user profile id", im);
        this.f14988w = new Nn(10000, "UserInfo", im);
    }

    private void a(String str, String str2, a aVar) {
        if (C1694i.a(str, str2)) {
            this.f14982q.put(aVar, Integer.valueOf(O2.c(str).length - O2.c(str2).length));
        } else {
            this.f14982q.remove(aVar);
        }
        t();
    }

    private String g(String str) {
        String strA = this.f14983r.a(str);
        a(str, strA, a.NAME);
        return strA;
    }

    private String h(String str) {
        String strA = this.f14984s.a(str);
        a(str, strA, a.VALUE);
        return strA;
    }

    public static C1744k0 r() {
        C1744k0 c1744k0 = new C1744k0();
        c1744k0.f16515e = EnumC1745k1.EVENT_TYPE_SEND_USER_PROFILE.b();
        return c1744k0;
    }

    private void t() {
        this.f16518h = 0;
        for (Integer num : this.f14982q.values()) {
            this.f16518h = num.intValue() + this.f16518h;
        }
    }

    public S a(HashMap<a, Integer> map) {
        this.f14982q = map;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.C1744k0
    public final C1744k0 a(byte[] bArr) {
        byte[] bArrA = this.f14986u.a(bArr);
        a aVar = a.VALUE;
        if (bArr.length != bArrA.length) {
            this.f14982q.put(aVar, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.f14982q.remove(aVar);
        }
        t();
        return super.a(bArrA);
    }

    @Override // com.yandex.metrica.impl.ob.C1744k0
    public C1744k0 b(String str) {
        String strA = this.f14983r.a(str);
        a(str, strA, a.NAME);
        this.f16511a = strA;
        return this;
    }

    @Override // com.yandex.metrica.impl.ob.C1744k0
    public C1744k0 d(String str) {
        return super.d(this.f14987v.a(str));
    }

    @Override // com.yandex.metrica.impl.ob.C1744k0
    public C1744k0 e(String str) {
        String strA = this.f14988w.a(str);
        a(str, strA, a.USER_INFO);
        return super.e(strA);
    }

    @Override // com.yandex.metrica.impl.ob.C1744k0
    public C1744k0 f(String str) {
        String strA = this.f14984s.a(str);
        a(str, strA, a.VALUE);
        this.f16512b = strA;
        return this;
    }

    public S i(String str) {
        String strA = this.f14985t.a(str);
        a(str, strA, a.VALUE);
        this.f16512b = strA;
        return this;
    }

    public HashMap<a, Integer> s() {
        return this.f14982q;
    }
}
