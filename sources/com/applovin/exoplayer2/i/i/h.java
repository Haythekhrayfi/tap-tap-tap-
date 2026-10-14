package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f7126a = Pattern.compile("^NOTE([ \t].*)?$");

    public static long a(String str) throws NumberFormatException {
        String[] strArrB = ai.b(str, "\\.");
        long j10 = 0;
        for (String str2 : ai.a(strArrB[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrB.length == 2) {
            j11 += Long.parseLong(strArrB[1]);
        }
        return j11 * 1000;
    }

    public static void a(y yVar) throws com.applovin.exoplayer2.ai {
        int iC = yVar.c();
        if (b(yVar)) {
            return;
        }
        yVar.d(iC);
        throw com.applovin.exoplayer2.ai.b("Expected WEBVTT. Got " + yVar.C(), null);
    }

    public static float b(String str) throws NumberFormatException {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static boolean b(y yVar) {
        String strC = yVar.C();
        return strC != null && strC.startsWith("WEBVTT");
    }
}
