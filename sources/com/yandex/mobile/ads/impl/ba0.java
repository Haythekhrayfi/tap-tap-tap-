package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ba0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ca0 f19153a;

    public ba0(Context context, InstreamAd instreamAd) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(instreamAd, "instreamAd");
        this.f19153a = new ca0(context, instreamAd);
    }

    public final aa0 a(v90 v90Var, String str) {
        fd.j0.i(v90Var, "manualAdBreakFactory");
        ArrayList arrayListA = this.f19153a.a(str);
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayDeque.add(v90Var.a((w90) it.next()));
        }
        return new aa0(arrayDeque);
    }
}
