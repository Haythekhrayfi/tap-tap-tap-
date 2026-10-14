package com.yandex.metrica.impl.ob;

import android.os.Build;
import java.util.Set;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1866om {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<String> f17025a;

    public C1866om(Set<String> set) {
        this.f17025a = set;
    }

    private String a(String[] strArr) {
        for (String str : strArr) {
            if (this.f17025a.contains(str)) {
                return str;
            }
        }
        return null;
    }

    public String a() {
        if (!U2.a(21)) {
            return a(new String[]{Build.CPU_ABI, Build.CPU_ABI2});
        }
        String strA = a(Build.SUPPORTED_64_BIT_ABIS);
        return strA != null ? strA : a(Build.SUPPORTED_32_BIT_ABIS);
    }
}
