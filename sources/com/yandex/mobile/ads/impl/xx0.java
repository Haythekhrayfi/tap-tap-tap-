package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.reward.ClientSideReward;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class xx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final td f26659a;

    public xx0() {
        this(0);
    }

    public /* synthetic */ xx0(int i10) {
        this(new td());
    }

    public xx0(td tdVar) {
        fd.j0.i(tdVar, "mBase64Decoder");
        this.f26659a = tdVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public final RewardData a(fx0 fx0Var) {
        String strA;
        ClientSideReward clientSideReward;
        fd.j0.i(fx0Var, "networkResponse");
        Map<String, String> mapB = fx0Var.b();
        Integer numC = qy.c(mapB, 25);
        String str = mapB.get(t00.a(27));
        ServerSideReward serverSideReward = null;
        if (str != null) {
            Objects.requireNonNull(this.f26659a);
            strA = td.a(str.getBytes());
        } else {
            strA = null;
        }
        if (numC == null || strA == null) {
            clientSideReward = null;
        } else {
            if (strA.length() > 0) {
                clientSideReward = new ClientSideReward(numC.intValue(), strA);
            } else {
                clientSideReward = null;
            }
        }
        String strD = qy.d(mapB, 28);
        if (strD != null) {
            if (strD.length() > 0) {
                serverSideReward = new ServerSideReward(strD);
            }
        }
        RewardData rewardDataA = new RewardData.b().a(clientSideReward).a(serverSideReward).a(qy.a(mapB, 33)).a();
        fd.j0.h(rewardDataA, "Builder()\n            .s…ype)\n            .build()");
        return rewardDataA;
    }
}
