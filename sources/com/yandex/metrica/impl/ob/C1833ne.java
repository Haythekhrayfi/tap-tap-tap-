package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ne, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1833ne implements InterfaceC1684he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Wn f16948c;

    public C1833ne(Context context, String str, Wn wn) {
        this.f16946a = context;
        this.f16947b = str;
        this.f16948c = wn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1684he
    public List<C1709ie> a() {
        ArrayList arrayList = new ArrayList();
        PackageInfo packageInfoB = this.f16948c.b(this.f16946a, this.f16947b, 4096);
        if (packageInfoB != null) {
            for (String str : packageInfoB.requestedPermissions) {
                arrayList.add(new C1709ie(str, true));
            }
        }
        return arrayList;
    }
}
