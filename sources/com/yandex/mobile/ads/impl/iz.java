package com.yandex.mobile.ads.impl;

import com.developer.filepicker.model.DialogConfigs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public final class iz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final py[] f21863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<qd.g, Integer> f21864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f21865c = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f21866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f21868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final qd.f f21869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public py[] f21870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f21871f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f21872g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f21873h;

        public /* synthetic */ a(l00.b bVar) {
            this(bVar, 4096);
        }

        public a(l00.b bVar, int i10) {
            fd.j0.i(bVar, "source");
            this.f21866a = 4096;
            this.f21867b = i10;
            this.f21868c = new ArrayList();
            this.f21869d = qd.o.c(bVar);
            this.f21870e = new py[8];
            this.f21871f = 7;
        }

        private final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f21870e.length;
                while (true) {
                    length--;
                    i11 = this.f21871f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    py pyVar = this.f21870e[length];
                    fd.j0.f(pyVar);
                    int i13 = pyVar.f24279c;
                    i10 -= i13;
                    this.f21873h -= i13;
                    this.f21872g--;
                    i12++;
                }
                py[] pyVarArr = this.f21870e;
                int i14 = i11 + 1;
                System.arraycopy(pyVarArr, i14, pyVarArr, i14 + i12, this.f21872g);
                this.f21871f += i12;
            }
            return i12;
        }

        private final void a(py pyVar) {
            this.f21868c.add(pyVar);
            int i10 = pyVar.f24279c;
            int i11 = this.f21867b;
            if (i10 > i11) {
                kc.i.i(this.f21870e, null, 0, 0, 6);
                this.f21871f = this.f21870e.length - 1;
                this.f21872g = 0;
                this.f21873h = 0;
                return;
            }
            a((this.f21873h + i10) - i11);
            int i12 = this.f21872g + 1;
            py[] pyVarArr = this.f21870e;
            if (i12 > pyVarArr.length) {
                py[] pyVarArr2 = new py[pyVarArr.length * 2];
                System.arraycopy(pyVarArr, 0, pyVarArr2, pyVarArr.length, pyVarArr.length);
                this.f21871f = this.f21870e.length - 1;
                this.f21870e = pyVarArr2;
            }
            int i13 = this.f21871f;
            this.f21871f = i13 - 1;
            this.f21870e[i13] = pyVar;
            this.f21872g++;
            this.f21873h += i10;
        }

        private final qd.g b(int i10) throws IOException {
            py pyVar;
            if (!(i10 >= 0 && i10 <= iz.b().length - 1)) {
                int length = this.f21871f + 1 + (i10 - iz.b().length);
                if (length >= 0) {
                    py[] pyVarArr = this.f21870e;
                    if (length < pyVarArr.length) {
                        pyVar = pyVarArr[length];
                        fd.j0.f(pyVar);
                    }
                }
                StringBuilder sbA = v60.a("Header index too large ");
                sbA.append(i10 + 1);
                throw new IOException(sbA.toString());
            }
            pyVar = iz.b()[i10];
            return pyVar.f24277a;
        }

        public final int a(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iA = ea1.a(this.f21869d.readByte());
                if ((iA & 128) == 0) {
                    return i11 + (iA << i13);
                }
                i11 += (iA & 127) << i13;
                i13 += 7;
            }
        }

        public final List<py> a() {
            List<py> listH = kc.t.H(this.f21868c);
            this.f21868c.clear();
            return listH;
        }

        public final qd.g b() throws IOException {
            int iA = ea1.a(this.f21869d.readByte());
            boolean z10 = (iA & 128) == 128;
            long jA = a(iA, 127);
            if (!z10) {
                return this.f21869d.d(jA);
            }
            qd.c cVar = new qd.c();
            int i10 = f10.f20490d;
            f10.a(this.f21869d, jA, cVar);
            return cVar.I();
        }

        public final void c() throws IOException {
            py pyVar;
            ArrayList arrayList;
            py pyVar2;
            while (!this.f21869d.y()) {
                int iA = ea1.a(this.f21869d.readByte());
                if (iA == 128) {
                    throw new IOException("index == 0");
                }
                boolean z10 = false;
                if ((iA & 128) == 128) {
                    int iA2 = a(iA, 127) - 1;
                    if (iA2 >= 0 && iA2 <= iz.b().length - 1) {
                        z10 = true;
                    }
                    py[] pyVarArrB = iz.b();
                    if (!z10) {
                        int length = this.f21871f + 1 + (iA2 - pyVarArrB.length);
                        if (length >= 0) {
                            py[] pyVarArr = this.f21870e;
                            if (length < pyVarArr.length) {
                                ArrayList arrayList2 = this.f21868c;
                                py pyVar3 = pyVarArr[length];
                                fd.j0.f(pyVar3);
                                arrayList2.add(pyVar3);
                            }
                        }
                        StringBuilder sbA = v60.a("Header index too large ");
                        sbA.append(iA2 + 1);
                        throw new IOException(sbA.toString());
                    }
                    this.f21868c.add(pyVarArrB[iA2]);
                } else {
                    if (iA == 64) {
                        int i10 = iz.f21865c;
                        pyVar = new py(iz.a(b()), b());
                    } else if ((iA & 64) == 64) {
                        pyVar = new py(b(a(iA, 63) - 1), b());
                    } else if ((iA & 32) == 32) {
                        int iA3 = a(iA, 31);
                        this.f21867b = iA3;
                        if (iA3 < 0 || iA3 > this.f21866a) {
                            StringBuilder sbA2 = v60.a("Invalid dynamic table size update ");
                            sbA2.append(this.f21867b);
                            throw new IOException(sbA2.toString());
                        }
                        int i11 = this.f21873h;
                        if (iA3 < i11) {
                            if (iA3 == 0) {
                                kc.i.i(this.f21870e, null, 0, 0, 6);
                                this.f21871f = this.f21870e.length - 1;
                                this.f21872g = 0;
                                this.f21873h = 0;
                            } else {
                                a(i11 - iA3);
                            }
                        }
                    } else {
                        if (iA == 16 || iA == 0) {
                            int i12 = iz.f21865c;
                            qd.g gVarA = iz.a(b());
                            qd.g gVarB = b();
                            arrayList = this.f21868c;
                            pyVar2 = new py(gVarA, gVarB);
                        } else {
                            qd.g gVarB2 = b(a(iA, 15) - 1);
                            qd.g gVarB3 = b();
                            arrayList = this.f21868c;
                            pyVar2 = new py(gVarB2, gVarB3);
                        }
                        arrayList.add(pyVar2);
                    }
                    a(pyVar);
                }
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f21874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qd.c f21875b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21876c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f21877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public py[] f21879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f21881h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f21882i;

        public b(int i10, boolean z10, qd.c cVar) {
            fd.j0.i(cVar, "out");
            this.f21874a = z10;
            this.f21875b = cVar;
            this.f21876c = Integer.MAX_VALUE;
            this.f21878e = i10;
            this.f21879f = new py[8];
            this.f21880g = 7;
        }

        public /* synthetic */ b(qd.c cVar) {
            this(4096, true, cVar);
        }

        private final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.f21879f.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f21880g;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    py pyVar = this.f21879f[length];
                    fd.j0.f(pyVar);
                    i10 -= pyVar.f24279c;
                    int i13 = this.f21882i;
                    py pyVar2 = this.f21879f[length];
                    fd.j0.f(pyVar2);
                    this.f21882i = i13 - pyVar2.f24279c;
                    this.f21881h--;
                    i12++;
                    length--;
                }
                py[] pyVarArr = this.f21879f;
                int i14 = i11 + 1;
                System.arraycopy(pyVarArr, i14, pyVarArr, i14 + i12, this.f21881h);
                py[] pyVarArr2 = this.f21879f;
                int i15 = this.f21880g + 1;
                Arrays.fill(pyVarArr2, i15, i15 + i12, (Object) null);
                this.f21880g += i12;
            }
        }

        private final void a(py pyVar) {
            int i10 = pyVar.f24279c;
            int i11 = this.f21878e;
            if (i10 > i11) {
                kc.i.i(this.f21879f, null, 0, 0, 6);
                this.f21880g = this.f21879f.length - 1;
                this.f21881h = 0;
                this.f21882i = 0;
                return;
            }
            a((this.f21882i + i10) - i11);
            int i12 = this.f21881h + 1;
            py[] pyVarArr = this.f21879f;
            if (i12 > pyVarArr.length) {
                py[] pyVarArr2 = new py[pyVarArr.length * 2];
                System.arraycopy(pyVarArr, 0, pyVarArr2, pyVarArr.length, pyVarArr.length);
                this.f21880g = this.f21879f.length - 1;
                this.f21879f = pyVarArr2;
            }
            int i13 = this.f21880g;
            this.f21880g = i13 - 1;
            this.f21879f[i13] = pyVar;
            this.f21881h++;
            this.f21882i += i10;
        }

        public final void a(int i10, int i11, int i12) {
            int i13;
            qd.c cVar;
            if (i10 < i11) {
                cVar = this.f21875b;
                i13 = i10 | i12;
            } else {
                this.f21875b.R(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f21875b.R(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                cVar = this.f21875b;
            }
            cVar.R(i13);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x007c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0083  */
        /* JADX WARN: Code duplicated, block: B:31:0x008b  */
        /* JADX WARN: Code duplicated, block: B:33:0x009a  */
        /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:45:0x00df  */
        /* JADX WARN: Code duplicated, block: B:57:0x00a9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x00bf A[SYNTHETIC] */
        public final void a(ArrayList arrayList) throws IOException {
            int length;
            int length2;
            int i10;
            int length3;
            py pyVar;
            py pyVar2;
            fd.j0.i(arrayList, "headerBlock");
            if (this.f21877d) {
                int i11 = this.f21876c;
                if (i11 < this.f21878e) {
                    a(i11, 31, 32);
                }
                this.f21877d = false;
                this.f21876c = Integer.MAX_VALUE;
                a(this.f21878e, 31, 32);
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                py pyVar3 = (py) arrayList.get(i12);
                qd.g gVarK = pyVar3.f24277a.k();
                qd.g gVar = pyVar3.f24278b;
                Integer num = (Integer) iz.a().get(gVarK);
                if (num != null) {
                    length = num.intValue() + 1;
                    if (!(2 <= length && length < 8)) {
                        length2 = length;
                        length = -1;
                    } else if (!fd.j0.d(iz.b()[length - 1].f24278b, gVar)) {
                        if (fd.j0.d(iz.b()[length].f24278b, gVar)) {
                            length2 = length;
                            length++;
                        } else {
                            length2 = length;
                            length = -1;
                        }
                    }
                    if (length == -1) {
                        length3 = this.f21879f.length;
                        for (i10 = this.f21880g + 1; i10 < length3; i10++) {
                            pyVar = this.f21879f[i10];
                            fd.j0.f(pyVar);
                            if (fd.j0.d(pyVar.f24277a, gVarK)) {
                                pyVar2 = this.f21879f[i10];
                                fd.j0.f(pyVar2);
                                if (fd.j0.d(pyVar2.f24278b, gVar)) {
                                    length = iz.b().length + (i10 - this.f21880g);
                                    break;
                                } else if (length2 == -1) {
                                    length2 = (i10 - this.f21880g) + iz.b().length;
                                }
                            }
                        }
                    }
                    if (length != -1) {
                        a(length, 127, 128);
                    } else {
                        if (length2 == -1) {
                            this.f21875b.R(64);
                            a(gVarK);
                        } else if (gVarK.j(py.f24271d) || fd.j0.d(py.f24276i, gVarK)) {
                            a(length2, 63, 64);
                        } else {
                            a(length2, 15, 0);
                            a(gVar);
                        }
                        a(gVar);
                        a(pyVar3);
                    }
                } else {
                    length = -1;
                }
                length2 = length;
                if (length == -1) {
                    length3 = this.f21879f.length;
                    while (i10 < length3) {
                        pyVar = this.f21879f[i10];
                        fd.j0.f(pyVar);
                        if (fd.j0.d(pyVar.f24277a, gVarK)) {
                            pyVar2 = this.f21879f[i10];
                            fd.j0.f(pyVar2);
                            if (fd.j0.d(pyVar2.f24278b, gVar)) {
                                length = iz.b().length + (i10 - this.f21880g);
                                break;
                            } else if (length2 == -1) {
                                length2 = (i10 - this.f21880g) + iz.b().length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    a(length, 127, 128);
                } else {
                    if (length2 == -1) {
                        this.f21875b.R(64);
                        a(gVarK);
                    } else {
                        if (gVarK.j(py.f24271d)) {
                        }
                        a(length2, 63, 64);
                    }
                    a(gVar);
                    a(pyVar3);
                }
            }
        }

        public final void a(qd.g gVar) throws IOException {
            int iC;
            int i10;
            fd.j0.i(gVar, "data");
            if (!this.f21874a || f10.a(gVar) >= gVar.c()) {
                iC = gVar.c();
                i10 = 0;
            } else {
                qd.c cVar = new qd.c();
                f10.a(gVar, cVar);
                gVar = cVar.I();
                iC = gVar.c();
                i10 = 128;
            }
            a(iC, 127, i10);
            this.f21875b.K(gVar);
        }

        public final void b(int i10) {
            int iMin = Math.min(i10, Http2.INITIAL_MAX_FRAME_SIZE);
            int i11 = this.f21878e;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f21876c = Math.min(this.f21876c, iMin);
            }
            this.f21877d = true;
            this.f21878e = iMin;
            int i12 = this.f21882i;
            if (iMin < i12) {
                if (iMin != 0) {
                    a(i12 - iMin);
                    return;
                }
                kc.i.i(this.f21879f, null, 0, 0, 6);
                this.f21880g = this.f21879f.length - 1;
                this.f21881h = 0;
                this.f21882i = 0;
            }
        }
    }

    static {
        py pyVar = new py(py.f24276i, "");
        qd.g gVar = py.f24273f;
        qd.g gVar2 = py.f24274g;
        qd.g gVar3 = py.f24275h;
        qd.g gVar4 = py.f24272e;
        f21863a = new py[]{pyVar, new py(gVar, "GET"), new py(gVar, "POST"), new py(gVar2, DialogConfigs.DIRECTORY_SEPERATOR), new py(gVar2, "/index.html"), new py(gVar3, "http"), new py(gVar3, "https"), new py(gVar4, "200"), new py(gVar4, "204"), new py(gVar4, "206"), new py(gVar4, "304"), new py(gVar4, "400"), new py(gVar4, "404"), new py(gVar4, "500"), new py("accept-charset", ""), new py("accept-encoding", "gzip, deflate"), new py("accept-language", ""), new py("accept-ranges", ""), new py("accept", ""), new py("access-control-allow-origin", ""), new py("age", ""), new py("allow", ""), new py("authorization", ""), new py("cache-control", ""), new py("content-disposition", ""), new py("content-encoding", ""), new py("content-language", ""), new py("content-length", ""), new py("content-location", ""), new py("content-range", ""), new py("content-type", ""), new py("cookie", ""), new py("date", ""), new py("etag", ""), new py("expect", ""), new py("expires", ""), new py("from", ""), new py("host", ""), new py("if-match", ""), new py("if-modified-since", ""), new py("if-none-match", ""), new py("if-range", ""), new py("if-unmodified-since", ""), new py("last-modified", ""), new py("link", ""), new py("location", ""), new py("max-forwards", ""), new py("proxy-authenticate", ""), new py("proxy-authorization", ""), new py("range", ""), new py("referer", ""), new py("refresh", ""), new py("retry-after", ""), new py("server", ""), new py("set-cookie", ""), new py("strict-transport-security", ""), new py("transfer-encoding", ""), new py("user-agent", ""), new py("vary", ""), new py("via", ""), new py("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i10 = 0; i10 < 61; i10++) {
            py[] pyVarArr = f21863a;
            if (!linkedHashMap.containsKey(pyVarArr[i10].f24277a)) {
                linkedHashMap.put(pyVarArr[i10].f24277a, Integer.valueOf(i10));
            }
        }
        Map<qd.g, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        fd.j0.h(mapUnmodifiableMap, "unmodifiableMap(result)");
        f21864b = mapUnmodifiableMap;
    }

    public static Map a() {
        return f21864b;
    }

    public static qd.g a(qd.g gVar) throws IOException {
        fd.j0.i(gVar, "name");
        int iC = gVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            byte bF = gVar.f(i10);
            if (65 <= bF && bF <= 90) {
                StringBuilder sbA = v60.a("PROTOCOL_ERROR response malformed: mixed case name: ");
                sbA.append(gVar.l());
                throw new IOException(sbA.toString());
            }
        }
        return gVar;
    }

    public static py[] b() {
        return f21863a;
    }
}
