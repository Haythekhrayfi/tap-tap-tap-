package com.applovin.impl.mediation;

import androidx.activity.k;
import com.applovin.mediation.MaxReward;

/* JADX INFO: loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8996b;

    private MaxRewardImpl(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f8995a = str;
        this.f8996b = i10;
    }

    public static MaxReward create(int i10, String str) {
        return new MaxRewardImpl(i10, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f8996b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f8995a;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MaxReward{amount=");
        sbA.append(this.f8996b);
        sbA.append(", label=");
        return k.a(sbA, this.f8995a, "}");
    }
}
