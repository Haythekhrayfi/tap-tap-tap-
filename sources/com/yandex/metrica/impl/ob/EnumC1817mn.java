package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1817mn {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16903a;

    EnumC1817mn(int i10) {
        this.f16903a = i10;
    }

    public static EnumC1817mn a(Integer num) {
        if (num != null) {
            EnumC1817mn[] enumC1817mnArrValues = values();
            for (int i10 = 0; i10 < 3; i10++) {
                EnumC1817mn enumC1817mn = enumC1817mnArrValues[i10];
                if (enumC1817mn.f16903a == num.intValue()) {
                    return enumC1817mn;
                }
            }
        }
        return NONE;
    }

    public int a() {
        return this.f16903a;
    }
}
