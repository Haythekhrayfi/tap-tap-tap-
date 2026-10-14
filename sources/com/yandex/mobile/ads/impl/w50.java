package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w50 implements InstreamAdBreak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<sc1<VideoAd>> f26175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q1 f26177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InstreamAdBreakPosition f26178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f26179e;

    public w50(ArrayList arrayList, String str, q1 q1Var, InstreamAdBreakPosition instreamAdBreakPosition, long j10) {
        this.f26175a = arrayList;
        this.f26176b = str;
        this.f26177c = q1Var;
        this.f26178d = instreamAdBreakPosition;
        this.f26179e = j10;
    }

    public final q1 a() {
        return this.f26177c;
    }

    public final void a(em emVar) {
    }

    public final em b() {
        return null;
    }

    public final List<sc1<VideoAd>> c() {
        return this.f26175a;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    public final InstreamAdBreakPosition getAdBreakPosition() {
        return this.f26178d;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    public final String getType() {
        return this.f26176b;
    }

    public final String toString() {
        StringBuilder sbA = v60.a("ad_break_#");
        sbA.append(this.f26179e);
        return sbA.toString();
    }
}
