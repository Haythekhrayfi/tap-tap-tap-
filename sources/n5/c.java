package n5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33620a;

    public c() {
        this(1);
    }

    public c(int i10) {
        this.f33620a = i10;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    @Override // n5.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i10;
        boolean z10;
        int i11 = this.f33620a;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i13];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num != null) {
                int iIntValue = num.intValue();
                int i15 = i13 - iIntValue;
                if (i13 + i15 <= stackTraceElementArr.length) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            z10 = true;
                            break;
                        }
                        if (!stackTraceElementArr[iIntValue + i16].equals(stackTraceElementArr[i13 + i16])) {
                            z10 = false;
                            break;
                        }
                        i16++;
                    }
                } else {
                    z10 = false;
                    break;
                }
                if (z10) {
                    int iIntValue2 = i13 - num.intValue();
                    if (i12 < i11) {
                        System.arraycopy(stackTraceElementArr, i13, stackTraceElementArr2, i14, iIntValue2);
                        i14 += iIntValue2;
                        i12++;
                    }
                    i10 = (iIntValue2 - 1) + i13;
                } else {
                    stackTraceElementArr2[i14] = stackTraceElementArr[i13];
                    i14++;
                    i12 = 1;
                    i10 = i13;
                }
            } else {
                stackTraceElementArr2[i14] = stackTraceElementArr[i13];
                i14++;
                i12 = 1;
                i10 = i13;
            }
            map.put(stackTraceElement, Integer.valueOf(i13));
            i13 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i14];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i14);
        return i14 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }
}
