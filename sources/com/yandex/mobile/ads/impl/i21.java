package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class i21 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet f21577b = new HashSet(Arrays.asList(q61.f24325b, q61.f24324a));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.video.parser.offset.a f21578a = new com.yandex.mobile.ads.video.parser.offset.a(f21577b);

    public final p50 a(nl nlVar) {
        int iD = nlVar.d();
        j21 j21VarG = nlVar.g();
        if (j21VarG == null) {
            return null;
        }
        VastTimeOffset vastTimeOffsetA = this.f21578a.a(j21VarG.a());
        if (vastTimeOffsetA == null) {
            return null;
        }
        float fD = vastTimeOffsetA.d();
        if (VastTimeOffset.b.f28006b.equals(vastTimeOffsetA.c())) {
            fD = (long) ((fD / 100.0f) * iD);
        }
        return new p50((long) fD);
    }
}
