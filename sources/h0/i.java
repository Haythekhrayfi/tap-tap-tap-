package h0;

import android.graphics.Path;
import android.util.Log;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class i {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f30464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f30465b;

        public a(char c10, float[] fArr) {
            this.f30464a = c10;
            this.f30465b = fArr;
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d10;
            double d11;
            double radians = Math.toRadians(f16);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d12 = f10;
            double d13 = f11;
            double d14 = (d13 * dSin) + (d12 * dCos);
            double d15 = d12;
            double d16 = f14;
            double d17 = d14 / d16;
            double d18 = f15;
            double d19 = ((d13 * dCos) + (((double) (-f10)) * dSin)) / d18;
            double d20 = d13;
            double d21 = f13;
            double d22 = ((d21 * dSin) + (((double) f12) * dCos)) / d16;
            double d23 = ((d21 * dCos) + (((double) (-f12)) * dSin)) / d18;
            double d24 = d17 - d22;
            double d25 = d19 - d23;
            double d26 = (d17 + d22) / 2.0d;
            double d27 = (d19 + d23) / 2.0d;
            double d28 = (d25 * d25) + (d24 * d24);
            if (d28 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d29 = (1.0d / d28) - 0.25d;
            if (d29 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d28);
                float fSqrt = (float) (Math.sqrt(d28) / 1.99999d);
                a(path, f10, f11, f12, f13, f14 * fSqrt, f15 * fSqrt, f16, z10, z11);
                return;
            }
            double dSqrt = Math.sqrt(d29);
            double d30 = d24 * dSqrt;
            double d31 = dSqrt * d25;
            if (z10 == z11) {
                d10 = d26 - d31;
                d11 = d27 + d30;
            } else {
                d10 = d26 + d31;
                d11 = d27 - d30;
            }
            double dAtan2 = Math.atan2(d19 - d11, d17 - d10);
            double dAtan3 = Math.atan2(d23 - d11, d22 - d10) - dAtan2;
            if (z11 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d32 = d10 * d16;
            double d33 = d11 * d18;
            double d34 = (d32 * dCos) - (d33 * dSin);
            double d35 = (d33 * dCos) + (d32 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d36 = -d16;
            double d37 = d36 * dCos2;
            double d38 = d18 * dSin2;
            double d39 = (d37 * dSin3) - (d38 * dCos3);
            double d40 = d36 * dSin2;
            double d41 = d18 * dCos2;
            double d42 = (dCos3 * d41) + (dSin3 * d40);
            double d43 = d41;
            double d44 = dAtan3 / ((double) iCeil);
            int i10 = 0;
            while (i10 < iCeil) {
                double d45 = dAtan2 + d44;
                double dSin4 = Math.sin(d45);
                double dCos4 = Math.cos(d45);
                double d46 = d44;
                double d47 = (((d16 * dCos2) * dCos4) + d34) - (d38 * dSin4);
                double d48 = d43;
                double d49 = d34;
                double d50 = (d48 * dSin4) + (d16 * dSin2 * dCos4) + d35;
                double d51 = (d37 * dSin4) - (d38 * dCos4);
                double d52 = (dCos4 * d48) + (dSin4 * d40);
                double d53 = d45 - dAtan2;
                double dTan = Math.tan(d53 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
                path.rLineTo(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                path.cubicTo((float) ((d39 * dSqrt2) + d15), (float) ((d42 * dSqrt2) + d20), (float) (d47 - (dSqrt2 * d51)), (float) (d50 - (dSqrt2 * d52)), (float) d47, (float) d50);
                i10++;
                dAtan2 = d45;
                d40 = d40;
                dCos2 = dCos2;
                iCeil = iCeil;
                d42 = d52;
                d16 = d16;
                d39 = d51;
                d15 = d47;
                d20 = d50;
                d34 = d49;
                d44 = d46;
                d43 = d48;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i10;
            int i11;
            float[] fArr;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            int i12 = 6;
            float[] fArr2 = new float[6];
            char c10 = 'm';
            int i13 = 0;
            char c11 = 'm';
            int i14 = 0;
            while (i14 < aVarArr.length) {
                char c12 = aVarArr[i14].f30464a;
                float[] fArr3 = aVarArr[i14].f30465b;
                float f28 = fArr2[i13];
                float f29 = fArr2[1];
                float f30 = fArr2[2];
                float f31 = fArr2[3];
                float f32 = fArr2[4];
                float f33 = fArr2[5];
                switch (c12) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = i12;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f32, f33);
                        f28 = f32;
                        f30 = f28;
                        f29 = f33;
                        f31 = f29;
                    default:
                        i10 = 2;
                        break;
                }
                float f34 = f32;
                float f35 = f33;
                float f36 = f28;
                float f37 = f29;
                int i15 = i13;
                while (i15 < fArr3.length) {
                    if (c12 != 'A') {
                        if (c12 != 'C') {
                            if (c12 == 'H') {
                                i11 = i15;
                                fArr = fArr3;
                                c12 = c12;
                                i14 = i14;
                                int i16 = i11 + 0;
                                path.lineTo(fArr[i16], f37);
                                f36 = fArr[i16];
                            } else if (c12 == 'Q') {
                                i11 = i15;
                                fArr = fArr3;
                                int i17 = i11 + 0;
                                int i18 = i11 + 1;
                                int i19 = i11 + 2;
                                int i20 = i11 + 3;
                                path.quadTo(fArr[i17], fArr[i18], fArr[i19], fArr[i20]);
                                f10 = fArr[i17];
                                f11 = fArr[i18];
                                f36 = fArr[i19];
                                f37 = fArr[i20];
                            } else if (c12 == 'V') {
                                i11 = i15;
                                fArr = fArr3;
                                c12 = c12;
                                i14 = i14;
                                int i21 = i11 + 0;
                                path.lineTo(f36, fArr[i21]);
                                f37 = fArr[i21];
                            } else if (c12 != 'a') {
                                if (c12 != 'c') {
                                    if (c12 == 'h') {
                                        i11 = i15;
                                        int i22 = i11 + 0;
                                        path.rLineTo(fArr3[i22], StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                        f36 += fArr3[i22];
                                    } else if (c12 != 'q') {
                                        if (c12 == 'v') {
                                            i11 = i15;
                                            int i23 = i11 + 0;
                                            path.rLineTo(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, fArr3[i23]);
                                            f19 = fArr3[i23];
                                        } else if (c12 == 'L') {
                                            i11 = i15;
                                            int i24 = i11 + 0;
                                            int i25 = i11 + 1;
                                            path.lineTo(fArr3[i24], fArr3[i25]);
                                            f36 = fArr3[i24];
                                            f37 = fArr3[i25];
                                        } else if (c12 == 'M') {
                                            i11 = i15;
                                            int i26 = i11 + 0;
                                            float f38 = fArr3[i26];
                                            int i27 = i11 + 1;
                                            float f39 = fArr3[i27];
                                            if (i11 > 0) {
                                                path.lineTo(fArr3[i26], fArr3[i27]);
                                                f36 = f38;
                                                f37 = f39;
                                            } else {
                                                path.moveTo(fArr3[i26], fArr3[i27]);
                                                f34 = f38;
                                                f35 = f39;
                                                f36 = f34;
                                                f37 = f35;
                                            }
                                        } else if (c12 == 'S') {
                                            i11 = i15;
                                            float f40 = f37;
                                            float f41 = f36;
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                f20 = (f40 * 2.0f) - f31;
                                                f21 = (f41 * 2.0f) - f30;
                                            } else {
                                                f21 = f41;
                                                f20 = f40;
                                            }
                                            int i28 = i11 + 0;
                                            int i29 = i11 + 1;
                                            int i30 = i11 + 2;
                                            int i31 = i11 + 3;
                                            path.cubicTo(f21, f20, fArr3[i28], fArr3[i29], fArr3[i30], fArr3[i31]);
                                            float f42 = fArr3[i28];
                                            float f43 = fArr3[i29];
                                            f18 = fArr3[i30];
                                            f17 = fArr3[i31];
                                            f30 = f42;
                                            f31 = f43;
                                            f36 = f18;
                                            f37 = f17;
                                        } else if (c12 == 'T') {
                                            i11 = i15;
                                            float f44 = f37;
                                            float f45 = f36;
                                            if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                f22 = (f45 * 2.0f) - f30;
                                                f23 = (f44 * 2.0f) - f31;
                                            } else {
                                                f22 = f45;
                                                f23 = f44;
                                            }
                                            int i32 = i11 + 0;
                                            int i33 = i11 + 1;
                                            path.quadTo(f22, f23, fArr3[i32], fArr3[i33]);
                                            f31 = f23;
                                            f30 = f22;
                                            fArr = fArr3;
                                            c12 = c12;
                                            i14 = i14;
                                            f36 = fArr3[i32];
                                            f37 = fArr3[i33];
                                        } else if (c12 == 'l') {
                                            i11 = i15;
                                            int i34 = i11 + 0;
                                            int i35 = i11 + 1;
                                            path.rLineTo(fArr3[i34], fArr3[i35]);
                                            f36 += fArr3[i34];
                                            f19 = fArr3[i35];
                                        } else if (c12 == c10) {
                                            i11 = i15;
                                            int i36 = i11 + 0;
                                            f36 += fArr3[i36];
                                            int i37 = i11 + 1;
                                            f37 += fArr3[i37];
                                            if (i11 > 0) {
                                                path.rLineTo(fArr3[i36], fArr3[i37]);
                                            } else {
                                                path.rMoveTo(fArr3[i36], fArr3[i37]);
                                                f35 = f37;
                                                f34 = f36;
                                                f36 = f34;
                                                f37 = f35;
                                            }
                                        } else if (c12 != 's') {
                                            if (c12 == 't') {
                                                if (c11 == 'q' || c11 == 't' || c11 == 'Q' || c11 == 'T') {
                                                    f26 = f36 - f30;
                                                    f27 = f37 - f31;
                                                } else {
                                                    f27 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                                    f26 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                                }
                                                int i38 = i15 + 0;
                                                int i39 = i15 + 1;
                                                path.rQuadTo(f26, f27, fArr3[i38], fArr3[i39]);
                                                float f46 = f26 + f36;
                                                float f47 = f27 + f37;
                                                f36 += fArr3[i38];
                                                f37 += fArr3[i39];
                                                f31 = f47;
                                                f30 = f46;
                                            }
                                            i11 = i15;
                                        } else {
                                            if (c11 == 'c' || c11 == 's' || c11 == 'C' || c11 == 'S') {
                                                f24 = f37 - f31;
                                                f25 = f36 - f30;
                                            } else {
                                                f25 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                                f24 = StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
                                            }
                                            int i40 = i15 + 0;
                                            int i41 = i15 + 1;
                                            int i42 = i15 + 2;
                                            int i43 = i15 + 3;
                                            i11 = i15;
                                            f12 = f37;
                                            float f48 = f36;
                                            path.rCubicTo(f25, f24, fArr3[i40], fArr3[i41], fArr3[i42], fArr3[i43]);
                                            f13 = fArr3[i40] + f48;
                                            f14 = fArr3[i41] + f12;
                                            f15 = f48 + fArr3[i42];
                                            f16 = fArr3[i43];
                                        }
                                        f37 += f19;
                                    } else {
                                        i11 = i15;
                                        f12 = f37;
                                        float f49 = f36;
                                        int i44 = i11 + 0;
                                        int i45 = i11 + 1;
                                        int i46 = i11 + 2;
                                        int i47 = i11 + 3;
                                        path.rQuadTo(fArr3[i44], fArr3[i45], fArr3[i46], fArr3[i47]);
                                        f13 = fArr3[i44] + f49;
                                        f14 = fArr3[i45] + f12;
                                        float f50 = f49 + fArr3[i46];
                                        float f51 = fArr3[i47];
                                        f15 = f50;
                                        f16 = f51;
                                    }
                                    fArr = fArr3;
                                    c12 = c12;
                                    i14 = i14;
                                } else {
                                    i11 = i15;
                                    f12 = f37;
                                    float f52 = f36;
                                    int i48 = i11 + 2;
                                    int i49 = i11 + 3;
                                    int i50 = i11 + 4;
                                    int i51 = i11 + 5;
                                    path.rCubicTo(fArr3[i11 + 0], fArr3[i11 + 1], fArr3[i48], fArr3[i49], fArr3[i50], fArr3[i51]);
                                    f13 = fArr3[i48] + f52;
                                    f14 = fArr3[i49] + f12;
                                    f15 = f52 + fArr3[i50];
                                    f16 = fArr3[i51];
                                }
                                f17 = f12 + f16;
                                f30 = f13;
                                f31 = f14;
                                f18 = f15;
                                f36 = f18;
                                f37 = f17;
                                fArr = fArr3;
                                c12 = c12;
                                i14 = i14;
                            } else {
                                i11 = i15;
                                float f53 = f37;
                                float f54 = f36;
                                int i52 = i11 + 5;
                                int i53 = i11 + 6;
                                fArr = fArr3;
                                a(path, f54, f53, fArr3[i52] + f54, fArr3[i53] + f53, fArr3[i11 + 0], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3] != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, fArr3[i11 + 4] != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                                f36 = f54 + fArr[i52];
                                f37 = f53 + fArr[i53];
                            }
                            i15 = i11 + i10;
                            c11 = c12;
                            c12 = c11;
                            fArr3 = fArr;
                            i14 = i14;
                            c10 = 'm';
                            i13 = 0;
                        } else {
                            i11 = i15;
                            fArr = fArr3;
                            int i54 = i11 + 2;
                            int i55 = i11 + 3;
                            int i56 = i11 + 4;
                            int i57 = i11 + 5;
                            path.cubicTo(fArr[i11 + 0], fArr[i11 + 1], fArr[i54], fArr[i55], fArr[i56], fArr[i57]);
                            float f55 = fArr[i56];
                            float f56 = fArr[i57];
                            f10 = fArr[i54];
                            f36 = f55;
                            f37 = f56;
                            f11 = fArr[i55];
                        }
                        f30 = f10;
                        f31 = f11;
                        i15 = i11 + i10;
                        c11 = c12;
                        c12 = c11;
                        fArr3 = fArr;
                        i14 = i14;
                        c10 = 'm';
                        i13 = 0;
                    } else {
                        i11 = i15;
                        fArr = fArr3;
                        int i58 = i11 + 5;
                        int i59 = i11 + 6;
                        a(path, f36, f37, fArr[i58], fArr[i59], fArr[i11 + 0], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, fArr[i11 + 4] != StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
                        f36 = fArr[i58];
                        f37 = fArr[i59];
                    }
                    f31 = f37;
                    f30 = f36;
                    i15 = i11 + i10;
                    c11 = c12;
                    c12 = c11;
                    fArr3 = fArr;
                    i14 = i14;
                    c10 = 'm';
                    i13 = 0;
                }
                int i60 = i14;
                fArr2[i13] = f36;
                fArr2[1] = f37;
                fArr2[2] = f30;
                fArr2[3] = f31;
                fArr2[4] = f34;
                fArr2[5] = f35;
                i14 = i60 + 1;
                i12 = 6;
                c10 = 'm';
                c11 = aVarArr[i60].f30464a;
            }
        }
    }

    public static float[] a(float[] fArr, int i10, int i11) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i10 < 0 || i10 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = i11 - i10;
        int iMin = Math.min(i12, length - i10);
        float[] fArr2 = new float[i12];
        System.arraycopy(fArr, i10, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:29:0x006c->B:49:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        if (r13 == 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h0.i.a[] b(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.b(java.lang.String):h0.i$a[]");
    }

    public static Path c(String str) {
        Path path = new Path();
        a[] aVarArrB = b(str);
        if (aVarArrB == null) {
            return null;
        }
        try {
            a.b(aVarArrB, path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException(i.f.a("Error in parsing ", str), e10);
        }
    }
}
