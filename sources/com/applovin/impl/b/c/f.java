package com.applovin.impl.b.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Button f8818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScrollView f8819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FrameLayout f8820c;

    public f(Context context, com.applovin.impl.b.a.h hVar) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.applovin_consent_flow_gdpr_phase_learn_more_screen, (ViewGroup) this, true);
        ((TextView) viewInflate.findViewById(R.id.title_textview)).setText(hVar.f());
        this.f8818a = (Button) viewInflate.findViewById(R.id.back_button);
        this.f8819b = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
        this.f8820c = (FrameLayout) viewInflate.findViewById(R.id.controls_view);
    }

    public Button getBackButton() {
        return this.f8818a;
    }

    @Override // com.applovin.impl.b.c.d
    public ViewGroup getControlsView() {
        return this.f8820c;
    }

    @Override // com.applovin.impl.b.c.d
    public ScrollView getScrollView() {
        return this.f8819b;
    }
}
