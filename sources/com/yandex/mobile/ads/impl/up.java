package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.NativeAdView;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class up implements yo<NativeAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y9.l1 f25721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq f25722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tp f25723c;

    public up(Context context, y9.l1 l1Var, yh yhVar, uk ukVar) {
        this(l1Var, new mq(), new tp(context, yhVar, ukVar));
    }

    public up(y9.l1 l1Var, mq mqVar, tp tpVar) {
        this.f25721a = l1Var;
        this.f25722b = mqVar;
        this.f25723c = tpVar;
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void a(ViewGroup viewGroup) {
        NativeAdView nativeAdView = (NativeAdView) viewGroup;
        try {
            Context context = nativeAdView.getContext();
            Objects.requireNonNull(this.f25722b);
            i8.k kVarA = mq.a(context);
            nativeAdView.addView(kVarA);
            kVarA.y(this.f25721a, new o7.a(UUID.randomUUID().toString()));
            kVarA.setActionHandler(this.f25723c);
        } catch (Throwable unused) {
        }
    }

    @Override // com.yandex.mobile.ads.impl.yo
    public final void c() {
    }
}
