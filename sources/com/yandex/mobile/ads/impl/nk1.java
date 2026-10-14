package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b5 f23418a = new b5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k2 f23419b;

    public nk1(k2 k2Var) {
        this.f23419b = k2Var;
    }

    private void a(Context context, AdResponse adResponse, fw0.b bVar, HashMap map) {
        int iG;
        HashMap map2 = new HashMap();
        map2.put("ad_unit_id", adResponse.p());
        map2.put("block_id", adResponse.p());
        map2.put("adapter", "Yandex");
        l6 l6VarN = adResponse.n();
        map2.put("ad_type", l6VarN != null ? l6VarN.a() : null);
        map2.putAll(this.f23418a.a(this.f23419b.a()));
        if (adResponse.C() instanceof cj0) {
            List<qh0> listD = ((cj0) adResponse.C()).d();
            map2.put("native_ad_type", (listD == null || listD.isEmpty() || (iG = listD.get(0).g()) == 0) ? "" : px0.a(iG));
        }
        gw0 gw0Var = new gw0(map2);
        gw0Var.b(adResponse.m(), FullscreenAdService.DATA_KEY_AD_SOURCE);
        Map<String, Object> mapA = gw0Var.a();
        mapA.putAll(map);
        z8.a(context).a(new fw0(bVar.a(), mapA));
    }

    public final void a(Context context, AdResponse adResponse) {
        RewardData rewardDataD;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (adResponse != null && (rewardDataD = adResponse.D()) != null) {
            map2.put("rewarding_side", rewardDataD.e() ? "server_side" : "client_side");
        }
        map.put("reward_info", map2);
        a(context, adResponse, fw0.b.L, map);
    }

    public final void a(Context context, AdResponse adResponse, mj0 mj0Var) {
        HashMap map = new HashMap();
        if (mj0Var != null) {
            map.putAll(mj0Var.a());
        }
        a(context, adResponse, fw0.b.f20879f, map);
    }

    public final void a(Context context, AdResponse adResponse, nj0 nj0Var) {
        HashMap map = new HashMap();
        if (nj0Var != null) {
            map.putAll(nj0Var.a());
        }
        map.put("status", fw0.c.f20901b.a());
        a(context, adResponse, fw0.b.f20880g, map);
    }
}
