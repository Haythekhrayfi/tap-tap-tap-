package com.applovin.impl.b.a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinCFErrorImpl;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.u;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinCFError;
import com.applovin.sdk.AppLovinCFService;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinCommunicatorPublisher, AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f8640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f8641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<d> f8642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8643d;

    /* JADX INFO: renamed from: com.applovin.impl.b.a.b$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f8644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AppLovinCFService.OnCFCompletionCallback f8645b;

        public AnonymousClass1(Activity activity, AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
            this.f8644a = activity;
            this.f8645b = onCFCompletionCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            final Runnable runnable = new Runnable() { // from class: com.applovin.impl.b.a.b.1.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.f8641b.a(b.this.f8642c, b.this.f8643d, AnonymousClass1.this.f8644a, new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.b.a.b.1.1.1
                        @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                        public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                            if (appLovinCFError == null) {
                                b.this.f8642c = null;
                                b.this.f8643d = false;
                            }
                            AnonymousClass1.this.f8645b.onFlowCompleted(appLovinCFError);
                        }
                    });
                }
            };
            if (b.this.c() == c.a.TERMS) {
                runnable.run();
            } else {
                b.this.b(this.f8644a, new Runnable() { // from class: com.applovin.impl.b.a.b.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        b.this.c(anonymousClass1.f8644a, runnable);
                    }
                });
            }
        }
    }

    public b(o oVar) {
        this.f8640a = oVar;
        this.f8641b = new i(oVar);
    }

    @SuppressLint({"DiscouragedApi"})
    public static c a(Context context) {
        String strA = w.a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (o) null);
        JSONObject jSONObjectJsonObjectFromJsonString = StringUtils.isValidString(strA) ? JsonUtils.jsonObjectFromJsonString(strA, new JSONObject()) : new JSONObject();
        return c(jSONObjectJsonObjectFromJsonString) == c.a.UNIFIED ? b(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "consent_flow_settings", new JSONObject())) : a(JsonUtils.getJSONObject(jSONObjectJsonObjectFromJsonString, "terms_flow_settings", new JSONObject()));
    }

    public static c a(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "terms_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "terms_flow_terms_of_service", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        String string2 = JsonUtils.getString(jSONObject, "terms_flow_privacy_policy", null);
        return new c(bool.booleanValue(), StringUtils.isValidString(string2) ? Uri.parse(string2) : null, uri);
    }

    private List<Uri> a(com.applovin.impl.sdk.c.b<String> bVar) {
        List<String> listB = this.f8640a.b(bVar);
        ArrayList arrayList = new ArrayList(listB.size());
        Iterator<String> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.parse(it.next()));
        }
        return arrayList;
    }

    private static List<Uri> a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayA = k.a(jSONObject, str);
        ArrayList arrayList = new ArrayList(jSONArrayA.length());
        for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
            Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArrayA, i10, null);
            if (objectAtIndex instanceof String) {
                arrayList.add(Uri.parse((String) objectAtIndex));
            } else {
                y.h("AppLovinSdk", "URIs need to be of type string");
            }
        }
        return arrayList;
    }

    private void a(final Activity activity, Runnable runnable) {
        if (a().getPrivacyPolicyUri() == null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.b.2
                @Override // java.lang.Runnable
                public void run() {
                    final Uri uriK = b.this.k();
                    new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.2.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            u.a(uriK, o.au(), b.this.f8640a);
                            StringBuilder sbA = defpackage.a.a("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to ");
                            sbA.append(uriK.toString());
                            throw new IllegalStateException(sbA.toString());
                        }
                    }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.2.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            StringBuilder sbA = defpackage.a.a("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to ");
                            sbA.append(uriK.toString());
                            throw new IllegalStateException(sbA.toString());
                        }
                    }).create().show();
                }
            });
        } else {
            runnable.run();
        }
    }

    public static c b(JSONObject jSONObject) {
        Boolean bool = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", Boolean.FALSE);
        String string = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri uri = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        Uri uri2 = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        List<Uri> listA = a(jSONObject, "consent_flow_advertising_partners");
        Boolean bool2 = Boolean.TRUE;
        return new c(bool.booleanValue(), c.a.UNIFIED, uri2, uri, listA, JsonUtils.getBoolean(jSONObject, "consent_flow_should_include_default_advertising_partners", bool2).booleanValue(), a(jSONObject, "consent_flow_analytics_partners"), JsonUtils.getBoolean(jSONObject, "consent_flow_should_include_default_analytics_partners", bool2).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Activity activity, Runnable runnable) {
        if (f().isEmpty()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.b.3
                @Override // java.lang.Runnable
                public void run() {
                    final Uri uriK = b.this.k();
                    new AlertDialog.Builder(activity).setTitle("Missing Advertising Partner URLs").setMessage("You cannot use the AppLovin SDK's consent flow without adding a list of advertising partner URLs").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.3.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            u.a(uriK, o.au(), b.this.f8640a);
                            StringBuilder sbA = defpackage.a.a("You cannot use the AppLovin SDK's consent flow without adding a list of advertising partner URLs Please refer to ");
                            sbA.append(uriK.toString());
                            throw new IllegalStateException(sbA.toString());
                        }
                    }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.3.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            StringBuilder sbA = defpackage.a.a("You cannot use the AppLovin SDK's consent flow without adding a list of advertising partner URLs Please refer to ");
                            sbA.append(uriK.toString());
                            throw new IllegalStateException(sbA.toString());
                        }
                    }).create().show();
                }
            });
        } else {
            runnable.run();
        }
    }

    private static c.a c(JSONObject jSONObject) {
        return jSONObject.has("consent_flow_settings") ? c.a.UNIFIED : c.a.TERMS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Activity activity, Runnable runnable) {
        if (g().isEmpty()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.b.a.b.4
                @Override // java.lang.Runnable
                public void run() {
                    final Uri uriK = b.this.k();
                    new AlertDialog.Builder(activity).setTitle("Missing Analytics Partner URLs").setMessage("You cannot use the AppLovin SDK's consent flow without adding a list of analytics partner URLs").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.4.2
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            u.a(uriK, o.au(), b.this.f8640a);
                            StringBuilder sbA = defpackage.a.a("You cannot use the AppLovin SDK's consent flow without adding a list of analytics partner URLs Please refer to ");
                            sbA.append(uriK.toString());
                            throw new IllegalStateException(sbA.toString());
                        }
                    }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.b.a.b.4.1
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i10) {
                            StringBuilder sbA = defpackage.a.a("You cannot use the AppLovin SDK's consent flow without adding a list of analytics partner URLs Please refer to ");
                            sbA.append(uriK.toString());
                            throw new IllegalStateException(sbA.toString());
                        }
                    }).create().show();
                }
            });
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri k() {
        return Uri.parse((String) this.f8640a.a(this.f8640a.g() ? com.applovin.impl.sdk.c.b.gW : com.applovin.impl.sdk.c.b.gV));
    }

    public c a() {
        return (c) this.f8640a.ay().getTermsFlowSettings();
    }

    public void a(Activity activity, AppLovinCFService.OnCFCompletionCallback onCFCompletionCallback) {
        List<d> list = this.f8642c;
        if (list == null || list.size() <= 0 || !b()) {
            onCFCompletionCallback.onFlowCompleted(new AppLovinCFErrorImpl(-100, "Failed to start consent flow. Please make sure that the consent flow is enabled."));
        } else {
            a(activity, new AnonymousClass1(activity, onCFCompletionCallback));
        }
    }

    public void a(boolean z10) {
        if (!this.f8640a.e() && b()) {
            if (a().a() == c.a.UNIFIED) {
                this.f8640a.F();
                if (y.a()) {
                    this.f8640a.F().b("AppLovinSdk", "Generating Unified Consent Flow...");
                }
                this.f8642c = a.a(this.f8640a, z10);
                this.f8643d = z10;
                this.f8640a.a(com.applovin.impl.sdk.c.d.f10399q, Boolean.FALSE);
            } else {
                this.f8640a.F();
                if (y.a()) {
                    this.f8640a.F().b("AppLovinSdk", "Generating Terms Flow...");
                }
                this.f8642c = a.a(this.f8640a);
            }
        }
        if (w.f(o.au())) {
            AppLovinCommunicator.getInstance(o.au()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    public boolean b() {
        Map<String, String> extraParameters = this.f8640a.ay().getExtraParameters();
        if (extraParameters.containsKey("consent_flow_enabled")) {
            return Boolean.parseBoolean(extraParameters.get("consent_flow_enabled")) && (c() == c.a.TERMS || this.f8640a.h());
        }
        return a().isEnabled() && (c() == c.a.TERMS || this.f8640a.h());
    }

    public c.a c() {
        return a().a();
    }

    public Uri d() {
        return a().getPrivacyPolicyUri();
    }

    public Uri e() {
        return a().getTermsOfServiceUri();
    }

    public List<Uri> f() {
        List<Uri> listB = a().b();
        if (a().c()) {
            listB.addAll(a(com.applovin.impl.sdk.c.b.gY));
        }
        return listB;
    }

    public List<Uri> g() {
        List<Uri> listD = a().d();
        if (a().e()) {
            listD.addAll(a(com.applovin.impl.sdk.c.b.gZ));
        }
        return listD;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    public boolean h() {
        o oVar = o.f10977a;
        if (!oVar.f()) {
            return false;
        }
        b bVarAa = oVar.aa();
        List<d> list = bVarAa.f8642c;
        return bVarAa.f8641b.a() || (list != null && list.size() > 0);
    }

    public JSONObject i() {
        c cVarA = a();
        Uri privacyPolicyUri = cVarA.getPrivacyPolicyUri();
        Uri termsOfServiceUri = cVarA.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(b()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    public String j() {
        a();
        Object objD = d();
        Object objE = e();
        StringBuilder sbA = defpackage.a.a("\nConsent Flow Enabled - ");
        sbA.append(b());
        sbA.append("\nPrivacy Policy - ");
        if (objD == null) {
            objD = AdError.UNDEFINED_DOMAIN;
        }
        sbA.append(objD);
        sbA.append("\nTerms of Service - ");
        if (objE == null) {
            objE = AdError.UNDEFINED_DOMAIN;
        }
        sbA.append(objE);
        return sbA.toString();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        Uri uriE = e();
        if (appLovinCommunicatorMessage.getMessageData().getBoolean("gdpr_flow")) {
            this.f8642c = j.c(this.f8640a);
            this.f8643d = true;
        } else {
            this.f8642c = (uriE == null || !appLovinCommunicatorMessage.getMessageData().getBoolean("include_tos")) ? j.a(this.f8640a) : j.b(this.f8640a);
        }
        if (this.f8642c.size() == 0) {
            w.a("No Consent Flow Available", (String) null, this.f8640a.at());
        } else {
            a(this.f8640a.at(), new AppLovinCFService.OnCFCompletionCallback() { // from class: com.applovin.impl.b.a.b.5
                @Override // com.applovin.sdk.AppLovinCFService.OnCFCompletionCallback
                public void onFlowCompleted(AppLovinCFError appLovinCFError) {
                    AppLovinCommunicatorMessage appLovinCommunicatorMessage2 = new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", b.this);
                    o unused = b.this.f8640a;
                    AppLovinCommunicator.getInstance(o.au()).getMessagingService().publish(appLovinCommunicatorMessage2);
                }
            });
        }
    }
}
