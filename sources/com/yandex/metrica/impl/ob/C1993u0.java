package com.yandex.metrica.impl.ob;

import android.location.Location;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1993u0 implements InterfaceC2049w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Location f17490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f17491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f17492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f17493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f17494e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, String> f17495f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f17496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17497h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private C1821n2 f17498i;

    private static boolean a(Object obj) {
        return obj == null;
    }

    private void b() {
        C1821n2 c1821n2 = this.f17498i;
        if (c1821n2 != null) {
            c1821n2.a(this.f17491b, this.f17493d, this.f17492c);
        }
    }

    private void b(Map<String, String> map, com.yandex.metrica.j.b bVar) {
        if (U2.b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bVar.f18078a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    public com.yandex.metrica.j a(com.yandex.metrica.j jVar) {
        if (this.f17497h) {
            return jVar;
        }
        com.yandex.metrica.j.b bVar = new com.yandex.metrica.j.b(jVar.apiKey);
        Map<String, String> map = jVar.f18067b;
        bVar.f18087j = jVar.f18074i;
        bVar.f18082e = map;
        bVar.f18079b = jVar.f18066a;
        bVar.f18078a.withPreloadInfo(jVar.preloadInfo);
        bVar.f18078a.withLocation(jVar.location);
        if (U2.a((Object) jVar.f18069d)) {
            bVar.f18080c = jVar.f18069d;
        }
        if (U2.a((Object) jVar.appVersion)) {
            bVar.f18078a.withAppVersion(jVar.appVersion);
        }
        if (U2.a(jVar.f18071f)) {
            bVar.f18084g = Integer.valueOf(jVar.f18071f.intValue());
        }
        if (U2.a(jVar.f18070e)) {
            bVar.a(jVar.f18070e.intValue());
        }
        if (U2.a(jVar.f18072g)) {
            bVar.f18085h = Integer.valueOf(jVar.f18072g.intValue());
        }
        if (U2.a(jVar.logs) && jVar.logs.booleanValue()) {
            bVar.f18078a.withLogs();
        }
        if (U2.a(jVar.sessionTimeout)) {
            bVar.f18078a.withSessionTimeout(jVar.sessionTimeout.intValue());
        }
        if (U2.a(jVar.crashReporting)) {
            bVar.f18078a.withCrashReporting(jVar.crashReporting.booleanValue());
        }
        if (U2.a(jVar.nativeCrashReporting)) {
            bVar.f18078a.withNativeCrashReporting(jVar.nativeCrashReporting.booleanValue());
        }
        if (U2.a(jVar.locationTracking)) {
            bVar.f18078a.withLocationTracking(jVar.locationTracking.booleanValue());
        }
        if (U2.a((Object) jVar.f18068c)) {
            bVar.f18083f = jVar.f18068c;
        }
        if (U2.a(jVar.firstActivationAsUpdate)) {
            bVar.f18078a.handleFirstActivationAsUpdate(jVar.firstActivationAsUpdate.booleanValue());
        }
        if (U2.a(jVar.statisticsSending)) {
            bVar.f18078a.withStatisticsSending(jVar.statisticsSending.booleanValue());
        }
        if (U2.a(jVar.f18076k)) {
            bVar.f18089l = Boolean.valueOf(jVar.f18076k.booleanValue());
        }
        if (U2.a(jVar.maxReportsInDatabaseCount)) {
            bVar.f18078a.withMaxReportsInDatabaseCount(jVar.maxReportsInDatabaseCount.intValue());
        }
        if (U2.a(jVar.f18077l)) {
            bVar.f18090m = jVar.f18077l;
        }
        if (U2.a((Object) jVar.userProfileID)) {
            bVar.f18078a.withUserProfileID(jVar.userProfileID);
        }
        if (U2.a(jVar.revenueAutoTrackingEnabled)) {
            bVar.f18078a.withRevenueAutoTrackingEnabled(jVar.revenueAutoTrackingEnabled.booleanValue());
        }
        if (U2.a(jVar.appOpenTrackingEnabled)) {
            bVar.f18078a.withAppOpenTrackingEnabled(jVar.appOpenTrackingEnabled.booleanValue());
        }
        a(this.f17494e, bVar);
        a(jVar.f18073h, bVar);
        b(this.f17495f, bVar);
        b(jVar.errorEnvironment, bVar);
        Boolean bool = this.f17491b;
        if (a(jVar.locationTracking) && U2.a(bool)) {
            bVar.f18078a.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f17490a;
        if (a((Object) jVar.location) && U2.a(location)) {
            bVar.f18078a.withLocation(location);
        }
        Boolean bool2 = this.f17493d;
        if (a(jVar.statisticsSending) && U2.a(bool2)) {
            bVar.f18078a.withStatisticsSending(bool2.booleanValue());
        }
        if (!U2.a((Object) jVar.userProfileID) && U2.a((Object) this.f17496g)) {
            bVar.f18078a.withUserProfileID(this.f17496g);
        }
        this.f17497h = true;
        this.f17490a = null;
        this.f17491b = null;
        this.f17493d = null;
        this.f17494e.clear();
        this.f17495f.clear();
        this.f17496g = null;
        return bVar.b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(Location location) {
        this.f17490a = location;
    }

    public void a(C1821n2 c1821n2) {
        this.f17498i = c1821n2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void a(boolean z10) {
        this.f17492c = Boolean.valueOf(z10);
        b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void b(boolean z10) {
        this.f17491b = Boolean.valueOf(z10);
        b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void c(String str, String str2) {
        this.f17495f.put(str, str2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void setStatisticsSending(boolean z10) {
        this.f17493d = Boolean.valueOf(z10);
        b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2049w1
    public void setUserProfileID(String str) {
        this.f17496g = str;
    }

    private void a(Map<String, String> map, com.yandex.metrica.j.b bVar) {
        if (U2.b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bVar.f18086i.put(entry.getKey(), entry.getValue());
        }
    }
}
