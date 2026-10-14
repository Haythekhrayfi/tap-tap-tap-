package com.applovin.impl.a.a.a;

import com.applovin.impl.sdk.ad.e;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8274d;

    public a(Object obj, long j10) {
        String networkName;
        this.f8272b = obj;
        this.f8271a = j10;
        if (obj instanceof e) {
            e eVar = (e) obj;
            this.f8273c = eVar.getAdZone().b() != null ? eVar.getAdZone().b().getLabel() : null;
            networkName = "AppLovin";
        } else {
            if (!(obj instanceof com.applovin.impl.mediation.a.a)) {
                return;
            }
            com.applovin.impl.mediation.a.a aVar = (com.applovin.impl.mediation.a.a) obj;
            this.f8273c = aVar.getFormat().getLabel();
            networkName = aVar.getNetworkName();
        }
        this.f8274d = networkName;
    }

    public String a() {
        String str = this.f8273c;
        return str != null ? str : "Unknown";
    }

    public String b() {
        String str = this.f8274d;
        return str != null ? str : "Unknown";
    }

    public Object c() {
        return this.f8272b;
    }

    public long d() {
        return this.f8271a;
    }
}
