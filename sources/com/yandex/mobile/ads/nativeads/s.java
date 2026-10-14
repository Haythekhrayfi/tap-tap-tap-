package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.bh0;
import com.yandex.mobile.ads.impl.j20;
import com.yandex.mobile.ads.impl.le1;
import com.yandex.mobile.ads.impl.sc1;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.vl0;
import com.yandex.mobile.ads.impl.wa0;
import com.yandex.mobile.ads.impl.zb1;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final le1 f27822a = new le1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bh0 f27823b = new bh0();

    public final NativeAdMedia a(vc0 vc0Var) {
        if (vc0Var == null) {
            return null;
        }
        zb1 zb1VarC = vc0Var.c();
        wa0 wa0VarB = vc0Var.b();
        List<j20> listA = vc0Var.a();
        if (zb1VarC != null) {
            le1 le1Var = this.f27822a;
            sc1<vl0> sc1VarA = zb1VarC.a();
            Objects.requireNonNull(le1Var);
            vl0 vl0VarC = sc1VarA.c();
            return new NativeAdMedia(vl0VarC.getAdHeight() != 0 ? vl0VarC.getAdWidth() / vl0VarC.getAdHeight() : 1.7777778f);
        }
        if (listA != null && listA.size() > 1) {
            Objects.requireNonNull(this.f27823b);
            return new NativeAdMedia((float) bh0.a(listA));
        }
        if (wa0VarB != null) {
            return new NativeAdMedia(wa0VarB.a());
        }
        return null;
    }
}
