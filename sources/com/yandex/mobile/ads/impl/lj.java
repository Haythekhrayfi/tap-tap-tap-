package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lj {

    public static final class a extends lj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f22710a;

        public a(boolean z10) {
            super(0);
            this.f22710a = z10;
        }

        public final boolean a() {
            return this.f22710a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f22710a == ((a) obj).f22710a;
        }

        public final int hashCode() {
            boolean z10 = this.f22710a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public final String toString() {
            return androidx.recyclerview.widget.s.a(v60.a("CmpPresent(value="), this.f22710a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class b extends lj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22711a;

        public b(String str) {
            super(0);
            this.f22711a = str;
        }

        public final String a() {
            return this.f22711a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && fd.j0.d(this.f22711a, ((b) obj).f22711a);
        }

        public final int hashCode() {
            String str = this.f22711a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return s.a.a(v60.a("ConsentString(value="), this.f22711a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class c extends lj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22712a;

        public c(String str) {
            super(0);
            this.f22712a = str;
        }

        public final String a() {
            return this.f22712a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && fd.j0.d(this.f22712a, ((c) obj).f22712a);
        }

        public final int hashCode() {
            String str = this.f22712a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return s.a.a(v60.a("Gdpr(value="), this.f22712a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class d extends lj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22713a;

        public d(String str) {
            super(0);
            this.f22713a = str;
        }

        public final String a() {
            return this.f22713a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && fd.j0.d(this.f22713a, ((d) obj).f22713a);
        }

        public final int hashCode() {
            String str = this.f22713a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return s.a.a(v60.a("PurposeConsents(value="), this.f22713a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class e extends lj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f22714a;

        public e(String str) {
            super(0);
            this.f22714a = str;
        }

        public final String a() {
            return this.f22714a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && fd.j0.d(this.f22714a, ((e) obj).f22714a);
        }

        public final int hashCode() {
            String str = this.f22714a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return s.a.a(v60.a("VendorConsents(value="), this.f22714a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    private lj() {
    }

    public /* synthetic */ lj(int i10) {
        this();
    }
}
