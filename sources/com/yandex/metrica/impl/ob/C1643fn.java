package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1643fn implements InterfaceC1767kn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1618en f16153a;

    public C1643fn() {
        this(new C1593dn(P0.i().f()));
    }

    public C1643fn(C1593dn c1593dn) {
        this(new C1618en("AES/CBC/PKCS5Padding", c1593dn.b(), c1593dn.a()));
    }

    public C1643fn(C1618en c1618en) {
        this.f16153a = c1618en;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    @Override // com.yandex.metrica.impl.ob.InterfaceC1767kn
    public C1742jn a(C1744k0 c1744k0) {
        String strEncodeToString;
        String strP = c1744k0.p();
        if (TextUtils.isEmpty(strP)) {
            strEncodeToString = null;
        } else {
            try {
                byte[] bArrA = this.f16153a.a(strP.getBytes("UTF-8"));
                if (bArrA != null) {
                    strEncodeToString = Base64.encodeToString(bArrA, 0);
                } else {
                    strEncodeToString = null;
                }
            } catch (Throwable unused) {
            }
        }
        return new C1742jn(c1744k0.f(strEncodeToString), EnumC1817mn.AES_VALUE_ENCRYPTION);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1767kn
    public byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || bArr.length <= 0) {
            return bArr2;
        }
        try {
            byte[] bArrDecode = Base64.decode(bArr, 0);
            C1618en c1618en = this.f16153a;
            Objects.requireNonNull(c1618en);
            return c1618en.a(bArrDecode, 0, bArrDecode.length);
        } catch (Throwable unused) {
            return bArr2;
        }
    }
}
