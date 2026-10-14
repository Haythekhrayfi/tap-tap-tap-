package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r30 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashSet f24591b = new HashSet(Arrays.asList(q61.f24326c, q61.f24327d, q61.f24325b, q61.f24324a, q61.f24328e));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<VastTimeOffset.b, InstreamAdBreakPosition.Type> f24592c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.video.parser.offset.a f24593a = new com.yandex.mobile.ads.video.parser.offset.a(f24591b);

    public class a extends HashMap<VastTimeOffset.b, InstreamAdBreakPosition.Type> {
        public a() {
            put(VastTimeOffset.b.f28005a, InstreamAdBreakPosition.Type.MILLISECONDS);
            put(VastTimeOffset.b.f28006b, InstreamAdBreakPosition.Type.PERCENTS);
            put(VastTimeOffset.b.f28007c, InstreamAdBreakPosition.Type.POSITION);
        }
    }

    public final InstreamAdBreakPosition a(p61 p61Var) {
        VastTimeOffset vastTimeOffsetA = this.f24593a.a(p61Var.a());
        if (vastTimeOffsetA != null) {
            InstreamAdBreakPosition.Type type = (InstreamAdBreakPosition.Type) ((HashMap) f24592c).get(vastTimeOffsetA.c());
            if (type != null) {
                return new InstreamAdBreakPosition(type, (long) vastTimeOffsetA.d());
            }
        }
        return null;
    }
}
