package bb;

import android.os.Bundle;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final C0062b E = new C0062b(null);
    public final Integer A;
    public final Integer B;
    public final boolean C;
    public final String D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f3466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f3469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f3470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f3471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f3472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f3475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f3476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f3477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f3478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f3479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f3480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f3481u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f3482v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f3484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f3485y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f3486z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f3489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f3490d;

        public a(String str, String str2) {
            j0.i(str, "supportEmail");
            j0.i(str2, "supportEmailVip");
            this.f3487a = str;
            this.f3488b = str2;
            this.f3489c = true;
        }

        public final b a() {
            return new b(this.f3487a, this.f3488b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f3489c, this.f3490d, null);
        }
    }

    /* JADX INFO: renamed from: bb.b$b, reason: collision with other inner class name */
    public static final class C0062b {
        public C0062b() {
        }

        public C0062b(vc.g gVar) {
        }

        public final b a(Bundle bundle) {
            String str = null;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("SETTINGS_CUSTOMER_SUPPORT_EMAIL");
            String string2 = bundle.getString("SETTINGS_CUSTOMER_SUPPORT_VIP_EMAIL");
            String string3 = bundle.getString("SETTINGS_CUSTOMER_SUPPORT_TITLE");
            String string4 = bundle.getString("SETTINGS_VIP_CUSTOMER_SUPPORT_TITLE");
            String string5 = bundle.getString("SETTINGS_CUSTOMER_SUPPORT_SUMMARY");
            Integer numValueOf = Integer.valueOf(bundle.getInt("SETTINGS_CUSTOMER_SUPPORT_ICON"));
            if (!(numValueOf.intValue() != 0)) {
                numValueOf = null;
            }
            String string6 = bundle.getString("SETTINGS_REMOVE_ADS_TITLE");
            String string7 = bundle.getString("SETTINGS_REMOVE_ADS_SUMMARY");
            Integer numValueOf2 = Integer.valueOf(bundle.getInt("SETTINGS_REMOVE_ADS_ICON"));
            Integer num = numValueOf2.intValue() != 0 ? numValueOf2 : null;
            String string8 = bundle.getString("SETTINGS_PERSONALIZED_ADS_TITLE");
            String string9 = bundle.getString("SETTINGS_PERSONALIZED_ADS_SUMMARY");
            Integer numValueOf3 = Integer.valueOf(bundle.getInt("SETTINGS_PERSONALIZED_ADS_ICON"));
            Integer num2 = numValueOf3.intValue() != 0 ? numValueOf3 : null;
            String string10 = bundle.getString("SETTINGS_RATE_US_TITLE");
            String string11 = bundle.getString("SETTINGS_RATE_US_SUMMARY");
            Integer numValueOf4 = Integer.valueOf(bundle.getInt("SETTINGS_RATE_US_ICON"));
            Integer num3 = numValueOf4.intValue() != 0 ? numValueOf4 : null;
            String string12 = bundle.getString("SETTINGS_SHARE_APP_TITLE");
            String string13 = bundle.getString("SETTINGS_SHARE_APP_SUMMARY");
            Integer numValueOf5 = Integer.valueOf(bundle.getInt("SETTINGS_SHARE_APP_ICON"));
            Integer num4 = numValueOf5.intValue() != 0 ? numValueOf5 : null;
            String string14 = bundle.getString("SETTINGS_PRIVACY_POLICY_TITLE");
            String string15 = bundle.getString("SETTINGS_PRIVACY_POLICY_SUMMARY");
            Integer numValueOf6 = Integer.valueOf(bundle.getInt("SETTINGS_PRIVACY_POLICY_ICON"));
            Integer num5 = numValueOf6.intValue() != 0 ? numValueOf6 : null;
            String string16 = bundle.getString("SETTINGS_TERMS_TITLE");
            String string17 = bundle.getString("SETTINGS_TERMS_SUMMARY");
            Integer numValueOf7 = Integer.valueOf(bundle.getInt("SETTINGS_TERMS_ICON"));
            Integer num6 = numValueOf7.intValue() != 0 ? numValueOf7 : null;
            String string18 = bundle.getString("SETTINGS_DELETE_ACCOUNT_TITLE");
            String string19 = bundle.getString("SETTINGS_DELETE_ACCOUNT_SUMMARY");
            Integer numValueOf8 = Integer.valueOf(bundle.getInt("SETTINGS_DELETE_ACCOUNT_ICON"));
            Integer num7 = numValueOf8.intValue() != 0 ? numValueOf8 : null;
            Integer numValueOf9 = Integer.valueOf(bundle.getInt("SETTINGS_APP_VERSION_ICON"));
            Integer num8 = Boolean.valueOf(numValueOf9.intValue() != 0).booleanValue() ? numValueOf9 : null;
            boolean z10 = bundle.getBoolean("SETTINGS_SHOW_ICONS", true);
            String string20 = bundle.getString("SETTINGS_DELETE_ACCOUNT_URL");
            if (string20 != null) {
                if (string20.length() > 0) {
                    str = string20;
                }
            }
            return new b(string, string2, string3, string4, string5, numValueOf, string6, string7, num, string8, string9, num2, string10, string11, num3, string12, string13, num4, string14, string15, num5, string16, string17, num6, string18, string19, num7, num8, z10, str, null);
        }
    }

    public b(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, Integer num2, String str8, String str9, Integer num3, String str10, String str11, Integer num4, String str12, String str13, Integer num5, String str14, String str15, Integer num6, String str16, String str17, Integer num7, String str18, String str19, Integer num8, Integer num9, boolean z10, String str20, vc.g gVar) {
        this.f3461a = str;
        this.f3462b = str2;
        this.f3463c = str3;
        this.f3464d = str4;
        this.f3465e = str5;
        this.f3466f = num;
        this.f3467g = str6;
        this.f3468h = str7;
        this.f3469i = num2;
        this.f3470j = str8;
        this.f3471k = str9;
        this.f3472l = num3;
        this.f3473m = str10;
        this.f3474n = str11;
        this.f3475o = num4;
        this.f3476p = str12;
        this.f3477q = str13;
        this.f3478r = num5;
        this.f3479s = str14;
        this.f3480t = str15;
        this.f3481u = num6;
        this.f3482v = str16;
        this.f3483w = str17;
        this.f3484x = num7;
        this.f3485y = str18;
        this.f3486z = str19;
        this.A = num8;
        this.B = num9;
        this.C = z10;
        this.D = str20;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("SETTINGS_CUSTOMER_SUPPORT_EMAIL", this.f3461a);
        bundle.putString("SETTINGS_CUSTOMER_SUPPORT_VIP_EMAIL", this.f3462b);
        bundle.putString("SETTINGS_CUSTOMER_SUPPORT_TITLE", this.f3463c);
        bundle.putString("SETTINGS_VIP_CUSTOMER_SUPPORT_TITLE", this.f3464d);
        bundle.putString("SETTINGS_CUSTOMER_SUPPORT_SUMMARY", this.f3465e);
        Integer num = this.f3466f;
        if (num != null) {
            bundle.putInt("SETTINGS_CUSTOMER_SUPPORT_ICON", num.intValue());
        }
        bundle.putString("SETTINGS_REMOVE_ADS_TITLE", this.f3467g);
        bundle.putString("SETTINGS_REMOVE_ADS_SUMMARY", this.f3468h);
        Integer num2 = this.f3469i;
        if (num2 != null) {
            bundle.putInt("SETTINGS_REMOVE_ADS_ICON", num2.intValue());
        }
        bundle.putString("SETTINGS_PERSONALIZED_ADS_TITLE", this.f3470j);
        bundle.putString("SETTINGS_PERSONALIZED_ADS_SUMMARY", this.f3471k);
        Integer num3 = this.f3472l;
        if (num3 != null) {
            bundle.putInt("SETTINGS_PERSONALIZED_ADS_ICON", num3.intValue());
        }
        bundle.putString("SETTINGS_RATE_US_TITLE", this.f3473m);
        bundle.putString("SETTINGS_RATE_US_SUMMARY", this.f3474n);
        Integer num4 = this.f3475o;
        if (num4 != null) {
            bundle.putInt("SETTINGS_RATE_US_ICON", num4.intValue());
        }
        bundle.putString("SETTINGS_SHARE_APP_TITLE", this.f3476p);
        bundle.putString("SETTINGS_SHARE_APP_SUMMARY", this.f3477q);
        Integer num5 = this.f3478r;
        if (num5 != null) {
            bundle.putInt("SETTINGS_SHARE_APP_ICON", num5.intValue());
        }
        bundle.putString("SETTINGS_PRIVACY_POLICY_TITLE", this.f3479s);
        bundle.putString("SETTINGS_PRIVACY_POLICY_SUMMARY", this.f3480t);
        Integer num6 = this.f3481u;
        if (num6 != null) {
            bundle.putInt("SETTINGS_PRIVACY_POLICY_ICON", num6.intValue());
        }
        bundle.putString("SETTINGS_TERMS_TITLE", this.f3482v);
        bundle.putString("SETTINGS_TERMS_SUMMARY", this.f3483w);
        Integer num7 = this.f3484x;
        if (num7 != null) {
            bundle.putInt("SETTINGS_TERMS_ICON", num7.intValue());
        }
        bundle.putString("SETTINGS_DELETE_ACCOUNT_TITLE", this.f3485y);
        bundle.putString("SETTINGS_DELETE_ACCOUNT_SUMMARY", this.f3486z);
        Integer num8 = this.A;
        if (num8 != null) {
            bundle.putInt("SETTINGS_DELETE_ACCOUNT_ICON", num8.intValue());
        }
        Integer num9 = this.B;
        if (num9 != null) {
            bundle.putInt("SETTINGS_APP_VERSION_ICON", num9.intValue());
        }
        bundle.putBoolean("SETTINGS_SHOW_ICONS", this.C);
        String str = this.D;
        if (str != null) {
            bundle.putString("SETTINGS_DELETE_ACCOUNT_URL", str);
        }
        return bundle;
    }
}
