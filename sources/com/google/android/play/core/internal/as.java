package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class as implements com.google.android.play.core.splitinstall.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.core.splitcompat.c f12268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final at f12269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f12270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.splitcompat.p f12271e;

    public as(Context context, Executor executor, at atVar, com.google.android.play.core.splitcompat.c cVar, com.google.android.play.core.splitcompat.p pVar) {
        this.f12267a = context;
        this.f12268b = cVar;
        this.f12269c = atVar;
        this.f12270d = executor;
        this.f12271e = pVar;
    }

    @SplitInstallErrorCode
    private final Integer a(List<Intent> list) {
        FileLock fileLockTryLock;
        try {
            FileChannel channel = new RandomAccessFile(this.f12268b.b(), "rw").getChannel();
            Integer numValueOf = null;
            try {
                try {
                    fileLockTryLock = channel.tryLock();
                } catch (OverlappingFileLockException unused) {
                    fileLockTryLock = null;
                }
                if (fileLockTryLock != null) {
                    int i10 = 0;
                    try {
                        Log.i("SplitCompat", "Copying splits.");
                        for (Intent intent : list) {
                            String stringExtra = intent.getStringExtra("split_id");
                            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f12267a.getContentResolver().openAssetFileDescriptor(intent.getData(), "r");
                            File fileA = this.f12268b.a(stringExtra);
                            if ((fileA.exists() && fileA.length() != assetFileDescriptorOpenAssetFileDescriptor.getLength()) || !fileA.exists()) {
                                if (this.f12268b.b(stringExtra).exists()) {
                                    continue;
                                } else {
                                    BufferedInputStream bufferedInputStream = new BufferedInputStream(assetFileDescriptorOpenAssetFileDescriptor.createInputStream());
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(fileA);
                                        try {
                                            byte[] bArr = new byte[4096];
                                            while (true) {
                                                int i11 = bufferedInputStream.read(bArr);
                                                if (i11 <= 0) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, i11);
                                                try {
                                                    bufferedInputStream.close();
                                                } catch (Throwable th) {
                                                    ci.a(th, th);
                                                }
                                                throw th;
                                            }
                                            fileOutputStream.close();
                                            bufferedInputStream.close();
                                        } catch (Throwable th2) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th3) {
                                                ci.a(th2, th3);
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th4) {
                                        bufferedInputStream.close();
                                        throw th4;
                                    }
                                }
                            }
                        }
                        Log.i("SplitCompat", "Splits copied.");
                        try {
                            if (this.f12269c.a()) {
                                Log.i("SplitCompat", "Splits verified.");
                            } else {
                                Log.e("SplitCompat", "Split verification failed.");
                                i10 = -11;
                            }
                        } catch (Exception e10) {
                            Log.e("SplitCompat", "Error verifying splits.", e10);
                        }
                    } catch (Exception e11) {
                        Log.e("SplitCompat", "Error copying splits.", e11);
                        i10 = -13;
                    }
                    numValueOf = Integer.valueOf(i10);
                    fileLockTryLock.release();
                }
                if (channel != null) {
                    channel.close();
                }
                return numValueOf;
            } catch (Throwable th5) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th6) {
                        ci.a(th5, th6);
                    }
                }
                throw th5;
            }
        } catch (Exception e12) {
            Log.e("SplitCompat", "Error locking files.", e12);
            return -13;
        }
    }

    public static /* synthetic */ void a(as asVar, com.google.android.play.core.splitinstall.d dVar) {
        try {
            if (SplitCompat.a(com.google.android.play.core.splitcompat.p.a(asVar.f12267a))) {
                Log.i("SplitCompat", "Splits installed.");
                dVar.a();
            } else {
                Log.e("SplitCompat", "Emulating splits failed.");
                dVar.a(-12);
            }
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error emulating splits.", e10);
            dVar.a(-12);
        }
    }

    public static /* synthetic */ void a(as asVar, List list, com.google.android.play.core.splitinstall.d dVar) {
        Integer numA = asVar.a((List<Intent>) list);
        if (numA == null) {
            return;
        }
        if (numA.intValue() == 0) {
            dVar.b();
        } else {
            dVar.a(numA.intValue());
        }
    }

    @Override // com.google.android.play.core.splitinstall.f
    public final void a(List<Intent> list, com.google.android.play.core.splitinstall.d dVar) {
        if (!SplitCompat.a()) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.f12270d.execute(new ar(this, list, dVar));
    }
}
