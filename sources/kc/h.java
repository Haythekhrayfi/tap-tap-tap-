package kc;

import fd.j0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h extends g {
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void a(T[] tArr, StringBuilder sb2, List<Object[]> list) throws IOException {
        String string;
        if (list.contains(tArr)) {
            sb2.append("[...]");
            return;
        }
        list.add(tArr);
        sb2.append('[');
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            Object[] objArr = tArr[i10];
            if (objArr == 0) {
                string = "null";
                sb2.append(string);
            } else if (objArr instanceof Object[]) {
                a(objArr, sb2, list);
            } else {
                if (objArr instanceof byte[]) {
                    string = Arrays.toString((byte[]) objArr);
                } else if (objArr instanceof short[]) {
                    string = Arrays.toString((short[]) objArr);
                } else if (objArr instanceof int[]) {
                    string = Arrays.toString((int[]) objArr);
                } else if (objArr instanceof long[]) {
                    string = Arrays.toString((long[]) objArr);
                } else if (objArr instanceof float[]) {
                    string = Arrays.toString((float[]) objArr);
                } else if (objArr instanceof double[]) {
                    string = Arrays.toString((double[]) objArr);
                } else if (objArr instanceof char[]) {
                    string = Arrays.toString((char[]) objArr);
                } else {
                    if (objArr instanceof boolean[]) {
                        string = Arrays.toString((boolean[]) objArr);
                    } else if (objArr instanceof jc.n) {
                        byte[] bArr = ((jc.n) objArr).f31823c;
                        if (bArr != null) {
                            string = t.w(new jc.n(bArr), ", ", "[", "]", 0, null, null, 56);
                        } else {
                            string = "null";
                        }
                    } else if (objArr instanceof jc.u) {
                        short[] sArr = ((jc.u) objArr).f31839c;
                        if (sArr != null) {
                            string = t.w(new jc.u(sArr), ", ", "[", "]", 0, null, null, 56);
                        } else {
                            string = "null";
                        }
                    } else if (objArr instanceof jc.p) {
                        int[] iArr = ((jc.p) objArr).f31828c;
                        if (iArr != null) {
                            string = t.w(new jc.p(iArr), ", ", "[", "]", 0, null, null, 56);
                        } else {
                            string = "null";
                        }
                    } else if (objArr instanceof jc.r) {
                        long[] jArr = ((jc.r) objArr).f31833c;
                        if (jArr != null) {
                            string = t.w(new jc.r(jArr), ", ", "[", "]", 0, null, null, 56);
                        } else {
                            string = "null";
                        }
                    } else {
                        string = objArr.toString();
                    }
                    sb2.append(string);
                }
                j0.h(string, "toString(this)");
                sb2.append(string);
            }
        }
        sb2.append(']');
        list.remove(l.b(list));
    }
}
