package com.yandex.mobile.ads.impl;

import android.view.View;
import com.google.android.exoplayer2.ui.AdOverlayInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class ks {
    public static qc1 a(AdOverlayInfo adOverlayInfo) {
        qc1.a aVar;
        fd.j0.i(adOverlayInfo, "adOverlayInfo");
        View view = adOverlayInfo.view;
        fd.j0.h(view, "adOverlayInfo.view");
        int i10 = adOverlayInfo.purpose;
        if (i10 == 1) {
            aVar = qc1.a.f24454a;
        } else if (i10 != 2) {
            aVar = i10 != 4 ? qc1.a.f24457d : qc1.a.f24456c;
        } else {
            aVar = qc1.a.f24455b;
        }
        return new qc1(view, aVar, adOverlayInfo.reasonDetail);
    }
}
