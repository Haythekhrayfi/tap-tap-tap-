package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.fullscreen.template.view.ExtendedViewContainer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f23240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u7 f23242c = new u7();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r7 f23243d;

    public n7(Context context, v7 v7Var) {
        this.f23241b = context;
        this.f23240a = v7Var;
        this.f23243d = new r7(context);
    }

    @SuppressLint({"InflateParams"})
    public final ViewGroup a() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f23241b).inflate(R.layout.yandex_ads_internal_adtune_container, (ViewGroup) null);
        Objects.requireNonNull(this.f23242c);
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer) viewGroup.findViewById(R.id.adtune_content_container);
        if (extendedViewContainer != null) {
            extendedViewContainer.setMeasureSpecProvider(this.f23243d);
        }
        Objects.requireNonNull(this.f23242c);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.adtune_webview_container);
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f23240a);
        }
        return viewGroup;
    }
}
