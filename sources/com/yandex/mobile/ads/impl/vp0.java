package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.MediationData;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediationData f26057b;

    public vp0(String str, MediationData mediationData) {
        fd.j0.i(mediationData, "mediationData");
        this.f26056a = str;
        this.f26057b = mediationData;
    }

    public final Map<String, String> a() {
        String str = this.f26056a;
        if (str == null || str.length() == 0) {
            Map<String, String> mapD = this.f26057b.d();
            fd.j0.h(mapD, "mediationData.passbackParameters");
            return mapD;
        }
        Map<String, String> mapD2 = this.f26057b.d();
        fd.j0.h(mapD2, "mediationData.passbackParameters");
        return kc.f0.g(mapD2, kc.e0.b(new jc.h("adf-resp_time", this.f26056a)));
    }
}
