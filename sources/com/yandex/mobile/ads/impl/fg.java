package com.yandex.mobile.ads.impl;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class fg {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f20689n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f20695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f20696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f20697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f20698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f20699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f20700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f20701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f20702m;

    public static final class a {
        public final a a() {
            return this;
        }

        public final a a(TimeUnit timeUnit) {
            fd.j0.i(timeUnit, "timeUnit");
            timeUnit.toSeconds(Integer.MAX_VALUE);
            return this;
        }

        public final a b() {
            return this;
        }
    }

    public static final class b {
        /* JADX WARN: Code duplicated, block: B:100:0x0149 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:101:0x0156 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:102:0x0162 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:106:0x006c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:107:0x0072 A[EDGE_INSN: B:107:0x0072->B:23:0x0072 BREAK  A[LOOP:2: B:16:0x004c->B:21:0x0063], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x0047  */
        /* JADX WARN: Code duplicated, block: B:18:0x0051  */
        /* JADX WARN: Code duplicated, block: B:21:0x0063 A[LOOP:2: B:16:0x004c->B:21:0x0063, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:43:0x0105  */
        /* JADX WARN: Code duplicated, block: B:48:0x0124  */
        /* JADX WARN: Code duplicated, block: B:51:0x0130  */
        /* JADX WARN: Code duplicated, block: B:55:0x0140  */
        /* JADX WARN: Code duplicated, block: B:58:0x014e  */
        /* JADX WARN: Code duplicated, block: B:61:0x015a  */
        /* JADX WARN: Code duplicated, block: B:64:0x0166  */
        /* JADX WARN: Code duplicated, block: B:69:0x0181  */
        /* JADX WARN: Code duplicated, block: B:70:0x0189  */
        /* JADX WARN: Code duplicated, block: B:72:0x0191  */
        /* JADX WARN: Code duplicated, block: B:73:0x0197  */
        /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:81:0x01be  */
        /* JADX WARN: Code duplicated, block: B:95:0x016e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:96:0x0179 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:97:0x0117 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:98:0x012c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:99:0x0138 A[SYNTHETIC] */
        public static fg a(ry ryVar) {
            int i10;
            boolean z10;
            int i11;
            int length;
            int length2;
            String string;
            boolean z11;
            String string2;
            int i12;
            ry ryVar2 = ryVar;
            fd.j0.i(ryVar2, "headers");
            int size = ryVar.size();
            boolean z12 = true;
            boolean z13 = true;
            int i13 = 0;
            String str = null;
            boolean z14 = false;
            boolean z15 = false;
            int iB = -1;
            int iB2 = -1;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            int iB3 = -1;
            int iB4 = -1;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            while (i13 < size) {
                String strA = ryVar2.a(i13);
                String strB = ryVar2.b(i13);
                if (ed.q.i(strA, "Cache-Control", z12)) {
                    if (str == null) {
                        str = strB;
                    }
                    i11 = 0;
                    while (i11 < strB.length()) {
                        length = strB.length();
                        length2 = i11;
                        while (true) {
                            size = size;
                            if (length2 < length) {
                                z13 = z13;
                                length2 = strB.length();
                                break;
                            }
                            i12 = length;
                            z13 = z13;
                            if (ed.u.w("=,;", strB.charAt(length2), false, 2)) {
                                break;
                            }
                            length2++;
                            size = size;
                            length = i12;
                            z13 = z13;
                        }
                        String strSubstring = strB.substring(i11, length2);
                        fd.j0.h(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = ed.u.Y(strSubstring).toString();
                        if (length2 != strB.length() || strB.charAt(length2) == ',' || strB.charAt(length2) == ';') {
                            str = str;
                            z11 = z18;
                            i11 = length2 + 1;
                            string2 = null;
                        } else {
                            int iA = ea1.a(length2 + 1, strB);
                            if (iA >= strB.length() || strB.charAt(iA) != '\"') {
                                int length3 = strB.length();
                                int length4 = iA;
                                while (true) {
                                    if (length4 >= length3) {
                                        str = str;
                                        z11 = z18;
                                        length4 = strB.length();
                                        break;
                                    }
                                    int i14 = length3;
                                    str = str;
                                    z11 = z18;
                                    if (ed.u.w(",;", strB.charAt(length4), false, 2)) {
                                        break;
                                    }
                                    length4++;
                                    length3 = i14;
                                    str = str;
                                    z18 = z11;
                                }
                                String strSubstring2 = strB.substring(iA, length4);
                                fd.j0.h(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = ed.u.Y(strSubstring2).toString();
                                i11 = length4;
                            } else {
                                int i15 = iA + 1;
                                int iD = ed.u.D(strB, CoreConstants.DOUBLE_QUOTE_CHAR, i15, false, 4);
                                string2 = strB.substring(i15, iD);
                                fd.j0.h(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                i11 = iD + 1;
                                str = str;
                                z11 = z18;
                            }
                        }
                        z12 = true;
                        if (ed.q.i("no-cache", string, true)) {
                            z14 = true;
                        } else if (ed.q.i("no-store", string, true)) {
                            z15 = true;
                        } else if (ed.q.i("max-age", string, true)) {
                            iB = ea1.b(-1, string2);
                        } else if (ed.q.i("s-maxage", string, true)) {
                            iB2 = ea1.b(-1, string2);
                        } else if (ed.q.i("private", string, true)) {
                            z16 = true;
                        } else if (ed.q.i("public", string, true)) {
                            z17 = true;
                        } else if (ed.q.i("must-revalidate", string, true)) {
                            z18 = true;
                        } else if (ed.q.i("max-stale", string, true)) {
                            iB3 = ea1.b(Integer.MAX_VALUE, string2);
                        } else if (ed.q.i("min-fresh", string, true)) {
                            iB4 = ea1.b(-1, string2);
                        } else if (ed.q.i("only-if-cached", string, true)) {
                            z19 = true;
                        } else if (ed.q.i("no-transform", string, true)) {
                            z20 = true;
                        } else if (ed.q.i("immutable", string, true)) {
                            z21 = true;
                        }
                        z18 = z11;
                    }
                    i10 = size;
                    z10 = z18;
                    i13++;
                    ryVar2 = ryVar;
                    z18 = z10;
                    size = i10;
                } else {
                    if (!ed.q.i(strA, "Pragma", z12)) {
                        i10 = size;
                        z10 = z18;
                    }
                    i13++;
                    ryVar2 = ryVar;
                    z18 = z10;
                    size = i10;
                }
                z13 = false;
                i11 = 0;
                while (i11 < strB.length()) {
                    length = strB.length();
                    length2 = i11;
                    while (true) {
                        size = size;
                        if (length2 < length) {
                            z13 = z13;
                            length2 = strB.length();
                            break;
                        }
                        i12 = length;
                        z13 = z13;
                        if (ed.u.w("=,;", strB.charAt(length2), false, 2)) {
                            break;
                            break;
                        }
                        length2++;
                        size = size;
                        length = i12;
                        z13 = z13;
                    }
                    String strSubstring3 = strB.substring(i11, length2);
                    fd.j0.h(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = ed.u.Y(strSubstring3).toString();
                    if (length2 != strB.length()) {
                        str = str;
                        z11 = z18;
                        i11 = length2 + 1;
                        string2 = null;
                    } else {
                        str = str;
                        z11 = z18;
                        i11 = length2 + 1;
                        string2 = null;
                    }
                    z12 = true;
                    if (ed.q.i("no-cache", string, true)) {
                        z14 = true;
                    } else if (ed.q.i("no-store", string, true)) {
                        z15 = true;
                    } else if (ed.q.i("max-age", string, true)) {
                        iB = ea1.b(-1, string2);
                    } else if (ed.q.i("s-maxage", string, true)) {
                        iB2 = ea1.b(-1, string2);
                    } else if (ed.q.i("private", string, true)) {
                        z16 = true;
                    } else if (ed.q.i("public", string, true)) {
                        z17 = true;
                    } else if (ed.q.i("must-revalidate", string, true)) {
                        z18 = true;
                    } else if (ed.q.i("max-stale", string, true)) {
                        iB3 = ea1.b(Integer.MAX_VALUE, string2);
                    } else if (ed.q.i("min-fresh", string, true)) {
                        iB4 = ea1.b(-1, string2);
                    } else if (ed.q.i("only-if-cached", string, true)) {
                        z19 = true;
                    } else if (ed.q.i("no-transform", string, true)) {
                        z20 = true;
                    } else if (ed.q.i("immutable", string, true)) {
                        z21 = true;
                    }
                    z18 = z11;
                }
                i10 = size;
                z10 = z18;
                i13++;
                ryVar2 = ryVar;
                z18 = z10;
                size = i10;
            }
            return new fg(z14, z15, iB, iB2, z16, z17, z18, iB3, iB4, z19, z20, z21, !z13 ? null : str, 0);
        }
    }

    static {
        new a().a();
        new a().b().a(TimeUnit.SECONDS);
    }

    private fg(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f20690a = z10;
        this.f20691b = z11;
        this.f20692c = i10;
        this.f20693d = i11;
        this.f20694e = z12;
        this.f20695f = z13;
        this.f20696g = z14;
        this.f20697h = i12;
        this.f20698i = i13;
        this.f20699j = z15;
        this.f20700k = z16;
        this.f20701l = z17;
        this.f20702m = str;
    }

    public /* synthetic */ fg(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, int i14) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public final boolean a() {
        return this.f20694e;
    }

    public final boolean b() {
        return this.f20695f;
    }

    public final int c() {
        return this.f20692c;
    }

    public final int d() {
        return this.f20697h;
    }

    public final int e() {
        return this.f20698i;
    }

    public final boolean f() {
        return this.f20696g;
    }

    public final boolean g() {
        return this.f20690a;
    }

    public final boolean h() {
        return this.f20691b;
    }

    public final boolean i() {
        return this.f20699j;
    }

    public final String toString() {
        String str = this.f20702m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f20690a) {
            sb2.append("no-cache, ");
        }
        if (this.f20691b) {
            sb2.append("no-store, ");
        }
        if (this.f20692c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f20692c);
            sb2.append(", ");
        }
        if (this.f20693d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f20693d);
            sb2.append(", ");
        }
        if (this.f20694e) {
            sb2.append("private, ");
        }
        if (this.f20695f) {
            sb2.append("public, ");
        }
        if (this.f20696g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f20697h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f20697h);
            sb2.append(", ");
        }
        if (this.f20698i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f20698i);
            sb2.append(", ");
        }
        if (this.f20699j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f20700k) {
            sb2.append("no-transform, ");
        }
        if (this.f20701l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        fd.j0.h(string, "StringBuilder().apply(builderAction).toString()");
        this.f20702m = string;
        return string;
    }
}
