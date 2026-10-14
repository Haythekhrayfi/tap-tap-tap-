package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import com.yandex.metrica.DoNotInline;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
@DoNotInline
public final class C1590dk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1590dk f15976a = new C1590dk();

    private C1590dk() {
    }

    public static final int a(CellIdentityLte cellIdentityLte) {
        return cellIdentityLte.getEarfcn();
    }

    public static final int a(CellIdentityWcdma cellIdentityWcdma) {
        return cellIdentityWcdma.getUarfcn();
    }
}
