package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
class C1758ke implements InterfaceC1684he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Wn f16580b;

    public C1758ke(Context context, Wn wn) {
        this.f16579a = context;
        this.f16580b = wn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1684he
    public List<C1709ie> a() {
        ArrayList arrayList = new ArrayList();
        Wn wn = this.f16580b;
        Context context = this.f16579a;
        PackageInfo packageInfoB = wn.b(context, context.getPackageName(), 4096);
        if (packageInfoB == null) {
            return arrayList;
        }
        String[] strArr = packageInfoB.requestedPermissions;
        int[] iArr = packageInfoB.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        int i10 = 0;
        while (i10 < strArr.length) {
            String str = strArr[i10];
            arrayList.add((iArr == null || iArr.length <= i10 || (iArr[i10] & 2) == 0) ? new C1709ie(str, false) : new C1709ie(str, true));
            i10++;
        }
        return arrayList;
    }
}
