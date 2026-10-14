package com.applovin.impl.b.b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: com.applovin.impl.b.b.b$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f8731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f8732c;

        static {
            int[] iArr = new int[a.values().length];
            f8732c = iArr;
            try {
                iArr[a.PERSONALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8732c[a.NON_PERSONALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8732c[a.LIMITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8732c[a.DROPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.values().length];
            f8731b = iArr2;
            try {
                iArr2[d.CONSENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8731b[d.LEGITIMATE_INTEREST.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8731b[d.AGREED_TO_BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8731b[d.DISAGREED_TO_BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[e.values().length];
            f8730a = iArr3;
            try {
                iArr3[e.f8761a.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8730a[e.f8762b.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8730a[e.f8763c.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8730a[e.f8764d.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum a {
        PERSONALIZED,
        NON_PERSONALIZED,
        LIMITED,
        DROPPED;

        @Override // java.lang.Enum
        public String toString() {
            int i10 = AnonymousClass1.f8732c[ordinal()];
            if (i10 == 1) {
                return "Personalized Ads";
            }
            if (i10 == 2) {
                return "Non-personalized Ads";
            }
            if (i10 != 3) {
                return i10 != 4 ? "" : "Dropped Ad Requests";
            }
            return "Limited Ads";
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.b.b.b$b, reason: collision with other inner class name */
    public enum EnumC0118b {
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        ELEVEN(11);


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f8750l;

        EnumC0118b(int i10) {
            this.f8750l = i10;
        }
    }

    public enum c {
        NOT_ALLOWED,
        REQUIRE_CONSENT,
        REQUIRE_LEGITIMATE_INTEREST,
        UNDEFINED;

        public static c a(int i10) {
            if (i10 == 1) {
                return REQUIRE_CONSENT;
            }
            if (i10 != 2) {
                return i10 != 3 ? NOT_ALLOWED : UNDEFINED;
            }
            return REQUIRE_LEGITIMATE_INTEREST;
        }
    }

    public enum d {
        CONSENT,
        LEGITIMATE_INTEREST,
        AGREED_TO_BOTH,
        DISAGREED_TO_BOTH;

        public static d a(boolean z10, boolean z11) {
            if (z10 && z11) {
                return AGREED_TO_BOTH;
            }
            if (z10) {
                return CONSENT;
            }
            return z11 ? LEGITIMATE_INTEREST : DISAGREED_TO_BOTH;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = AnonymousClass1.f8731b[ordinal()];
            if (i10 == 1) {
                return "Consent";
            }
            if (i10 == 2) {
                return "Legitimate Interest";
            }
            if (i10 != 3) {
                return i10 != 4 ? "" : "No Consent / Legitimate Interest";
            }
            return "Consent and Legitimate Interest";
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f8761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f8762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f8763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f8764d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ e[] f8765f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<c> f8766e;

        static {
            e eVar = new e("UNDECLARED", 0, new ArrayList());
            f8761a = eVar;
            c cVar = c.NOT_ALLOWED;
            e eVar2 = new e("CONSENT", 1, Arrays.asList(cVar, c.REQUIRE_LEGITIMATE_INTEREST));
            f8762b = eVar2;
            e eVar3 = new e("LEGITIMATE_INTEREST", 2, Arrays.asList(cVar, c.REQUIRE_CONSENT));
            f8763c = eVar3;
            e eVar4 = new e("FLEXIBLE", 3, Arrays.asList(cVar));
            f8764d = eVar4;
            f8765f = new e[]{eVar, eVar2, eVar3, eVar4};
        }

        private e(String str, int i10, List list) {
            super(str, i10);
            this.f8766e = list;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f8765f.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = AnonymousClass1.f8730a[ordinal()];
            if (i10 == 1) {
                return "Not declared as required by vendor";
            }
            if (i10 == 2) {
                return "Consent";
            }
            if (i10 != 3) {
                return i10 != 4 ? "" : "Consent or legitimate Interest";
            }
            return "Legitimate Interest";
        }
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : str.split("\\.")) {
            if (!b(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, int i10) {
        return str != null && i10 >= 0 && str.length() > i10 && str.charAt(i10) == '1';
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^[a-zA-Z\\d_-]*$");
    }
}
