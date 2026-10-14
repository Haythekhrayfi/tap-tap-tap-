package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class Id {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cc f14212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Hd f14213b;

    public Id(Cc cc2, Hd hd2) {
        this.f14212a = cc2;
        this.f14213b = hd2;
    }

    public Uf.a a(long j10, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Tc tcA = this.f14212a.a(j10, str);
                if (tcA != null) {
                    return this.f14213b.a(tcA);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
