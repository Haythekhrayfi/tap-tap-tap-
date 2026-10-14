package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class bz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Double> f12017a = new HashMap();

    public final synchronized double a(String str, cr crVar) {
        double d10;
        d10 = (((double) ((bs) crVar).f11976e) + 1.0d) / ((double) ((bs) crVar).f11977f);
        this.f12017a.put(str, Double.valueOf(d10));
        return d10;
    }

    public final synchronized void a(String str) {
        this.f12017a.put(str, Double.valueOf(0.0d));
    }

    public final synchronized double b(String str) {
        Double d10 = this.f12017a.get(str);
        if (d10 == null) {
            return 0.0d;
        }
        return d10.doubleValue();
    }
}
