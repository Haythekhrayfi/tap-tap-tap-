package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ju0<V extends ViewGroup> implements yo<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NativeAdAssets f22155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ku0 f22156b = new ku0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final rh0 f22157c = new rh0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bi0 f22158d = new bi0();

    public ju0(NativeAdAssets nativeAdAssets) {
        this.f22155a = nativeAdAssets;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(V v10) {
        String strValueOf;
        Objects.requireNonNull(this.f22158d);
        ViewGroup viewGroup = (ViewGroup) v10.findViewById(R.id.rating_container);
        Float rating = this.f22155a.getRating();
        if (rating == null) {
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        Objects.requireNonNull(this.f22157c);
        TextView textView = (TextView) v10.findViewById(R.id.rating_text);
        if (textView != null) {
            ku0 ku0Var = this.f22156b;
            float fFloatValue = rating.floatValue();
            Objects.requireNonNull(ku0Var);
            try {
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(CoreConstants.COMMA_CHAR);
                strValueOf = new DecimalFormat("0.0", decimalFormatSymbols).format(fFloatValue);
            } catch (RuntimeException unused) {
                strValueOf = String.valueOf(fFloatValue);
            }
            textView.setText(strValueOf);
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
