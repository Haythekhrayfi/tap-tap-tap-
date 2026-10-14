package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2M, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2M extends EB {
    public C2M(C1337Xw c1337Xw) {
        super(c1337Xw);
        setCarouselLayoutManager(c1337Xw);
    }

    public C1178Rp getFullscreenCarouselRecyclerViewAdapter() {
        if (getAdapter() instanceof C1178Rp) {
            return (C1178Rp) getAdapter();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.EB
    public C1364Yy getLayoutManager() {
        return (C1364Yy) super.getLayoutManager();
    }

    public AbstractC06104f getOnScrollListener() {
        return new TY(this);
    }

    private void setCarouselLayoutManager(C1337Xw c1337Xw) {
        C1364Yy c1364Yy = new C1364Yy(c1337Xw, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1364Yy.A1V(true);
        }
        super.setLayoutManager(c1364Yy);
    }

    @Override // com.facebook.ads.redexgen.X.EB
    public void setLayoutManager(AbstractC06054a abstractC06054a) {
    }
}
