package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class ip implements eg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f21772a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f21773b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f21774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f21775d;

    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f21776a;

        public a(File file) {
            this.f21776a = file;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f21777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f21778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f21779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f21780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f21781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f21782f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f21783g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<oy> f21784h;

        public b(String str, eg.a aVar) {
            this(str, aVar.f20240b, aVar.f20241c, aVar.f20242d, aVar.f20243e, aVar.f20244f, a(aVar));
        }

        private b(String str, String str2, long j10, long j11, long j12, long j13, List<oy> list) {
            this.f21778b = str;
            this.f21779c = "".equals(str2) ? null : str2;
            this.f21780d = j10;
            this.f21781e = j11;
            this.f21782f = j12;
            this.f21783g = j13;
            this.f21784h = list;
        }

        public static b a(c cVar) throws IOException {
            if (ip.a(cVar) != 538247942) {
                throw new IOException();
            }
            String str = new String(ip.a(cVar, ip.b(cVar)), "UTF-8");
            String str2 = new String(ip.a(cVar, ip.b(cVar)), "UTF-8");
            long jB = ip.b(cVar);
            long jB2 = ip.b(cVar);
            long jB3 = ip.b(cVar);
            long jB4 = ip.b(cVar);
            int iA = ip.a(cVar);
            if (iA < 0) {
                throw new IOException(u60.a("readHeaderList size=", iA));
            }
            List listEmptyList = iA == 0 ? Collections.emptyList() : new ArrayList();
            int i10 = 0;
            while (i10 < iA) {
                listEmptyList.add(new oy(new String(ip.a(cVar, ip.b(cVar)), "UTF-8").intern(), new String(ip.a(cVar, ip.b(cVar)), "UTF-8").intern()));
                i10++;
                jB4 = jB4;
                jB3 = jB3;
            }
            return new b(str, str2, jB, jB2, jB3, jB4, listEmptyList);
        }

        private static List<oy> a(eg.a aVar) {
            List<oy> list = aVar.f20246h;
            if (list != null) {
                return list;
            }
            Map<String, String> map = aVar.f20245g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new oy(entry.getKey(), entry.getValue()));
            }
            return arrayList;
        }

        public final eg.a a(byte[] bArr) {
            eg.a aVar = new eg.a();
            aVar.f20239a = bArr;
            aVar.f20240b = this.f21779c;
            aVar.f20241c = this.f21780d;
            aVar.f20242d = this.f21781e;
            aVar.f20243e = this.f21782f;
            aVar.f20244f = this.f21783g;
            List<oy> list = this.f21784h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (oy oyVar : list) {
                treeMap.put(oyVar.a(), oyVar.b());
            }
            aVar.f20245g = treeMap;
            aVar.f20246h = Collections.unmodifiableList(this.f21784h);
            return aVar;
        }

        public final boolean a(BufferedOutputStream bufferedOutputStream) {
            try {
                ip.a(bufferedOutputStream, 538247942);
                byte[] bytes = this.f21778b.getBytes("UTF-8");
                ip.a(bufferedOutputStream, bytes.length);
                bufferedOutputStream.write(bytes, 0, bytes.length);
                String str = this.f21779c;
                if (str == null) {
                    str = "";
                }
                byte[] bytes2 = str.getBytes("UTF-8");
                ip.a(bufferedOutputStream, bytes2.length);
                bufferedOutputStream.write(bytes2, 0, bytes2.length);
                ip.a(bufferedOutputStream, this.f21780d);
                ip.a(bufferedOutputStream, this.f21781e);
                ip.a(bufferedOutputStream, this.f21782f);
                ip.a(bufferedOutputStream, this.f21783g);
                List<oy> list = this.f21784h;
                if (list != null) {
                    ip.a(bufferedOutputStream, list.size());
                    for (oy oyVar : list) {
                        byte[] bytes3 = oyVar.a().getBytes("UTF-8");
                        ip.a(bufferedOutputStream, bytes3.length);
                        bufferedOutputStream.write(bytes3, 0, bytes3.length);
                        byte[] bytes4 = oyVar.b().getBytes("UTF-8");
                        ip.a(bufferedOutputStream, bytes4.length);
                        bufferedOutputStream.write(bytes4, 0, bytes4.length);
                    }
                } else {
                    ip.a(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e10) {
                Object[] objArr = {e10.toString()};
                boolean z10 = ci1.f19511a;
                x60.b("%s", objArr);
                return false;
            }
        }
    }

    public static class c extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f21785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f21786b;

        public c(BufferedInputStream bufferedInputStream, long j10) {
            super(bufferedInputStream);
            this.f21785a = j10;
        }

        public final long a() {
            return this.f21785a - this.f21786b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int i10 = super.read();
            if (i10 != -1) {
                this.f21786b++;
            }
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = super.read(bArr, i10, i11);
            if (i12 != -1) {
                this.f21786b += (long) i12;
            }
            return i12;
        }
    }

    public interface d {
    }

    public ip(File file, int i10) {
        this.f21774c = new a(file);
        this.f21775d = i10;
    }

    public static int a(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 == -1) {
            throw new EOFException();
        }
        int i11 = (i10 << 0) | 0;
        int i12 = inputStream.read();
        if (i12 == -1) {
            throw new EOFException();
        }
        int i13 = i11 | (i12 << 8);
        int i14 = inputStream.read();
        if (i14 == -1) {
            throw new EOFException();
        }
        int i15 = i13 | (i14 << 16);
        int i16 = inputStream.read();
        if (i16 != -1) {
            return (i16 << 24) | i15;
        }
        throw new EOFException();
    }

    public static void a(BufferedOutputStream bufferedOutputStream, int i10) throws IOException {
        bufferedOutputStream.write((i10 >> 0) & 255);
        bufferedOutputStream.write((i10 >> 8) & 255);
        bufferedOutputStream.write((i10 >> 16) & 255);
        bufferedOutputStream.write((i10 >> 24) & 255);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, long j10) throws IOException {
        bufferedOutputStream.write((byte) (j10 >>> 0));
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }

    public static byte[] a(c cVar, long j10) throws IOException {
        long jA = cVar.a();
        if (j10 >= 0 && j10 <= jA) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbA = i2.a.a("streamToBytes length=", j10, ", maxLength=");
        sbA.append(jA);
        throw new IOException(sbA.toString());
    }

    public static long b(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 == -1) {
            throw new EOFException();
        }
        long j10 = ((((long) i10) & 255) << 0) | 0;
        int i11 = inputStream.read();
        if (i11 == -1) {
            throw new EOFException();
        }
        long j11 = j10 | ((((long) i11) & 255) << 8);
        int i12 = inputStream.read();
        if (i12 == -1) {
            throw new EOFException();
        }
        long j12 = j11 | ((((long) i12) & 255) << 16);
        int i13 = inputStream.read();
        if (i13 == -1) {
            throw new EOFException();
        }
        long j13 = j12 | ((((long) i13) & 255) << 24);
        int i14 = inputStream.read();
        if (i14 == -1) {
            throw new EOFException();
        }
        long j14 = j13 | ((((long) i14) & 255) << 32);
        int i15 = inputStream.read();
        if (i15 == -1) {
            throw new EOFException();
        }
        long j15 = j14 | ((((long) i15) & 255) << 40);
        int i16 = inputStream.read();
        if (i16 == -1) {
            throw new EOFException();
        }
        long j16 = j15 | ((((long) i16) & 255) << 48);
        int i17 = inputStream.read();
        if (i17 != -1) {
            return ((((long) i17) & 255) << 56) | j16;
        }
        throw new EOFException();
    }

    private void b() {
        if (this.f21773b < this.f21775d) {
            return;
        }
        if (ci1.f19511a) {
            x60.e("Pruning old cache entries.", new Object[0]);
        }
        long j10 = this.f21773b;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f21772a.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            String str = bVar.f21778b;
            File file = ((a) this.f21774c).f21776a;
            int length = str.length() / 2;
            StringBuilder sbA = v60.a(String.valueOf(str.substring(0, length).hashCode()));
            sbA.append(String.valueOf(str.substring(length).hashCode()));
            if (new File(file, sbA.toString()).delete()) {
                this.f21773b -= bVar.f21777a;
            } else {
                String str2 = bVar.f21778b;
                int length2 = str2.length() / 2;
                StringBuilder sbA2 = v60.a(String.valueOf(str2.substring(0, length2).hashCode()));
                sbA2.append(String.valueOf(str2.substring(length2).hashCode()));
                x60.b("Could not delete cache entry for key=%s, filename=%s", str2, sbA2.toString());
            }
            it.remove();
            i10++;
            if (this.f21773b < this.f21775d * 0.9f) {
                break;
            }
        }
        if (ci1.f19511a) {
            x60.e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i10), Long.valueOf(this.f21773b - j10), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg
    public final synchronized void a() {
        File file = ((a) this.f21774c).f21776a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                Object[] objArr = {file.getAbsolutePath()};
                boolean z10 = ci1.f19511a;
                x60.c("Unable to create cache dir %s", objArr);
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                long length = file2.length();
                c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), length);
                try {
                    b bVarA = b.a(cVar);
                    bVarA.f21777a = length;
                    String str = bVarA.f21778b;
                    if (this.f21772a.containsKey(str)) {
                        this.f21773b = (bVarA.f21777a - ((b) this.f21772a.get(str)).f21777a) + this.f21773b;
                    } else {
                        this.f21773b += bVarA.f21777a;
                    }
                    this.f21772a.put(str, bVarA);
                    cVar.close();
                } catch (Throwable th) {
                    cVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file2.delete();
            } catch (Throwable unused2) {
                av.a(file2);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg
    public final synchronized void a(String str) {
        eg.a aVar = get(str);
        if (aVar != null) {
            aVar.f20244f = 0L;
            aVar.f20243e = 0L;
            a(str, aVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg
    public final synchronized void a(String str, eg.a aVar) {
        long j10 = this.f21773b;
        byte[] bArr = aVar.f20239a;
        long length = j10 + ((long) bArr.length);
        int i10 = this.f21775d;
        if (length > i10 && bArr.length > i10 * 0.9f) {
            return;
        }
        File file = ((a) this.f21774c).f21776a;
        int length2 = str.length() / 2;
        StringBuilder sbA = v60.a(String.valueOf(str.substring(0, length2).hashCode()));
        sbA.append(String.valueOf(str.substring(length2).hashCode()));
        File file2 = new File(file, sbA.toString());
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
            b bVar = new b(str, aVar);
            if (!bVar.a(bufferedOutputStream)) {
                bufferedOutputStream.close();
                Object[] objArr = {file2.getAbsolutePath()};
                boolean z10 = ci1.f19511a;
                x60.b("Failed to write header for %s", objArr);
                throw new IOException();
            }
            bufferedOutputStream.write(aVar.f20239a);
            bufferedOutputStream.close();
            bVar.f21777a = file2.length();
            if (this.f21772a.containsKey(str)) {
                this.f21773b = (bVar.f21777a - ((b) this.f21772a.get(str)).f21777a) + this.f21773b;
            } else {
                this.f21773b += bVar.f21777a;
            }
            this.f21772a.put(str, bVar);
            b();
        } catch (IOException unused) {
            if (!file2.delete()) {
                Object[] objArr2 = {file2.getAbsolutePath()};
                boolean z11 = ci1.f19511a;
                x60.b("Could not clean up file %s", objArr2);
            }
            if (!((a) this.f21774c).f21776a.exists()) {
                boolean z12 = ci1.f19511a;
                x60.b("Re-initializing cache after external clearing.", new Object[0]);
                this.f21772a.clear();
                this.f21773b = 0L;
                a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.eg
    public final synchronized eg.a get(String str) {
        b bVar = (b) this.f21772a.get(str);
        if (bVar == null) {
            return null;
        }
        File file = ((a) this.f21774c).f21776a;
        int length = str.length() / 2;
        StringBuilder sbA = v60.a(String.valueOf(str.substring(0, length).hashCode()));
        sbA.append(String.valueOf(str.substring(length).hashCode()));
        File file2 = new File(file, sbA.toString());
        try {
            c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                b bVarA = b.a(cVar);
                if (TextUtils.equals(str, bVarA.f21778b)) {
                    eg.a aVarA = bVar.a(a(cVar, cVar.a()));
                    cVar.close();
                    return aVarA;
                }
                Object[] objArr = {file2.getAbsolutePath(), str, bVarA.f21778b};
                boolean z10 = ci1.f19511a;
                x60.b("%s: key=%s, found=%s", objArr);
                b bVar2 = (b) this.f21772a.remove(str);
                if (bVar2 != null) {
                    this.f21773b -= bVar2.f21777a;
                }
                cVar.close();
                return null;
            } catch (Throwable th) {
                cVar.close();
                throw th;
            }
        } catch (IOException e10) {
            Object[] objArr2 = {file2.getAbsolutePath(), e10.toString()};
            boolean z11 = ci1.f19511a;
            x60.b("%s: %s", objArr2);
            synchronized (this) {
                File file3 = ((a) this.f21774c).f21776a;
                int length2 = str.length() / 2;
                boolean zDelete = new File(file3, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode())).delete();
                b bVar3 = (b) this.f21772a.remove(str);
                if (bVar3 != null) {
                    this.f21773b -= bVar3.f21777a;
                }
                if (!zDelete) {
                    int length3 = str.length() / 2;
                    x60.b("Could not delete cache entry for key=%s, filename=%s", str, String.valueOf(str.substring(0, length3).hashCode()) + String.valueOf(str.substring(length3).hashCode()));
                }
                return null;
            }
        }
    }
}
