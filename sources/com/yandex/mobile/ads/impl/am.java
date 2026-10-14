package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: loaded from: classes3.dex */
public final class am implements wf {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final am f18955r = new a().a("").a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final wf.a<am> f18956s = yn1.f26946f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f18957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f18958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f18959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bitmap f18960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f18964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f18966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f18967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f18971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f18972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f18973q;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private CharSequence f18974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Bitmap f18975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Layout.Alignment f18976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Layout.Alignment f18977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f18978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f18979f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18980g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f18981h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f18982i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f18983j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f18984k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f18985l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f18986m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f18987n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f18988o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f18989p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private float f18990q;

        public a() {
            this.f18974a = null;
            this.f18975b = null;
            this.f18976c = null;
            this.f18977d = null;
            this.f18978e = -3.4028235E38f;
            this.f18979f = Integer.MIN_VALUE;
            this.f18980g = Integer.MIN_VALUE;
            this.f18981h = -3.4028235E38f;
            this.f18982i = Integer.MIN_VALUE;
            this.f18983j = Integer.MIN_VALUE;
            this.f18984k = -3.4028235E38f;
            this.f18985l = -3.4028235E38f;
            this.f18986m = -3.4028235E38f;
            this.f18987n = false;
            this.f18988o = -16777216;
            this.f18989p = Integer.MIN_VALUE;
        }

        private a(am amVar) {
            this.f18974a = amVar.f18957a;
            this.f18975b = amVar.f18960d;
            this.f18976c = amVar.f18958b;
            this.f18977d = amVar.f18959c;
            this.f18978e = amVar.f18961e;
            this.f18979f = amVar.f18962f;
            this.f18980g = amVar.f18963g;
            this.f18981h = amVar.f18964h;
            this.f18982i = amVar.f18965i;
            this.f18983j = amVar.f18970n;
            this.f18984k = amVar.f18971o;
            this.f18985l = amVar.f18966j;
            this.f18986m = amVar.f18967k;
            this.f18987n = amVar.f18968l;
            this.f18988o = amVar.f18969m;
            this.f18989p = amVar.f18972p;
            this.f18990q = amVar.f18973q;
        }

        public /* synthetic */ a(am amVar, int i10) {
            this(amVar);
        }

        public final a a(float f10) {
            this.f18986m = f10;
            return this;
        }

        public final a a(int i10) {
            this.f18980g = i10;
            return this;
        }

        public final a a(int i10, float f10) {
            this.f18978e = f10;
            this.f18979f = i10;
            return this;
        }

        public final a a(Bitmap bitmap) {
            this.f18975b = bitmap;
            return this;
        }

        public final a a(CharSequence charSequence) {
            this.f18974a = charSequence;
            return this;
        }

        public final am a() {
            return new am(this.f18974a, this.f18976c, this.f18977d, this.f18975b, this.f18978e, this.f18979f, this.f18980g, this.f18981h, this.f18982i, this.f18983j, this.f18984k, this.f18985l, this.f18986m, this.f18987n, this.f18988o, this.f18989p, this.f18990q, 0);
        }

        public final void a(Layout.Alignment alignment) {
            this.f18977d = alignment;
        }

        public final a b(float f10) {
            this.f18981h = f10;
            return this;
        }

        public final a b(int i10) {
            this.f18982i = i10;
            return this;
        }

        public final a b(Layout.Alignment alignment) {
            this.f18976c = alignment;
            return this;
        }

        public final void b() {
            this.f18987n = false;
        }

        public final void b(int i10, float f10) {
            this.f18984k = f10;
            this.f18983j = i10;
        }

        @Pure
        public final int c() {
            return this.f18980g;
        }

        public final a c(int i10) {
            this.f18989p = i10;
            return this;
        }

        public final void c(float f10) {
            this.f18990q = f10;
        }

        @Pure
        public final int d() {
            return this.f18982i;
        }

        public final a d(float f10) {
            this.f18985l = f10;
            return this;
        }

        public final void d(int i10) {
            this.f18988o = i10;
            this.f18987n = true;
        }

        @Pure
        public final CharSequence e() {
            return this.f18974a;
        }
    }

    private am(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            pa.a(bitmap);
        } else {
            pa.a(bitmap == null);
        }
        this.f18957a = charSequence instanceof Spanned ? SpannedString.valueOf(charSequence) : charSequence != null ? charSequence.toString() : null;
        this.f18958b = alignment;
        this.f18959c = alignment2;
        this.f18960d = bitmap;
        this.f18961e = f10;
        this.f18962f = i10;
        this.f18963g = i11;
        this.f18964h = f11;
        this.f18965i = i12;
        this.f18966j = f13;
        this.f18967k = f14;
        this.f18968l = z10;
        this.f18969m = i14;
        this.f18970n = i13;
        this.f18971o = f12;
        this.f18972p = i15;
        this.f18973q = f15;
    }

    public /* synthetic */ am(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, int i16) {
        this(charSequence, alignment, alignment2, bitmap, f10, i10, i11, f11, i12, i13, f12, f13, f14, z10, i14, i15, f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final am a(Bundle bundle) {
        a aVar = new a();
        CharSequence charSequence = bundle.getCharSequence(Integer.toString(0, 36));
        if (charSequence != null) {
            aVar.a(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Integer.toString(1, 36));
        if (alignment != null) {
            aVar.b(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(Integer.toString(2, 36));
        if (alignment2 != null) {
            aVar.a(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(Integer.toString(3, 36));
        if (bitmap != null) {
            aVar.a(bitmap);
        }
        if (bundle.containsKey(Integer.toString(4, 36)) && bundle.containsKey(Integer.toString(5, 36))) {
            aVar.a(bundle.getInt(Integer.toString(5, 36)), bundle.getFloat(Integer.toString(4, 36)));
        }
        if (bundle.containsKey(Integer.toString(6, 36))) {
            aVar.a(bundle.getInt(Integer.toString(6, 36)));
        }
        if (bundle.containsKey(Integer.toString(7, 36))) {
            aVar.b(bundle.getFloat(Integer.toString(7, 36)));
        }
        if (bundle.containsKey(Integer.toString(8, 36))) {
            aVar.b(bundle.getInt(Integer.toString(8, 36)));
        }
        if (bundle.containsKey(Integer.toString(10, 36)) && bundle.containsKey(Integer.toString(9, 36))) {
            aVar.b(bundle.getInt(Integer.toString(9, 36)), bundle.getFloat(Integer.toString(10, 36)));
        }
        if (bundle.containsKey(Integer.toString(11, 36))) {
            aVar.d(bundle.getFloat(Integer.toString(11, 36)));
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            aVar.a(bundle.getFloat(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            aVar.d(bundle.getInt(Integer.toString(13, 36)));
        }
        if (!bundle.getBoolean(Integer.toString(14, 36), false)) {
            aVar.b();
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            aVar.c(bundle.getInt(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            aVar.c(bundle.getFloat(Integer.toString(16, 36)));
        }
        return aVar.a();
    }

    public final a a() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || am.class != obj.getClass()) {
            return false;
        }
        am amVar = (am) obj;
        return TextUtils.equals(this.f18957a, amVar.f18957a) && this.f18958b == amVar.f18958b && this.f18959c == amVar.f18959c && ((bitmap = this.f18960d) != null ? !((bitmap2 = amVar.f18960d) == null || !bitmap.sameAs(bitmap2)) : amVar.f18960d == null) && this.f18961e == amVar.f18961e && this.f18962f == amVar.f18962f && this.f18963g == amVar.f18963g && this.f18964h == amVar.f18964h && this.f18965i == amVar.f18965i && this.f18966j == amVar.f18966j && this.f18967k == amVar.f18967k && this.f18968l == amVar.f18968l && this.f18969m == amVar.f18969m && this.f18970n == amVar.f18970n && this.f18971o == amVar.f18971o && this.f18972p == amVar.f18972p && this.f18973q == amVar.f18973q;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18957a, this.f18958b, this.f18959c, this.f18960d, Float.valueOf(this.f18961e), Integer.valueOf(this.f18962f), Integer.valueOf(this.f18963g), Float.valueOf(this.f18964h), Integer.valueOf(this.f18965i), Float.valueOf(this.f18966j), Float.valueOf(this.f18967k), Boolean.valueOf(this.f18968l), Integer.valueOf(this.f18969m), Integer.valueOf(this.f18970n), Float.valueOf(this.f18971o), Integer.valueOf(this.f18972p), Float.valueOf(this.f18973q)});
    }
}
