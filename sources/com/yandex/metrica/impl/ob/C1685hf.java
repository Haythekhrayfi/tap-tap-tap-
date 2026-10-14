package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1685hf implements InterfaceC1809mf, Ve {
    @Override // com.yandex.metrica.impl.ob.Ve
    public int a(EnumC1817mn enumC1817mn) {
        return 2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1809mf
    public byte[] a(Xe xe2, C1736jh c1736jh) {
        return TextUtils.isEmpty(xe2.f15485b) ? new byte[0] : Base64.decode(xe2.f15485b, 0);
    }
}
