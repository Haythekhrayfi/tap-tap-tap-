package com.yandex.metrica.impl.ob;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public enum Hi {
    UNKNOWN(0),
    NETWORK(1),
    PARSE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14154a;

    Hi(int i10) {
        this.f14154a = i10;
    }

    public Bundle a(Bundle bundle) {
        bundle.putInt("startup_error_key_code", this.f14154a);
        return bundle;
    }
}
