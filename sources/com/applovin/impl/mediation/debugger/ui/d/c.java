package com.applovin.impl.mediation.debugger.ui.d;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f9715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpannedString f9717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SpannedString f9718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f9719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f9720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9726m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9727n;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f9728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public SpannedString f9730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SpannedString f9731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f9733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9734g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9735h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9736i = -16777216;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9737j = -16777216;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f9738k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f9739l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f9740m;

        public a(b bVar) {
            this.f9728a = bVar;
        }

        public a a(int i10) {
            this.f9735h = i10;
            return this;
        }

        public a a(Context context) {
            this.f9735h = R.drawable.applovin_ic_disclosure_arrow;
            this.f9739l = g.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public a a(SpannedString spannedString) {
            this.f9730c = spannedString;
            return this;
        }

        public a a(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a a(boolean z10) {
            this.f9729b = z10;
            return this;
        }

        public c a() {
            return new c(this);
        }

        public a b(int i10) {
            this.f9737j = i10;
            return this;
        }

        public a b(SpannedString spannedString) {
            this.f9731d = spannedString;
            return this;
        }

        public a b(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public a b(boolean z10) {
            this.f9740m = z10;
            return this;
        }

        public a c(int i10) {
            this.f9739l = i10;
            return this;
        }

        public a c(String str) {
            this.f9732e = str;
            return this;
        }

        public a d(String str) {
            this.f9733f = str;
            return this;
        }
    }

    public enum b {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f9748g;

        b(int i10) {
            this.f9748g = i10;
        }

        public int a() {
            return this.f9748g;
        }

        public int b() {
            if (this == SECTION) {
                return R.layout.mediation_debugger_list_section;
            }
            if (this == SECTION_CENTERED) {
                return R.layout.mediation_debugger_list_section_centered;
            }
            if (this == SIMPLE) {
                return android.R.layout.simple_list_item_1;
            }
            return this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }
    }

    private c(a aVar) {
        this.f9721h = 0;
        this.f9722i = 0;
        this.f9723j = -16777216;
        this.f9724k = -16777216;
        this.f9725l = 0;
        this.f9726m = 0;
        this.f9715b = aVar.f9728a;
        this.f9716c = aVar.f9729b;
        this.f9717d = aVar.f9730c;
        this.f9718e = aVar.f9731d;
        this.f9719f = aVar.f9732e;
        this.f9720g = aVar.f9733f;
        this.f9721h = aVar.f9734g;
        this.f9722i = aVar.f9735h;
        this.f9723j = aVar.f9736i;
        this.f9724k = aVar.f9737j;
        this.f9725l = aVar.f9738k;
        this.f9726m = aVar.f9739l;
        this.f9727n = aVar.f9740m;
    }

    public c(b bVar) {
        this.f9721h = 0;
        this.f9722i = 0;
        this.f9723j = -16777216;
        this.f9724k = -16777216;
        this.f9725l = 0;
        this.f9726m = 0;
        this.f9715b = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public static int h() {
        return b.COUNT.a();
    }

    public static a p() {
        return a(b.RIGHT_DETAIL);
    }

    public int a() {
        return this.f9722i;
    }

    public int b() {
        return this.f9726m;
    }

    public boolean c() {
        return this.f9716c;
    }

    public SpannedString d() {
        return this.f9718e;
    }

    public int e() {
        return this.f9724k;
    }

    public int g() {
        return this.f9721h;
    }

    public int i() {
        return this.f9715b.a();
    }

    public int j() {
        return this.f9715b.b();
    }

    public boolean j_() {
        return this.f9727n;
    }

    public SpannedString k() {
        return this.f9717d;
    }

    public String l() {
        return this.f9719f;
    }

    public String m() {
        return this.f9720g;
    }

    public int n() {
        return this.f9723j;
    }

    public int o() {
        return this.f9725l;
    }
}
