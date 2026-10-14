package j1;

import android.app.job.JobParameters;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LiveData;
import com.android.billingclient.api.g0;
import com.android.billingclient.api.j0;
import com.android.billingclient.api.n;
import com.android.billingclient.api.w;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzfy;
import com.google.android.gms.internal.play_billing.zzfz;
import com.yandex.metrica.ConfigurationJobService;
import com.yandex.metrica.impl.ob.O6;
import g3.m;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c implements O6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<LiveData> f31679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f31680b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Set<androidx.lifecycle.LiveData>] */
    public c() {
        this.f31679a = new HashMap();
        this.f31680b = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static c b(Context context, String str) {
        Throwable e10;
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new c(channel, fileLockLock);
                } catch (IOException e11) {
                    e10 = e11;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e10);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e12) {
                    e10 = e12;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e10);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e13) {
                    e10 = e13;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e10);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e14) {
                e10 = e14;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e15) {
            e10 = e15;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // com.yandex.metrica.impl.ob.O6
    public void a() {
        try {
            ((ConfigurationJobService) this.f31680b).jobFinished((JobParameters) this.f31679a, false);
        } catch (Throwable unused) {
        }
    }

    public Map<d3.c, m<?>> c(boolean z10) {
        return (Map) (z10 ? this.f31680b : this.f31679a);
    }

    public void d() {
        try {
            ((FileLock) this.f31680b).release();
            ((FileChannel) this.f31679a).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    public void e(zzfb zzfbVar) {
        try {
            zzfy zzfyVarZzv = zzfz.zzv();
            zzfm zzfmVar = (zzfm) this.f31679a;
            if (zzfmVar != null) {
                zzfyVarZzv.zzk(zzfmVar);
            }
            zzfyVarZzv.zzi(zzfbVar);
            ((g0) this.f31680b).a((zzfz) zzfyVarZzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    public void f(zzff zzffVar) {
        try {
            zzfy zzfyVarZzv = zzfz.zzv();
            zzfm zzfmVar = (zzfm) this.f31679a;
            if (zzfmVar != null) {
                zzfyVarZzv.zzk(zzfmVar);
            }
            zzfyVarZzv.zzj(zzffVar);
            ((g0) this.f31680b).a((zzfz) zzfyVarZzv.zzc());
        } catch (Throwable unused) {
            zzb.zzj("BillingLogger", "Unable to log.");
        }
    }

    public void g() {
        j0 j0Var = (j0) this.f31680b;
        Context context = (Context) this.f31679a;
        if (!j0Var.f3819d) {
            zzb.zzj("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver((j0) j0Var.f3820e.f31680b);
            j0Var.f3819d = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, w wVar, com.android.billingclient.api.c cVar, c cVar2) {
        this.f31679a = context;
        this.f31680b = new j0(this, wVar, cVar, cVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, zzfm zzfmVar) {
        this.f31680b = new g0(context);
        this.f31679a = zzfmVar;
    }

    public c(androidx.room.g gVar) {
        this.f31679a = Collections.newSetFromMap(new IdentityHashMap());
        this.f31680b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(n nVar, List list) {
        this.f31679a = list;
        this.f31680b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(ConfigurationJobService configurationJobService, JobParameters jobParameters) {
        this.f31680b = configurationJobService;
        this.f31679a = jobParameters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(FileChannel fileChannel, FileLock fileLock) {
        this.f31679a = fileChannel;
        this.f31680b = fileLock;
    }
}
