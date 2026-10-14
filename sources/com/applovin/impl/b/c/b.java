package com.applovin.impl.b.c;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Button f8784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinearLayout f8785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FrameLayout f8786c;

    public b(Activity activity, com.applovin.impl.b.a.h hVar, o oVar) {
        super(activity);
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.applovin_consent_flow_gdpr_phase_partners_screen, (ViewGroup) this, true);
        ((TextView) viewInflate.findViewById(R.id.title_textview)).setText(activity.getString(R.string.applovin_gdpr_analytics_partners_screen_title));
        ((TextView) viewInflate.findViewById(R.id.message_textview)).setText(activity.getString(R.string.applovin_gdpr_analytics_partners_screen_message));
        TextView textView = (TextView) viewInflate.findViewById(R.id.partner_links_textview);
        textView.setText(hVar.h());
        SpannableString spannableString = (SpannableString) textView.getText();
        for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(uRLSpan);
            int spanEnd = spannableString.getSpanEnd(uRLSpan);
            spannableString.removeSpan(uRLSpan);
            spannableString.setSpan(new h(uRLSpan.getURL(), activity, oVar), spanStart, spanEnd, 0);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f8784a = (Button) viewInflate.findViewById(R.id.back_button);
        this.f8785b = (LinearLayout) viewInflate.findViewById(R.id.partners_content_view);
        this.f8786c = (FrameLayout) viewInflate.findViewById(R.id.controls_view);
    }

    @Override // com.applovin.impl.b.c.d
    public void a() {
        super.a();
        ((FrameLayout.LayoutParams) this.f8785b.getLayoutParams()).bottomMargin = getResources().getDimensionPixelSize(R.dimen.applovin_sdk_consentFlowGdprControlsViewHeight);
    }

    public Button getBackButton() {
        return this.f8784a;
    }

    @Override // com.applovin.impl.b.c.d
    public ViewGroup getControlsView() {
        return this.f8786c;
    }

    @Override // com.applovin.impl.b.c.d
    public ScrollView getScrollView() {
        return null;
    }
}
