package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1849o5 extends AbstractC1948s5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Um<String> f16996b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.o5$a */
    public class a implements Um<String> {
        @Override // com.yandex.metrica.impl.ob.Um
        public void b(String str) {
            String str2 = str;
            if (U2.a(21)) {
                CrashpadServiceHelper.a(str2);
            }
        }
    }

    public C1849o5(C1624f4 c1624f4) {
        this(c1624f4, new a());
    }

    public C1849o5(C1624f4 c1624f4, Um<String> um) {
        super(c1624f4);
        this.f16996b = um;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1824n5
    public boolean a(C1744k0 c1744k0) {
        Bundle bundleK = c1744k0.k();
        if (bundleK == null) {
            return true;
        }
        String string = bundleK.getString("payload_crash_id");
        if (TextUtils.isEmpty(string)) {
            return true;
        }
        this.f16996b.b(string);
        return true;
    }
}
