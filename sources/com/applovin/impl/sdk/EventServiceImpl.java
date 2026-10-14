package com.applovin.impl.sdk;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventService;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class EventServiceImpl implements AppLovinEventService {
    public static final List<String> ALLOW_PRE_INIT_EVENT_TYPES = Arrays.asList("landing", "paused", "resumed", "cf_start", "tos_ok", "gdpr_ok");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Object> f10081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10082c = new AtomicBoolean();

    public EventServiceImpl(o oVar) {
        this.f10080a = oVar;
        if (((Boolean) oVar.a(com.applovin.impl.sdk.c.b.bt)).booleanValue()) {
            this.f10081b = JsonUtils.toStringObjectMap((String) oVar.b(com.applovin.impl.sdk.c.d.H, "{}"));
        } else {
            this.f10081b = new HashMap();
            oVar.a(com.applovin.impl.sdk.c.d.H, "{}");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a() {
        return androidx.activity.k.a(new StringBuilder(), (String) this.f10080a.a(com.applovin.impl.sdk.c.b.bl), "4.0/pix");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(t tVar, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        boolean zContains = this.f10080a.b(com.applovin.impl.sdk.c.b.br).contains(tVar.a());
        map2.put("AppLovin-Event", zContains ? tVar.a() : "postinstall");
        if (!zContains) {
            map2.put("AppLovin-Sub-Event", tVar.a());
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(t tVar, boolean z10) {
        boolean zContains = this.f10080a.b(com.applovin.impl.sdk.c.b.br).contains(tVar.a());
        Map<String, Object> mapA = this.f10080a.M() != null ? this.f10080a.M().a(null, z10, false) : this.f10080a.K().a(null, z10, false);
        mapA.put("event", zContains ? tVar.a() : "postinstall");
        mapA.put("event_id", tVar.d());
        mapA.put("ts", Long.toString(tVar.c()));
        if (!zContains) {
            mapA.put("sub_event", tVar.a());
        }
        return com.applovin.impl.sdk.utils.w.a(mapA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        return androidx.activity.k.a(new StringBuilder(), (String) this.f10080a.a(com.applovin.impl.sdk.c.b.bm), "4.0/pix");
    }

    private void c() {
        if (((Boolean) this.f10080a.a(com.applovin.impl.sdk.c.b.bt)).booleanValue()) {
            this.f10080a.a(com.applovin.impl.sdk.c.d.H, CollectionUtils.toJsonString(this.f10081b, "{}"));
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public Map<String, Object> getSuperProperties() {
        return CollectionUtils.map(this.f10081b);
    }

    public void maybeTrackAppOpenEvent() {
        if (this.f10082c.compareAndSet(false, true)) {
            this.f10080a.x().trackEvent("landing");
        }
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void setSuperProperty(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            y.j("AppLovinEventService", "Super property key cannot be null or empty");
            return;
        }
        if (obj == null) {
            this.f10081b.remove(str);
            c();
            return;
        }
        List<String> listB = this.f10080a.b(com.applovin.impl.sdk.c.b.bs);
        if (com.applovin.impl.sdk.utils.w.a(obj, listB, this.f10080a)) {
            this.f10081b.put(str, com.applovin.impl.sdk.utils.w.a(obj, this.f10080a));
            c();
            return;
        }
        y.j("AppLovinEventService", "Failed to set super property '" + obj + "' for key '" + str + "' - valid super property types include: " + listB);
    }

    public String toString() {
        return "EventService{}";
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackCheckout(String str, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        map2.put(AppLovinEventParameters.CHECKOUT_TRANSACTION_IDENTIFIER, str);
        trackEvent(AppLovinEventTypes.USER_COMPLETED_CHECKOUT, map2);
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str) {
        trackEvent(str, new HashMap());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackEvent(String str, Map<String, String> map) {
        trackEvent(str, map, null);
    }

    public void trackEvent(String str, Map<String, String> map, final Map<String, String> map2) {
        this.f10080a.F();
        if (y.a()) {
            this.f10080a.F().b("AppLovinEventService", "Tracking event: \"" + str + "\" with parameters: " + map);
        }
        final t tVar = new t(str, map, this.f10081b);
        final boolean zContains = ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
        try {
            this.f10080a.G().a(new com.applovin.impl.sdk.e.ac(this.f10080a, zContains, "submitTrackEventPostback", new Runnable() { // from class: com.applovin.impl.sdk.EventServiceImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    Map<String, String> mapA = EventServiceImpl.this.a(tVar, false);
                    Map<String, Object> mapB = tVar.b();
                    if (((Boolean) EventServiceImpl.this.f10080a.a(com.applovin.impl.sdk.c.b.fQ)).booleanValue() || ((Boolean) EventServiceImpl.this.f10080a.a(com.applovin.impl.sdk.c.b.fL)).booleanValue()) {
                        mapB.putAll(mapA);
                        mapA = null;
                    }
                    EventServiceImpl.this.f10080a.ai().a(com.applovin.impl.sdk.network.j.p().c(EventServiceImpl.this.a()).d(EventServiceImpl.this.b()).a(mapA).c(mapB).b(EventServiceImpl.this.a(tVar, (Map<String, String>) map2)).b(((Boolean) EventServiceImpl.this.f10080a.a(com.applovin.impl.sdk.c.b.f10373ga)).booleanValue()).a(((Boolean) EventServiceImpl.this.f10080a.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()).c(zContains).a(com.applovin.impl.sdk.utils.r.a.a(((Integer) EventServiceImpl.this.f10080a.a(com.applovin.impl.sdk.c.b.fI)).intValue())).a());
                }
            }), com.applovin.impl.sdk.e.r.b.BACKGROUND);
        } catch (Throwable th) {
            this.f10080a.F();
            if (y.a()) {
                this.f10080a.F().b("AppLovinEventService", "Unable to track event: " + tVar, th);
            }
            this.f10080a.ag().a("AppLovinEventService", "trackEvent", th);
        }
    }

    public void trackEventSynchronously(String str) {
        this.f10080a.F();
        if (y.a()) {
            this.f10080a.F().b("AppLovinEventService", "Tracking event: \"" + str + "\" synchronously");
        }
        t tVar = new t(str, new HashMap(), this.f10081b);
        Map<String, String> mapA = a(tVar, true);
        Map<String, Object> mapB = tVar.b();
        if (((Boolean) this.f10080a.a(com.applovin.impl.sdk.c.b.fQ)).booleanValue() || ((Boolean) this.f10080a.a(com.applovin.impl.sdk.c.b.fL)).booleanValue()) {
            mapB.putAll(mapA);
            mapA = null;
        }
        this.f10080a.ai().a(com.applovin.impl.sdk.network.j.p().c(a()).d(b()).a(mapA).c(mapB).b(a(tVar, (Map<String, String>) null)).b(((Boolean) this.f10080a.a(com.applovin.impl.sdk.c.b.f10373ga)).booleanValue()).a(((Boolean) this.f10080a.a(com.applovin.impl.sdk.c.b.fx)).booleanValue()).a());
    }

    @Override // com.applovin.sdk.AppLovinEventService
    public void trackInAppPurchase(Intent intent, Map<String, String> map) {
        Map<String, String> map2 = CollectionUtils.map(map);
        try {
            map2.put(AppLovinEventParameters.IN_APP_PURCHASE_DATA, intent.getStringExtra("INAPP_PURCHASE_DATA"));
            map2.put(AppLovinEventParameters.IN_APP_DATA_SIGNATURE, intent.getStringExtra("INAPP_DATA_SIGNATURE"));
        } catch (Throwable th) {
            y.c("AppLovinEventService", "Unable to track in app purchase - invalid purchase intent", th);
            this.f10080a.ag().a("AppLovinEventService", "trackIAP", th);
        }
        trackEvent(AppLovinEventTypes.USER_COMPLETED_IN_APP_PURCHASE, map2);
    }
}
