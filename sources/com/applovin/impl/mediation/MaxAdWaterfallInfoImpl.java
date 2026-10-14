package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.a f8969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f8972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8973e;

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, long j10, List<MaxNetworkResponseInfo> list) {
        this(aVar, aVar.y(), aVar.z(), j10, list);
    }

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, String str, String str2, long j10, List<MaxNetworkResponseInfo> list) {
        this.f8969a = aVar;
        this.f8970b = str;
        this.f8971c = str2;
        this.f8972d = list;
        this.f8973e = j10;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f8973e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f8969a;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f8970b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f8972d;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f8971c;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MaxAdWaterfallInfo{name=");
        sbA.append(this.f8970b);
        sbA.append(", testName=");
        sbA.append(this.f8971c);
        sbA.append(", networkResponses=");
        sbA.append(this.f8972d);
        sbA.append(", latencyMillis=");
        return o2.a.a(sbA, this.f8973e, '}');
    }
}
