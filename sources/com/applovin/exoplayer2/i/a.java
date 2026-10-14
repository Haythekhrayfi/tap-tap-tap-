package com.applovin.exoplayer2.i;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.exoplayer2.a.p;
import com.applovin.exoplayer2.common.base.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6736a = new C0095a().a("").e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.applovin.exoplayer2.g.a<a> f6737s = p.f4009y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f6738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f6739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Layout.Alignment f6740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bitmap f6741e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f6742f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f6745i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6746j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f6747k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f6748l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6749m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6750n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6751o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float f6752p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f6753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f6754r;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.i.a$a, reason: collision with other inner class name */
    public static final class C0095a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f6755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f6756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f6757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f6758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f6759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f6760f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f6761g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f6762h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f6763i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f6764j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f6765k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f6766l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f6767m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f6768n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f6769o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f6770p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f6771q;

        public C0095a() {
            this.f6755a = null;
            this.f6756b = null;
            this.f6757c = null;
            this.f6758d = null;
            this.f6759e = -3.4028235E38f;
            this.f6760f = Integer.MIN_VALUE;
            this.f6761g = Integer.MIN_VALUE;
            this.f6762h = -3.4028235E38f;
            this.f6763i = Integer.MIN_VALUE;
            this.f6764j = Integer.MIN_VALUE;
            this.f6765k = -3.4028235E38f;
            this.f6766l = -3.4028235E38f;
            this.f6767m = -3.4028235E38f;
            this.f6768n = false;
            this.f6769o = -16777216;
            this.f6770p = Integer.MIN_VALUE;
        }

        private C0095a(a aVar) {
            this.f6755a = aVar.f6738b;
            this.f6756b = aVar.f6741e;
            this.f6757c = aVar.f6739c;
            this.f6758d = aVar.f6740d;
            this.f6759e = aVar.f6742f;
            this.f6760f = aVar.f6743g;
            this.f6761g = aVar.f6744h;
            this.f6762h = aVar.f6745i;
            this.f6763i = aVar.f6746j;
            this.f6764j = aVar.f6751o;
            this.f6765k = aVar.f6752p;
            this.f6766l = aVar.f6747k;
            this.f6767m = aVar.f6748l;
            this.f6768n = aVar.f6749m;
            this.f6769o = aVar.f6750n;
            this.f6770p = aVar.f6753q;
            this.f6771q = aVar.f6754r;
        }

        public C0095a a(float f10) {
            this.f6762h = f10;
            return this;
        }

        public C0095a a(float f10, int i10) {
            this.f6759e = f10;
            this.f6760f = i10;
            return this;
        }

        public C0095a a(int i10) {
            this.f6761g = i10;
            return this;
        }

        public C0095a a(Bitmap bitmap) {
            this.f6756b = bitmap;
            return this;
        }

        public C0095a a(Layout.Alignment alignment) {
            this.f6757c = alignment;
            return this;
        }

        public C0095a a(CharSequence charSequence) {
            this.f6755a = charSequence;
            return this;
        }

        public CharSequence a() {
            return this.f6755a;
        }

        public int b() {
            return this.f6761g;
        }

        public C0095a b(float f10) {
            this.f6766l = f10;
            return this;
        }

        public C0095a b(float f10, int i10) {
            this.f6765k = f10;
            this.f6764j = i10;
            return this;
        }

        public C0095a b(int i10) {
            this.f6763i = i10;
            return this;
        }

        public C0095a b(Layout.Alignment alignment) {
            this.f6758d = alignment;
            return this;
        }

        public int c() {
            return this.f6763i;
        }

        public C0095a c(float f10) {
            this.f6767m = f10;
            return this;
        }

        public C0095a c(int i10) {
            this.f6769o = i10;
            this.f6768n = true;
            return this;
        }

        public C0095a d() {
            this.f6768n = false;
            return this;
        }

        public C0095a d(float f10) {
            this.f6771q = f10;
            return this;
        }

        public C0095a d(int i10) {
            this.f6770p = i10;
            return this;
        }

        public a e() {
            return new a(this.f6755a, this.f6757c, this.f6758d, this.f6756b, this.f6759e, this.f6760f, this.f6761g, this.f6762h, this.f6763i, this.f6764j, this.f6765k, this.f6766l, this.f6767m, this.f6768n, this.f6769o, this.f6770p, this.f6771q);
        }
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            com.applovin.exoplayer2.l.a.b(bitmap);
        } else {
            com.applovin.exoplayer2.l.a.a(bitmap == null);
        }
        this.f6738b = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f6739c = alignment;
        this.f6740d = alignment2;
        this.f6741e = bitmap;
        this.f6742f = f10;
        this.f6743g = i10;
        this.f6744h = i11;
        this.f6745i = f11;
        this.f6746j = i12;
        this.f6747k = f13;
        this.f6748l = f14;
        this.f6749m = z10;
        this.f6750n = i14;
        this.f6751o = i13;
        this.f6752p = f12;
        this.f6753q = i15;
        this.f6754r = f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a a(Bundle bundle) {
        C0095a c0095a = new C0095a();
        CharSequence charSequence = bundle.getCharSequence(a(0));
        if (charSequence != null) {
            c0095a.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(a(1));
        if (alignment != null) {
            c0095a.a(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(a(2));
        if (alignment2 != null) {
            c0095a.b(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(a(3));
        if (bitmap != null) {
            c0095a.a(bitmap);
        }
        if (bundle.containsKey(a(4)) && bundle.containsKey(a(5))) {
            c0095a.a(bundle.getFloat(a(4)), bundle.getInt(a(5)));
        }
        if (bundle.containsKey(a(6))) {
            c0095a.a(bundle.getInt(a(6)));
        }
        if (bundle.containsKey(a(7))) {
            c0095a.a(bundle.getFloat(a(7)));
        }
        if (bundle.containsKey(a(8))) {
            c0095a.b(bundle.getInt(a(8)));
        }
        if (bundle.containsKey(a(10)) && bundle.containsKey(a(9))) {
            c0095a.b(bundle.getFloat(a(10)), bundle.getInt(a(9)));
        }
        if (bundle.containsKey(a(11))) {
            c0095a.b(bundle.getFloat(a(11)));
        }
        if (bundle.containsKey(a(12))) {
            c0095a.c(bundle.getFloat(a(12)));
        }
        if (bundle.containsKey(a(13))) {
            c0095a.c(bundle.getInt(a(13)));
        }
        if (!bundle.getBoolean(a(14), false)) {
            c0095a.d();
        }
        if (bundle.containsKey(a(15))) {
            c0095a.d(bundle.getInt(a(15)));
        }
        if (bundle.containsKey(a(16))) {
            c0095a.d(bundle.getFloat(a(16)));
        }
        return c0095a.e();
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public C0095a a() {
        return new C0095a();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return TextUtils.equals(this.f6738b, aVar.f6738b) && this.f6739c == aVar.f6739c && this.f6740d == aVar.f6740d && ((bitmap = this.f6741e) != null ? !((bitmap2 = aVar.f6741e) == null || !bitmap.sameAs(bitmap2)) : aVar.f6741e == null) && this.f6742f == aVar.f6742f && this.f6743g == aVar.f6743g && this.f6744h == aVar.f6744h && this.f6745i == aVar.f6745i && this.f6746j == aVar.f6746j && this.f6747k == aVar.f6747k && this.f6748l == aVar.f6748l && this.f6749m == aVar.f6749m && this.f6750n == aVar.f6750n && this.f6751o == aVar.f6751o && this.f6752p == aVar.f6752p && this.f6753q == aVar.f6753q && this.f6754r == aVar.f6754r;
    }

    public int hashCode() {
        return Objects.hashCode(this.f6738b, this.f6739c, this.f6740d, this.f6741e, Float.valueOf(this.f6742f), Integer.valueOf(this.f6743g), Integer.valueOf(this.f6744h), Float.valueOf(this.f6745i), Integer.valueOf(this.f6746j), Float.valueOf(this.f6747k), Float.valueOf(this.f6748l), Boolean.valueOf(this.f6749m), Integer.valueOf(this.f6750n), Integer.valueOf(this.f6751o), Float.valueOf(this.f6752p), Integer.valueOf(this.f6753q), Float.valueOf(this.f6754r));
    }
}
