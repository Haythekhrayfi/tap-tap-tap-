package za;

import ch.qos.logback.core.CoreConstants;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.b.f f45226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.zipoapps.premiumhelper.ui.rate.c.b f45227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f45228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f45229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f45230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f45231f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public oa.b.f f45232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.zipoapps.premiumhelper.ui.rate.c.b f45233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f45234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f45235d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f45236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f45237f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f45238g;

        public a() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public a(oa.b.f fVar, com.zipoapps.premiumhelper.ui.rate.c.b bVar, b bVar2, String str, String str2, Integer num, Integer num2) {
            this.f45232a = fVar;
            this.f45233b = bVar;
            this.f45234c = bVar2;
            this.f45235d = str;
            this.f45236e = str2;
            this.f45237f = num;
            this.f45238g = num2;
        }

        public /* synthetic */ a(oa.b.f fVar, com.zipoapps.premiumhelper.ui.rate.c.b bVar, b bVar2, String str, String str2, Integer num, Integer num2, int i10, vc.g gVar) {
            this((i10 & 1) != 0 ? null : fVar, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : bVar2, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f45232a == aVar.f45232a && this.f45233b == aVar.f45233b && j0.d(this.f45234c, aVar.f45234c) && j0.d(this.f45235d, aVar.f45235d) && j0.d(this.f45236e, aVar.f45236e) && j0.d(this.f45237f, aVar.f45237f) && j0.d(this.f45238g, aVar.f45238g);
        }

        public int hashCode() {
            oa.b.f fVar = this.f45232a;
            int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
            com.zipoapps.premiumhelper.ui.rate.c.b bVar = this.f45233b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            b bVar2 = this.f45234c;
            int iHashCode3 = (iHashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            String str = this.f45235d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f45236e;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f45237f;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f45238g;
            return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Builder(dialogType=");
            sbA.append(this.f45232a);
            sbA.append(", dialogMode=");
            sbA.append(this.f45233b);
            sbA.append(", dialogStyle=");
            sbA.append(this.f45234c);
            sbA.append(", supportEmail=");
            sbA.append(this.f45235d);
            sbA.append(", supportEmailVip=");
            sbA.append(this.f45236e);
            sbA.append(", rateSessionStart=");
            sbA.append(this.f45237f);
            sbA.append(", rateDialogLayout=");
            sbA.append(this.f45238g);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f45240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f45241c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Integer f45242d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Integer f45243e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Integer f45244f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Integer f45245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Integer f45246b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Integer f45247c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Integer f45248d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Integer f45249e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Integer f45250f;

            public a() {
                this(null, null, null, null, null, null, 63, null);
            }

            public a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
                this.f45245a = num;
                this.f45246b = num2;
                this.f45247c = num3;
                this.f45248d = num4;
                this.f45249e = num5;
                this.f45250f = num6;
            }

            public /* synthetic */ a(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i10, vc.g gVar) {
                this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : num2, (i10 & 4) != 0 ? null : num3, (i10 & 8) != 0 ? null : num4, (i10 & 16) != 0 ? null : num5, (i10 & 32) != 0 ? null : num6);
            }

            public final b a() {
                Integer num = this.f45245a;
                if (num != null) {
                    return new b(num.intValue(), this.f45246b, this.f45247c, this.f45248d, this.f45249e, this.f45250f, null);
                }
                throw new IllegalStateException("Main button color is mandatory".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return j0.d(this.f45245a, aVar.f45245a) && j0.d(this.f45246b, aVar.f45246b) && j0.d(this.f45247c, aVar.f45247c) && j0.d(this.f45248d, aVar.f45248d) && j0.d(this.f45249e, aVar.f45249e) && j0.d(this.f45250f, aVar.f45250f);
            }

            public int hashCode() {
                Integer num = this.f45245a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Integer num2 = this.f45246b;
                int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
                Integer num3 = this.f45247c;
                int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
                Integer num4 = this.f45248d;
                int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
                Integer num5 = this.f45249e;
                int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
                Integer num6 = this.f45250f;
                return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
            }

            public String toString() {
                StringBuilder sbA = defpackage.a.a("Builder(buttonColor=");
                sbA.append(this.f45245a);
                sbA.append(", disabledButtonColor=");
                sbA.append(this.f45246b);
                sbA.append(", pressedButtonColor=");
                sbA.append(this.f45247c);
                sbA.append(", backgroundColor=");
                sbA.append(this.f45248d);
                sbA.append(", textColor=");
                sbA.append(this.f45249e);
                sbA.append(", buttonTextColor=");
                sbA.append(this.f45250f);
                sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                return sbA.toString();
            }
        }

        public b(int i10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, vc.g gVar) {
            this.f45239a = i10;
            this.f45240b = num;
            this.f45241c = num2;
            this.f45242d = num3;
            this.f45243e = num4;
            this.f45244f = num5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f45239a == bVar.f45239a && j0.d(this.f45240b, bVar.f45240b) && j0.d(this.f45241c, bVar.f45241c) && j0.d(this.f45242d, bVar.f45242d) && j0.d(this.f45243e, bVar.f45243e) && j0.d(this.f45244f, bVar.f45244f);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f45239a) * 31;
            Integer num = this.f45240b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f45241c;
            int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f45242d;
            int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f45243e;
            int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f45244f;
            return iHashCode5 + (num5 != null ? num5.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("RateBarDialogStyle(buttonColor=");
            sbA.append(this.f45239a);
            sbA.append(", disabledButtonColor=");
            sbA.append(this.f45240b);
            sbA.append(", pressedButtonColor=");
            sbA.append(this.f45241c);
            sbA.append(", backgroundColor=");
            sbA.append(this.f45242d);
            sbA.append(", textColor=");
            sbA.append(this.f45243e);
            sbA.append(", buttonTextColor=");
            sbA.append(this.f45244f);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f45251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f45252b;

        public c(String str, String str2) {
            j0.i(str, "supportEmail");
            j0.i(str2, "vipSupportEmail");
            this.f45251a = str;
            this.f45252b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return j0.d(this.f45251a, cVar.f45251a) && j0.d(this.f45252b, cVar.f45252b);
        }

        public int hashCode() {
            return this.f45252b.hashCode() + (this.f45251a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("SupportEmailContainer(supportEmail=");
            sbA.append(this.f45251a);
            sbA.append(", vipSupportEmail=");
            return s.a.a(sbA, this.f45252b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public i(oa.b.f fVar, com.zipoapps.premiumhelper.ui.rate.c.b bVar, b bVar2, c cVar, Integer num, Integer num2, vc.g gVar) {
        this.f45226a = fVar;
        this.f45227b = bVar;
        this.f45228c = bVar2;
        this.f45229d = cVar;
        this.f45230e = num;
        this.f45231f = num2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f45226a == iVar.f45226a && this.f45227b == iVar.f45227b && j0.d(this.f45228c, iVar.f45228c) && j0.d(this.f45229d, iVar.f45229d) && j0.d(this.f45230e, iVar.f45230e) && j0.d(this.f45231f, iVar.f45231f);
    }

    public int hashCode() {
        int iHashCode = this.f45226a.hashCode() * 31;
        com.zipoapps.premiumhelper.ui.rate.c.b bVar = this.f45227b;
        int iHashCode2 = (this.f45228c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        c cVar = this.f45229d;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.f45230e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f45231f;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("RateDialogConfiguration(dialogType=");
        sbA.append(this.f45226a);
        sbA.append(", dialogMode=");
        sbA.append(this.f45227b);
        sbA.append(", dialogStyle=");
        sbA.append(this.f45228c);
        sbA.append(", emails=");
        sbA.append(this.f45229d);
        sbA.append(", rateSessionStart=");
        sbA.append(this.f45230e);
        sbA.append(", rateDialogLayout=");
        sbA.append(this.f45231f);
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sbA.toString();
    }
}
