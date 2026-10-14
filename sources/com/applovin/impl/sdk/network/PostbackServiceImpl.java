package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.e.r;
import com.applovin.impl.sdk.o;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f10816a;

    public PostbackServiceImpl(o oVar) {
        this.f10816a = oVar;
    }

    private boolean a(l lVar) {
        Map<String, String> mapC = lVar.c();
        if (mapC == null) {
            return false;
        }
        String str = mapC.get("event");
        if ("postinstall".equals(str)) {
            str = mapC.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(str);
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(l.b(this.f10816a).a(str).d(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(l lVar, r.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        com.applovin.impl.sdk.e.j jVar = new com.applovin.impl.sdk.e.j(lVar, bVar, this.f10816a, appLovinPostbackListener);
        jVar.a(a(lVar));
        this.f10816a.G().a(jVar, bVar);
    }

    public void dispatchPostbackRequest(l lVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(lVar, r.b.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
