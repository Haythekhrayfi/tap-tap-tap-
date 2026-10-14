package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kl1 extends zc0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pg1<ImageView, j20> f22443c;

    public kl1(MediaView mediaView, r20 r20Var, k2 k2Var) {
        super(mediaView, k2Var);
        this.f22443c = new pg1<>(r20Var);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(View view) {
        this.f22443c.a();
        super.a((MediaView) view);
    }

    @Override // com.yandex.mobile.ads.impl.og1
    public final void a(qa qaVar, rg1 rg1Var, vc0 vc0Var) {
        vc0 vc0Var2 = vc0Var;
        j20 j20Var = null;
        List<j20> listA = vc0Var2 != null ? vc0Var2.a() : null;
        if (listA != null && !listA.isEmpty()) {
            j20Var = listA.get(0);
        }
        this.f22443c.a(qaVar, rg1Var, j20Var);
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final void a(vc0 vc0Var) {
        List<j20> listA = vc0Var.a();
        j20 j20Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        if (j20Var != null) {
            this.f22443c.b(j20Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    /* JADX INFO: renamed from: a */
    public final void b(MediaView mediaView, vc0 vc0Var) {
        super.b(mediaView, vc0Var);
        List<j20> listA = vc0Var.a();
        j20 j20Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        if (j20Var != null) {
            this.f22443c.b(j20Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.og1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean a(MediaView mediaView, vc0 vc0Var) {
        List<j20> listA = vc0Var.a();
        j20 j20Var = (listA == null || listA.isEmpty()) ? null : listA.get(0);
        if (j20Var != null) {
            return this.f22443c.a(j20Var);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.zc0
    public final int c() {
        return 4;
    }
}
