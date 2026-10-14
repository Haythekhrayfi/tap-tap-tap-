package com.yandex.metrica.impl.ob;

import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: loaded from: classes.dex */
public enum Qm {
    LOGIN(AppLovinEventTypes.USER_LOGGED_IN),
    LOGOUT("logout"),
    SWITCH("switch"),
    UPDATE("update");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14827a;

    Qm(String str) {
        this.f14827a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14827a;
    }
}
