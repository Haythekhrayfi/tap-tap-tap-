package com.applovin.exoplayer2.ui;

import android.graphics.Color;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
final class e {
    public static String a(int i10) {
        return ai.a("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }

    public static String a(String str) {
        return y.q.a(".", str, ",.", str, " *");
    }
}
