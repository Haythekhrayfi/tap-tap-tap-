package com.applovin.impl.b.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.sdk.AppLovinCFErrorImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f8701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<d> f8703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AppLovinCFService.OnCFCompletionCallback f8705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f8706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Dialog f8707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.utils.a f8708h = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.b.a.i.1
        @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Bundle bundleA;
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || i.this.f8706f == null) {
                return;
            }
            if (i.this.f8707g != null) {
                bundleA = i.this.f8707g instanceof com.applovin.impl.b.c.e ? ((com.applovin.impl.b.c.e) i.this.f8707g).a() : null;
                i.this.f8707g.dismiss();
                i.this.f8707g = null;
            } else {
                bundleA = null;
            }
            d dVar = i.this.f8706f;
            i.this.f8706f = null;
            i.this.a(dVar, bundleA, activity);
        }
    };

    public i(o oVar) {
        this.f8701a = oVar;
        this.f8702b = ((Integer) oVar.a(com.applovin.impl.sdk.c.b.gX)).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d a(String str) {
        List<d> list = this.f8703c;
        if (list == null) {
            return null;
        }
        for (d dVar : list) {
            if (str.equalsIgnoreCase(dVar.a())) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, Activity activity) {
        a(dVar, (Bundle) null, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final d dVar, final Bundle bundle, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.i.2
            @Override // java.lang.Runnable
            public void run() {
                Uri uriD;
                Runnable runnable;
                i.this.f8701a.F();
                if (y.a()) {
                    y yVarF = i.this.f8701a.F();
                    StringBuilder sbA = defpackage.a.a("Transitioning to state: ");
                    sbA.append(dVar);
                    yVarF.b("AppLovinSdk", sbA.toString());
                }
                if (dVar.b() == d.a.ALERT) {
                    if (!com.applovin.impl.sdk.utils.b.a(activity)) {
                        e eVar = (e) dVar;
                        i.this.f8706f = eVar;
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                        builder.setCancelable(false);
                        for (final f fVar : eVar.g()) {
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.i.2.2
                                @Override // android.content.DialogInterface.OnClickListener
                                public void onClick(DialogInterface dialogInterface, int i10) {
                                    i.this.f8706f = null;
                                    i.this.f8707g = null;
                                    d dVarA = i.this.a(fVar.c());
                                    if (dVarA == null) {
                                        i.this.f8701a.F();
                                        if (y.a()) {
                                            i.this.f8701a.F().e("AppLovinSdk", "Consent flow failed to get destination state for TOS/PP alert. Finishing flow...");
                                        }
                                        i.this.b();
                                        return;
                                    }
                                    if ("12".equals(dVarA.a())) {
                                        i.this.f8701a.a(com.applovin.impl.sdk.c.d.f10400r, Boolean.FALSE);
                                    }
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    i.this.a(dVarA, activity);
                                    if (dVarA.b() != d.a.ALERT) {
                                        dialogInterface.dismiss();
                                    }
                                }
                            };
                            if (fVar.b() == f.a.POSITIVE) {
                                builder.setPositiveButton(fVar.a(), onClickListener);
                            } else {
                                f.a aVarB = fVar.b();
                                f.a aVar = f.a.NEGATIVE;
                                String strA = fVar.a();
                                if (aVarB == aVar) {
                                    builder.setNegativeButton(strA, onClickListener);
                                } else {
                                    builder.setNeutralButton(strA, onClickListener);
                                }
                            }
                        }
                        String strE = eVar.e();
                        SpannableString spannableString = null;
                        if (StringUtils.isValidString(strE)) {
                            spannableString = new SpannableString(strE);
                            String strA2 = o.a(R.string.applovin_terms_of_service_text);
                            String strA3 = o.a(R.string.applovin_privacy_policy_text);
                            if (StringUtils.containsAtLeastOneSubstring(strE, Arrays.asList(strA2, strA3))) {
                                final Uri uriE = i.this.f8701a.aa().e();
                                if (uriE != null) {
                                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new ClickableSpan() { // from class: com.applovin.impl.b.a.i.2.3
                                        @Override // android.text.style.ClickableSpan
                                        public void onClick(View view) {
                                            Uri uri = uriE;
                                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                            w.a(uri, activity, i.this.f8701a);
                                        }
                                    }, true);
                                }
                                final Uri uriD2 = i.this.f8701a.aa().d();
                                StringUtils.addLinks(spannableString, Pattern.compile(strA3), new ClickableSpan() { // from class: com.applovin.impl.b.a.i.2.4
                                    @Override // android.text.style.ClickableSpan
                                    public void onClick(View view) {
                                        Uri uri = uriD2;
                                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                        w.a(uri, activity, i.this.f8701a);
                                    }
                                }, true);
                            }
                        }
                        final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(eVar.f()).create();
                        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.b.a.i.2.5
                            @Override // android.content.DialogInterface.OnShowListener
                            public void onShow(DialogInterface dialogInterface) {
                                TextView textView = (TextView) alertDialogCreate.findViewById(alertDialogCreate.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
                                textView.setLinkTextColor(textView.getCurrentTextColor());
                                textView.setMovementMethod(LinkMovementMethod.getInstance());
                                textView.setMaxLines(i.this.f8702b);
                            }
                        });
                        i.this.f8707g = alertDialogCreate;
                        alertDialogCreate.show();
                        return;
                    }
                    runnable = new Runnable() { // from class: com.applovin.impl.b.a.i.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            i iVar = i.this;
                            iVar.a(dVar, iVar.f8701a.at());
                        }
                    };
                } else {
                    if (dVar.b() != d.a.GDPR_ALERT) {
                        if (dVar.b() == d.a.EVENT) {
                            g gVar = (g) dVar;
                            String strE2 = gVar.e();
                            Map<String, String> mapF = gVar.f();
                            if (mapF == null) {
                                mapF = new HashMap<>(1);
                            }
                            mapF.put("flow_type", i.this.f8701a.aa().c().a());
                            i.this.f8701a.x().trackEvent(strE2, mapF);
                            i.this.b(gVar, activity);
                            return;
                        }
                        if (dVar.b() == d.a.TERMS_OF_SERVICE) {
                            uriD = i.this.f8701a.aa().e();
                        } else {
                            if (dVar.b() != d.a.PRIVACY_POLICY) {
                                if (dVar.b() == d.a.HAS_USER_CONSENT) {
                                    i.this.a(true);
                                    i.this.b(dVar, activity);
                                    return;
                                } else {
                                    if (dVar.b() == d.a.REINIT) {
                                        i.this.b();
                                        return;
                                    }
                                    i.this.f8701a.F();
                                    if (y.a()) {
                                        i.this.f8701a.F().e("AppLovinSdk", "No destination consent flow state found!");
                                        return;
                                    }
                                    return;
                                }
                            }
                            uriD = i.this.f8701a.aa().d();
                        }
                        w.a(uriD, activity, i.this.f8701a);
                        return;
                    }
                    if (!com.applovin.impl.sdk.utils.b.a(activity)) {
                        com.applovin.impl.b.c.e eVar2 = new com.applovin.impl.b.c.e(activity, bundle, (h) dVar, i.this.f8701a, new com.applovin.impl.b.c.e.a() { // from class: com.applovin.impl.b.a.i.2.7
                            @Override // com.applovin.impl.b.c.e.a
                            public void a(boolean z10, boolean z11) {
                                i.this.f8701a.a(com.applovin.impl.sdk.c.d.f10402t, Boolean.valueOf(z10));
                                i.this.f8701a.a(com.applovin.impl.sdk.c.d.f10403u, Boolean.valueOf(z11));
                                i.this.f8701a.a(com.applovin.impl.sdk.c.d.f10404v, Boolean.TRUE);
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                d dVarA = i.this.a(dVar.d());
                                if (dVarA == null) {
                                    i.this.f8701a.F();
                                    if (y.a()) {
                                        i.this.f8701a.F().e("AppLovinSdk", "Consent flow failed to get destination state for GDPR alert. Finishing flow...");
                                    }
                                    i.this.b();
                                    return;
                                }
                                if ("13".equals(dVarA.a())) {
                                    i.this.f8701a.a(com.applovin.impl.sdk.c.d.f10400r, Boolean.FALSE);
                                    HashMap map = new HashMap(3);
                                    map.put("paa", String.valueOf(z10));
                                    map.put("apa", String.valueOf(z11));
                                    map.put("ppa", String.valueOf(true));
                                    ((g) dVarA).a(map);
                                }
                                i.this.a(z10 && z11);
                                i.this.b(false);
                                i.this.f8706f = null;
                                i.this.f8707g = null;
                                AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                                i.this.a(dVarA, activity);
                            }
                        });
                        i.this.f8706f = dVar;
                        i.this.f8707g = eVar2;
                        eVar2.show();
                        return;
                    }
                    runnable = new Runnable() { // from class: com.applovin.impl.b.a.i.2.6
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            i iVar = i.this;
                            iVar.a(dVar, iVar.f8701a.at());
                        }
                    };
                }
                AppLovinSdkUtils.runOnUiThreadDelayed(runnable, TimeUnit.SECONDS.toMillis(1L));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(d dVar, Activity activity) {
        a(a(dVar.d()), activity);
    }

    private d c() {
        for (d dVar : this.f8703c) {
            if (dVar.c()) {
                return dVar;
            }
        }
        return null;
    }

    private boolean d() {
        Iterator<d> it = this.f8703c.iterator();
        while (it.hasNext()) {
            d.a aVarB = it.next().b();
            if (aVarB == d.a.ALERT || aVarB == d.a.GDPR_ALERT) {
                return true;
            }
        }
        return false;
    }

    public void a(List<d> list, boolean z10, Activity activity, AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
        if (this.f8703c == null) {
            this.f8703c = list;
            this.f8704d = z10;
            this.f8705e = onCFCompletionCallback;
            this.f8701a.x().trackEvent("cf_start");
            o.a(activity).a(this.f8708h);
            if (!z10 && d()) {
                this.f8701a.a(com.applovin.impl.sdk.c.d.f10400r, Boolean.TRUE);
            }
            a(c(), activity);
            return;
        }
        this.f8701a.F();
        if (y.a()) {
            this.f8701a.F().b("AppLovinSdk", "Unable to start states: " + list);
        }
        this.f8701a.F();
        if (y.a()) {
            y yVarF = this.f8701a.F();
            StringBuilder sbA = defpackage.a.a("Consent flow already in progress for states: ");
            sbA.append(this.f8703c);
            yVarF.b("AppLovinSdk", sbA.toString());
        }
        onCFCompletionCallback.onFlowCompleted(new AppLovinCFErrorImpl(-200, "Consent flow is already in progress."));
    }

    public void a(boolean z10) {
        if (this.f8701a.aa().c() == c.a.TERMS) {
            return;
        }
        com.applovin.impl.b.a.b(z10, o.au());
    }

    public boolean a() {
        return this.f8703c != null;
    }

    public void b() {
        this.f8701a.F();
        if (y.a()) {
            this.f8701a.F().b("AppLovinSdk", "Reinitializing SDK and ending consent flow");
        }
        this.f8703c = null;
        this.f8701a.E().b(this.f8708h);
        AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback = this.f8705e;
        if (onCFCompletionCallback != null) {
            onCFCompletionCallback.onFlowCompleted(null);
            this.f8705e = null;
        }
    }

    public void b(boolean z10) {
        if (this.f8701a.aa().c() == c.a.TERMS) {
            return;
        }
        com.applovin.impl.b.a.a(z10, o.au());
    }
}
