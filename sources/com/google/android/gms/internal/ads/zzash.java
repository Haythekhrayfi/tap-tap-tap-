package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzash extends zzath {
    private static final zzati zzi = new zzati();
    private final Context zzj;

    public zzash(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, Context context, zzanj zzanjVar) {
        super(zzartVar, "jrfJs+Yxsv/gGQ+cGnmY8EkHVJn84HokHsebN4IZy0eeE0ECK9wrDY7bM1U167G5", "b0nnYr5Y43sLp9uCG6eLzyBhSsauFEDPWpaZrhJ4ttc=", zzanqVar, i10, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaon zzaonVarZzc = this.zzb.zzc();
            if (zzaonVarZzc == null || !zzaonVarZzc.zzaj()) {
                return null;
            }
            return zzaonVarZzc.zzh();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i10;
        zzape zzapeVar;
        AtomicReference atomicReferenceZza = zzi.zza(this.zzj.getPackageName());
        synchronized (atomicReferenceZza) {
            zzape zzapeVar2 = (zzape) atomicReferenceZza.get();
            if (zzapeVar2 == null || zzarw.zzd(zzapeVar2.zza) || zzapeVar2.zza.equals("E") || zzapeVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzarw.zzd(null)) {
                    zzarw.zzd(null);
                    Boolean.FALSE.booleanValue();
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                Boolean boolValueOf = Boolean.valueOf(i10 == 3);
                Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzce);
                String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcd)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzp() && zzarw.zzd(strZzb)) {
                    strZzb = zzc();
                }
                zzape zzapeVar3 = new zzape((String) this.zzf.invoke(null, this.zzj, boolValueOf, strZzb));
                if (zzarw.zzd(zzapeVar3.zza) || zzapeVar3.zza.equals("E")) {
                    int i11 = i10 - 1;
                    if (i11 == 3) {
                        String strZzc = zzc();
                        if (!zzarw.zzd(strZzc)) {
                            zzapeVar3.zza = strZzc;
                        }
                    } else if (i11 == 4) {
                        throw null;
                    }
                }
                atomicReferenceZza.set(zzapeVar3);
            }
            zzapeVar = (zzape) atomicReferenceZza.get();
        }
        synchronized (this.zze) {
            if (zzapeVar != null) {
                this.zze.zzx(zzapeVar.zza);
                this.zze.zzX(zzapeVar.zzb);
                this.zze.zzZ(zzapeVar.zzc);
                this.zze.zzi(zzapeVar.zzd);
                this.zze.zzw(zzapeVar.zze);
            }
        }
    }

    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzf = zzarw.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcf));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzarw.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcg)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zzb.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzfwv zzfwvVarZzf = zzfwv.zzf();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzatj
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    zzfwv zzfwvVar = zzfwvVarZzf;
                    if (list == null) {
                        zzfwvVar.zzd(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list.get(i10);
                            if (apkChecksum.getType() == 8) {
                                zzfwvVar.zzd(zzarw.zzb(apkChecksum.getValue()));
                                return;
                            }
                        }
                        zzfwvVar.zzd(null);
                    } catch (Throwable unused) {
                        zzfwvVar.zzd(null);
                    }
                }
            });
            return (String) zzfwvVarZzf.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
