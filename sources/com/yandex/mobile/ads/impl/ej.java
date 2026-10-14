package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public enum ej {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("IABConsent_ConsentString", "IABTCF_TCString"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("IABConsent_SubjectToGDPR", "IABTCF_gdprApplies"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("IABConsent_CMPPresent", "IABTCF_CmpSdkID"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("IABConsent_ParsedPurposeConsents", "IABTCF_PurposeConsents"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("IABConsent_ParsedVendorConsents", "IABTCF_VendorConsents");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20260b;

    public static final class a {
        public static ej a(String str) {
            fd.j0.i(str, "v1");
            for (ej ejVar : ej.values()) {
                if (fd.j0.d(ejVar.a(), str)) {
                    return ejVar;
                }
            }
            return null;
        }

        public static ej b(String str) {
            fd.j0.i(str, "v2");
            for (ej ejVar : ej.values()) {
                if (fd.j0.d(ejVar.b(), str)) {
                    return ejVar;
                }
            }
            return null;
        }
    }

    ej(String str, String str2) {
        this.f20259a = str;
        this.f20260b = str2;
    }

    public final String a() {
        return this.f20259a;
    }

    public final String b() {
        return this.f20260b;
    }
}
