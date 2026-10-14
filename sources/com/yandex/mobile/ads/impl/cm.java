package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cm implements wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19552a = 0;

    static {
        new cm(com.yandex.mobile.ads.embedded.guava.collect.p.i());
        yn1 yn1Var = yn1.f26950j;
    }

    public cm(List<am> list) {
        com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cm a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return new cm(parcelableArrayList == null ? com.yandex.mobile.ads.embedded.guava.collect.p.i() : xf.a(am.f18956s, parcelableArrayList));
    }
}
