package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class W4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map<Integer, Integer> f15371h = Collections.unmodifiableMap(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1744k0 f15372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final X4 f15373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Z4 f15374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Mn f15375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Mn f15376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Om f15377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1699i4 f15378g;

    public class a extends HashMap<Integer, Integer> {
        public a() {
            put(Integer.valueOf(EnumC1745k1.EVENT_TYPE_DIAGNOSTIC.b()), 22);
            put(Integer.valueOf(EnumC1745k1.EVENT_TYPE_DIAGNOSTIC_STATBOX.b()), 23);
            put(Integer.valueOf(EnumC1745k1.EVENT_TYPE_DIAGNOSTIC_DISABLE_STAT_SENDING.b()), 24);
            put(Integer.valueOf(EnumC1745k1.EVENT_TYPE_APPMETRICA_DIAGNOSTICS.b()), 24);
        }
    }

    public static class b {
    }

    public W4(C1744k0 c1744k0, X4 x10, Z4 z10, C1699i4 c1699i4, Mn mn, Mn mn2, Om om) {
        this.f15372a = c1744k0;
        this.f15373b = x10;
        this.f15374c = z10;
        this.f15378g = c1699i4;
        this.f15376e = mn;
        this.f15375d = mn2;
        this.f15377f = om;
    }

    public byte[] a() {
        Vf vf = new Vf();
        Vf.d dVar = new Vf.d();
        vf.f15235b = new Vf.d[]{dVar};
        Z4.a aVarA = this.f15374c.a();
        dVar.f15269b = aVarA.f15630a;
        Vf.d.b bVar = new Vf.d.b();
        dVar.f15270c = bVar;
        bVar.f15305d = 2;
        bVar.f15303b = new Vf.f();
        Vf.f fVar = dVar.f15270c.f15303b;
        long j10 = aVarA.f15631b;
        fVar.f15311b = j10;
        fVar.f15312c = C1694i.a(j10);
        dVar.f15270c.f15304c = this.f15373b.l();
        Vf.d.a aVar = new Vf.d.a();
        dVar.f15271d = new Vf.d.a[]{aVar};
        aVar.f15273b = aVarA.f15632c;
        aVar.f15288q = this.f15378g.a(this.f15372a.n());
        aVar.f15274c = this.f15377f.b() - aVarA.f15631b;
        aVar.f15275d = f15371h.get(Integer.valueOf(this.f15372a.n())).intValue();
        if (!TextUtils.isEmpty(this.f15372a.g())) {
            aVar.f15276e = this.f15376e.a(this.f15372a.g());
        }
        if (!TextUtils.isEmpty(this.f15372a.p())) {
            String strP = this.f15372a.p();
            String strA = this.f15375d.a(strP);
            if (!TextUtils.isEmpty(strA)) {
                aVar.f15277f = strA.getBytes();
            }
            int length = strP.getBytes().length;
            byte[] bArr = aVar.f15277f;
            aVar.f15282k = length - (bArr != null ? bArr.length : 0);
        }
        return AbstractC1594e.a(vf);
    }
}
