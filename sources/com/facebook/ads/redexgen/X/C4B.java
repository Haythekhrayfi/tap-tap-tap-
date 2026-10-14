package com.facebook.ads.redexgen.X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4B implements Runnable {
    public static Comparator<C4A> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<C4B> A07;
    public long A00;
    public long A01;
    public ArrayList<EB> A02 = new ArrayList<>();
    public ArrayList<C4A> A03 = new ArrayList<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<C4A>() { // from class: com.facebook.ads.redexgen.X.49
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(C4A c4a, C4A c4a2) {
                if ((c4a.A03 == null) != (c4a2.A03 == null)) {
                    return c4a.A03 == null ? 1 : -1;
                }
                if (c4a.A04 != c4a2.A04) {
                    return c4a.A04 ? -1 : 1;
                }
                int i10 = c4a2.A02 - c4a.A02;
                if (i10 != 0) {
                    return i10;
                }
                int i11 = c4a.A00;
                int deltaViewVelocity = c4a2.A00;
                int i12 = i11 - deltaViewVelocity;
                if (i12 != 0) {
                    return i12;
                }
                return 0;
            }
        };
    }

    private AbstractC06224s A00(EB eb2, int i10, long j10) {
        if (A08(eb2, i10)) {
            return null;
        }
        C06124i c06124i = eb2.A0r;
        try {
            eb2.A1L();
            AbstractC06224s abstractC06224sA0I = c06124i.A0I(i10, false, j10);
            if (abstractC06224sA0I != null) {
                if (abstractC06224sA0I.A0a() && !abstractC06224sA0I.A0b()) {
                    c06124i.A0X(abstractC06224sA0I.A0H);
                } else {
                    c06124i.A0d(abstractC06224sA0I, false);
                }
            }
            return abstractC06224sA0I;
        } finally {
            eb2.A1r(false);
        }
    }

    private void A02() {
        C4A c4a;
        int size = this.A02.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            EB eb2 = this.A02.get(i11);
            int viewCount = eb2.getWindowVisibility();
            if (viewCount == 0) {
                eb2.A02.A04(eb2, false);
                int viewCount2 = eb2.A02.A00;
                i10 += viewCount2;
            }
        }
        this.A03.ensureCapacity(i10);
        int j10 = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int totalTaskCount = str.length();
        int viewCount3 = str2.length();
        if (totalTaskCount != viewCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i12 = 0; i12 < size; i12++) {
            EB eb3 = this.A02.get(i12);
            int viewCount4 = eb3.getWindowVisibility();
            if (viewCount4 == 0) {
                C1365Yz c1365Yz = eb3.A02;
                int viewCount5 = c1365Yz.A01;
                int i13 = Math.abs(viewCount5);
                int viewCount6 = c1365Yz.A02;
                int i14 = i13 + Math.abs(viewCount6);
                for (int i15 = 0; i15 < viewCount * 2; i15 += 2) {
                    int viewCount7 = this.A03.size();
                    if (j10 >= viewCount7) {
                        c4a = new C4A();
                        this.A03.add(c4a);
                    } else {
                        c4a = this.A03.get(j10);
                    }
                    int totalTaskCount2 = i15 + 1;
                    int totalTaskIndex = c1365Yz.A03[totalTaskCount2];
                    c4a.A04 = totalTaskIndex <= i14;
                    c4a.A02 = i14;
                    c4a.A00 = totalTaskIndex;
                    c4a.A03 = eb3;
                    int totalTaskCount3 = c1365Yz.A03[i15];
                    c4a.A01 = totalTaskCount3;
                    j10++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j10) {
        for (int i10 = 0; i10 < i; i10++) {
            C4A task = this.A03.get(i10);
            if (task.A03 == null) {
                return;
            }
            A06(task, j10);
            task.A00();
        }
    }

    private final void A05(long j10) {
        A02();
        A04(j10);
    }

    private void A06(C4A c4a, long j10) {
        AbstractC06224s abstractC06224sA00 = A00(c4a.A03, c4a.A01, c4a.A04 ? RecyclerView.FOREVER_NS : j10);
        if (abstractC06224sA00 != null && abstractC06224sA00.A09 != null && abstractC06224sA00.A0a() && !abstractC06224sA00.A0b()) {
            A07(abstractC06224sA00.A09.get(), j10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[Catch: all -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x006e, blocks: (B:13:0x0030, B:14:0x0043, B:19:0x0064), top: B:27:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[EDGE_INSN: B:29:0x0077->B:25:0x0077 BREAK  A[LOOP:0: B:14:0x0043->B:31:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private void A07(EB eb2, long j10) {
        C1365Yz c1365Yz;
        int i10;
        int i11;
        int i12;
        if (eb2 == null) {
            return;
        }
        if (eb2.A0C) {
            C06033y c06033y = eb2.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c06033y.A06() != 0) {
                    eb2.A1O();
                }
                c1365Yz = eb2.A02;
                c1365Yz.A04(eb2, true);
                if (c1365Yz.A00 != 0) {
                    try {
                        C05572c.A01(A01(0, 18, 7));
                        eb2.A0s.A05(eb2.A04);
                        i10 = 0;
                        while (true) {
                            i11 = c1365Yz.A00 * 2;
                            i12 = A06[6].charAt(8);
                            if (i12 != 73) {
                                break;
                            }
                            String[] strArr = A06;
                            strArr[3] = "nG";
                            strArr[7] = "TD";
                            if (i10 < i11) {
                                A00(eb2, c1365Yz.A03[i10], j10);
                                i10 += 2;
                            } else {
                                C05572c.A00();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        C05572c.A00();
                        throw th;
                    }
                } else {
                    return;
                }
            }
        } else {
            c1365Yz = eb2.A02;
            c1365Yz.A04(eb2, true);
            if (c1365Yz.A00 != 0) {
                C05572c.A01(A01(0, 18, 7));
                eb2.A0s.A05(eb2.A04);
                i10 = 0;
                while (true) {
                    i11 = c1365Yz.A00 * 2;
                    i12 = A06[6].charAt(8);
                    if (i12 != 73) {
                        break;
                        break;
                    }
                    String[] strArr2 = A06;
                    strArr2[3] = "nG";
                    strArr2[7] = "TD";
                    if (i10 < i11) {
                        A00(eb2, c1365Yz.A03[i10], j10);
                        i10 += 2;
                    } else {
                        C05572c.A00();
                        return;
                    }
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public static boolean A08(EB eb2, int i10) {
        int iA06 = eb2.A01.A06();
        for (int i11 = 0; i11 < iA06; i11++) {
            AbstractC06224s abstractC06224sA0F = EB.A0F(eb2.A01.A0A(i11));
            int childCount = abstractC06224sA0F.A03;
            if (childCount == i10 && !abstractC06224sA0F.A0b()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(EB eb2) {
        this.A02.add(eb2);
    }

    public final void A0A(EB eb2) {
        this.A02.remove(eb2);
    }

    public final void A0B(EB eb2, int i10, int i11) {
        if (eb2.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = eb2.getNanoTime();
            eb2.post(this);
        }
        eb2.A02.A03(i10, i11);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C05572c.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                C05572c.A00();
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i10 = 0; i10 < size; i10++) {
                EB eb2 = this.A02.get(i10);
                if (eb2.getWindowVisibility() == 0) {
                    jMax = Math.max(eb2.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                C05572c.A00();
                return;
            }
            A05(TimeUnit.MILLISECONDS.toNanos(jMax) + this.A00);
            this.A01 = 0L;
            C05572c.A00();
        } catch (Throwable th) {
            this.A01 = 0L;
            C05572c.A00();
            throw th;
        }
    }
}
