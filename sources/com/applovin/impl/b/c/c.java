package com.applovin.impl.b.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Button f8787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Button f8788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScrollView f8789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinearLayout f8790d;

    public c(Context context, com.applovin.impl.b.a.h hVar) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.applovin_consent_flow_gdpr_are_you_sure_screen, (ViewGroup) this, true);
        this.f8787a = (Button) viewInflate.findViewById(R.id.back_button);
        this.f8788b = (Button) viewInflate.findViewById(R.id.understand_and_confirm_button);
        this.f8789c = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
        this.f8790d = (LinearLayout) viewInflate.findViewById(R.id.controls_view);
    }

    public Button getBackButton() {
        return this.f8787a;
    }

    @Override // com.applovin.impl.b.c.d
    public ViewGroup getControlsView() {
        return this.f8790d;
    }

    @Override // com.applovin.impl.b.c.d
    public ScrollView getScrollView() {
        return this.f8789c;
    }

    public Button getUnderstandAndConfirmButton() {
        return this.f8788b;
    }
}
