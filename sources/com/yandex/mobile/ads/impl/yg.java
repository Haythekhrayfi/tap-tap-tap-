package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class yg<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uh0 f26841a = new uh0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xg f26842b;

    public yg(Context context) {
        this.f26842b = new xg(context);
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        Objects.requireNonNull(this.f26841a);
        TextView textView = (TextView) v10.findViewById(R.id.call_to_action);
        if (textView != null) {
            this.f26842b.a(textView);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
        this.f26842b.a();
    }
}
