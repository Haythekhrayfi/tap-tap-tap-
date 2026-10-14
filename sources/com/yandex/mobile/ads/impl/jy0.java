package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.ClientSideReward;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.base.model.reward.ServerSideReward;

/* JADX INFO: loaded from: classes3.dex */
public final class jy0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ky0 f22196a;

    public jy0(ky0 ky0Var) {
        this.f22196a = ky0Var;
    }

    public final iy0 a(Context context, AdResponse adResponse, k2 k2Var) {
        RewardData rewardDataD = adResponse != null ? adResponse.D() : null;
        if (rewardDataD == null) {
            return null;
        }
        if (rewardDataD.e()) {
            ServerSideReward serverSideRewardD = rewardDataD.d();
            if (serverSideRewardD != null) {
                return new a11(context, k2Var, serverSideRewardD);
            }
            return null;
        }
        ClientSideReward clientSideRewardC = rewardDataD.c();
        if (clientSideRewardC != null) {
            return new ii(clientSideRewardC, this.f22196a);
        }
        return null;
    }
}
