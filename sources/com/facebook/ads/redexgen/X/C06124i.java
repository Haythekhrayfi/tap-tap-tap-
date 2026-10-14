package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C06124i {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public int A00;
    public C4h A01;
    public ArrayList<AbstractC06224s> A02;
    public int A03;
    public AbstractC06204q A04;
    public final ArrayList<AbstractC06224s> A05;
    public final ArrayList<AbstractC06224s> A06;
    public final List<AbstractC06224s> A07;
    public final /* synthetic */ EB A08;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, Ascii.RS, Ascii.RS, 43, Ascii.GS, 44, -14, -53, -48, -62, -21, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -38, -33, 36, 37, 18, 37, 22, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, Ascii.RS, 19, Ascii.US, Ascii.RS, 35, Ascii.EM, 35, 36, 21, Ascii.RS, 19, 41, -48, 20, 21, 36, 21, 19, 36, 21, 20, -34, -48, -7, Ascii.RS, 38, 17, Ascii.FS, Ascii.EM, 20, -48, Ascii.EM, 36, 21, Ascii.GS, -48, 32, Ascii.US, 35, Ascii.EM, 36, Ascii.EM, Ascii.US, Ascii.RS, -48, -13, Ascii.CAN, 13, Ascii.EM, Ascii.CAN, Ascii.GS, 19, Ascii.GS, Ascii.RS, 15, Ascii.CAN, 13, 35, -54, 14, 15, Ascii.RS, 15, 13, Ascii.RS, 15, 14, -40, -54, -13, Ascii.CAN, 32, 11, 22, 19, 14, -54, 32, 19, 15, 33, -54, 18, Ascii.EM, 22, 14, 15, Ascii.FS, -54, 11, 14, 11, Ascii.SUB, Ascii.RS, 15, Ascii.FS, -54, Ascii.SUB, Ascii.EM, Ascii.GS, 19, Ascii.RS, 19, Ascii.EM, Ascii.CAN, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -90, -8, -21, -6, -5, -8, -12, -21, -22, -90, -25, -90, -4, -17, -21, -3, -90, -6, -18, -25, -6, -90, -17, -7, -90, -17, -19, -12, -11, -8, -21, -22, -76, -90, -33, -11, -5, -90, -13, -5, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -90, -24, -21, -20, -11, -8, -21, -90, -8, -21, -6, -5, -8, -12, -17, -12, -19, -90, -6, -18, -17, -7, -90, -4, -17, -21, -3, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, 107, -67, -80, -65, -64, -67, -71, -80, -81, 107, -84, 107, -63, -76, -80, -62, 107, -62, -77, -76, -82, -77, 107, -81, -70, -80, -66, 107, -71, -70, -65, 107, -77, -84, -63, -80, 107, -84, 107, -95, -76, -80, -62, -109, -70, -73, -81, -80, -67, -63, -74, -50, -60, -54, -55, 117, -66, -61, -71, -70, -51, 117, -56, -67, -60, -54, -63, -71, 117, -61, -60, -55, 117, -73, -70, 117, -126, -122, 117, -74, -69, -55, -70, -57, 117, -54, -61, -67, -66, -71, -66, -61, -68, 117, -74, 117, -53, -66, -70, -52, -113, -25, -26, -50, -31, -35, -17, -54, -35, -37, -15, -37, -28, -35, -36};
    }

    static {
        A05();
    }

    public C06124i(EB eb2) {
        this.A08 = eb2;
        ArrayList<AbstractC06224s> arrayList = new ArrayList<>();
        this.A05 = arrayList;
        this.A02 = null;
        this.A06 = new ArrayList<>();
        this.A07 = Collections.unmodifiableList(arrayList);
        this.A03 = 2;
        this.A00 = 2;
    }

    private final View A00(int i10, boolean z10) {
        return A0I(i10, z10, RecyclerView.FOREVER_NS).A0H;
    }

    private final AbstractC06224s A01(int i10) {
        int size;
        int iA0D;
        ArrayList<AbstractC06224s> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC06224s abstractC06224s = this.A02.get(i11);
            if (!abstractC06224s.A0i()) {
                int i12 = abstractC06224s.A0I();
                if (i12 == i10) {
                    abstractC06224s.A0T(32);
                    return abstractC06224s;
                }
            }
        }
        if (this.A08.A04.A0A() && (iA0D = this.A08.A00.A0D(i10)) > 0) {
            int offsetPosition = this.A08.A04.A0D();
            if (iA0D < offsetPosition) {
                long jA04 = this.A08.A04.A04(iA0D);
                for (int i13 = 0; i13 < size; i13++) {
                    AbstractC06224s abstractC06224s2 = this.A02.get(i13);
                    if (!abstractC06224s2.A0i() && abstractC06224s2.A0K() == jA04) {
                        abstractC06224s2.A0T(32);
                        return abstractC06224s2;
                    }
                }
            }
        }
        return null;
    }

    private final AbstractC06224s A02(int i10, boolean z10) {
        View viewA08;
        int size = this.A05.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC06224s abstractC06224s = this.A05.get(i11);
            if (!abstractC06224s.A0i()) {
                int scrapCount = abstractC06224s.A0I();
                if (scrapCount == i10 && !abstractC06224s.A0b() && (this.A08.A0s.A09 || !abstractC06224s.A0c())) {
                    abstractC06224s.A0T(32);
                    return abstractC06224s;
                }
            }
        }
        if (!z10 && (viewA08 = this.A08.A01.A08(i10)) != null) {
            AbstractC06224s abstractC06224sA0F = EB.A0F(viewA08);
            this.A08.A01.A0G(viewA08);
            int iA07 = this.A08.A01.A07(viewA08);
            if (iA07 != -1) {
                this.A08.A01.A0C(iA07);
                A0W(viewA08);
                abstractC06224sA0F.A0T(8224);
                return abstractC06224sA0F;
            }
            throw new IllegalStateException(A04(727, 52, 27) + abstractC06224sA0F + this.A08.A1I());
        }
        int size2 = this.A06.size();
        for (int i12 = 0; i12 < size2; i12++) {
            AbstractC06224s abstractC06224s2 = this.A06.get(i12);
            if (!abstractC06224s2.A0b()) {
                int scrapCount2 = abstractC06224s2.A0I();
                if (scrapCount2 == i10) {
                    if (!z10) {
                        this.A06.remove(i12);
                    }
                    return abstractC06224s2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec A[SYNTHETIC] */
    private final AbstractC06224s A03(long j10, int i10, boolean z10) {
        ArrayList<AbstractC06224s> arrayList;
        int cacheSize;
        int count;
        int cacheSize2;
        int count2;
        int count3 = this.A05.size();
        for (int i11 = count3 - 1; i11 >= 0; i11--) {
            AbstractC06224s abstractC06224s = this.A05.get(i11);
            if (abstractC06224s.A0K() == j10 && !abstractC06224s.A0i()) {
                int count4 = abstractC06224s.A0H();
                if (i10 == count4) {
                    abstractC06224s.A0T(32);
                    if (abstractC06224s.A0c()) {
                        EB eb2 = this.A08;
                        int i12 = A0A[4].charAt(3);
                        if (i12 == 98) {
                            A0A[0] = "q3aWXTgT7NsVf007";
                            if (!eb2.A0s.A07()) {
                                String[] strArr = A0A;
                                String str = strArr[2];
                                String str2 = strArr[1];
                                int cacheSize3 = str.charAt(0);
                                int count5 = str2.charAt(0);
                                if (cacheSize3 != count5) {
                                    A0A[4] = "NC6bFXUosLdTEwJsXrsHGkbXBsQUMG7q";
                                    abstractC06224s.A0U(2, 14);
                                } else {
                                    String[] strArr2 = A0A;
                                    strArr2[2] = "kBSMDIkt47Rx4hHhTamY1xnSrMWRxYxp";
                                    strArr2[1] = "kToZLwND7zKVFlbtf8XZb6UwHA5zPLAu";
                                    abstractC06224s.A0U(2, 14);
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                    return abstractC06224s;
                }
                if (!z10) {
                    this.A05.remove(i11);
                    this.A08.removeDetachedView(abstractC06224s.A0H, false);
                    A0V(abstractC06224s.A0H);
                }
            }
        }
        int count6 = this.A06.size();
        for (int i13 = count6 - 1; i13 >= 0; i13--) {
            AbstractC06224s abstractC06224s2 = this.A06.get(i13);
            if (abstractC06224s2.A0K() == j10) {
                int iA0H = abstractC06224s2.A0H();
                int cacheSize4 = A0A[0].length();
                if (cacheSize4 != 16) {
                    String[] strArr3 = A0A;
                    strArr3[7] = "lrD7iCy3KBiO8gA6PsFToJiVZrW1xMAl";
                    strArr3[6] = "amz9CZtibeJcU8bEqG7a4ZYgRNeZgxWk";
                    if (i10 == iA0H) {
                        if (!z10) {
                            arrayList = this.A06;
                            String[] strArr4 = A0A;
                            String str3 = strArr4[5];
                            String str4 = strArr4[3];
                            cacheSize = str3.charAt(0);
                            count = str4.charAt(0);
                            if (cacheSize != count) {
                                String[] strArr5 = A0A;
                                strArr5[5] = "or4YmCu0ppqzW1VFAnuQtpcwvOCNSyKL";
                                strArr5[3] = "x7G8xrEgau2heO3LEdjWfX9qC3RDyC0d";
                                arrayList.remove(i13);
                            } else {
                                arrayList.remove(i13);
                            }
                        }
                        return abstractC06224s2;
                    }
                    if (!z10) {
                        A07(i13);
                        String[] strArr6 = A0A;
                        String str5 = strArr6[2];
                        String str6 = strArr6[1];
                        cacheSize2 = str5.charAt(0);
                        count2 = str6.charAt(0);
                        if (cacheSize2 == count2) {
                            A0A[4] = "2lrbY7WLbUziAPe6QkcwvBQ2VEr9QFta";
                            return null;
                        }
                        throw new RuntimeException();
                    }
                } else {
                    String[] strArr7 = A0A;
                    strArr7[2] = "kYzWBiiTSiU3KogqfJ4EJctPAodLTQqF";
                    strArr7[1] = "kIBKgO4naDZyukeXVXxcwMENrZxoY36q";
                    if (i10 == iA0H) {
                        if (!z10) {
                            arrayList = this.A06;
                            String[] strArr8 = A0A;
                            String str7 = strArr8[5];
                            String str8 = strArr8[3];
                            cacheSize = str7.charAt(0);
                            count = str8.charAt(0);
                            if (cacheSize != count) {
                                String[] strArr9 = A0A;
                                strArr9[5] = "or4YmCu0ppqzW1VFAnuQtpcwvOCNSyKL";
                                strArr9[3] = "x7G8xrEgau2heO3LEdjWfX9qC3RDyC0d";
                                arrayList.remove(i13);
                            } else {
                                arrayList.remove(i13);
                            }
                        }
                        return abstractC06224s2;
                    }
                    if (!z10) {
                        A07(i13);
                        String[] strArr10 = A0A;
                        String str9 = strArr10[2];
                        String str10 = strArr10[1];
                        cacheSize2 = str9.charAt(0);
                        count2 = str10.charAt(0);
                        if (cacheSize2 == count2) {
                            A0A[4] = "2lrbY7WLbUziAPe6QkcwvBQ2VEr9QFta";
                            return null;
                        }
                        throw new RuntimeException();
                    }
                }
            }
        }
        return null;
    }

    private final void A06() {
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        if (EB.A1E) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i10) {
        A0d(this.A06.get(i10), true);
        this.A06.remove(i10);
    }

    private void A08(ViewGroup viewGroup, boolean z10) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                String str = strArr[7];
                String str2 = strArr[6];
                int iCharAt = str.charAt(8);
                int i10 = str2.charAt(8);
                if (iCharAt == i10) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z10) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AbstractC06224s abstractC06224s) {
        if (this.A08.A1t()) {
            View view = abstractC06224s.A0H;
            if (C3F.A00(view) == 0) {
                C3F.A09(view, 1);
            }
            if (!C3F.A0F(view)) {
                abstractC06224s.A0T(Http2.INITIAL_MAX_FRAME_SIZE);
                C3F.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AbstractC06224s abstractC06224s) {
        if (abstractC06224s.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC06224s.A0H, false);
        }
    }

    private final void A0B(AbstractC06224s abstractC06224s) {
        if (this.A08.A07 != null) {
            throw new NullPointerException(A04(779, 14, 62));
        }
        C4O c4o = this.A08.A04;
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC06224s);
        }
    }

    private final boolean A0C(AbstractC06224s abstractC06224s) {
        if (abstractC06224s.A0c()) {
            return this.A08.A0s.A07();
        }
        if (abstractC06224s.A03 >= 0 && abstractC06224s.A03 < this.A08.A04.A0D()) {
            if (!this.A08.A0s.A07()) {
                int iA03 = this.A08.A04.A03(abstractC06224s.A03);
                int type = abstractC06224s.A0H();
                if (iA03 != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0A() || abstractC06224s.A0K() == this.A08.A04.A04(abstractC06224s.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 112) + abstractC06224s + this.A08.A1I());
    }

    private boolean A0D(AbstractC06224s abstractC06224s, int i10, int i11, long startBindNs) {
        abstractC06224s.A08 = this.A08;
        int iA0H = abstractC06224s.A0H();
        long nanoTime = this.A08.getNanoTime();
        if (startBindNs != RecyclerView.FOREVER_NS) {
            C4h c4h = this.A01;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int iCharAt = str.charAt(0);
            int viewType = str2.charAt(0);
            if (iCharAt == viewType) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c4h.A0A(iA0H, nanoTime, startBindNs)) {
                return false;
            }
        }
        this.A08.A04.A09(abstractC06224s, i10);
        this.A01.A05(abstractC06224s.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC06224s);
        if (this.A08.A0s.A07()) {
            abstractC06224s.A04 = i11;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i10) {
        return this.A05.get(i10).A0H;
    }

    public final View A0G(int i10) {
        return A00(i10, false);
    }

    public final C4h A0H() {
        if (this.A01 == null) {
            this.A01 = new C4h();
        }
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x026c  */
    /* JADX WARN: Code duplicated, block: B:102:0x027a  */
    /* JADX WARN: Code duplicated, block: B:106:0x028d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0297  */
    /* JADX WARN: Code duplicated, block: B:109:0x029d  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0216  */
    /* JADX WARN: Code duplicated, block: B:92:0x024c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0262  */
    /* JADX WARN: Code duplicated, block: B:99:0x0264  */
    public final AbstractC06224s A0I(int i10, boolean z10, long j10) {
        boolean zA0D;
        ViewGroup.LayoutParams layoutParams;
        C06064b c06064b;
        EB ebA0H;
        AbstractC06204q abstractC06204q;
        View viewA00;
        if (i10 >= 0 && i10 < this.A08.A0s.A03()) {
            boolean z11 = false;
            AbstractC06224s abstractC06224sA05 = null;
            boolean fromScrapOrHiddenOrCache = this.A08.A0s.A07();
            if (fromScrapOrHiddenOrCache) {
                abstractC06224sA05 = A01(i10);
                z11 = abstractC06224sA05 != null;
            }
            if (abstractC06224sA05 == null && (abstractC06224sA05 = A02(i10, z10)) != null) {
                boolean fromScrapOrHiddenOrCache2 = A0C(abstractC06224sA05);
                if (!fromScrapOrHiddenOrCache2) {
                    if (!z10) {
                        abstractC06224sA05.A0T(4);
                        boolean fromScrapOrHiddenOrCache3 = abstractC06224sA05.A0d();
                        if (fromScrapOrHiddenOrCache3) {
                            this.A08.removeDetachedView(abstractC06224sA05.A0H, false);
                            abstractC06224sA05.A0S();
                        } else {
                            boolean fromScrapOrHiddenOrCache4 = abstractC06224sA05.A0i();
                            if (fromScrapOrHiddenOrCache4) {
                                abstractC06224sA05.A0O();
                            }
                        }
                        A0b(abstractC06224sA05);
                    }
                    abstractC06224sA05 = null;
                } else {
                    z11 = true;
                }
            }
            if (abstractC06224sA05 == null) {
                int iA0D = this.A08.A00.A0D(i10);
                if (iA0D < 0 || iA0D >= this.A08.A04.A0D()) {
                    throw new IndexOutOfBoundsException(A04(165, 46, 118) + i10 + A04(13, 8, 126) + iA0D + A04(35, 8, 119) + this.A08.A0s.A03() + this.A08.A1I());
                }
                int iA03 = this.A08.A04.A03(iA0D);
                boolean fromScrapOrHiddenOrCache5 = this.A08.A04.A0A();
                if (fromScrapOrHiddenOrCache5 && (abstractC06224sA05 = A03(this.A08.A04.A04(iA0D), iA03, z10)) != null) {
                    abstractC06224sA05.A03 = iA0D;
                    z11 = true;
                }
                if (abstractC06224sA05 == null && (abstractC06204q = this.A04) != null && (viewA00 = abstractC06204q.A00(this, i10, iA03)) != null) {
                    abstractC06224sA05 = this.A08.A1H(viewA00);
                    if (abstractC06224sA05 != null) {
                        boolean fromScrapOrHiddenOrCache6 = abstractC06224sA05.A0h();
                        if (fromScrapOrHiddenOrCache6) {
                            throw new IllegalArgumentException(A04(540, 113, 76) + this.A08.A1I());
                        }
                    } else {
                        throw new IllegalArgumentException(A04(653, 74, 17) + this.A08.A1I());
                    }
                }
                if (abstractC06224sA05 == null) {
                    C4h c4hA0H = A0H();
                    String[] strArr = A0A;
                    if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                        A0A[4] = "3K2bfdY4Lns5cH4Uqi6qZhk44zURNmgZ";
                        abstractC06224sA05 = c4hA0H.A03(iA03);
                        if (abstractC06224sA05 != null) {
                            abstractC06224sA05.A0Q();
                            boolean fromScrapOrHiddenOrCache7 = EB.A1C;
                            if (fromScrapOrHiddenOrCache7) {
                                A0A(abstractC06224sA05);
                            }
                        }
                    }
                }
                if (abstractC06224sA05 == null) {
                    long nanoTime = this.A08.getNanoTime();
                    if (j10 != RecyclerView.FOREVER_NS) {
                        boolean fromScrapOrHiddenOrCache8 = this.A01.A0B(iA03, nanoTime, j10);
                        if (!fromScrapOrHiddenOrCache8) {
                            return null;
                        }
                    }
                    C4O c4o = this.A08.A04;
                    EB eb2 = this.A08;
                    String[] strArr2 = A0A;
                    if (strArr2[5].charAt(0) == strArr2[3].charAt(0)) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0A;
                    strArr3[5] = "ofPrqBOY4KV1O5mmTOXtQojU6rRVoJMb";
                    strArr3[3] = "dfUBDtyf096LhSCdUEMmmzbvfUZbBbNe";
                    abstractC06224sA05 = c4o.A05(eb2, iA03);
                    boolean fromScrapOrHiddenOrCache9 = EB.A1E;
                    if (fromScrapOrHiddenOrCache9 && (ebA0H = EB.A0H(abstractC06224sA05.A0H)) != null) {
                        abstractC06224sA05.A09 = new WeakReference<>(ebA0H);
                    }
                    this.A01.A06(iA03, this.A08.getNanoTime() - nanoTime);
                }
                if (z11) {
                    abstractC06224sA05.A0U(0, 8192);
                    if (this.A08.A0s.A0C) {
                        int changeFlags = C4W.A00(abstractC06224sA05);
                        C4V info = this.A08.A05.A09(this.A08.A0s, abstractC06224sA05, changeFlags | 4096, abstractC06224sA05.A0L());
                        this.A08.A1n(abstractC06224sA05, info);
                    }
                }
                zA0D = false;
                if (!this.A08.A0s.A07()) {
                    if (abstractC06224sA05.A0a()) {
                        zA0D = A0D(abstractC06224sA05, this.A08.A00.A0D(i10), i10, j10);
                    } else {
                        zA0D = A0D(abstractC06224sA05, this.A08.A00.A0D(i10), i10, j10);
                    }
                } else if (abstractC06224sA05.A0a()) {
                    zA0D = A0D(abstractC06224sA05, this.A08.A00.A0D(i10), i10, j10);
                } else {
                    zA0D = A0D(abstractC06224sA05, this.A08.A00.A0D(i10), i10, j10);
                }
                layoutParams = abstractC06224sA05.A0H.getLayoutParams();
                if (layoutParams == null) {
                    c06064b = (C06064b) this.A08.generateDefaultLayoutParams();
                    abstractC06224sA05.A0H.setLayoutParams(c06064b);
                } else if (!this.A08.checkLayoutParams(layoutParams)) {
                    c06064b = (C06064b) this.A08.generateLayoutParams(layoutParams);
                    abstractC06224sA05.A0H.setLayoutParams(c06064b);
                } else if (A0A[0].length() == 16) {
                    A0A[4] = "WeHbAL2DpvJL4iRMn0O7hIhaGbvumhB7";
                    c06064b = (C06064b) layoutParams;
                }
                c06064b.A00 = abstractC06224sA05;
                c06064b.A02 = !z11 && zA0D;
                return abstractC06224sA05;
            }
            if (z11 && !this.A08.A0s.A07() && abstractC06224sA05.A0k(8192)) {
                abstractC06224sA05.A0U(0, 8192);
                if (this.A08.A0s.A0C) {
                    int changeFlags2 = C4W.A00(abstractC06224sA05);
                    C4V info2 = this.A08.A05.A09(this.A08.A0s, abstractC06224sA05, changeFlags2 | 4096, abstractC06224sA05.A0L());
                    this.A08.A1n(abstractC06224sA05, info2);
                }
            }
            zA0D = false;
            if (!this.A08.A0s.A07() && abstractC06224sA05.A0a()) {
                abstractC06224sA05.A04 = i10;
            } else if (abstractC06224sA05.A0a() || abstractC06224sA05.A0g() || abstractC06224sA05.A0b()) {
                zA0D = A0D(abstractC06224sA05, this.A08.A00.A0D(i10), i10, j10);
            }
            layoutParams = abstractC06224sA05.A0H.getLayoutParams();
            if (layoutParams == null) {
                c06064b = (C06064b) this.A08.generateDefaultLayoutParams();
                abstractC06224sA05.A0H.setLayoutParams(c06064b);
            } else if (!this.A08.checkLayoutParams(layoutParams)) {
                c06064b = (C06064b) this.A08.generateLayoutParams(layoutParams);
                abstractC06224sA05.A0H.setLayoutParams(c06064b);
            } else if (A0A[0].length() == 16) {
                A0A[4] = "WeHbAL2DpvJL4iRMn0O7hIhaGbvumhB7";
                c06064b = (C06064b) layoutParams;
            }
            c06064b.A00 = abstractC06224sA05;
            c06064b.A02 = !z11 && zA0D;
            return abstractC06224sA05;
            throw new RuntimeException();
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 0) + i10 + A04(12, 1, 99) + i10 + A04(21, 14, 104) + this.A08.A0s.A03() + this.A08.A1I());
    }

    public final List<AbstractC06224s> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A0M();
        }
        int i11 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i11; scrapCount++) {
            this.A05.get(scrapCount).A0M();
        }
        ArrayList<AbstractC06224s> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int scrapCount2 = str.charAt(0);
        int cachedCount = str2.charAt(0);
        if (scrapCount2 != cachedCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int scrapCount3 = 0; scrapCount3 < changedScrapCount; scrapCount3++) {
                this.A02.get(scrapCount3).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<AbstractC06224s> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i10 = 0; i10 < size; i10++) {
            C06064b c06064b = (C06064b) this.A06.get(i10).A0H.getLayoutParams();
            if (c06064b != null) {
                c06064b.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0A()) {
            int size = this.A06.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC06224s abstractC06224s = this.A06.get(i10);
                int i11 = A0A[0].length();
                if (i11 != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (abstractC06224s != null) {
                    abstractC06224s.A0T(6);
                    abstractC06224s.A0Y(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i10;
        if (this.A08.A06 != null) {
            AbstractC06054a abstractC06054a = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                i10 = abstractC06054a.A00;
            }
            throw new RuntimeException();
        }
        i10 = 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i10;
        int extraCache2 = this.A06.size();
        for (int i11 = extraCache2 - 1; i11 >= 0; i11--) {
            int size = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int i12 = str.charAt(0);
            int extraCache3 = str2.charAt(0);
            if (i12 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int extraCache4 = this.A00;
            if (size > extraCache4) {
                A07(i11);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i10) {
        this.A03 = i10;
        A0O();
    }

    public final void A0R(int i10, int i11) {
        int size = this.A06.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC06224s abstractC06224s = this.A06.get(i12);
            if (abstractC06224s != null) {
                int cachedCount = abstractC06224s.A03;
                if (cachedCount >= i10) {
                    abstractC06224s.A0W(i11, true);
                }
            }
        }
    }

    public final void A0S(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (i10 < i11) {
            i12 = i10;
            i13 = i11;
            i14 = -1;
        } else {
            i12 = i11;
            i13 = i10;
            i14 = 1;
        }
        int size = this.A06.size();
        for (int i15 = 0; i15 < size; i15++) {
            AbstractC06224s abstractC06224s = this.A06.get(i15);
            if (abstractC06224s != null) {
                int start = abstractC06224s.A03;
                if (start >= i12) {
                    int start2 = abstractC06224s.A03;
                    if (start2 > i13) {
                        continue;
                    } else {
                        int i16 = abstractC06224s.A03;
                        String[] strArr = A0A;
                        String str = strArr[5];
                        String str2 = strArr[3];
                        int end = str.charAt(0);
                        int start3 = str2.charAt(0);
                        if (end == start3) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                        strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                        if (i16 == i10) {
                            int start4 = i11 - i10;
                            abstractC06224s.A0W(start4, false);
                        } else {
                            abstractC06224s.A0W(i14, false);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void A0T(int i10, int i11) {
        int positionEnd;
        int i12 = i10 + i11;
        for (int i13 = this.A06.size() - 1; i13 >= 0; i13--) {
            AbstractC06224s abstractC06224s = this.A06.get(i13);
            if (abstractC06224s != null && (positionEnd = abstractC06224s.A03) >= i10 && positionEnd < i12) {
                abstractC06224s.A0T(2);
                A07(i13);
            }
        }
    }

    public final void A0U(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int removedEnd = this.A06.size();
        for (int i13 = removedEnd - 1; i13 >= 0; i13--) {
            AbstractC06224s abstractC06224s = this.A06.get(i13);
            if (abstractC06224s != null) {
                int removedEnd2 = abstractC06224s.A03;
                if (removedEnd2 >= i12) {
                    int removedEnd3 = -i11;
                    abstractC06224s.A0W(removedEnd3, z10);
                } else {
                    int removedEnd4 = abstractC06224s.A03;
                    if (removedEnd4 >= i10) {
                        abstractC06224s.A0T(8);
                        A07(i13);
                    }
                }
            }
        }
    }

    public final void A0V(View view) {
        AbstractC06224s abstractC06224sA0F = EB.A0F(view);
        abstractC06224sA0F.A0F = null;
        abstractC06224sA0F.A0G = false;
        abstractC06224sA0F.A0O();
        A0b(abstractC06224sA0F);
    }

    public final void A0W(View view) {
        AbstractC06224s abstractC06224sA0F = EB.A0F(view);
        if (abstractC06224sA0F.A0k(12) || !abstractC06224sA0F.A0f() || this.A08.A21(abstractC06224sA0F)) {
            boolean zA0b = abstractC06224sA0F.A0b();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!zA0b || abstractC06224sA0F.A0c() || this.A08.A04.A0A()) {
                abstractC06224sA0F.A0X(this, false);
                this.A05.add(abstractC06224sA0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 32) + this.A08.A1I());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        abstractC06224sA0F.A0X(this, true);
        this.A02.add(abstractC06224sA0F);
    }

    public final void A0X(View view) {
        AbstractC06224s abstractC06224sA0F = EB.A0F(view);
        if (abstractC06224sA0F.A0e()) {
            this.A08.removeDetachedView(view, false);
        }
        if (abstractC06224sA0F.A0d()) {
            abstractC06224sA0F.A0S();
        } else if (abstractC06224sA0F.A0i()) {
            abstractC06224sA0F.A0O();
        }
        A0b(abstractC06224sA0F);
    }

    public final void A0Y(C4O c4o, C4O c4o2, boolean z10) {
        A0P();
        A0H().A08(c4o, c4o2, z10);
    }

    public final void A0Z(C4h c4h) {
        C4h c4h2 = this.A01;
        if (c4h2 != null) {
            c4h2.A04();
        }
        this.A01 = c4h;
        if (c4h != null) {
            c4h.A07(this.A08.getAdapter());
        }
    }

    public final void A0a(AbstractC06204q abstractC06204q) {
        this.A04 = abstractC06204q;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:51:0x0113  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128 A[LOOP:0: B:45:0x00f3->B:58:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109 A[EDGE_INSN: B:68:0x0109->B:48:0x0109 BREAK  A[LOOP:0: B:45:0x00f3->B:58:0x0128], SYNTHETIC] */
    public final void A0b(AbstractC06224s abstractC06224s) {
        boolean transientStatePreventsRecycling;
        int i10;
        String[] strArr;
        boolean transientStatePreventsRecycling2;
        int size;
        boolean transientStatePreventsRecycling3;
        boolean transientStatePreventsRecycling4;
        int i11;
        boolean transientStatePreventsRecycling5;
        if (abstractC06224s.A0d() || abstractC06224s.A0H.getParent() != null) {
            throw new IllegalArgumentException(A04(293, 56, 52) + abstractC06224s.A0d() + A04(0, 12, 75) + (abstractC06224s.A0H.getParent() != null) + this.A08.A1I());
        }
        boolean zA0e = abstractC06224s.A0e();
        String[] strArr2 = A0A;
        if (strArr2[2].charAt(0) != strArr2[1].charAt(0)) {
            throw new RuntimeException();
        }
        A0A[4] = "QZZbfikyhDCMiV1imXgamooHNWBI4VfH";
        if (!zA0e) {
            if (abstractC06224s.A0h()) {
                throw new IllegalArgumentException(A04(430, 110, 12) + this.A08.A1I());
            }
            boolean zA09 = abstractC06224s.A09();
            if (this.A08.A04 != null && zA09) {
                boolean transientStatePreventsRecycling6 = this.A08.A04.A0B(abstractC06224s);
                if (transientStatePreventsRecycling6) {
                    transientStatePreventsRecycling = true;
                } else {
                    transientStatePreventsRecycling = false;
                }
            } else {
                transientStatePreventsRecycling = false;
            }
            boolean z10 = false;
            boolean z11 = false;
            if (transientStatePreventsRecycling) {
                i10 = this.A00;
                strArr = A0A;
                if (strArr[2].charAt(0) != strArr[1].charAt(0)) {
                    A0A[4] = "JXkbPmQXP2BcwiEI3FqqjfiGok6rwhAB";
                    if (i10 > 0) {
                        transientStatePreventsRecycling2 = abstractC06224s.A0k(526);
                        if (!transientStatePreventsRecycling2) {
                            size = this.A06.size();
                            if (size >= this.A00) {
                                A07(0);
                                size--;
                            }
                            transientStatePreventsRecycling3 = EB.A1E;
                            if (transientStatePreventsRecycling3) {
                                transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC06224s.A03);
                                if (!transientStatePreventsRecycling4) {
                                    i11 = size - 1;
                                    while (i11 >= 0) {
                                        int targetCacheIndex = this.A06.get(i11).A03;
                                        transientStatePreventsRecycling5 = this.A08.A02.A05(targetCacheIndex);
                                        if (!transientStatePreventsRecycling5) {
                                            break;
                                            break;
                                        }
                                        i11--;
                                    }
                                    size = i11 + 1;
                                }
                            }
                            this.A06.add(size, abstractC06224s);
                            z10 = true;
                        }
                    }
                } else {
                    A0A[4] = "iMRb6lH7bzEtCSJD4TfZYArDATXy6kqw";
                    if (i10 > 0) {
                        transientStatePreventsRecycling2 = abstractC06224s.A0k(526);
                        if (!transientStatePreventsRecycling2) {
                            size = this.A06.size();
                            if (size >= this.A00) {
                                A07(0);
                                size--;
                            }
                            transientStatePreventsRecycling3 = EB.A1E;
                            if (transientStatePreventsRecycling3) {
                                transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC06224s.A03);
                                if (!transientStatePreventsRecycling4) {
                                    i11 = size - 1;
                                    while (i11 >= 0) {
                                        int targetCacheIndex2 = this.A06.get(i11).A03;
                                        transientStatePreventsRecycling5 = this.A08.A02.A05(targetCacheIndex2);
                                        if (!transientStatePreventsRecycling5) {
                                            break;
                                            break;
                                        }
                                        i11--;
                                    }
                                    size = i11 + 1;
                                }
                            }
                            this.A06.add(size, abstractC06224s);
                            z10 = true;
                        }
                    }
                }
                if (!z10) {
                    A0d(abstractC06224s, true);
                    z11 = true;
                }
            } else {
                boolean transientStatePreventsRecycling7 = abstractC06224s.A0j();
                if (transientStatePreventsRecycling7) {
                    i10 = this.A00;
                    strArr = A0A;
                    if (strArr[2].charAt(0) != strArr[1].charAt(0)) {
                        A0A[4] = "JXkbPmQXP2BcwiEI3FqqjfiGok6rwhAB";
                        if (i10 > 0) {
                            transientStatePreventsRecycling2 = abstractC06224s.A0k(526);
                            if (!transientStatePreventsRecycling2) {
                                size = this.A06.size();
                                if (size >= this.A00 && size > 0) {
                                    A07(0);
                                    size--;
                                }
                                transientStatePreventsRecycling3 = EB.A1E;
                                if (transientStatePreventsRecycling3 && size > 0) {
                                    transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC06224s.A03);
                                    if (!transientStatePreventsRecycling4) {
                                        i11 = size - 1;
                                        while (i11 >= 0) {
                                            int targetCacheIndex3 = this.A06.get(i11).A03;
                                            transientStatePreventsRecycling5 = this.A08.A02.A05(targetCacheIndex3);
                                            if (!transientStatePreventsRecycling5) {
                                                break;
                                            } else {
                                                i11--;
                                            }
                                        }
                                        size = i11 + 1;
                                    }
                                }
                                this.A06.add(size, abstractC06224s);
                                z10 = true;
                            }
                        }
                    } else {
                        A0A[4] = "iMRb6lH7bzEtCSJD4TfZYArDATXy6kqw";
                        if (i10 > 0) {
                            transientStatePreventsRecycling2 = abstractC06224s.A0k(526);
                            if (!transientStatePreventsRecycling2) {
                                size = this.A06.size();
                                if (size >= this.A00) {
                                    A07(0);
                                    size--;
                                }
                                transientStatePreventsRecycling3 = EB.A1E;
                                if (transientStatePreventsRecycling3) {
                                    transientStatePreventsRecycling4 = this.A08.A02.A05(abstractC06224s.A03);
                                    if (!transientStatePreventsRecycling4) {
                                        i11 = size - 1;
                                        while (i11 >= 0) {
                                            int targetCacheIndex4 = this.A06.get(i11).A03;
                                            transientStatePreventsRecycling5 = this.A08.A02.A05(targetCacheIndex4);
                                            if (!transientStatePreventsRecycling5) {
                                                break;
                                                break;
                                            }
                                            i11--;
                                        }
                                        size = i11 + 1;
                                    }
                                }
                                this.A06.add(size, abstractC06224s);
                                z10 = true;
                            }
                        }
                    }
                    if (!z10) {
                        A0d(abstractC06224s, true);
                        z11 = true;
                    }
                }
            }
            this.A08.A0t.A0B(abstractC06224s);
            if (!z10 && !z11 && zA09) {
                abstractC06224s.A08 = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(A04(349, 81, 79) + abstractC06224s + this.A08.A1I());
    }

    public final void A0c(AbstractC06224s abstractC06224s) {
        if (abstractC06224s.A0G) {
            this.A02.remove(abstractC06224s);
        } else {
            this.A05.remove(abstractC06224s);
        }
        abstractC06224s.A0F = null;
        abstractC06224s.A0G = false;
        abstractC06224s.A0O();
    }

    public final void A0d(AbstractC06224s abstractC06224s, boolean z10) {
        EB.A0s(abstractC06224s);
        if (abstractC06224s.A0k(Http2.INITIAL_MAX_FRAME_SIZE)) {
            abstractC06224s.A0U(0, Http2.INITIAL_MAX_FRAME_SIZE);
            C3F.A0B(abstractC06224s.A0H, null);
        }
        if (z10) {
            A0B(abstractC06224s);
        }
        abstractC06224s.A08 = null;
        A0H().A09(abstractC06224s);
    }
}
