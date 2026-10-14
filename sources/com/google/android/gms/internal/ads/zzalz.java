package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class zzalz implements zzald {
    public final zzamb zza;

    @Deprecated
    public final zzaly zzb;
    private final zzaly zzc;

    public zzalz(zzaly zzalyVar) {
        zzamb zzambVar = new zzamb(4096);
        this.zzc = zzalyVar;
        this.zzb = zzalyVar;
        this.zza = zzambVar;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:147:0x02d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x02db  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:164:0x0336  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0389 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzald
    public zzalg zza(zzalk zzalkVar) throws Throwable {
        zzami zzamiVar;
        byte[] bArr;
        int iZzb;
        zzamm zzammVar;
        zzalg zzalgVar;
        zzamm zzammVar2;
        int iZzb2;
        Map mapEmptyMap;
        byte[] byteArray;
        byte[] bArrZzb;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            boolean z10 = true;
            try {
                zzakt zzaktVarZzd = zzalkVar.zzd();
                if (zzaktVarZzd == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str = zzaktVarZzd.zzb;
                    if (str != null) {
                        map.put("If-None-Match", str);
                    }
                    long j10 = zzaktVarZzd.zzd;
                    if (j10 > 0) {
                        map.put("If-Modified-Since", zzamh.zzc(j10));
                    }
                    mapEmptyMap = map;
                }
                String strZzk = zzalkVar.zzk();
                HashMap map2 = new HashMap();
                map2.putAll(mapEmptyMap);
                map2.putAll(zzalkVar.zzl());
                URL url = new URL(strZzk);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                int iZzb3 = zzalkVar.zzb();
                httpURLConnection.setConnectTimeout(iZzb3);
                httpURLConnection.setReadTimeout(iZzb3);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                "https".equals(url.getProtocol());
                try {
                    for (String str2 : map2.keySet()) {
                        httpURLConnection.setRequestProperty(str2, (String) map2.get(str2));
                    }
                    if (zzalkVar.zza() != 0) {
                        httpURLConnection.setRequestMethod("POST");
                        byte[] bArrZzx = zzalkVar.zzx();
                        if (bArrZzx != null) {
                            httpURLConnection.setDoOutput(true);
                            if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                            }
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(bArrZzx);
                            dataOutputStream.close();
                        }
                    } else {
                        httpURLConnection.setRequestMethod("GET");
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == -1) {
                        try {
                            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
                        } catch (Throwable th) {
                            th = th;
                            z10 = false;
                            if (!z10) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    zzalkVar.zza();
                    if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                        zzamiVar = new zzami(responseCode, zzamk.zza(httpURLConnection.getHeaderFields()), -1, null);
                        httpURLConnection.disconnect();
                    } else {
                        try {
                            zzamiVar = new zzami(responseCode, zzamk.zza(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new zzamj(httpURLConnection));
                        } catch (Throwable th2) {
                            th = th2;
                            if (!z10) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (IOException e10) {
                                    e = e10;
                                    zzamiVar = null;
                                    bArr = null;
                                    if (e instanceof SocketTimeoutException) {
                                        zzammVar = new zzamm("socket", new zzals(), null);
                                    } else {
                                        if (!(e instanceof MalformedURLException)) {
                                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzalkVar.zzk())), e);
                                        }
                                        if (zzamiVar != null) {
                                            throw new zzalh(e);
                                        }
                                        iZzb = zzamiVar.zzb();
                                        zzalw.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb), zzalkVar.zzk());
                                        if (bArr != null) {
                                            zzalgVar = new zzalg(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzamiVar.zzd());
                                            if (iZzb == 401) {
                                            }
                                            zzammVar = new zzamm("auth", new zzaks(zzalgVar), null);
                                        } else {
                                            zzammVar = new zzamm("network", new zzalf(), null);
                                        }
                                    }
                                    zzammVar2 = zzammVar;
                                    zzaky zzakyVarZzy = zzalkVar.zzy();
                                    iZzb2 = zzalkVar.zzb();
                                    try {
                                        zzakyVarZzy.zzc(zzammVar2.zzb);
                                        zzalkVar.zzm(String.format("%s-retry [timeout=%s]", zzammVar2.zza, Integer.valueOf(iZzb2)));
                                    } catch (zzalt e11) {
                                        zzalkVar.zzm(String.format("%s-timeout-giveup [timeout=%s]", zzammVar2.zza, Integer.valueOf(iZzb2)));
                                        throw e11;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    try {
                        int iZzb4 = zzamiVar.zzb();
                        List listZzd = zzamiVar.zzd();
                        if (iZzb4 == 304) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            zzakt zzaktVarZzd2 = zzalkVar.zzd();
                            if (zzaktVarZzd2 == null) {
                                return new zzalg(304, (byte[]) null, true, jElapsedRealtime2, listZzd);
                            }
                            TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                            if (!listZzd.isEmpty()) {
                                Iterator it = listZzd.iterator();
                                while (it.hasNext()) {
                                    treeSet.add(((zzalc) it.next()).zza());
                                }
                            }
                            ArrayList arrayList = new ArrayList(listZzd);
                            List list = zzaktVarZzd2.zzh;
                            if (list != null) {
                                if (!list.isEmpty()) {
                                    for (zzalc zzalcVar : zzaktVarZzd2.zzh) {
                                        if (!treeSet.contains(zzalcVar.zza())) {
                                            arrayList.add(zzalcVar);
                                        }
                                    }
                                }
                            } else if (!zzaktVarZzd2.zzg.isEmpty()) {
                                for (Map.Entry entry : zzaktVarZzd2.zzg.entrySet()) {
                                    if (!treeSet.contains(entry.getKey())) {
                                        arrayList.add(new zzalc((String) entry.getKey(), (String) entry.getValue()));
                                    }
                                }
                            }
                            return new zzalg(304, zzaktVarZzd2.zza, true, jElapsedRealtime2, (List) arrayList);
                        }
                        InputStream inputStreamZzc = zzamiVar.zzc();
                        if (inputStreamZzc != null) {
                            int iZza = zzamiVar.zza();
                            try {
                                zzamb zzambVar = this.zza;
                                zzamn zzamnVar = new zzamn(zzambVar, iZza);
                                try {
                                    bArrZzb = zzambVar.zzb(1024);
                                    while (true) {
                                        try {
                                            int i10 = inputStreamZzc.read(bArrZzb);
                                            if (i10 == -1) {
                                                break;
                                            }
                                            zzamnVar.write(bArrZzb, 0, i10);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                inputStreamZzc.close();
                                            } catch (IOException unused) {
                                                zzalw.zzd("Error occurred when closing InputStream", new Object[0]);
                                            }
                                            zzambVar.zza(bArrZzb);
                                            zzamnVar.close();
                                            throw th;
                                        }
                                        if (e instanceof SocketTimeoutException) {
                                            zzammVar = new zzamm("socket", new zzals(), null);
                                        } else {
                                            if (!(e instanceof MalformedURLException)) {
                                                throw new RuntimeException("Bad URL ".concat(String.valueOf(zzalkVar.zzk())), e);
                                            }
                                            if (zzamiVar != null) {
                                                throw new zzalh(e);
                                            }
                                            iZzb = zzamiVar.zzb();
                                            zzalw.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb), zzalkVar.zzk());
                                            if (bArr != null) {
                                                zzalgVar = new zzalg(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzamiVar.zzd());
                                                if (iZzb == 401 && iZzb != 403) {
                                                    if (iZzb < 400 || iZzb > 499) {
                                                        throw new zzalr(zzalgVar);
                                                    }
                                                    throw new zzakx(zzalgVar);
                                                }
                                                zzammVar = new zzamm("auth", new zzaks(zzalgVar), null);
                                            } else {
                                                zzammVar = new zzamm("network", new zzalf(), null);
                                            }
                                        }
                                        zzammVar2 = zzammVar;
                                        zzaky zzakyVarZzy2 = zzalkVar.zzy();
                                        iZzb2 = zzalkVar.zzb();
                                        zzakyVarZzy2.zzc(zzammVar2.zzb);
                                        zzalkVar.zzm(String.format("%s-retry [timeout=%s]", zzammVar2.zza, Integer.valueOf(iZzb2)));
                                    }
                                    byteArray = zzamnVar.toByteArray();
                                    try {
                                        inputStreamZzc.close();
                                    } catch (IOException unused2) {
                                        zzalw.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzambVar.zza(bArrZzb);
                                    zzamnVar.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    bArrZzb = null;
                                }
                            } catch (IOException e12) {
                                e = e12;
                                bArr = null;
                            }
                        } else {
                            byteArray = new byte[0];
                        }
                        try {
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (zzalw.zzb || jElapsedRealtime3 > 3000) {
                                Object[] objArr = new Object[5];
                                objArr[0] = zzalkVar;
                                objArr[1] = Long.valueOf(jElapsedRealtime3);
                                objArr[2] = byteArray != null ? Integer.valueOf(byteArray.length) : "null";
                                objArr[3] = Integer.valueOf(iZzb4);
                                objArr[4] = Integer.valueOf(zzalkVar.zzy().zza());
                                zzalw.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                            }
                            if (iZzb4 < 200 || iZzb4 > 299) {
                                throw new IOException();
                            }
                            return new zzalg(iZzb4, byteArray, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzd);
                        } catch (IOException e13) {
                            e = e13;
                            bArr = byteArray;
                        }
                    } catch (IOException e14) {
                        e = e14;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (IOException e15) {
                e = e15;
            }
        }
    }
}
