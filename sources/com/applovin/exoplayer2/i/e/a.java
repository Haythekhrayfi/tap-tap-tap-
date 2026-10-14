package com.applovin.exoplayer2.i.e;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.applovin.exoplayer2.i.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f6950a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f6951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f6952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, c> f6953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f6954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f6955f;

    public a() {
        this(null);
    }

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f6954e = -3.4028235E38f;
        this.f6955f = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f6951b = false;
            this.f6952c = null;
            return;
        }
        this.f6951b = true;
        String strA = ai.a(list.get(0));
        com.applovin.exoplayer2.l.a.a(strA.startsWith("Format:"));
        this.f6952c = (b) com.applovin.exoplayer2.l.a.b(b.a(strA));
        a(new y(list.get(1)));
    }

    private static int a(long j10, List<Long> list, List<List<com.applovin.exoplayer2.i.a>> list2) {
        int i10;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (list.get(size).longValue() == j10) {
                return size;
            }
            if (list.get(size).longValue() < j10) {
                i10 = size + 1;
                break;
            }
            size--;
        }
        list.add(i10, Long.valueOf(j10));
        list2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList(list2.get(i10 - 1)));
        return i10;
    }

    private static long a(String str) {
        Matcher matcher = f6950a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) ai.a(matcher.group(4))) * AbstractComponentTracker.LINGERING_TIMEOUT) + (Long.parseLong((String) ai.a(matcher.group(3))) * 1000000) + (Long.parseLong((String) ai.a(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) ai.a(matcher.group(1))) * 60 * 60 * 1000000);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    private static com.applovin.exoplayer2.i.a a(String str, c cVar, c.b bVar, float f10, float f11) {
        float fE;
        StyleSpan styleSpan;
        SpannableString spannableString = new SpannableString(str);
        com.applovin.exoplayer2.i.a.C0095a c0095aA = new com.applovin.exoplayer2.i.a.C0095a().a(spannableString);
        if (cVar != null) {
            if (cVar.f6963c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.f6963c.intValue()), 0, spannableString.length(), 33);
            }
            float f12 = cVar.f6964d;
            if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                c0095aA.b(f12 / f11, 1);
            }
            boolean z10 = cVar.f6965e;
            if (z10 && cVar.f6966f) {
                styleSpan = new StyleSpan(3);
            } else if (z10) {
                styleSpan = new StyleSpan(1);
            } else if (cVar.f6966f) {
                styleSpan = new StyleSpan(2);
            } else {
                if (cVar.f6967g) {
                    spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
                }
                if (cVar.f6968h) {
                    spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
                }
            }
            spannableString.setSpan(styleSpan, 0, spannableString.length(), 33);
            if (cVar.f6967g) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.f6968h) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i10 = bVar.f6982a;
        if (i10 == -1) {
            i10 = cVar != null ? cVar.f6962b : -1;
        }
        c0095aA.a(b(i10)).b(d(i10)).a(c(i10));
        PointF pointF = bVar.f6983b;
        if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
            c0095aA.a(e(c0095aA.c()));
            fE = e(c0095aA.b());
        } else {
            c0095aA.a(pointF.x / f10);
            fE = bVar.f6983b.y / f11;
        }
        c0095aA.a(fE, 0);
        return c0095aA.e();
    }

    private void a(y yVar) {
        while (true) {
            String strC = yVar.C();
            if (strC == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strC)) {
                b(yVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strC)) {
                this.f6953d = c(yVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(strC)) {
                q.b("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strC)) {
                return;
            }
        }
    }

    private void a(y yVar, List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        b bVarA = this.f6951b ? this.f6952c : null;
        while (true) {
            String strC = yVar.C();
            if (strC == null) {
                return;
            }
            if (strC.startsWith("Format:")) {
                bVarA = b.a(strC);
            } else if (strC.startsWith("Dialogue:")) {
                if (bVarA == null) {
                    q.c("SsaDecoder", "Skipping dialogue line before complete format: " + strC);
                } else {
                    a(strC, bVarA, list, list2);
                }
            }
        }
    }

    private void a(String str, b bVar, List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        int i10;
        StringBuilder sb2;
        com.applovin.exoplayer2.l.a.a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", bVar.f6960e);
        if (strArrSplit.length != bVar.f6960e) {
            sb2 = defpackage.a.a("Skipping dialogue line with fewer columns than format: ");
        } else {
            long jA = a(strArrSplit[bVar.f6956a]);
            if (jA == -9223372036854775807L) {
                sb2 = new StringBuilder();
            } else {
                long jA2 = a(strArrSplit[bVar.f6957b]);
                if (jA2 != -9223372036854775807L) {
                    Map<String, c> map = this.f6953d;
                    c cVar = (map == null || (i10 = bVar.f6958c) == -1) ? null : map.get(strArrSplit[i10].trim());
                    String str2 = strArrSplit[bVar.f6959d];
                    com.applovin.exoplayer2.i.a aVarA = a(c.b.b(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.a(str2), this.f6954e, this.f6955f);
                    int iA = a(jA2, list2, list);
                    for (int iA2 = a(jA, list2, list); iA2 < iA; iA2++) {
                        list.get(iA2).add(aVarA);
                    }
                    return;
                }
                sb2 = new StringBuilder();
            }
            sb2.append("Skipping invalid timing: ");
        }
        sb2.append(str);
        q.c("SsaDecoder", sb2.toString());
    }

    private static Layout.Alignment b(int i10) {
        switch (i10) {
            case -1:
                return null;
            case 0:
            default:
                q.c("SsaDecoder", "Unknown alignment: " + i10);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private void b(y yVar) {
        while (true) {
            String strC = yVar.C();
            if (strC == null) {
                return;
            }
            if (yVar.a() != 0 && yVar.f() == 91) {
                return;
            }
            String[] strArrSplit = strC.split(":");
            if (strArrSplit.length == 2) {
                String lowerCase = Ascii.toLowerCase(strArrSplit[0].trim());
                Objects.requireNonNull(lowerCase);
                if (lowerCase.equals("playresx")) {
                    this.f6954e = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.f6955f = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static int c(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                q.c("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static Map<String, c> c(y yVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVarA = null;
        while (true) {
            String strC = yVar.C();
            if (strC == null || (yVar.a() != 0 && yVar.f() == 91)) {
                break;
            }
            if (strC.startsWith("Format:")) {
                aVarA = c.a.a(strC);
            } else if (strC.startsWith("Style:")) {
                if (aVarA == null) {
                    q.c("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + strC);
                } else {
                    c cVarA = c.a(strC, aVarA);
                    if (cVarA != null) {
                        linkedHashMap.put(cVarA.f6961a, cVarA);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static int d(int i10) {
        switch (i10) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                q.c("SsaDecoder", "Unknown alignment: " + i10);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    private static float e(int i10) {
        if (i10 == 0) {
            return 0.05f;
        }
        if (i10 != 1) {
            return i10 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    @Override // com.applovin.exoplayer2.i.d
    public f a(byte[] bArr, int i10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        y yVar = new y(bArr, i10);
        if (!this.f6951b) {
            a(yVar);
        }
        a(yVar, arrayList, arrayList2);
        return new d(arrayList, arrayList2);
    }
}
