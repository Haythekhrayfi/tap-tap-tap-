package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.RemoteException;
import com.yandex.metrica.MetricaService;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2099y1 extends O1 {
    void a(int i10, Bundle bundle);

    void a(Bundle bundle);

    void a(MetricaService.e eVar);

    @Deprecated
    void a(String str, int i10, String str2, Bundle bundle) throws RemoteException;

    void b(Bundle bundle);

    void reportData(Bundle bundle);
}
