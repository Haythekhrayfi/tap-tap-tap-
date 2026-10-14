package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.exo.metadata.mp4.SlowMotionData;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class t01 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z31 f25215d = z31.a(CoreConstants.COLON_CHAR);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z31 f25216e = z31.a('*');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f25217a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25218b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f25219c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f25220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f25221b;

        public a(int i10, long j10) {
            this.f25220a = j10;
            this.f25221b = i10;
        }
    }

    public final void a() {
        this.f25217a.clear();
        this.f25218b = 0;
    }

    public final void a(vt vtVar, cs0 cs0Var, ArrayList arrayList) throws IOException {
        int i10;
        long j10;
        char c10;
        int i11 = this.f25218b;
        if (i11 != 0) {
            if (i11 != 1) {
                char c11 = 2820;
                short s10 = 2819;
                short s11 = 2817;
                if (i11 == 2) {
                    long jA = vtVar.a();
                    int i12 = (this.f25219c - 12) - 8;
                    mp0 mp0Var = new mp0(i12);
                    vtVar.readFully(mp0Var.c(), 0, i12);
                    int i13 = 0;
                    while (i13 < i12 / 12) {
                        mp0Var.f(2);
                        short sM = mp0Var.m();
                        if (sM != 2192 && sM != 2816 && sM != s11 && sM != s10) {
                            if (sM != 2820) {
                                mp0Var.f(8);
                            }
                            i13++;
                            i12 = i12;
                            s10 = 2819;
                            s11 = 2817;
                        }
                        this.f25217a.add(new a(mp0Var.k(), (jA - ((long) this.f25219c)) - ((long) mp0Var.k())));
                        i13++;
                        i12 = i12;
                        s10 = 2819;
                        s11 = 2817;
                    }
                    if (!this.f25217a.isEmpty()) {
                        this.f25218b = 3;
                        j10 = ((a) this.f25217a.get(0)).f25220a;
                    }
                    cs0Var.f19623a = j10;
                    return;
                }
                if (i11 != 3) {
                    throw new IllegalStateException();
                }
                long position = vtVar.getPosition();
                int iA = (int) ((vtVar.a() - vtVar.getPosition()) - ((long) this.f25219c));
                mp0 mp0Var2 = new mp0(iA);
                vtVar.readFully(mp0Var2.c(), 0, iA);
                int i14 = 0;
                while (i14 < this.f25217a.size()) {
                    a aVar = (a) this.f25217a.get(i14);
                    mp0Var2.e((int) (aVar.f25220a - position));
                    mp0Var2.f(4);
                    int iK = mp0Var2.k();
                    Charset charset = qh.f24496c;
                    String strA = mp0Var2.a(iK, charset);
                    Objects.requireNonNull(strA);
                    switch (strA) {
                        case "SlowMotion_Data":
                            c10 = 2192;
                            break;
                        case "Super_SlowMotion_Edit_Data":
                            c10 = 2819;
                            break;
                        case "Super_SlowMotion_Data":
                            c10 = 2816;
                            break;
                        case "Super_SlowMotion_Deflickering_On":
                            c10 = c11;
                            break;
                        case "Super_SlowMotion_BGM":
                            c10 = 2817;
                            break;
                        default:
                            throw qp0.a("Invalid SEF name", (Exception) null);
                    }
                    int i15 = aVar.f25221b - (iK + 8);
                    if (c10 == 2192) {
                        ArrayList arrayList2 = new ArrayList();
                        List<String> listA = f25216e.a(mp0Var2.a(i15, charset));
                        for (int i16 = 0; i16 < listA.size(); i16++) {
                            List<String> listA2 = f25215d.a(listA.get(i16));
                            if (listA2.size() != 3) {
                                throw qp0.a((String) null, (Exception) null);
                            }
                            try {
                                arrayList2.add(new SlowMotionData.Segment(1 << (Integer.parseInt(listA2.get(2)) - 1), Long.parseLong(listA2.get(0)), Long.parseLong(listA2.get(1))));
                            } catch (NumberFormatException e10) {
                                throw qp0.a((String) null, (Exception) e10);
                            }
                        }
                        arrayList.add(new SlowMotionData(arrayList2));
                    } else if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != c11) {
                        throw new IllegalStateException();
                    }
                    i14++;
                    c11 = 2820;
                }
                cs0Var.f19623a = 0L;
                return;
            }
            mp0 mp0Var3 = new mp0(8);
            vtVar.readFully(mp0Var3.c(), 0, 8);
            this.f25219c = mp0Var3.k() + 8;
            if (mp0Var3.h() == 1397048916) {
                cs0Var.f19623a = vtVar.getPosition() - ((long) (this.f25219c - 12));
                i10 = 2;
            }
            j10 = 0;
            cs0Var.f19623a = j10;
            return;
        }
        long jA2 = vtVar.a();
        cs0Var.f19623a = (jA2 == -1 || jA2 < 8) ? 0L : jA2 - 8;
        i10 = 1;
        this.f25218b = i10;
    }
}
