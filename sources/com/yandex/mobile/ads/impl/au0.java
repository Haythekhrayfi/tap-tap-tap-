package com.yandex.mobile.ads.impl;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class au0 {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final UUID f19064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f19066c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f19064a = uuid;
            this.f19065b = i10;
            this.f19066c = bArr;
        }
    }

    public static boolean a(byte[] bArr) {
        return b(bArr) != null;
    }

    public static byte[] a(UUID uuid, byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        if (uuid.equals(aVarB.f19064a)) {
            return aVarB.f19066c;
        }
        p90.d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarB.f19064a + ".");
        return null;
    }

    private static a b(byte[] bArr) {
        mp0 mp0Var = new mp0(bArr);
        if (mp0Var.e() < 32) {
            return null;
        }
        mp0Var.e(0);
        if (mp0Var.h() != mp0Var.a() + 4 || mp0Var.h() != 1886614376) {
            return null;
        }
        int iB = rb.b(mp0Var.h());
        if (iB > 1) {
            o80.a("Unsupported pssh version: ", iB, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(mp0Var.p(), mp0Var.p());
        if (iB == 1) {
            mp0Var.f(mp0Var.x() * 16);
        }
        int iX = mp0Var.x();
        if (iX != mp0Var.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iX];
        mp0Var.a(bArr2, 0, iX);
        return new a(uuid, iB, bArr2);
    }

    public static UUID c(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return null;
        }
        return aVarB.f19064a;
    }

    public static int d(byte[] bArr) {
        a aVarB = b(bArr);
        if (aVarB == null) {
            return -1;
        }
        return aVarB.f19065b;
    }
}
