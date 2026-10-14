package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.Clock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdo extends zzcdl {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcdo(zzcca zzccaVar) {
        super(zzccaVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            zzbzr.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(cacheDir, "admobVideoStreams");
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            zzbzr.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            zzbzr.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(this.zzg, String.valueOf(file.getName()).concat(".done"));
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:167:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:168:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:171:0x040b  */
    /* JADX WARN: Instruction removed from duplicated block: B:167:0x03d2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:168:0x03ec, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzt(final String str) {
        int i10;
        String str2;
        String str3;
        String str4;
        String str5;
        int responseCode;
        String str6;
        boolean zDelete;
        FileOutputStream fileOutputStream = null;
        if (this.zzg == null) {
            zzg(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.zzg;
            if (file == null) {
                i10 = 0;
            } else {
                i10 = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i10++;
                    }
                }
            }
            if (i10 <= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzu)).intValue()) {
                File file3 = new File(this.zzg, zzbzk.zze(str));
                File fileZza = zza(file3);
                if (file3.isFile() && fileZza.isFile()) {
                    int length = (int) file3.length();
                    zzbzr.zze("Stream cache hit at ".concat(String.valueOf(str)));
                    zzh(str, file3.getAbsolutePath(), length);
                    return true;
                }
                String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
                String strValueOf2 = String.valueOf(str);
                Set set = zze;
                String strConcat = strValueOf.concat(strValueOf2);
                synchronized (set) {
                    if (set.contains(strConcat)) {
                        zzbzr.zzj("Stream cache already in progress at " + str);
                        zzg(str, file3.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(strConcat);
                    String str7 = "error";
                    try {
                        HttpURLConnection httpURLConnectionZzn = zzflm.zza().zzn(new zzflx() { // from class: com.google.android.gms.internal.ads.zzcdn
                            @Override // com.google.android.gms.internal.ads.zzflx
                            public final URLConnection zza() throws IOException {
                                String str8 = str;
                                int i11 = zzcdo.zzd;
                                com.google.android.gms.ads.internal.zzt.zzw();
                                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzz)).intValue();
                                URL url = new URL(str8);
                                int i12 = 0;
                                while (true) {
                                    i12++;
                                    if (i12 > 20) {
                                        throw new IOException("Too many redirects (20)");
                                    }
                                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                                    uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                    uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                    if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                        throw new IOException("Invalid protocol.");
                                    }
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                    zzbzq zzbzqVar = new zzbzq(null);
                                    zzbzqVar.zzc(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode2 = httpURLConnection.getResponseCode();
                                    zzbzqVar.zze(httpURLConnection, responseCode2);
                                    if (responseCode2 / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    String headerField = httpURLConnection.getHeaderField("Location");
                                    if (headerField == null) {
                                        throw new IOException("Missing Location header in redirect");
                                    }
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new IOException("Protocol is null");
                                    }
                                    if (!protocol.equals("http") && !protocol.equals("https")) {
                                        throw new IOException("Unsupported scheme: ".concat(protocol));
                                    }
                                    zzbzr.zze("Redirecting to ".concat(headerField));
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if (!(httpURLConnectionZzn instanceof HttpURLConnection) || (responseCode = httpURLConnectionZzn.getResponseCode()) < 400) {
                            int contentLength = httpURLConnectionZzn.getContentLength();
                            if (contentLength < 0) {
                                zzbzr.zzj("Stream cache aborted, missing content-length header at " + str);
                                zzg(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(strConcat);
                                return false;
                            }
                            String str8 = zzf.format(contentLength);
                            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzv)).intValue();
                            if (contentLength > iIntValue) {
                                zzbzr.zzj("Content length " + str8 + " exceeds limit at " + str);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("File too big for full file cache. Size: ");
                                sb2.append(str8);
                                zzg(str, file3.getAbsolutePath(), "sizeExceeded", sb2.toString());
                                set.remove(strConcat);
                                return false;
                            }
                            zzbzr.zze("Caching " + str8 + " bytes from " + str);
                            ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzn.getInputStream());
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                            try {
                                FileChannel channel = fileOutputStream2.getChannel();
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                Clock clockZzB = com.google.android.gms.ads.internal.zzt.zzB();
                                long jCurrentTimeMillis = clockZzB.currentTimeMillis();
                                com.google.android.gms.ads.internal.util.zzbz zzbzVar = new com.google.android.gms.ads.internal.util.zzbz(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzy)).longValue());
                                zzbbe zzbbeVar = zzbbm.zzx;
                                zzbbk zzbbkVarZzc = com.google.android.gms.ads.internal.client.zzba.zzc();
                                long jLongValue = ((Long) zzbbkVarZzc.zzb(zzbbeVar)).longValue();
                                int i11 = 0;
                                while (true) {
                                    int i12 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                    if (i12 >= 0) {
                                        i11 += i12;
                                        try {
                                            try {
                                                if (i11 > iIntValue) {
                                                    String str9 = "File too big for full file cache. Size: " + Integer.toString(i11);
                                                    throw new IOException("stream cache file size limit exceeded");
                                                }
                                                try {
                                                    byteBufferAllocate.flip();
                                                    while (channel.write(byteBufferAllocate) > 0) {
                                                    }
                                                    byteBufferAllocate.clear();
                                                    if (clockZzB.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                        String str10 = "Timeout exceeded. Limit: " + Long.toString(jLongValue) + " sec";
                                                        throw new IOException("stream cache time limit exceeded");
                                                    }
                                                    ByteBuffer byteBuffer = byteBufferAllocate;
                                                    if (this.zzh) {
                                                        throw new IOException("abort requested");
                                                    }
                                                    if (zzbzVar.zzb()) {
                                                        str4 = str7;
                                                        try {
                                                            str5 = strConcat;
                                                            fileOutputStream2 = fileOutputStream2;
                                                            try {
                                                                try {
                                                                    zzbzk.zza.post(new zzcdf(this, str, file3.getAbsolutePath(), i11, contentLength, false));
                                                                } catch (IOException e10) {
                                                                    e = e10;
                                                                    str2 = str5;
                                                                    str7 = str4;
                                                                    fileOutputStream = fileOutputStream2;
                                                                    str3 = 0;
                                                                    if (e instanceof RuntimeException) {
                                                                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoStreamFullFileCache.preload");
                                                                    }
                                                                    fileOutputStream.close();
                                                                    if (this.zzh) {
                                                                        zzbzr.zzi("Preload aborted for URL \"" + str + "\"");
                                                                    } else {
                                                                        zzbzr.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                    }
                                                                    if (file3.exists()) {
                                                                        zzbzr.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                                                    }
                                                                    zzg(str, file3.getAbsolutePath(), str7, str3);
                                                                    zze.remove(str2);
                                                                    return false;
                                                                }
                                                            } catch (RuntimeException e11) {
                                                                e = e11;
                                                                str2 = str5;
                                                                str7 = str4;
                                                                fileOutputStream = fileOutputStream2;
                                                                str3 = 0;
                                                                if (e instanceof RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoStreamFullFileCache.preload");
                                                                }
                                                                fileOutputStream.close();
                                                                if (this.zzh) {
                                                                    zzbzr.zzi("Preload aborted for URL \"" + str + "\"");
                                                                } else {
                                                                    zzbzr.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                }
                                                                if (file3.exists()) {
                                                                    zzbzr.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                                                }
                                                                zzg(str, file3.getAbsolutePath(), str7, str3);
                                                                zze.remove(str2);
                                                                return false;
                                                            }
                                                        } catch (IOException e12) {
                                                            e = e12;
                                                            str2 = strConcat;
                                                            str7 = str4;
                                                            fileOutputStream = fileOutputStream2;
                                                            str3 = 0;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.zzh) {
                                                                zzbzr.zzi("Preload aborted for URL \"" + str + "\"");
                                                            } else {
                                                                zzbzr.zzk("Preload failed for URL \"" + str + "\"", e);
                                                            }
                                                            if (file3.exists()) {
                                                                zzbzr.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                                            }
                                                            zzg(str, file3.getAbsolutePath(), str7, str3);
                                                            zze.remove(str2);
                                                            return false;
                                                        } catch (RuntimeException e13) {
                                                            e = e13;
                                                            str2 = strConcat;
                                                            str7 = str4;
                                                            fileOutputStream = fileOutputStream2;
                                                            str3 = 0;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.zzh) {
                                                                zzbzr.zzi("Preload aborted for URL \"" + str + "\"");
                                                            } else {
                                                                zzbzr.zzk("Preload failed for URL \"" + str + "\"", e);
                                                            }
                                                            if (file3.exists()) {
                                                                zzbzr.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                                            }
                                                            zzg(str, file3.getAbsolutePath(), str7, str3);
                                                            zze.remove(str2);
                                                            return false;
                                                        }
                                                    } else {
                                                        fileOutputStream2 = fileOutputStream2;
                                                        str5 = strConcat;
                                                        str4 = str7;
                                                    }
                                                    byteBufferAllocate = byteBuffer;
                                                    readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                    str7 = str4;
                                                    zzbzVar = zzbzVar;
                                                    strConcat = str5;
                                                    channel = channel;
                                                    fileOutputStream2 = fileOutputStream2;
                                                    iIntValue = iIntValue;
                                                    contentLength = contentLength;
                                                } catch (IOException | RuntimeException e14) {
                                                    e = e14;
                                                    str4 = str7;
                                                }
                                                str2 = strConcat;
                                            } catch (IOException | RuntimeException e15) {
                                                e = e15;
                                                str3 = zzbbkVarZzc;
                                                str2 = str5;
                                                fileOutputStream = fileOutputStream2;
                                            }
                                        } catch (IOException | RuntimeException e16) {
                                            e = e16;
                                            str2 = str5;
                                        }
                                    } else {
                                        fileOutputStream2 = fileOutputStream2;
                                        str5 = strConcat;
                                        str4 = str7;
                                        fileOutputStream2.close();
                                        if (zzbzr.zzm(3)) {
                                            zzbzr.zze("Preloaded " + zzf.format(i11) + " bytes from " + str);
                                        }
                                        file3.setReadable(true, false);
                                        if (fileZza.isFile()) {
                                            fileZza.setLastModified(System.currentTimeMillis());
                                        } else {
                                            try {
                                                fileZza.createNewFile();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        zzh(str, file3.getAbsolutePath(), i11);
                                        str2 = str5;
                                        try {
                                            zze.remove(str2);
                                            return true;
                                        } catch (IOException e17) {
                                            e = e17;
                                        } catch (RuntimeException e18) {
                                            e = e18;
                                        }
                                    }
                                    str7 = str4;
                                    fileOutputStream = fileOutputStream2;
                                    str3 = 0;
                                }
                            } catch (IOException | RuntimeException e19) {
                                e = e19;
                                fileOutputStream2 = fileOutputStream2;
                                str2 = strConcat;
                                str4 = str7;
                            }
                        } else {
                            str7 = "badUrl";
                            try {
                                String str11 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                try {
                                    throw new IOException("HTTP status code " + responseCode + " at " + str);
                                } catch (IOException | RuntimeException e20) {
                                    e = e20;
                                    str6 = str11;
                                    str2 = strConcat;
                                    str3 = str6;
                                    if (e instanceof RuntimeException) {
                                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoStreamFullFileCache.preload");
                                    }
                                    fileOutputStream.close();
                                    if (this.zzh) {
                                        zzbzr.zzi("Preload aborted for URL \"" + str + "\"");
                                    } else {
                                        zzbzr.zzk("Preload failed for URL \"" + str + "\"", e);
                                    }
                                    if (file3.exists()) {
                                        zzbzr.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                    }
                                    zzg(str, file3.getAbsolutePath(), str7, str3);
                                    zze.remove(str2);
                                    return false;
                                }
                            } catch (IOException | RuntimeException e21) {
                                e = e21;
                                str6 = null;
                            }
                        }
                    } catch (IOException | RuntimeException e22) {
                        e = e22;
                        str2 = strConcat;
                        str7 = "error";
                        str3 = 0;
                        fileOutputStream = null;
                    }
                    if (e instanceof RuntimeException) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoStreamFullFileCache.preload");
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException | NullPointerException unused2) {
                    }
                    if (this.zzh) {
                        zzbzr.zzi("Preload aborted for URL \"" + str + "\"");
                    } else {
                        zzbzr.zzk("Preload failed for URL \"" + str + "\"", e);
                    }
                    if (file3.exists() && !file3.delete()) {
                        zzbzr.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                    }
                    zzg(str, file3.getAbsolutePath(), str7, str3);
                    zze.remove(str2);
                    return false;
                }
            }
            File file4 = this.zzg;
            if (file4 == null) {
                break;
            }
            File[] fileArrListFiles = file4.listFiles();
            long j10 = RecyclerView.FOREVER_NS;
            File file5 = null;
            for (File file6 : fileArrListFiles) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j10) {
                        file5 = file6;
                        j10 = jLastModified;
                    }
                }
            }
            if (file5 != null) {
                zDelete = file5.delete();
                File fileZza2 = zza(file5);
                if (fileZza2.isFile()) {
                    zDelete &= fileZza2.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        zzbzr.zzj("Unable to expire stream cache");
        zzg(str, null, "expireFailed", null);
        return false;
    }
}
