package com.yandex.mobile.ads.impl;

import android.location.Location;

/* JADX INFO: loaded from: classes3.dex */
final class n90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23308a;

    public n90(Object obj) {
        this.f23308a = obj;
    }

    public final Location a() {
        Object objA = iv0.a(this.f23308a, "getResult", new Object[0]);
        if (objA instanceof Location) {
            return (Location) objA;
        }
        return null;
    }

    public final boolean b() {
        Object objA = iv0.a(this.f23308a, "isComplete", new Object[0]);
        if (objA instanceof Boolean) {
            return ((Boolean) objA).booleanValue();
        }
        return false;
    }
}
