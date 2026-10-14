package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1503a8 implements Tm<String, Bundle, Z7> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1802m8 f15736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1877p8 f15737b;

    public C1503a8() {
        this(new C1802m8(), new C1877p8());
    }

    public C1503a8(C1802m8 c1802m8, C1877p8 c1877p8) {
        this.f15736a = c1802m8;
        this.f15737b = c1877p8;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    @Override // com.yandex.metrica.impl.ob.Tm
    public Z7 a(String str, Bundle bundle) {
        C1553c8 c1553c8;
        C4 c4A;
        C1852o8 c1852o8;
        if (!TextUtils.isEmpty(str) && bundle.containsKey("arg_df") && bundle.containsKey("arg_ct")) {
            String string = bundle.getString("arg_df");
            if (TextUtils.isEmpty(string)) {
                c1553c8 = null;
            } else {
                c1553c8 = new C1553c8(str, string, bundle.getLong("arg_ct"));
            }
        } else {
            c1553c8 = null;
        }
        if (c1553c8 != null) {
            String string2 = bundle.getString("arg_cd");
            if (!TextUtils.isEmpty(string2) && (c4A = this.f15736a.a(string2)) != null) {
                C1877p8 c1877p8 = this.f15737b;
                String string3 = bundle.getString("arg_rc");
                if (string3 == null) {
                    string3 = "";
                }
                Objects.requireNonNull(c1877p8);
                try {
                    C2120ym.a aVar = new C2120ym.a(new String(Base64.decode(string3, 0)));
                    try {
                        String strOptString = aVar.optString("arg_ee", "");
                        String string4 = aVar.has("arg_hv") ? aVar.getString("arg_hv") : null;
                        if (TextUtils.isEmpty(strOptString)) {
                            strOptString = null;
                        }
                        if (TextUtils.isEmpty(string4)) {
                            string4 = null;
                        }
                        c1852o8 = new C1852o8(strOptString, string4);
                    } catch (Exception unused) {
                        c1852o8 = new C1852o8(null, null);
                    }
                } catch (Exception unused2) {
                    c1852o8 = new C1852o8(null, null);
                }
                return new Z7(c1553c8, c4A, c1852o8);
            }
        }
        return null;
    }
}
