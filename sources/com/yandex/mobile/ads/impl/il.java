package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class il implements jl {
    @Override // com.yandex.mobile.ads.impl.jl
    public final List<hl> a(d10 d10Var) {
        fd.j0.i(d10Var, ImagesContract.URL);
        return kc.w.f32009c;
    }

    @Override // com.yandex.mobile.ads.impl.jl
    public final void a(d10 d10Var, List<hl> list) {
        fd.j0.i(d10Var, ImagesContract.URL);
        fd.j0.i(list, "cookies");
    }
}
