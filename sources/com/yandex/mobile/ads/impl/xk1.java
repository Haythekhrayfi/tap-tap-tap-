package com.yandex.mobile.ads.impl;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.yandex.mobile.ads.R;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xk1 implements gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f26539b;

    public xk1(Context context) {
        fd.j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f26538a = context.getApplicationContext();
        this.f26539b = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.gm
    public final byte[][] a() {
        try {
            InputStream inputStreamOpenRawResource = this.f26539b.getResources().openRawResource(R.raw.yandexinternalca);
            try {
                fd.j0.h(inputStreamOpenRawResource, "it");
                byte[] bArrP = h9.d.p(inputStreamOpenRawResource);
                y8.c0.g(inputStreamOpenRawResource, null);
                try {
                    InputStream inputStreamOpenRawResource2 = this.f26538a.getResources().openRawResource(R.raw.bundled_cert);
                    try {
                        fd.j0.h(inputStreamOpenRawResource2, "it");
                        byte[] bArrP2 = h9.d.p(inputStreamOpenRawResource2);
                        y8.c0.g(inputStreamOpenRawResource2, null);
                        byte[][] bArr = {bArrP2};
                        byte[][] bArr2 = {bArrP};
                        fd.j0.i(bArr, "<this>");
                        fd.j0.i(bArr2, "elements");
                        Object[] objArrCopyOf = Arrays.copyOf(bArr, 2);
                        System.arraycopy(bArr2, 0, objArrCopyOf, 1, 1);
                        fd.j0.h(objArrCopyOf, "result");
                        return (byte[][]) objArrCopyOf;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            y8.c0.g(inputStreamOpenRawResource2, th);
                            throw th2;
                        }
                    }
                } catch (IOException e10) {
                    throw new IllegalStateException("Failed to create cert", e10);
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    y8.c0.g(inputStreamOpenRawResource, th3);
                    throw th4;
                }
            }
        } catch (IOException e11) {
            throw new IllegalStateException("Failed to create cert", e11);
        }
    }
}
