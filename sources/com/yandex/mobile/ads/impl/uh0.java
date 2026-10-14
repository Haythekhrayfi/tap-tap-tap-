package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.MediaView;

/* JADX INFO: loaded from: classes3.dex */
public final class uh0 implements th0 {
    @Override // com.yandex.mobile.ads.impl.th0
    public final View a(View view, String str) {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView a(View view) {
        return (TextView) view.findViewById(R.id.body);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final MediaView b(View view) {
        return (MediaView) view.findViewById(R.id.media);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView c(View view) {
        return (TextView) view.findViewById(R.id.price);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView d(View view) {
        return (TextView) view.findViewById(R.id.call_to_action);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView e(View view) {
        return (TextView) view.findViewById(R.id.warning);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final ImageView f(View view) {
        return (ImageView) view.findViewById(R.id.favicon);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView g(View view) {
        return (TextView) view.findViewById(R.id.age);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final View h(View view) {
        return view.findViewById(R.id.rating);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView i(View view) {
        return (TextView) view.findViewById(R.id.title);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final ImageView j(View view) {
        return (ImageView) view.findViewById(R.id.feedback);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView k(View view) {
        return (TextView) view.findViewById(R.id.sponsored);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView l(View view) {
        return (TextView) view.findViewById(R.id.domain);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final ImageView m(View view) {
        return (ImageView) view.findViewById(R.id.icon);
    }

    @Override // com.yandex.mobile.ads.impl.th0
    public final TextView n(View view) {
        return (TextView) view.findViewById(R.id.review_count);
    }
}
