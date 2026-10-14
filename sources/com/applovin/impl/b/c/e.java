package com.applovin.impl.b.c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class e extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RelativeLayout f8791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f8792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f8793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.b.c.a f8794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f8795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f8796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8797g;

    public interface a {
        void a(boolean z10, boolean z11);
    }

    public e(final Activity activity, Bundle bundle, com.applovin.impl.b.a.h hVar, final o oVar, final a aVar) {
        super(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
        getWindow().setLayout(-1, -1);
        getWindow().setBackgroundDrawable(new ColorDrawable(getContext().getResources().getColor(R.color.transparent)));
        requestWindowFeature(1);
        setCancelable(false);
        g gVar = new g(getContext(), hVar);
        this.f8792b = gVar;
        gVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        gVar.getPrivacyPolicySwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.applovin.impl.b.c.e.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                e.this.f8792b.getContinueButton().setEnabled(z10);
            }
        });
        gVar.getContinueButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.c.e.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zIsChecked = e.this.f8792b.getPersonalizedAdvertisingSwitch().isChecked();
                boolean zIsChecked2 = e.this.f8792b.getAnalyticsPurposesSwitch().isChecked();
                if (zIsChecked && zIsChecked2) {
                    e.this.dismiss();
                    aVar.a(zIsChecked, zIsChecked2);
                } else {
                    e eVar = e.this;
                    eVar.a(eVar.f8793c, 4);
                }
            }
        });
        gVar.getLearnMoreButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.c.e.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f8796f, 1);
            }
        });
        String string = getContext().getString(com.applovin.sdk.R.string.applovin_gdpr_main_screen_personalized_advertising_purposes_switch_text);
        SpannableString spannableString = new SpannableString(string);
        StringUtils.addLinks(spannableString, Pattern.compile(string), new ClickableSpan() { // from class: com.applovin.impl.b.c.e.8
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f8794d, 2);
            }
        }, true);
        gVar.getPersonalizedAdvertisingSwitchTextView().setText(spannableString);
        gVar.getPersonalizedAdvertisingSwitchTextView().setMovementMethod(LinkMovementMethod.getInstance());
        String string2 = getContext().getString(com.applovin.sdk.R.string.applovin_gdpr_main_screen_analytics_purposes_switch_text);
        SpannableString spannableString2 = new SpannableString(string2);
        StringUtils.addLinks(spannableString2, Pattern.compile(string2), new ClickableSpan() { // from class: com.applovin.impl.b.c.e.9
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f8795e, 3);
            }
        }, true);
        gVar.getAnalyticsPurposesSwitchTextView().setText(spannableString2);
        gVar.getAnalyticsPurposesSwitchTextView().setMovementMethod(LinkMovementMethod.getInstance());
        final Uri uriE = oVar.aa().e();
        boolean z10 = uriE != null;
        SpannableString spannableString3 = new SpannableString(getContext().getString(z10 ? com.applovin.sdk.R.string.applovin_gdpr_main_screen_pp_and_tos_switch_text : com.applovin.sdk.R.string.applovin_gdpr_main_screen_privacy_policy_switch_text));
        Pattern patternCompile = Pattern.compile(getContext().getString(com.applovin.sdk.R.string.applovin_privacy_policy_text));
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.applovin.impl.b.c.e.10
            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                w.a(oVar.aa().d(), activity, oVar);
            }
        };
        StringUtils.addLinks(spannableString3, patternCompile, clickableSpan, true);
        String string3 = getContext().getString(com.applovin.sdk.R.string.applovin_alt_privacy_policy_text);
        if (AppLovinSdkUtils.isValidString(string3)) {
            StringUtils.addLinks(spannableString3, Pattern.compile(string3), clickableSpan, true);
        }
        if (z10) {
            StringUtils.addLinks(spannableString3, Pattern.compile(getContext().getString(com.applovin.sdk.R.string.applovin_terms_of_use_text)), new ClickableSpan() { // from class: com.applovin.impl.b.c.e.11
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    w.a(uriE, activity, oVar);
                }
            }, true);
        }
        gVar.getPrivacyPolicySwitchTextView().setText(spannableString3);
        gVar.getPrivacyPolicySwitchTextView().setMovementMethod(LinkMovementMethod.getInstance());
        Switch personalizedAdvertisingSwitch = gVar.getPersonalizedAdvertisingSwitch();
        com.applovin.impl.sdk.c.d<Boolean> dVar = com.applovin.impl.sdk.c.d.f10402t;
        Boolean bool = Boolean.TRUE;
        personalizedAdvertisingSwitch.setChecked(((Boolean) oVar.b(dVar, bool)).booleanValue());
        gVar.getAnalyticsPurposesSwitch().setChecked(((Boolean) oVar.b(com.applovin.impl.sdk.c.d.f10403u, bool)).booleanValue());
        gVar.getPrivacyPolicySwitch().setChecked(((Boolean) oVar.b(com.applovin.impl.sdk.c.d.f10404v, bool)).booleanValue());
        c cVar = new c(getContext(), hVar);
        this.f8793c = cVar;
        cVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        cVar.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.c.e.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f8793c);
            }
        });
        cVar.getUnderstandAndConfirmButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.c.e.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zIsChecked = e.this.f8792b.getPersonalizedAdvertisingSwitch().isChecked();
                boolean zIsChecked2 = e.this.f8792b.getAnalyticsPurposesSwitch().isChecked();
                e.this.dismiss();
                aVar.a(zIsChecked, zIsChecked2);
            }
        });
        com.applovin.impl.b.c.a aVar2 = new com.applovin.impl.b.c.a(activity, hVar, oVar);
        this.f8794d = aVar2;
        aVar2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        aVar2.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.c.e.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f8794d);
            }
        });
        b bVar = new b(activity, hVar, oVar);
        this.f8795e = bVar;
        bVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        bVar.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.c.e.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f8795e);
            }
        });
        f fVar = new f(getContext(), hVar);
        this.f8796f = fVar;
        fVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        fVar.getBackButton().setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.b.c.e.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e eVar = e.this;
                eVar.a(eVar.f8796f);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        gVar.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f8791a = relativeLayout;
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        relativeLayout.addView(gVar);
        this.f8797g = 0;
        a(bundle);
    }

    private View a(int i10) {
        if (i10 == 0) {
            return this.f8792b;
        }
        if (i10 == 1) {
            return this.f8796f;
        }
        if (i10 == 2) {
            return this.f8794d;
        }
        return i10 == 3 ? this.f8795e : this.f8793c;
    }

    private void a(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int i10 = bundle.getInt("current_showing_view_id");
        if (i10 != 0) {
            a(a(i10), i10);
        }
        this.f8792b.getPersonalizedAdvertisingSwitch().setChecked(bundle.getBoolean("advertising_partners_switch_state"));
        this.f8792b.getAnalyticsPurposesSwitch().setChecked(bundle.getBoolean("analytics_partners_switch_state"));
        this.f8792b.getPrivacyPolicySwitch().setChecked(bundle.getBoolean("privacy_policy_switch_state"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        this.f8791a.removeView(view);
        this.f8797g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, int i10) {
        if (view.getParent() != null) {
            view.bringToFront();
        } else {
            this.f8791a.addView(view);
            this.f8797g = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Point pointA = com.applovin.impl.sdk.utils.h.a(getContext());
        boolean z10 = AppLovinSdkUtils.getOrientation(getContext()) == 1;
        double d10 = 0.1d;
        double d11 = 0.05d;
        if (true ^ AppLovinSdkUtils.isTablet(getContext())) {
            d10 = z10 ? 0.05d : 0.2d;
        } else if (z10) {
            d11 = 0.1d;
        } else {
            d11 = 0.075d;
        }
        int i10 = (int) (((double) pointA.x) * d10);
        int i11 = (int) (((double) pointA.y) * d11);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f8791a.getLayoutParams();
        layoutParams.setMargins(i10, i11, i10, i11);
        this.f8791a.setLayoutParams(layoutParams);
        this.f8792b.a();
        this.f8793c.a();
        this.f8796f.a();
        this.f8794d.a();
        this.f8795e.a();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("current_showing_view_id", this.f8797g);
        bundle.putBoolean("advertising_partners_switch_state", this.f8792b.getPersonalizedAdvertisingSwitch().isChecked());
        bundle.putBoolean("analytics_partners_switch_state", this.f8792b.getAnalyticsPurposesSwitch().isChecked());
        bundle.putBoolean("privacy_policy_switch_state", this.f8792b.getPrivacyPolicySwitch().isChecked());
        return bundle;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().getRootView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.applovin.impl.b.c.e.5
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if ((i10 == i14 && i12 == i16 && i13 == i17 && i11 == i15) ? false : true) {
                    e.this.b();
                }
            }
        });
        b();
        setContentView(this.f8791a);
    }
}
