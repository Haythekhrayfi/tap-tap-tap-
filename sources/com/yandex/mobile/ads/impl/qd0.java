package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class qd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k2 f24459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b5 f24460b = new b5();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdResponse f24461c;

    public qd0(k2 k2Var, AdResponse adResponse) {
        this.f24459a = k2Var;
        this.f24461c = adResponse;
    }

    private void a(Context context, fw0.b bVar, ce0 ce0Var, Map<String, Object> map) {
        HashMap map2 = new HashMap();
        map2.put("ad_unit_id", this.f24459a.c());
        map2.put("block_id", this.f24459a.c());
        map2.put("ad_type", this.f24459a.b().a());
        map2.put("adapter", ce0Var.c());
        map2.put("adapter_parameters", ce0Var.g());
        map2.putAll(this.f24460b.a(this.f24459a.a()));
        gw0 gw0Var = new gw0(map2);
        AdResponse adResponse = this.f24461c;
        gw0Var.b(adResponse != null ? adResponse.m() : null, FullscreenAdService.DATA_KEY_AD_SOURCE);
        Map<String, Object> mapA = gw0Var.a();
        mapA.putAll(map);
        z8.a(context).a(new fw0(bVar.a(), mapA));
    }

    public final void a(Context context, ce0 ce0Var) {
        a(context, fw0.b.f20894u, ce0Var, Collections.emptyMap());
    }

    public final void a(Context context, ce0 ce0Var, AdResponse adResponse) {
        RewardData rewardDataD;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (adResponse != null && (rewardDataD = adResponse.D()) != null) {
            map2.put("rewarding_side", rewardDataD.e() ? "server_side" : "client_side");
        }
        map.put("reward_info", map2);
        a(context, fw0.b.L, ce0Var, map);
    }

    public final void a(Context context, ce0 ce0Var, HashMap map) {
        a(context, fw0.b.f20878e, ce0Var, map);
    }

    public final void a(Context context, ce0 ce0Var, Map<String, Object> map) {
        a(context, fw0.b.f20894u, ce0Var, map);
    }

    public final void b(Context context, ce0 ce0Var) {
        a(context, fw0.b.f20879f, ce0Var, Collections.emptyMap());
    }

    public final void b(Context context, ce0 ce0Var, HashMap map) {
        a(context, fw0.b.A, ce0Var, map);
    }

    public final void b(Context context, ce0 ce0Var, Map<String, Object> map) {
        a(context, fw0.b.f20899z, ce0Var, map);
    }

    public final void c(Context context, ce0 ce0Var, HashMap map) {
        a(context, fw0.b.f20895v, ce0Var, map);
        a(context, fw0.b.f20896w, ce0Var, map);
    }

    public final void d(Context context, ce0 ce0Var, HashMap map) {
        a(context, fw0.b.f20877d, ce0Var, map);
    }

    public final void e(Context context, ce0 ce0Var, HashMap map) {
        a(context, fw0.b.f20880g, ce0Var, map);
    }

    public final void f(Context context, ce0 ce0Var, HashMap map) {
        a(context, fw0.b.f20881h, ce0Var, map);
    }
}
