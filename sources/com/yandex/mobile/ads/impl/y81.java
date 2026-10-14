package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class y81 {
    public static z81 a(z81 z81Var, String[] strArr, Map<String, z81> map) {
        int i10 = 0;
        if (z81Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                z81 z81Var2 = new z81();
                int length = strArr.length;
                while (i10 < length) {
                    z81Var2.a(map.get(strArr[i10]));
                    i10++;
                }
                return z81Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return z81Var.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    z81Var.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return z81Var;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, z81 z81Var, w81 w81Var, Map map, int i12) {
        w81 w81Var2;
        Object sy0Var;
        Object absoluteSizeSpan;
        if (z81Var.k() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(z81Var.k()), i10, i11, 33);
        }
        if (z81Var.q()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (z81Var.r()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (z81Var.p()) {
            u31.a(spannableStringBuilder, new ForegroundColorSpan(z81Var.b()), i10, i11);
        }
        if (z81Var.o()) {
            u31.a(spannableStringBuilder, new BackgroundColorSpan(z81Var.a()), i10, i11);
        }
        if (z81Var.c() != null) {
            u31.a(spannableStringBuilder, new TypefaceSpan(z81Var.c()), i10, i11);
        }
        if (z81Var.n() != null) {
            h61 h61VarN = z81Var.n();
            Objects.requireNonNull(h61VarN);
            int i13 = h61VarN.f21319a;
            u31.a(spannableStringBuilder, new i61(), i10, i11);
        }
        int i14 = z81Var.i();
        if (i14 == 2) {
            while (true) {
                w81Var2 = null;
                if (w81Var == null) {
                    w81Var = null;
                    break;
                }
                z81 z81VarA = a(w81Var.f26212f, w81Var.c(), map);
                if (z81VarA != null && z81VarA.i() == 1) {
                    break;
                } else {
                    w81Var = w81Var.f26216j;
                }
            }
            if (w81Var != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(w81Var);
                while (!arrayDeque.isEmpty()) {
                    w81 w81Var3 = (w81) arrayDeque.pop();
                    z81 z81VarA2 = a(w81Var3.f26212f, w81Var3.c(), map);
                    if (z81VarA2 != null && z81VarA2.i() == 3) {
                        w81Var2 = w81Var3;
                        break;
                    }
                    for (int iA = w81Var3.a() - 1; iA >= 0; iA--) {
                        arrayDeque.push(w81Var3.a(iA));
                    }
                }
                if (w81Var2 != null) {
                    if (w81Var2.a() != 1 || w81Var2.a(0).f26208b == null) {
                        p90.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = w81Var2.a(0).f26208b;
                        int i15 = da1.f19803a;
                        z81 z81VarA3 = a(w81Var2.f26212f, w81Var2.c(), map);
                        if ((z81VarA3 != null ? z81VarA3.h() : -1) == -1) {
                            a(w81Var.f26212f, w81Var.c(), map);
                        }
                        sy0Var = new sy0();
                        spannableStringBuilder.setSpan(sy0Var, i10, i11, 33);
                    }
                }
            }
        } else if (i14 == 3 || i14 == 4) {
            sy0Var = new wo();
            spannableStringBuilder.setSpan(sy0Var, i10, i11, 33);
        }
        if (z81Var.m()) {
            u31.a(spannableStringBuilder, new wy(), i10, i11);
        }
        int iE = z81Var.e();
        if (iE == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) z81Var.d(), true);
        } else if (iE == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(z81Var.d());
        } else if (iE != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(z81Var.d() / 100.0f);
        }
        u31.a(spannableStringBuilder, absoluteSizeSpan, i10, i11);
    }
}
