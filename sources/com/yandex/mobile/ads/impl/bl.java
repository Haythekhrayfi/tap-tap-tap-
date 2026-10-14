package com.yandex.mobile.ads.impl;

import android.widget.FrameLayout;
import com.yandex.mobile.ads.base.AdResponse;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final si f19288a = new si();

    public final al a(FrameLayout frameLayout, AdResponse adResponse, um umVar, boolean z10, boolean z11) {
        Objects.requireNonNull(this.f19288a);
        ri riVarA = si.a(frameLayout, adResponse, umVar, z10);
        return z11 ? new ow(riVarA) : new hv(riVarA);
    }
}
