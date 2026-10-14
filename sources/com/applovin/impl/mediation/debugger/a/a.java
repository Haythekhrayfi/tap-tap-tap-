package com.applovin.impl.mediation.debugger.a;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements DTBAdCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f9423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0128a f9424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DTBAdRequest f9425c;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0128a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public a(b bVar, MaxAdFormat maxAdFormat, InterfaceC0128a interfaceC0128a) {
        this((List<?>) Arrays.asList(bVar.a()), maxAdFormat, interfaceC0128a);
    }

    public a(List<?> list, MaxAdFormat maxAdFormat, InterfaceC0128a interfaceC0128a) {
        this.f9423a = maxAdFormat;
        this.f9424b = interfaceC0128a;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i10] = (DTBAdSize) obj;
                }
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f9425c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f9425c;
        if (dTBAdRequest == null) {
            this.f9424b.onAdLoadFailed(null, this.f9423a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f9424b.onAdLoadFailed(adError, this.f9423a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f9424b.onAdResponseLoaded(dTBAdResponse, this.f9423a);
    }
}
