package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Object> f8975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f8976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f8977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f8978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f8979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f8980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f8981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f8982i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8983j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f8984k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f8985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MaxAdFormat f8986m;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.a aVar) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((com.applovin.impl.mediation.a.f) aVar);
        maxAdapterParametersImplA.f8983j = aVar.x();
        maxAdapterParametersImplA.f8984k = aVar.p();
        maxAdapterParametersImplA.f8985l = aVar.r();
        return maxAdapterParametersImplA;
    }

    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.f fVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f8974a = fVar.getAdUnitId();
        maxAdapterParametersImpl.f8978e = fVar.af();
        maxAdapterParametersImpl.f8979f = fVar.ag();
        maxAdapterParametersImpl.f8980g = fVar.ah();
        maxAdapterParametersImpl.f8981h = fVar.ai();
        maxAdapterParametersImpl.f8975b = fVar.ak();
        maxAdapterParametersImpl.f8976c = fVar.al();
        maxAdapterParametersImpl.f8977d = fVar.am();
        maxAdapterParametersImpl.f8982i = fVar.ae();
        return maxAdapterParametersImpl;
    }

    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.h hVar, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(hVar);
        maxAdapterParametersImplA.f8974a = str;
        maxAdapterParametersImplA.f8986m = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f8986m;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f8974a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f8985l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f8984k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f8981h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f8977d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f8975b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f8976c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f8983j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f8978e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.f8979f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f8980g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f8982i;
    }
}
