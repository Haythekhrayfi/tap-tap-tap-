package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f24661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f24665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24666f;

    private rc(ArrayList arrayList, int i10, int i11, int i12, float f10, String str) {
        this.f24661a = arrayList;
        this.f24662b = i10;
        this.f24663c = i11;
        this.f24664d = i12;
        this.f24665e = f10;
        this.f24666f = str;
    }

    public static rc a(mp0 mp0Var) throws qp0 {
        float f10;
        String str;
        int i10;
        try {
            mp0Var.f(4);
            int iT = (mp0Var.t() & 3) + 1;
            if (iT == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iT2 = mp0Var.t() & 31;
            for (int i11 = 0; i11 < iT2; i11++) {
                int iZ = mp0Var.z();
                int iD = mp0Var.d();
                mp0Var.f(iZ);
                arrayList.add(mj.a(mp0Var.c(), iD, iZ));
            }
            int iT3 = mp0Var.t();
            for (int i12 = 0; i12 < iT3; i12++) {
                int iZ2 = mp0Var.z();
                int iD2 = mp0Var.d();
                mp0Var.f(iZ2);
                arrayList.add(mj.a(mp0Var.c(), iD2, iZ2));
            }
            int i13 = -1;
            if (iT2 > 0) {
                oh0.c cVarB = oh0.b((byte[]) arrayList.get(0), iT, ((byte[]) arrayList.get(0)).length);
                int i14 = cVarB.f23813e;
                int i15 = cVarB.f23814f;
                float f11 = cVarB.f23815g;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(cVarB.f23809a), Integer.valueOf(cVarB.f23810b), Integer.valueOf(cVarB.f23811c));
                f10 = f11;
                i13 = i15;
                i10 = i14;
            } else {
                f10 = 1.0f;
                str = null;
                i10 = -1;
            }
            return new rc(arrayList, iT, i10, i13, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw qp0.a("Error parsing AVC config", e10);
        }
    }
}
