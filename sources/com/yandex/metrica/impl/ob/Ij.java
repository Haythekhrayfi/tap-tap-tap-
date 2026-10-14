package com.yandex.metrica.impl.ob;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class Ij implements Cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F9 f14229a;

    public Ij(F9 f10) {
        this.f14229a = f10;
    }

    @Override // com.yandex.metrica.impl.ob.Cj
    public String a() {
        C1646g1 c1646g1T = this.f14229a.t();
        String str = !TextUtils.isEmpty(c1646g1T.f16160a) ? c1646g1T.f16160a : null;
        if (str != null) {
            return str;
        }
        String strM = this.f14229a.m(null);
        return !TextUtils.isEmpty(strM) ? strM : str;
    }
}
