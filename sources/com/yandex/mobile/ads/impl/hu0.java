package com.yandex.mobile.ads.impl;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hu0 implements wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wf.a<hu0> f21511a = dp1.f19955n;

    /* JADX INFO: Access modifiers changed from: private */
    public static hu0 a(Bundle bundle) {
        wf.a aVar;
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        if (i10 == 0) {
            aVar = ty.f25515d;
        } else if (i10 == 1) {
            aVar = bq0.f19309c;
        } else if (i10 == 2) {
            aVar = k41.f22251d;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(u60.a("Unknown RatingType: ", i10));
            }
            aVar = o61.f23703d;
        }
        return (hu0) aVar.fromBundle(bundle);
    }
}
