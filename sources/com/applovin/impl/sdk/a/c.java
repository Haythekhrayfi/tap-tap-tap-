package com.applovin.impl.sdk.a;

import android.webkit.WebView;
import com.applovin.impl.sdk.y;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {
    public c(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (y.a()) {
                this.f10113c.b(this.f10114d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionContext a(WebView webView) {
        try {
            return this.f10111a.getOpenMeasurementVerificationScriptResources().size() > 0 ? AdSessionContext.createNativeAdSessionContext(this.f10112b.ad().d(), this.f10112b.ad().e(), this.f10111a.getOpenMeasurementVerificationScriptResources(), this.f10111a.getOpenMeasurementContentUrl(), this.f10111a.getOpenMeasurementCustomReferenceData()) : AdSessionContext.createHtmlAdSessionContext(this.f10112b.ad().d(), webView, this.f10111a.getOpenMeasurementContentUrl(), this.f10111a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (y.a()) {
                this.f10113c.b(this.f10114d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
