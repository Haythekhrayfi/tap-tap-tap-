package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.SubscriptionInfo;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.xk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(29)
@DoNotInline
public final class C2093xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2093xk f17857a = new C2093xk();

    private C2093xk() {
    }

    public static final Integer a(SubscriptionInfo subscriptionInfo) {
        return C1694i.b(subscriptionInfo.getMccString());
    }

    public static final Integer b(SubscriptionInfo subscriptionInfo) {
        return C1694i.b(subscriptionInfo.getMncString());
    }
}
