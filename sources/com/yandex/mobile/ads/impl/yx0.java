package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.reward.RewardData;

/* JADX INFO: loaded from: classes3.dex */
public final class yx0 {
    public static boolean a(RewardData rewardData) {
        if (rewardData == null) {
            return false;
        }
        if (rewardData.e()) {
            if (rewardData.d() == null) {
                return false;
            }
        } else if (rewardData.c() == null) {
            return false;
        }
        return true;
    }
}
