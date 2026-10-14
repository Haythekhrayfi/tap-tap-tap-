package se;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.net.URL;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f35515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentNavigableMap<String, a> f35516d = new ConcurrentSkipListMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set<String> f35517e = new CopyOnWriteArraySet();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f35518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f35519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final short[] f35520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceArray<Object> f35521d;

        public a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f35521d = atomicReferenceArray;
            this.f35518a = str;
            this.f35519b = strArr;
            this.f35520c = sArr;
        }

        public String toString() {
            return this.f35518a;
        }
    }

    public c() {
        URL urlNextElement;
        URL url = null;
        try {
            Enumeration<URL> resources = i.class.getClassLoader().getResources("org/threeten/bp/TZDB.dat");
            boolean zF = false;
            while (resources.hasMoreElements()) {
                urlNextElement = resources.nextElement();
                try {
                    zF |= f(urlNextElement);
                    url = urlNextElement;
                } catch (Exception e10) {
                    e = e10;
                    throw new g("Unable to load TZDB time-zone rules: " + urlNextElement, e);
                }
            }
            if (!zF) {
                throw new g("No time-zone rules found for 'TZDB'");
            }
        } catch (Exception e11) {
            e = e11;
            urlNextElement = url;
        }
    }

    public c(InputStream inputStream) {
        try {
            e(inputStream);
        } catch (Exception e10) {
            throw new g("Unable to load TZDB time-zone rules", e10);
        }
    }

    public c(URL url) {
        try {
            if (f(url)) {
                return;
            }
            throw new g("No time-zone rules found: " + url);
        } catch (Exception e10) {
            throw new g("Unable to load TZDB time-zone rules: " + url, e10);
        }
    }

    @Override // se.i
    public f b(String str, boolean z10) {
        f fVar;
        a value = this.f35516d.lastEntry().getValue();
        int iBinarySearch = Arrays.binarySearch(value.f35519b, str);
        if (iBinarySearch < 0) {
            fVar = null;
        } else {
            try {
                short s10 = value.f35520c[iBinarySearch];
                Object objB = value.f35521d.get(s10);
                if (objB instanceof byte[]) {
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) objB));
                    objB = se.a.b(dataInputStream.readByte(), dataInputStream);
                    value.f35521d.set(s10, objB);
                }
                fVar = (f) objB;
            } catch (Exception e10) {
                StringBuilder sbA = androidx.activity.result.c.a("Invalid binary time-zone data: TZDB:", str, ", version: ");
                sbA.append(value.f35518a);
                throw new g(sbA.toString(), e10);
            }
        }
        if (fVar != null) {
            return fVar;
        }
        throw new g(i.f.a("Unknown time-zone ID: ", str));
    }

    @Override // se.i
    public Set<String> c() {
        return new HashSet(this.f35515c);
    }

    public final boolean e(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int i10 = dataInputStream.readShort();
        String[] strArr = new String[i10];
        boolean z10 = false;
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = dataInputStream.readUTF();
        }
        int i12 = dataInputStream.readShort();
        String[] strArr2 = new String[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            strArr2[i13] = dataInputStream.readUTF();
        }
        this.f35515c = Arrays.asList(strArr2);
        int i14 = dataInputStream.readShort();
        Object[] objArr = new Object[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i15] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet<a> hashSet = new HashSet(i10);
        for (int i16 = 0; i16 < i10; i16++) {
            int i17 = dataInputStream.readShort();
            String[] strArr3 = new String[i17];
            short[] sArr = new short[i17];
            for (int i18 = 0; i18 < i17; i18++) {
                strArr3[i18] = strArr2[dataInputStream.readShort()];
                sArr[i18] = dataInputStream.readShort();
            }
            hashSet.add(new a(strArr[i16], strArr3, sArr, atomicReferenceArray));
        }
        for (a aVar : hashSet) {
            a aVarPutIfAbsent = this.f35516d.putIfAbsent(aVar.f35518a, aVar);
            if (aVarPutIfAbsent != null && !aVarPutIfAbsent.f35518a.equals(aVar.f35518a)) {
                StringBuilder sbA = defpackage.a.a("Data already loaded for TZDB time-zone rules version: ");
                sbA.append(aVar.f35518a);
                throw new g(sbA.toString());
            }
            z10 = true;
        }
        return z10;
    }

    public final boolean f(URL url) throws IOException, ClassNotFoundException, g {
        boolean zE = false;
        if (this.f35517e.add(url.toExternalForm())) {
            InputStream inputStreamOpenStream = null;
            try {
                inputStreamOpenStream = url.openStream();
                zE = false | e(inputStreamOpenStream);
            } finally {
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            }
        }
        return zE;
    }

    public String toString() {
        return "TZDB";
    }
}
