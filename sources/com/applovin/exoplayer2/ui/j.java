package com.applovin.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.applovin.exoplayer2.common.base.Predicate;

/* JADX INFO: loaded from: classes.dex */
final class j {
    public static float a(int i10, float f10, int i11, int i12) {
        float f11;
        if (f10 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f11 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f10;
            }
            f11 = i11;
        }
        return f10 * f11;
    }

    private static void a(Spannable spannable, Predicate<Object> predicate) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static void a(com.applovin.exoplayer2.i.a.C0095a c0095a) {
        c0095a.d();
        if (c0095a.a() instanceof Spanned) {
            if (!(c0095a.a() instanceof Spannable)) {
                c0095a.a(SpannableString.valueOf(c0095a.a()));
            }
            a((Spannable) com.applovin.exoplayer2.l.a.b(c0095a.a()), new Predicate() { // from class: com.applovin.exoplayer2.ui.r
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(Object obj) {
                    return j.b(obj);
                }
            });
        }
        b(c0095a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void b(com.applovin.exoplayer2.i.a.C0095a c0095a) {
        c0095a.b(-3.4028235E38f, Integer.MIN_VALUE);
        if (c0095a.a() instanceof Spanned) {
            if (!(c0095a.a() instanceof Spannable)) {
                c0095a.a(SpannableString.valueOf(c0095a.a()));
            }
            a((Spannable) com.applovin.exoplayer2.l.a.b(c0095a.a()), new Predicate() { // from class: com.applovin.exoplayer2.ui.q
                @Override // com.applovin.exoplayer2.common.base.Predicate
                public final boolean apply(Object obj) {
                    return j.a(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean b(Object obj) {
        return !(obj instanceof com.applovin.exoplayer2.i.d.b);
    }
}
