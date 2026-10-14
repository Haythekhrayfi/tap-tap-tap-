package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public class Ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Kn f14435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Jn f14436b;

    public Ln(Im im, String str) {
        this(new Kn(30, 50, 4000, str, im), new Jn(4500, str, im));
    }

    public Ln(Kn kn, Jn jn) {
        this.f14435a = kn;
        this.f14436b = jn;
    }

    public synchronized boolean a(Gm gm, String str, String str2) {
        boolean z10;
        if (gm.size() >= this.f14435a.a().a() && (this.f14435a.a().a() != gm.size() || !gm.containsKey(str))) {
            this.f14435a.a(str);
        } else if (this.f14436b.a(gm, str, str2)) {
            this.f14436b.a(str);
        } else {
            gm.put(str, str2);
            z10 = true;
        }
        z10 = false;
        return z10;
    }

    public boolean b(Gm gm, String str, String str2) {
        if (gm == null) {
            return false;
        }
        String strA = this.f14435a.b().a(str);
        String strA2 = this.f14435a.c().a(str2);
        if (!gm.containsKey(strA)) {
            if (strA2 != null) {
                return a(gm, strA, strA2);
            }
            return false;
        }
        String str3 = gm.get(strA);
        if (strA2 == null || !strA2.equals(str3)) {
            return a(gm, strA, strA2);
        }
        return false;
    }
}
