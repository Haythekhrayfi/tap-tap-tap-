package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ca0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f19431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2 f19432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v50 f19433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x90 f19434d;

    public ca0(Context context, InstreamAd instreamAd) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        fd.j0.i(instreamAd, "instreamAd");
        this.f19431a = new c2();
        this.f19432b = new d2();
        v50 v50VarA = c60.a(instreamAd);
        fd.j0.h(v50VarA, "videoAdProvider.getInstreamVideoAd(instreamAd)");
        this.f19433c = v50VarA;
        this.f19434d = new x90(context, v50VarA);
    }

    public final ArrayList a(String str) {
        d2 d2Var = this.f19432b;
        List<w50> adBreaks = this.f19433c.getAdBreaks();
        Objects.requireNonNull(d2Var);
        ArrayList arrayListA = d2.a(adBreaks);
        fd.j0.h(arrayListA, "adBreaksSorter.sortAdBre…instreamVideoAd.adBreaks)");
        Objects.requireNonNull(this.f19431a);
        ArrayList arrayListA2 = c2.a(str, arrayListA);
        ArrayList arrayList = new ArrayList(kc.m.j(arrayListA2, 10));
        Iterator it = arrayListA2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f19434d.a((w50) it.next()));
        }
        return arrayList;
    }
}
