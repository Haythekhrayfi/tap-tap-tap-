package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pi1<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uh0 f24070a = new uh0();

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        Objects.requireNonNull(this.f24070a);
        TextView textView = (TextView) v10.findViewById(R.id.warning);
        if (textView != null) {
            textView.setSelected(true);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
