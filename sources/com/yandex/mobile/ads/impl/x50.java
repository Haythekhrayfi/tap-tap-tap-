package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r30 f26425b = new r30();

    public x50(Context context) {
        this.f26424a = context.getApplicationContext();
    }

    public final w50 a(q1 q1Var, List<ac1> list) {
        InstreamAdBreakPosition instreamAdBreakPositionA;
        String strC = q1Var.c();
        if (strC == null || (instreamAdBreakPositionA = this.f26425b.a(q1Var.f())) == null) {
            return null;
        }
        long jA = q10.a();
        ArrayList arrayListA = new vc1(this.f26424a, new b60(instreamAdBreakPositionA, jA)).a(list);
        if (arrayListA.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            arrayList.add((VideoAd) ((sc1) it.next()).c());
        }
        return new w50(arrayListA, strC, q1Var, instreamAdBreakPositionA, jA);
    }
}
