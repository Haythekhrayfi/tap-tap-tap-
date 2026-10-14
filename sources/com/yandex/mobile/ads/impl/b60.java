package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b60 implements gd1<VideoAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i21 f19122a = new i21();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rc1 f19123b = new rc1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InstreamAdBreakPosition f19124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19125d;

    public b60(InstreamAdBreakPosition instreamAdBreakPosition, long j10) {
        this.f19124c = instreamAdBreakPosition;
        this.f19125d = j10;
    }

    @Override // com.yandex.mobile.ads.impl.gd1
    public final Object a(ac1 ac1Var, nl nlVar, vb0 vb0Var, rd1 rd1Var, String str, JSONObject jSONObject) {
        p50 p50VarA = this.f19122a.a(nlVar);
        l50 l50Var = new l50(this.f19124c, vb0Var.d(), vb0Var.f(), vb0Var.b());
        long jD = nlVar.d();
        rc1 rc1Var = this.f19123b;
        long j10 = this.f19125d;
        Objects.requireNonNull(rc1Var);
        return new u50(rc1.a(j10, rd1Var, ac1Var), l50Var, rd1Var, p50VarA, str, jSONObject, jD);
    }
}
