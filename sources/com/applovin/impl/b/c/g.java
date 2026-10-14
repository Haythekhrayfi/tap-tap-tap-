package com.applovin.impl.b.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class g extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f8821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f8822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f8823c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Switch f8824d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Switch f8825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Switch f8826f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Button f8827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Button f8828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ScrollView f8829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinearLayout f8830j;

    public g(Context context, com.applovin.impl.b.a.h hVar) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.applovin_consent_flow_gdpr_phase_main_screen, (ViewGroup) this, true);
        ((TextView) viewInflate.findViewById(R.id.title_textview)).setText(hVar.e());
        this.f8821a = (TextView) viewInflate.findViewById(R.id.personalized_advertising_switch_textview);
        this.f8822b = (TextView) viewInflate.findViewById(R.id.analytics_purposes_switch_textview);
        this.f8823c = (TextView) viewInflate.findViewById(R.id.privacy_policy_switch_textview);
        this.f8824d = (Switch) viewInflate.findViewById(R.id.personalized_advertising_switch);
        this.f8825e = (Switch) viewInflate.findViewById(R.id.analytics_purposes_switch);
        this.f8826f = (Switch) viewInflate.findViewById(R.id.privacy_policy_switch);
        this.f8827g = (Button) viewInflate.findViewById(R.id.continue_button);
        this.f8828h = (Button) viewInflate.findViewById(R.id.learn_more_button);
        this.f8829i = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
        this.f8830j = (LinearLayout) viewInflate.findViewById(R.id.controls_view);
    }

    public Switch getAnalyticsPurposesSwitch() {
        return this.f8825e;
    }

    public TextView getAnalyticsPurposesSwitchTextView() {
        return this.f8822b;
    }

    public Button getContinueButton() {
        return this.f8827g;
    }

    @Override // com.applovin.impl.b.c.d
    public ViewGroup getControlsView() {
        return this.f8830j;
    }

    public Button getLearnMoreButton() {
        return this.f8828h;
    }

    public Switch getPersonalizedAdvertisingSwitch() {
        return this.f8824d;
    }

    public TextView getPersonalizedAdvertisingSwitchTextView() {
        return this.f8821a;
    }

    public Switch getPrivacyPolicySwitch() {
        return this.f8826f;
    }

    public TextView getPrivacyPolicySwitchTextView() {
        return this.f8823c;
    }

    @Override // com.applovin.impl.b.c.d
    public ScrollView getScrollView() {
        return this.f8829i;
    }
}
