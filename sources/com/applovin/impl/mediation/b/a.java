package com.applovin.impl.mediation.b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f9178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f9179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f9180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f9181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f9182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f9183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JSONArray f9184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<String> f9185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<String> f9186k;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.b.a$a, reason: collision with other inner class name */
    public static class C0122a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f9188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9189c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9190d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f9191e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f9192f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f9193g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f9194h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f9195i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f9196j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f9197k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f9198l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f9199m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private JSONArray f9200n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f9201o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private List<String> f9202p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f9203q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private List<String> f9204r;

        public C0122a a(int i10) {
            this.f9196j = i10;
            return this;
        }

        public C0122a a(String str) {
            this.f9188b = str;
            this.f9187a = true;
            return this;
        }

        public C0122a a(List<String> list) {
            this.f9202p = list;
            this.f9201o = true;
            return this;
        }

        public C0122a a(JSONArray jSONArray) {
            this.f9200n = jSONArray;
            this.f9199m = true;
            return this;
        }

        public a a() {
            String strT = this.f9188b;
            if (!this.f9187a) {
                strT = a.t();
            }
            String str = strT;
            String strU = this.f9190d;
            if (!this.f9189c) {
                strU = a.u();
            }
            String str2 = strU;
            String strV = this.f9192f;
            if (!this.f9191e) {
                strV = a.v();
            }
            String str3 = strV;
            String strW = this.f9194h;
            if (!this.f9193g) {
                strW = a.w();
            }
            String str4 = strW;
            JSONArray jSONArrayX = this.f9200n;
            if (!this.f9199m) {
                jSONArrayX = a.x();
            }
            JSONArray jSONArray = jSONArrayX;
            List<String> listY = this.f9202p;
            if (!this.f9201o) {
                listY = a.y();
            }
            List<String> list = listY;
            List<String> listZ = this.f9204r;
            if (!this.f9203q) {
                listZ = a.z();
            }
            return new a(str, str2, str3, str4, this.f9195i, this.f9196j, this.f9197k, this.f9198l, jSONArray, list, listZ);
        }

        public C0122a b(int i10) {
            this.f9197k = i10;
            return this;
        }

        public C0122a b(String str) {
            this.f9190d = str;
            this.f9189c = true;
            return this;
        }

        public C0122a b(List<String> list) {
            this.f9204r = list;
            this.f9203q = true;
            return this;
        }

        public C0122a c(String str) {
            this.f9192f = str;
            this.f9191e = true;
            return this;
        }

        public C0122a d(String str) {
            this.f9194h = str;
            this.f9193g = true;
            return this;
        }

        public C0122a e(String str) {
            this.f9195i = str;
            return this;
        }

        public C0122a f(String str) {
            this.f9198l = str;
            return this;
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("OpenRtbAdConfiguration.Builder(version$value=");
            sbA.append(this.f9188b);
            sbA.append(", title$value=");
            sbA.append(this.f9190d);
            sbA.append(", advertiser$value=");
            sbA.append(this.f9192f);
            sbA.append(", body$value=");
            sbA.append(this.f9194h);
            sbA.append(", mainImageUrl=");
            sbA.append(this.f9195i);
            sbA.append(", mainImageWidth=");
            sbA.append(this.f9196j);
            sbA.append(", mainImageHeight=");
            sbA.append(this.f9197k);
            sbA.append(", clickDestinationUrl=");
            sbA.append(this.f9198l);
            sbA.append(", clickTrackingUrls$value=");
            sbA.append(this.f9200n);
            sbA.append(", jsTrackers$value=");
            sbA.append(this.f9202p);
            sbA.append(", impressionUrls$value=");
            sbA.append(this.f9204r);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public a(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, JSONArray jSONArray, List<String> list, List<String> list2) {
        this.f9176a = str;
        this.f9177b = str2;
        this.f9178c = str3;
        this.f9179d = str4;
        this.f9180e = str5;
        this.f9181f = i10;
        this.f9182g = i11;
        this.f9183h = str6;
        this.f9184i = jSONArray;
        this.f9185j = list;
        this.f9186k = list2;
    }

    public static C0122a a() {
        return new C0122a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String u() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String w() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONArray x() {
        return new JSONArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> y() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<String> z() {
        return new ArrayList();
    }

    public String b() {
        return this.f9176a;
    }

    public String c() {
        return this.f9177b;
    }

    public String d() {
        return this.f9178c;
    }

    public String e() {
        return this.f9179d;
    }

    public String f() {
        return this.f9180e;
    }

    public int g() {
        return this.f9181f;
    }

    public int h() {
        return this.f9182g;
    }

    public String i() {
        return this.f9183h;
    }

    public JSONArray j() {
        return this.f9184i;
    }

    public List<String> k() {
        return this.f9185j;
    }

    public List<String> l() {
        return this.f9186k;
    }
}
