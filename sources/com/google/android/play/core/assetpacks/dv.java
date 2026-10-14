package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
final class dv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12174a = new com.google.android.play.core.internal.af("VerifySliceTaskHandler");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bb f12175b;

    public dv(bb bbVar) {
        this.f12175b = bbVar;
    }

    private final void a(du duVar, File file) {
        try {
            File fileF = this.f12175b.f(duVar.f12065k, duVar.f12170a, duVar.f12171b, duVar.f12172c);
            if (!fileF.exists()) {
                throw new bv(String.format("Cannot find metadata files for slice %s.", duVar.f12172c), duVar.f12064j);
            }
            try {
                if (!db.a(dt.a(file, fileF)).equals(duVar.f12173d)) {
                    throw new bv(String.format("Verification failed for slice %s.", duVar.f12172c), duVar.f12064j);
                }
                f12174a.c("Verification of slice %s of pack %s successful.", duVar.f12172c, duVar.f12065k);
            } catch (IOException e10) {
                throw new bv(String.format("Could not digest file during verification for slice %s.", duVar.f12172c), e10, duVar.f12064j);
            } catch (NoSuchAlgorithmException e11) {
                throw new bv("SHA256 algorithm not supported.", e11, duVar.f12064j);
            }
        } catch (IOException e12) {
            throw new bv(String.format("Could not reconstruct slice archive during verification for slice %s.", duVar.f12172c), e12, duVar.f12064j);
        }
    }

    public final void a(du duVar) {
        File fileA = this.f12175b.a(duVar.f12065k, duVar.f12170a, duVar.f12171b, duVar.f12172c);
        if (!fileA.exists()) {
            throw new bv(String.format("Cannot find unverified files for slice %s.", duVar.f12172c), duVar.f12064j);
        }
        a(duVar, fileA);
        File fileB = this.f12175b.b(duVar.f12065k, duVar.f12170a, duVar.f12171b, duVar.f12172c);
        if (!fileB.exists()) {
            fileB.mkdirs();
        }
        if (!fileA.renameTo(fileB)) {
            throw new bv(String.format("Failed to move slice %s after verification.", duVar.f12172c), duVar.f12064j);
        }
    }
}
