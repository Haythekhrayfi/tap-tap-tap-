package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qe implements rm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ie f24462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ag f24463b;

    public qe(c10 c10Var) {
        this(c10Var, new ag());
    }

    public qe(c10 c10Var, ag agVar) {
        this.f24462a = c10Var;
        this.f24463b = agVar;
    }

    public final wm0 a(mw0<?> mw0Var) throws bi1 {
        en0.a aVar;
        int iK;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            z00 z00Var = null;
            int i10 = 0;
            try {
                z00 z00VarA = this.f24462a.a(mw0Var, u00.a(mw0Var.d()));
                try {
                    int iD = z00VarA.d();
                    List<oy> listC = z00VarA.c();
                    if (iD == 304) {
                        return en0.a(mw0Var, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = z00VarA.a();
                    byte[] bArrA = inputStreamA != null ? en0.a(inputStreamA, z00VarA.b(), this.f24463b) : new byte[0];
                    en0.a(SystemClock.elapsedRealtime() - jElapsedRealtime, mw0Var, bArrA, iD);
                    if (iD < 200 || iD > 299) {
                        throw new IOException();
                    }
                    return new wm0(iD, bArrA, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                } catch (IOException e10) {
                    e = e10;
                    z00Var = z00VarA;
                    if (e instanceof SocketTimeoutException) {
                        aVar = new en0.a("socket", new x61(), i10);
                    } else {
                        if (e instanceof MalformedURLException) {
                            StringBuilder sbA = v60.a("Bad URL ");
                            sbA.append(mw0Var.m());
                            throw new RuntimeException(sbA.toString(), e);
                        }
                        if (z00Var == null) {
                            throw new kn0(e);
                        }
                        int iD2 = z00Var.d();
                        Object[] objArr = {Integer.valueOf(iD2), mw0Var.m()};
                        boolean z10 = ci1.f19511a;
                        x60.c("Unexpected response code %d for %s", objArr);
                        if (z00Var != 0) {
                            wm0 wm0Var = new wm0(iD2, (byte[]) 0, false, SystemClock.elapsedRealtime() - jElapsedRealtime, z00Var.c());
                            if (iD2 != 401 && iD2 != 403) {
                                if (iD2 < 400 || iD2 > 499) {
                                    throw new z01(wm0Var);
                                }
                                throw new hi(wm0Var);
                            }
                            aVar = new en0.a("auth", new fc(wm0Var), i10);
                        } else {
                            aVar = new en0.a("network", new tm0(), i10);
                        }
                    }
                    lo loVarI = mw0Var.i();
                    iK = mw0Var.k();
                    try {
                        loVarI.a(aVar.f20296b);
                        mw0Var.a(String.format("%s-retry [timeout=%s]", aVar.f20295a, Integer.valueOf(iK)));
                    } catch (bi1 e11) {
                        mw0Var.a(String.format("%s-timeout-giveup [timeout=%s]", aVar.f20295a, Integer.valueOf(iK)));
                        throw e11;
                    }
                }
            } catch (IOException e12) {
                e = e12;
            }
            mw0Var.a(String.format("%s-retry [timeout=%s]", aVar.f20295a, Integer.valueOf(iK)));
        }
    }
}
