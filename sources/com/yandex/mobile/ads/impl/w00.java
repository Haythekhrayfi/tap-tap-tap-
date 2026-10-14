package com.yandex.mobile.ads.impl;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final qd.g f26122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final qd.g f26123b;

    static {
        qd.g.a aVar = qd.g.f34892f;
        f26122a = aVar.d("\"\\");
        f26123b = aVar.d("\t ,=");
    }

    private static final String a(qd.c cVar) {
        long jI = cVar.i(f26123b);
        if (jI == -1) {
            jI = cVar.f34879d;
        }
        if (jI != 0) {
            return cVar.p(jI);
        }
        return null;
    }

    public static final ArrayList a(ry ryVar, String str) {
        fd.j0.i(ryVar, "<this>");
        fd.j0.i(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = ryVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ed.q.i(str, ryVar.a(i10), true)) {
                qd.c cVar = new qd.c();
                cVar.e0(ryVar.b(i10));
                try {
                    a(cVar, arrayList);
                } catch (EOFException e10) {
                    int i11 = qq0.f24561c;
                    Objects.requireNonNull(qq0.a.b());
                    qq0.a(5, "Unable to parse challenge", e10);
                }
            }
        }
        return arrayList;
    }

    public static final void a(jl jlVar, d10 d10Var, ry ryVar) {
        fd.j0.i(jlVar, "<this>");
        fd.j0.i(d10Var, ImagesContract.URL);
        fd.j0.i(ryVar, "headers");
        if (jlVar == jl.f22077a) {
            return;
        }
        int i10 = hl.f21456n;
        List<hl> listA = hl.a.a(d10Var, ryVar);
        if (listA.isEmpty()) {
            return;
        }
        jlVar.a(d10Var, listA);
    }

    public static final boolean a(ex0 ex0Var) {
        fd.j0.i(ex0Var, "<this>");
        if (fd.j0.d(ex0Var.p().f(), "HEAD")) {
            return false;
        }
        int iE = ex0Var.e();
        return (((iE >= 100 && iE < 200) || iE == 204 || iE == 304) && ea1.a(ex0Var) == -1 && !ed.q.i("chunked", ex0.a(ex0Var, "Transfer-Encoding"), true)) ? false : true;
    }

    private static final boolean b(qd.c cVar) throws EOFException {
        boolean z10 = false;
        while (!cVar.y()) {
            byte bG = cVar.g(0L);
            if (bG != 44) {
                if (!(bG == 32 || bG == 9)) {
                    break;
                }
                cVar.readByte();
            } else {
                cVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da A[LOOP:3: B:46:0x00b0->B:55:0x00da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0110 A[EDGE_INSN: B:82:0x0110->B:70:0x0110 BREAK  A[LOOP:2: B:22:0x006d->B:69:0x010d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0080, please report this as an issue */
    private static final void a(qd.c cVar, ArrayList arrayList) throws EOFException {
        boolean z10;
        String strA;
        qd.c cVar2;
        long jI;
        while (true) {
            String strA2 = null;
            while (true) {
                if (strA2 == null) {
                    b(cVar);
                    strA2 = a(cVar);
                    if (strA2 == null) {
                        return;
                    }
                }
                boolean zB = b(cVar);
                String strA3 = a(cVar);
                if (strA3 == null) {
                    if (cVar.y()) {
                        arrayList.add(new nh(strA2, kc.x.f32010c));
                        return;
                    }
                    return;
                }
                int iA = ea1.a(cVar);
                boolean zB2 = b(cVar);
                if (zB || !(zB2 || cVar.y())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iA2 = ea1.a(cVar) + iA;
                    while (true) {
                        if (strA3 != null) {
                            if (iA2 != 0) {
                                break;
                                break;
                            }
                            if (iA2 <= 1) {
                                return;
                            }
                            if (cVar.y()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                if (cVar.readByte() == 34) {
                                    throw new IllegalArgumentException("Failed requirement.".toString());
                                }
                                cVar2 = new qd.c();
                                while (true) {
                                    jI = cVar.i(f26122a);
                                    if (jI != -1) {
                                        if (cVar.g(jI) == 34) {
                                            cVar2.write(cVar, jI);
                                            cVar.readByte();
                                            strA = cVar2.n();
                                            break;
                                        } else if (cVar.f34879d == jI + 1) {
                                            cVar2.write(cVar, jI);
                                            cVar.readByte();
                                            cVar2.write(cVar, 1L);
                                        }
                                    }
                                    strA = null;
                                    break;
                                }
                            } else {
                                strA = a(cVar);
                            }
                            if (strA != null) {
                                return;
                            }
                            if (b(cVar)) {
                            }
                            strA3 = null;
                        } else {
                            strA3 = a(cVar);
                            if (!b(cVar)) {
                                iA2 = ea1.a(cVar);
                                if (iA2 != 0) {
                                    break;
                                }
                                if (iA2 <= 1 || b(cVar)) {
                                    return;
                                }
                                if (cVar.y() || cVar.g(0L) != 34) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (z10) {
                                    if (cVar.readByte() == 34) {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                    cVar2 = new qd.c();
                                    while (true) {
                                        jI = cVar.i(f26122a);
                                        if (jI != -1) {
                                            if (cVar.g(jI) == 34) {
                                                cVar2.write(cVar, jI);
                                                cVar.readByte();
                                                strA = cVar2.n();
                                                break;
                                            } else if (cVar.f34879d == jI + 1) {
                                                cVar2.write(cVar, jI);
                                                cVar.readByte();
                                                cVar2.write(cVar, 1L);
                                            }
                                        }
                                        strA = null;
                                        break;
                                    }
                                } else {
                                    strA = a(cVar);
                                }
                                if (strA != null || ((String) linkedHashMap.put(strA3, strA)) != null) {
                                    return;
                                }
                                if (b(cVar) && !cVar.y()) {
                                    return;
                                } else {
                                    strA3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    arrayList.add(new nh(strA2, linkedHashMap));
                    strA2 = strA3;
                } else {
                    StringBuilder sbA = v60.a(strA3);
                    sbA.append(ed.q.n("=", iA));
                    Map mapSingletonMap = Collections.singletonMap(null, sbA.toString());
                    fd.j0.h(mapSingletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
                    arrayList.add(new nh(strA2, mapSingletonMap));
                }
            }
        }
    }
}
