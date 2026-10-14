package com.yandex.metrica.impl.ob;

import com.yandex.metrica.IParamsCallback;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2066wi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2091xi f17805a = new C2091xi();

    public final C1646g1 a(String str) {
        Boolean boolB;
        String str2;
        C2091xi c2091xi = this.f17805a;
        if (str.hashCode() != 949037879 || !str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) || (boolB = c2091xi.b()) == null) {
            return null;
        }
        boolean zBooleanValue = boolB.booleanValue();
        EnumC1596e1 enumC1596e1C = c2091xi.c();
        String strA = c2091xi.a();
        if (zBooleanValue) {
            str2 = "true";
        } else {
            if (zBooleanValue) {
                throw new jc.g();
            }
            str2 = "false";
        }
        return new C1646g1(str2, enumC1596e1C, strA);
    }

    public final synchronized C2091xi a() {
        return this.f17805a;
    }

    public final synchronized void a(C2091xi c2091xi) {
        this.f17805a = c2091xi;
    }

    public final synchronized void a(List<String> list, Map<String, C1646g1> map) {
        Boolean boolB;
        String str;
        for (String str2 : list) {
            if (str2.hashCode() == 949037879 && str2.equals(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED) && (boolB = this.f17805a.b()) != null) {
                boolean zBooleanValue = boolB.booleanValue();
                EnumC1596e1 enumC1596e1C = this.f17805a.c();
                String strA = this.f17805a.a();
                if (zBooleanValue) {
                    str = "true";
                } else {
                    if (zBooleanValue) {
                        throw new jc.g();
                    }
                    str = "false";
                }
                map.put(IParamsCallback.YANDEX_MOBILE_METRICA_FEATURE_LIB_SSL_ENABLED, new C1646g1(str, enumC1596e1C, strA));
            }
        }
    }
}
