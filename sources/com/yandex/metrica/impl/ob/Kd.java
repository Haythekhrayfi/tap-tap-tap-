package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class Kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cc f14351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Jd f14352b;

    public Kd(Cc cc2, Jd jd2) {
        this.f14351a = cc2;
        this.f14352b = jd2;
    }

    public Uf.b a(long j10, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C1882pd c1882pdB = this.f14351a.b(j10, str);
                if (c1882pdB != null) {
                    return this.f14352b.a(c1882pdB);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
