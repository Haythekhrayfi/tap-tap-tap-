package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdz extends zzfy {
    private final Context zza;
    private final zzge zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzawl zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzfwm zzo;
    private final AtomicLong zzp;
    private final zzcec zzq;

    public zzcdz(Context context, zzge zzgeVar, String str, int i10, zzhg zzhgVar, zzcec zzcecVar) {
        super(false);
        this.zza = context;
        this.zzb = zzgeVar;
        this.zzq = zzcecVar;
        this.zzc = str;
        this.zzd = i10;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbJ)).booleanValue();
        zzf(zzhgVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzeb)).booleanValue() || this.zzl) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzec)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzt
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        int iZza = inputStream != null ? inputStream.read(bArr, i10, i11) : this.zzb.zza(bArr, i10, i11);
        if (!this.zze || this.zzf != null) {
            zzg(iZza);
        }
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcem] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzge
    public final long zzb(zzgj zzgjVar) throws Throwable {
        zzawi zzawiVarZzb;
        boolean z10;
        boolean z11;
        long jElapsedRealtime;
        String string = "ms";
        if (this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r10 = 1;
        this.zzg = true;
        this.zzh = zzgjVar.zza;
        if (!this.zze) {
            zzj(zzgjVar);
        }
        this.zzi = zzawl.zza(zzgjVar.zza);
        ?? sb2 = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdY)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgjVar.zzf;
                this.zzi.zzi = zzfpw.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzawiVarZzb = com.google.android.gms.ads.internal.zzt.zzc().zzb(this.zzi);
            } else {
                zzawiVarZzb = null;
            }
            if (zzawiVarZzb != null && zzawiVarZzb.zze()) {
                this.zzj = zzawiVarZzb.zzd();
                this.zzl = zzawiVarZzb.zzg();
                this.zzm = zzawiVarZzb.zzf();
                this.zzn = zzawiVarZzb.zza();
                this.zzk = true;
                if (!zzr()) {
                    this.zzf = zzawiVarZzb.zzc();
                    if (this.zze) {
                        zzj(zzgjVar);
                    }
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgjVar.zzf;
            this.zzi.zzi = zzfpw.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(this.zzi.zzg ? zzbbm.zzea : zzbbm.zzdZ)).longValue();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
            com.google.android.gms.ads.internal.zzt.zzd();
            Future futureZza = zzaww.zza(this.zza, this.zzi);
            try {
                try {
                    zzawx zzawxVar = (zzawx) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.zzj = zzawxVar.zzd();
                        this.zzl = zzawxVar.zzf();
                        this.zzm = zzawxVar.zze();
                        this.zzn = zzawxVar.zza();
                        if (!zzr()) {
                            this.zzf = zzawxVar.zzc();
                            if (this.zze) {
                                zzj(zzgjVar);
                            }
                            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime2;
                            this.zzq.zza.zzab(true, jElapsedRealtime3);
                            this.zzk = true;
                            com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime3 + "ms");
                            return -1L;
                        }
                        long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(true, jElapsedRealtime4);
                        this.zzk = true;
                        string = "Cache connection took " + jElapsedRealtime4 + "ms";
                    } catch (InterruptedException unused) {
                        z11 = true;
                        futureZza.cancel(true);
                        Thread.currentThread().interrupt();
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(z11, jElapsedRealtime);
                        this.zzk = z11;
                        sb2 = new StringBuilder();
                        sb2.append("Cache connection took ");
                        sb2.append(jElapsedRealtime);
                        sb2.append("ms");
                        string = sb2.toString();
                    } catch (ExecutionException | TimeoutException unused2) {
                        z10 = true;
                        futureZza.cancel(true);
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(z10, jElapsedRealtime);
                        this.zzk = z10;
                        sb2 = new StringBuilder();
                        sb2.append("Cache connection took ");
                        sb2.append(jElapsedRealtime);
                        sb2.append("ms");
                        string = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(r10, jElapsedRealtime5);
                        this.zzk = r10;
                        com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime5 + string);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10 = sb2;
                }
            } catch (InterruptedException unused3) {
                z11 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z10 = false;
            } catch (Throwable th3) {
                th = th3;
                r10 = 0;
            }
            com.google.android.gms.ads.internal.util.zze.zza(string);
        }
        this.zzk = false;
        if (this.zzi != null) {
            zzgjVar = new zzgj(Uri.parse(this.zzi.zza), null, zzgjVar.zze, zzgjVar.zzf, zzgjVar.zzg, null, zzgjVar.zzi);
        }
        return this.zzb.zzb(zzgjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzge
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        boolean z10 = (this.zze && this.zzf == null) ? false : true;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z10) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long zzl() {
        if (this.zzi == null) {
            return -1L;
        }
        if (this.zzp.get() == -1) {
            synchronized (this) {
                if (this.zzo == null) {
                    this.zzo = zzcae.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdy
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzm();
                        }
                    });
                }
            }
            if (!this.zzo.isDone()) {
                return -1L;
            }
            try {
                this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.zzp.get();
    }

    public final /* synthetic */ Long zzm() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzt.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
