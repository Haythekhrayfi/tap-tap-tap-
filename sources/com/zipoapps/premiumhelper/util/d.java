package com.zipoapps.premiumhelper.util;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    UNKNOWN(""),
    TRIAL("trial"),
    TRIAL_CANCELLED("trial_cancelled"),
    SUBSCRIPTION_CANCELLED("subscription_cancelled"),
    PAID("paid");

    private final String value;

    d(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
