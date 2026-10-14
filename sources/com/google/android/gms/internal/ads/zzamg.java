package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzamg implements zzaku {
    private final zzamf zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzamg(zzamf zzamfVar, int i10) {
        this.zzc = zzamfVar;
    }

    public zzamg(File file, int i10) {
        this.zzc = new zzamc(this, file);
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (((long) zzn(inputStream)) & 255) | ((((long) zzn(inputStream)) & 255) << 8) | ((((long) zzn(inputStream)) & 255) << 16) | ((((long) zzn(inputStream)) & 255) << 24) | ((((long) zzn(inputStream)) & 255) << 32) | ((((long) zzn(inputStream)) & 255) << 40) | ((((long) zzn(inputStream)) & 255) << 48) | ((((long) zzn(inputStream)) & 255) << 56);
    }

    public static String zzh(zzame zzameVar) throws IOException {
        return new String(zzm(zzameVar, zzf(zzameVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] zzm(zzame zzameVar, long j10) throws IOException {
        long jZza = zzameVar.zza();
        if (j10 >= 0 && j10 <= jZza) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzameVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbA = i2.a.a("streamToBytes length=", j10, ", maxLength=");
        sbA.append(jZza);
        throw new IOException(sbA.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzamd zzamdVar) {
        if (this.zza.containsKey(str)) {
            this.zzb = (zzamdVar.zza - ((zzamd) this.zza.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzamdVar.zza;
        }
        this.zza.put(str, zzamdVar);
    }

    private final void zzp(String str) {
        zzamd zzamdVar = (zzamd) this.zza.remove(str);
        if (zzamdVar != null) {
            this.zzb -= zzamdVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    public final synchronized zzakt zza(String str) {
        zzamd zzamdVar = (zzamd) this.zza.get(str);
        if (zzamdVar == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            zzame zzameVar = new zzame(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                zzamd zzamdVarZza = zzamd.zza(zzameVar);
                if (!TextUtils.equals(str, zzamdVarZza.zzb)) {
                    zzalw.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, zzamdVarZza.zzb);
                    zzp(str);
                    zzameVar.close();
                    return null;
                }
                byte[] bArrZzm = zzm(zzameVar, zzameVar.zza());
                zzakt zzaktVar = new zzakt();
                zzaktVar.zza = bArrZzm;
                zzaktVar.zzb = zzamdVar.zzc;
                zzaktVar.zzc = zzamdVar.zzd;
                zzaktVar.zzd = zzamdVar.zze;
                zzaktVar.zze = zzamdVar.zzf;
                zzaktVar.zzf = zzamdVar.zzg;
                List<zzalc> list = zzamdVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzalc zzalcVar : list) {
                    treeMap.put(zzalcVar.zza(), zzalcVar.zzb());
                }
                zzaktVar.zzg = treeMap;
                zzaktVar.zzh = Collections.unmodifiableList(zzamdVar.zzh);
                zzameVar.close();
                return zzaktVar;
            } catch (Throwable th) {
                zzameVar.close();
                throw th;
            }
        } catch (IOException e10) {
            zzalw.zza("%s: %s", fileZzg.getAbsolutePath(), e10.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    public final synchronized void zzb() {
        try {
            File fileZza = this.zzc.zza();
            if (!fileZza.exists()) {
                if (fileZza.mkdirs()) {
                    return;
                }
                zzalw.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
                return;
            }
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzame zzameVar = new zzame(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzamd zzamdVarZza = zzamd.zza(zzameVar);
                            zzamdVarZza.zza = length;
                            zzo(zzamdVarZza.zzb, zzamdVarZza);
                            zzameVar.close();
                        } catch (Throwable th) {
                            zzameVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    public final synchronized void zzc(String str, boolean z10) {
        zzakt zzaktVarZza = zza(str);
        if (zzaktVarZza != null) {
            zzaktVarZza.zzf = 0L;
            zzaktVarZza.zze = 0L;
            zzd(str, zzaktVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaku
    public final synchronized void zzd(String str, zzakt zzaktVar) {
        long j10 = this.zzb;
        int length = zzaktVar.zza.length;
        long j11 = j10 + ((long) length);
        int i10 = this.zzd;
        if (j11 > i10 && length > i10 * 0.9f) {
            return;
        }
        File fileZzg = zzg(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
            zzamd zzamdVar = new zzamd(str, zzaktVar);
            try {
                zzj(bufferedOutputStream, 538247942);
                zzl(bufferedOutputStream, zzamdVar.zzb);
                String str2 = zzamdVar.zzc;
                if (str2 == null) {
                    str2 = "";
                }
                zzl(bufferedOutputStream, str2);
                zzk(bufferedOutputStream, zzamdVar.zzd);
                zzk(bufferedOutputStream, zzamdVar.zze);
                zzk(bufferedOutputStream, zzamdVar.zzf);
                zzk(bufferedOutputStream, zzamdVar.zzg);
                List<zzalc> list = zzamdVar.zzh;
                if (list != null) {
                    zzj(bufferedOutputStream, list.size());
                    for (zzalc zzalcVar : list) {
                        zzl(bufferedOutputStream, zzalcVar.zza());
                        zzl(bufferedOutputStream, zzalcVar.zzb());
                    }
                } else {
                    zzj(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.write(zzaktVar.zza);
                bufferedOutputStream.close();
                zzamdVar.zza = fileZzg.length();
                zzo(str, zzamdVar);
                if (this.zzb >= this.zzd) {
                    if (zzalw.zzb) {
                        zzalw.zzd("Pruning old cache entries.", new Object[0]);
                    }
                    long j12 = this.zzb;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator it = this.zza.entrySet().iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        zzamd zzamdVar2 = (zzamd) ((Map.Entry) it.next()).getValue();
                        if (zzg(zzamdVar2.zzb).delete()) {
                            this.zzb -= zzamdVar2.zza;
                        } else {
                            String str3 = zzamdVar2.zzb;
                            zzalw.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                        }
                        it.remove();
                        i11++;
                        if (this.zzb < this.zzd * 0.9f) {
                            break;
                        }
                    }
                    if (zzalw.zzb) {
                        zzalw.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.zzb - j12), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                    }
                }
            } catch (IOException e10) {
                zzalw.zza("%s", e10.toString());
                bufferedOutputStream.close();
                zzalw.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (!fileZzg.delete()) {
                zzalw.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
            }
            if (!this.zzc.zza().exists()) {
                zzalw.zza("Re-initializing cache after external clearing.", new Object[0]);
                this.zza.clear();
                this.zzb = 0L;
                zzb();
            }
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        zzp(str);
        if (zDelete) {
            return;
        }
        zzalw.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }
}
