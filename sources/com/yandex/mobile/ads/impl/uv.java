package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class uv {

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        EF10(R.font.ya_medium, R.font.ya_bold);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f25745f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f25746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f25747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f25748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f25749d;

        a(int i10, int i11) {
            this.f25746a = i;
            this.f25747b = i;
            this.f25748c = i10;
            this.f25749d = i11;
        }

        public final int a() {
            return this.f25749d;
        }

        public final int b() {
            return this.f25746a;
        }

        public final int c() {
            return this.f25748c;
        }

        public final int d() {
            return this.f25747b;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25750a;

        static {
            int[] iArr = new int[a.values().length];
            int i10 = a.f25745f;
            iArr[0] = 1;
            f25750a = iArr;
        }
    }

    public static tv a(Context context) {
        Typeface font;
        Typeface font2;
        Typeface font3;
        Typeface font4;
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        nz0 nz0VarA = i01.b().a(context);
        String strH = nz0VarA != null ? nz0VarA.h() : null;
        if (strH == null) {
            return null;
        }
        try {
            a aVarValueOf = a.valueOf(strH);
            if (b.f25750a[aVarValueOf.ordinal()] != 1) {
                throw new jc.g();
            }
            try {
                font = context.getResources().getFont(aVarValueOf.b());
            } catch (Exception unused) {
                font = null;
            }
            try {
                font2 = context.getResources().getFont(aVarValueOf.d());
            } catch (Exception unused2) {
                font2 = null;
            }
            try {
                font3 = context.getResources().getFont(aVarValueOf.c());
            } catch (Exception unused3) {
                font3 = null;
            }
            try {
                font4 = context.getResources().getFont(aVarValueOf.a());
            } catch (Exception unused4) {
                font4 = null;
            }
            return new tv(font, font2, font3, font4);
        } catch (Exception unused5) {
            return null;
        }
    }
}
