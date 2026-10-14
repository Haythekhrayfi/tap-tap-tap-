package com.yandex.mobile.ads.impl;

import android.util.Base64;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.exo.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mi1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f23090a;

        public a(String[] strArr) {
            this.f23090a = strArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f23091a;

        public b(boolean z10) {
            this.f23091a = z10;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f23092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f23096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f23097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f23098g;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
            this.f23092a = i10;
            this.f23093b = i11;
            this.f23094c = i12;
            this.f23095d = i13;
            this.f23096e = i14;
            this.f23097f = i15;
            this.f23098g = bArr;
        }
    }

    public static Metadata a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            int i11 = da1.f19803a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                li1.a("Failed to parse Vorbis comment: ", str, "VorbisUtil");
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    mp0 mp0Var = new mp0(Base64.decode(strArrSplit[1], 0));
                    int iH = mp0Var.h();
                    String strA = mp0Var.a(mp0Var.h(), qh.f24494a);
                    String strA2 = mp0Var.a(mp0Var.h(), qh.f24496c);
                    int iH2 = mp0Var.h();
                    int iH3 = mp0Var.h();
                    int iH4 = mp0Var.h();
                    int iH5 = mp0Var.h();
                    int iH6 = mp0Var.h();
                    byte[] bArr = new byte[iH6];
                    mp0Var.a(bArr, 0, iH6);
                    arrayList.add(new PictureFrame(iH, strA, strA2, iH2, iH3, iH4, iH5, bArr));
                } catch (RuntimeException e10) {
                    p90.b("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static a a(mp0 mp0Var, boolean z10, boolean z11) throws qp0 {
        if (z10) {
            a(3, mp0Var, false);
        }
        mp0Var.a((int) mp0Var.n(), qh.f24496c);
        long jN = mp0Var.n();
        String[] strArr = new String[(int) jN];
        for (int i10 = 0; i10 < jN; i10++) {
            strArr[i10] = mp0Var.a((int) mp0Var.n(), qh.f24496c);
        }
        if (z11 && (mp0Var.t() & 1) == 0) {
            throw qp0.a("framing bit expected to be set", (Exception) null);
        }
        return new a(strArr);
    }

    public static c a(mp0 mp0Var) throws qp0 {
        a(1, mp0Var, false);
        int iK = mp0Var.k();
        if (iK < 0) {
            throw new IllegalStateException(u60.a("Top bit not zero: ", iK));
        }
        int iT = mp0Var.t();
        int iK2 = mp0Var.k();
        if (iK2 < 0) {
            throw new IllegalStateException(u60.a("Top bit not zero: ", iK2));
        }
        int iK3 = mp0Var.k();
        int i10 = iK3 <= 0 ? -1 : iK3;
        int iK4 = mp0Var.k();
        int i11 = iK4 <= 0 ? -1 : iK4;
        mp0Var.k();
        int iT2 = mp0Var.t();
        int iPow = (int) Math.pow(2.0d, iT2 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iT2 & 240) >> 4);
        mp0Var.t();
        return new c(iT, iK2, i10, i11, iPow, iPow2, Arrays.copyOf(mp0Var.c(), mp0Var.e()));
    }

    public static boolean a(int i10, mp0 mp0Var, boolean z10) throws qp0 {
        if (mp0Var.a() < 7) {
            if (z10) {
                return false;
            }
            StringBuilder sbA = v60.a("too short header: ");
            sbA.append(mp0Var.a());
            throw qp0.a(sbA.toString(), (Exception) null);
        }
        if (mp0Var.t() != i10) {
            if (z10) {
                return false;
            }
            StringBuilder sbA2 = v60.a("expected header type ");
            sbA2.append(Integer.toHexString(i10));
            throw qp0.a(sbA2.toString(), (Exception) null);
        }
        if (mp0Var.t() == 118 && mp0Var.t() == 111 && mp0Var.t() == 114 && mp0Var.t() == 98 && mp0Var.t() == 105 && mp0Var.t() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw qp0.a("expected characters 'vorbis'", (Exception) null);
    }
}
