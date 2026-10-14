package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1596e1 {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15989a;

    EnumC1596e1(String str) {
        this.f15989a = str;
    }

    public static EnumC1596e1 a(String str) {
        EnumC1596e1[] enumC1596e1ArrValues = values();
        for (int i10 = 0; i10 < 6; i10++) {
            EnumC1596e1 enumC1596e1 = enumC1596e1ArrValues[i10];
            if (enumC1596e1.f15989a.equals(str)) {
                return enumC1596e1;
            }
        }
        return UNKNOWN;
    }

    public String a() {
        return this.f15989a;
    }
}
