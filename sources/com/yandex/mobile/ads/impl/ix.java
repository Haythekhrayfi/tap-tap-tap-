package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ix<K, L> implements lw0<K, gx<L>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kt<t81<?>> f21837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f21838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedHashMap f21839d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21840a;

        static {
            int[] iArr = new int[z3.values().length];
            iArr[1] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            f21840a = iArr;
        }
    }

    public /* synthetic */ ix(Long l10) {
        this(l10, 3, new u81());
    }

    public ix(Long l10, int i10, kt<t81<?>> ktVar) {
        fd.j0.i(ktVar, "expiredChecker");
        this.f21836a = i10;
        this.f21837b = ktVar;
        this.f21838c = l10 != null ? l10.longValue() : 86400000L;
        this.f21839d = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.lw0
    public final gx a(fx fxVar) {
        LinkedHashMap linkedHashMap = this.f21839d;
        kt<t81<?>> ktVar = this.f21837b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (ktVar.a((t81) entry.getValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            this.f21839d.remove(entry2.getKey());
            ((gx) ((t81) entry2.getValue()).b()).c();
        }
        t81 t81Var = (t81) this.f21839d.remove(fxVar);
        if (t81Var != null) {
            return (gx) t81Var.b();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.lw0
    public final void a(fx fxVar, gx gxVar) {
        Object obj;
        fd.j0.i(gxVar, "value");
        if (this.f21839d.size() == this.f21836a) {
            Iterator it = this.f21839d.entrySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long jA = ((t81) ((Map.Entry) next).getValue()).a();
                    do {
                        Object next2 = it.next();
                        long jA2 = ((t81) ((Map.Entry) next2).getValue()).a();
                        if (jA > jA2) {
                            next = next2;
                            jA = jA2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null) {
                this.f21839d.remove(entry.getKey());
                ((gx) ((t81) entry.getValue()).b()).c();
            }
        }
        this.f21839d.put(fxVar, t81.a.a(gxVar, this.f21838c));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.lw0
    public final boolean b(fx fxVar) {
        gx gxVar;
        LinkedHashMap linkedHashMap = this.f21839d;
        kt<t81<?>> ktVar = this.f21837b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (ktVar.a((t81) entry.getValue())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            this.f21839d.remove(entry2.getKey());
            ((gx) ((t81) entry2.getValue()).b()).c();
        }
        t81 t81Var = (t81) this.f21839d.get(fxVar);
        z3 z3VarD = (t81Var == null || (gxVar = (gx) t81Var.b()) == null) ? null : gxVar.d();
        int i10 = z3VarD == null ? -1 : a.f21840a[z3VarD.ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // com.yandex.mobile.ads.impl.lw0
    public final void clear() {
        Iterator it = this.f21839d.values().iterator();
        while (it.hasNext()) {
            ((gx) ((t81) it.next()).b()).c();
        }
        this.f21839d.clear();
    }
}
