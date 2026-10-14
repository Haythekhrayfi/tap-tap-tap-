package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.core.splitcompat.c f12272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final av f12274c;

    public at(Context context, com.google.android.play.core.splitcompat.c cVar, av avVar, byte[] bArr) {
        this.f12272a = cVar;
        this.f12274c = avVar;
        this.f12273b = context;
    }

    private static X509Certificate a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException e10) {
            Log.e("SplitCompat", "Cannot decode certificate.", e10);
            return null;
        }
    }

    public final boolean a() {
        Signature[] signatureArr;
        String string;
        try {
            File fileC = this.f12272a.c();
            ArrayList<X509Certificate> arrayList = null;
            try {
                signatureArr = this.f12273b.getPackageManager().getPackageInfo(this.f12273b.getPackageName(), 64).signatures;
            } catch (PackageManager.NameNotFoundException unused) {
                signatureArr = null;
            }
            if (signatureArr != null) {
                arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    X509Certificate x509CertificateA = a(signature);
                    if (x509CertificateA != null) {
                        arrayList.add(x509CertificateA);
                    }
                }
            }
            if (arrayList == null || arrayList.isEmpty()) {
                Log.e("SplitCompat", "No app certificates found.");
                return false;
            }
            File[] fileArrListFiles = fileC.listFiles();
            Arrays.sort(fileArrListFiles);
            int length = fileArrListFiles.length;
            while (true) {
                length--;
                if (length < 0) {
                    return true;
                }
                File file = fileArrListFiles[length];
                try {
                    String absolutePath = file.getAbsolutePath();
                    try {
                        X509Certificate[][] x509CertificateArrA = h.a(absolutePath);
                        if (x509CertificateArrA == null || x509CertificateArrA.length == 0 || x509CertificateArrA[0].length == 0) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                            sb2.append("Downloaded split ");
                            sb2.append(absolutePath);
                            sb2.append(" is not signed.");
                            string = sb2.toString();
                            break;
                        }
                        if (arrayList.isEmpty()) {
                            string = "No certificates found for app.";
                            break;
                        }
                        for (X509Certificate x509Certificate : arrayList) {
                            int length2 = x509CertificateArrA.length;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length2) {
                                    Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                                } else if (!x509CertificateArrA[i10][0].equals(x509Certificate)) {
                                    i10++;
                                }
                            }
                        }
                        try {
                            file.renameTo(this.f12272a.a(file));
                        } catch (IOException e10) {
                            Log.e("SplitCompat", "Cannot write verified split.", e10);
                            return false;
                        }
                        Log.e("SplitCompat", "Split verification failure.");
                        return false;
                    } catch (Exception e11) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(absolutePath).length() + 32);
                        sb3.append("Downloaded split ");
                        sb3.append(absolutePath);
                        sb3.append(" is not signed.");
                        Log.e("SplitCompat", sb3.toString(), e11);
                    }
                } catch (Exception e12) {
                    Log.e("SplitCompat", "Split verification error.", e12);
                    return false;
                }
            }
            Log.e("SplitCompat", string);
            Log.e("SplitCompat", "Split verification failure.");
            return false;
        } catch (IOException e13) {
            Log.e("SplitCompat", "Cannot access directory for unverified splits.", e13);
            return false;
        }
    }

    public final boolean a(List<Intent> list) throws IOException {
        Iterator<Intent> it = list.iterator();
        while (it.hasNext()) {
            if (!this.f12272a.b(it.next().getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }
}
