package com.yandex.mobile.ads.nativeads;

import android.annotation.SuppressLint;
import com.yandex.mobile.ads.impl.oj0;
import com.yandex.mobile.ads.impl.qa;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends g {
    public n0(List<qa<?>> list, oj0 oj0Var) {
        super(list, oj0Var);
    }

    @Override // com.yandex.mobile.ads.nativeads.g
    @SuppressLint({"VisibleForTests"})
    public final boolean a(h0.b bVar, List<qa<?>> list) {
        Objects.requireNonNull(this.f27745b);
        return list == null || bVar.isValid(list);
    }
}
