package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.yandex.metrica.DoNotInline;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(23)
@DoNotInline
public final class C2068wk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2068wk f17807a = new C2068wk();

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wk$a */
    public static final class a<T, R> implements Wm<SubscriptionManager, List<? extends SubscriptionInfo>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17808a = new a();

        @Override // com.yandex.metrica.impl.ob.Wm
        public List<? extends SubscriptionInfo> a(SubscriptionManager subscriptionManager) {
            return subscriptionManager.getActiveSubscriptionInfoList();
        }
    }

    private C2068wk() {
    }

    public static final List<C2013uk> a(Context context) {
        List<SubscriptionInfo> list = (List) U2.a(a.f17808a, context, "telephony_subscription_service", "getting active subcription info list", "SubscriptionManager");
        if (list == null) {
            return kc.w.f32009c;
        }
        ArrayList arrayList = new ArrayList(kc.m.j(list, 10));
        for (SubscriptionInfo subscriptionInfo : list) {
            Integer numA = U2.a(29) ? C2093xk.a(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMcc());
            Integer numB = U2.a(29) ? C2093xk.b(subscriptionInfo) : Integer.valueOf(subscriptionInfo.getMnc());
            boolean z10 = subscriptionInfo.getDataRoaming() == 1;
            CharSequence carrierName = subscriptionInfo.getCarrierName();
            arrayList.add(new C2013uk(numA, numB, z10, carrierName != null ? carrierName.toString() : null));
        }
        return arrayList;
    }
}
