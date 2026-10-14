package com.yandex.mobile.ads.instream.player.ad;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.fc1;

/* JADX INFO: loaded from: classes3.dex */
public class InstreamAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private fc1 f27502a;

    public InstreamAdView(Context context) {
        super(context);
    }

    public InstreamAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstreamAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public InstreamAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public final fc1 a() {
        return this.f27502a;
    }

    public final void a(fc1 fc1Var) {
        this.f27502a = fc1Var;
    }
}
