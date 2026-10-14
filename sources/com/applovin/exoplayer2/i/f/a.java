package com.applovin.exoplayer2.i.f;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.r;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f6986a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f6987b = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StringBuilder f6988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f6989d;

    public a() {
        super("SubripDecoder");
        this.f6988c = new StringBuilder();
        this.f6989d = new ArrayList<>();
    }

    private static long a(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(i10 + 3))) * 1000) + (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(i10 + 2))) * 60 * 1000) + (strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e6  */
    private com.applovin.exoplayer2.i.a a(Spanned spanned, String str) {
        byte b10;
        byte b11;
        com.applovin.exoplayer2.i.a.C0095a c0095aA = new com.applovin.exoplayer2.i.a.C0095a().a(spanned);
        if (str == null) {
            return c0095aA.e();
        }
        switch (str) {
            case "{\an1}":
                b10 = 0;
                break;
            case "{\an2}":
                b10 = 6;
                break;
            case "{\an3}":
                b10 = 3;
                break;
            case "{\an4}":
                b10 = 1;
                break;
            case "{\an5}":
                b10 = 7;
                break;
            case "{\an6}":
                b10 = 4;
                break;
            case "{\an7}":
                b10 = 2;
                break;
            case "{\an8}":
                b10 = 8;
                break;
            case "{\an9}":
                b10 = 5;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0 || b10 == 1 || b10 == 2) {
            c0095aA.b(0);
        } else if (b10 == 3 || b10 == 4 || b10 == 5) {
            c0095aA.b(2);
        } else {
            c0095aA.b(1);
        }
        switch (str) {
            case "{\an1}":
                b11 = 0;
                break;
            case "{\an2}":
                b11 = 1;
                break;
            case "{\an3}":
                b11 = 2;
                break;
            case "{\an4}":
                b11 = 6;
                break;
            case "{\an5}":
                b11 = 7;
                break;
            case "{\an6}":
                b11 = 8;
                break;
            case "{\an7}":
                b11 = 3;
                break;
            case "{\an8}":
                b11 = 4;
                break;
            case "{\an9}":
                b11 = 5;
                break;
            default:
                b11 = -1;
                break;
        }
        if (b11 == 0 || b11 == 1 || b11 == 2) {
            c0095aA.a(2);
        } else if (b11 == 3 || b11 == 4 || b11 == 5) {
            c0095aA.a(0);
        } else {
            c0095aA.a(1);
        }
        return c0095aA.a(b(c0095aA.c())).a(b(c0095aA.b()), 0).e();
    }

    private String a(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f6987b.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    public static float b(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.applovin.exoplayer2.i.d
    public f a(byte[] bArr, int i10, boolean z10) {
        StringBuilder sb2;
        String str;
        ArrayList arrayList = new ArrayList();
        r rVar = new r();
        y yVar = new y(bArr, i10);
        while (true) {
            String strC = yVar.C();
            if (strC == null) {
                break;
            }
            if (strC.length() != 0) {
                try {
                    Integer.parseInt(strC);
                    strC = yVar.C();
                    if (strC == null) {
                        q.c("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f6986a.matcher(strC);
                    if (matcher.matches()) {
                        rVar.a(a(matcher, 1));
                        rVar.a(a(matcher, 6));
                        this.f6988c.setLength(0);
                        this.f6989d.clear();
                        while (true) {
                            String strC2 = yVar.C();
                            if (TextUtils.isEmpty(strC2)) {
                                break;
                            }
                            if (this.f6988c.length() > 0) {
                                this.f6988c.append("<br>");
                            }
                            this.f6988c.append(a(strC2, this.f6989d));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.f6988c.toString());
                        String str2 = null;
                        for (int i11 = 0; i11 < this.f6989d.size(); i11++) {
                            String str3 = this.f6989d.get(i11);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str3;
                                break;
                            }
                        }
                        arrayList.add(a(spannedFromHtml, str2));
                        arrayList.add(com.applovin.exoplayer2.i.a.f6736a);
                    } else {
                        sb2 = new StringBuilder();
                        str = "Skipping invalid timing: ";
                        sb2.append(str);
                        sb2.append(strC);
                        q.c("SubripDecoder", sb2.toString());
                    }
                } catch (NumberFormatException unused) {
                    sb2 = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
            }
        }
        return new b((com.applovin.exoplayer2.i.a[]) arrayList.toArray(new com.applovin.exoplayer2.i.a[0]), rVar.b());
    }
}
