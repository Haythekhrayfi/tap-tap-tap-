package com.applovin.impl.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.adview.a0;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* JADX INFO: loaded from: classes.dex */
public class u {
    public static void a(Uri uri, final com.applovin.impl.adview.b bVar, final com.applovin.impl.sdk.o oVar) {
        com.applovin.impl.adview.d dVarS = bVar.s();
        final String queryParameter = uri.getQueryParameter(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
        if (TextUtils.isEmpty(queryParameter)) {
            oVar.F();
            if (com.applovin.impl.sdk.y.a()) {
                oVar.F().e("UriUtils", "Could not find url to load from query in original uri");
                return;
            }
            return;
        }
        String queryParameter2 = uri.getQueryParameter("load_type");
        if ("external".equalsIgnoreCase(queryParameter2)) {
            oVar.F();
            if (com.applovin.impl.sdk.y.a()) {
                a0.a("Loading new page externally: ", queryParameter, oVar.F(), "UriUtils");
            }
            a(Uri.parse(queryParameter), dVarS.getContext(), oVar);
            o.c(bVar.g(), bVar.p(), bVar.r());
            return;
        }
        if ("internal".equalsIgnoreCase(queryParameter2)) {
            oVar.F();
            if (com.applovin.impl.sdk.y.a()) {
                a0.a("Loading new page in WebView: ", queryParameter, oVar.F(), "UriUtils");
            }
            dVarS.loadUrl(queryParameter);
            String queryParameter3 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter3)) {
                dVarS.setBackgroundColor(Color.parseColor(queryParameter3));
                return;
            }
            return;
        }
        boolean zEqualsIgnoreCase = "in_app".equalsIgnoreCase(queryParameter2);
        oVar.F();
        if (!zEqualsIgnoreCase) {
            if (com.applovin.impl.sdk.y.a()) {
                oVar.F().e("UriUtils", "Could not find load type in original uri");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            a0.a("Loading new page in slide-up webview: ", queryParameter, oVar.F(), "UriUtils");
        }
        oVar.E().a(new a() { // from class: com.applovin.impl.sdk.utils.u.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (activity instanceof AppLovinWebViewActivity) {
                    ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, null);
                    o.a(bVar.g(), bVar.p(), bVar.r());
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                if (activity instanceof AppLovinWebViewActivity) {
                    o.b(bVar.g(), bVar.p(), bVar.r());
                    oVar.E().b(this);
                }
            }
        });
        Intent intent = new Intent(com.applovin.impl.sdk.o.au(), (Class<?>) AppLovinWebViewActivity.class);
        intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, oVar.ax());
        intent.setFlags(268435456);
        com.applovin.impl.sdk.o.au().startActivity(intent);
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.e eVar, com.applovin.impl.sdk.o oVar) {
        String queryParameter = uri.getQueryParameter(GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION);
        if (URLUtil.isValidUrl(queryParameter)) {
            oVar.ai().a(com.applovin.impl.sdk.network.j.p().c(StringUtils.appendQueryParameter(queryParameter, "clcode", eVar.getClCode())).a(false).d(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        oVar.F();
        if (com.applovin.impl.sdk.y.a()) {
            oVar.F().e("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    public static boolean a(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static boolean a(Uri uri, Context context, com.applovin.impl.sdk.o oVar) {
        boolean z10 = false;
        if (uri == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if ("market".equals(intent.getScheme())) {
                intent.setPackage("com.android.vending");
            }
            oVar.U().pauseForClick();
            context.startActivity(intent);
            z10 = true;
        } catch (Throwable th) {
            oVar.F();
            if (com.applovin.impl.sdk.y.a()) {
                oVar.F().b("UriUtils", "Unable to open \"" + uri + "\".", th);
            }
            com.applovin.impl.sdk.s sVarAg = oVar.ag();
            StringBuilder sbA = defpackage.a.a("openUri:");
            sbA.append(uri.getHost());
            sVarAg.a("UriUtils", sbA.toString(), th);
        }
        if (!z10) {
            oVar.U().resumeForClick();
        }
        return z10;
    }
}
