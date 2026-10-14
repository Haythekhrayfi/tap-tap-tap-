package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(28)
@DoNotInline
public final class C1640fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1640fk f16144a = new C1640fk();

    private C1640fk() {
    }

    public static final int a(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte.getBandwidth();
    }
}
