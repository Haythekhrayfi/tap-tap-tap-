package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1280Vr implements BY {
    public static byte[] A0C;
    public static String[] A0D = {"1uxTk9uu8NGqb4bRD7SiE7", "Ssi3SEW4IwUGp9bqpG4lGM81x4BmU482", "xmiG4gye91jMk16VeYAf2JsNYB9ZLAXn", "P3M63oXZ4RlItM7d6tCP0FhU4UJB0VVm", "pvrI0I2hPgkxZ7mKqcVNCE", "IViSy7bNMMRqTObQqgQHZJ03ioQVAxI3", "AKSfxMAYbymYkKmkIHXjHayRWnu0Srjs", "XaZNcJans0E3GSdApjoK7oUba6xaED3H"};
    public static final InterfaceC0775Bb A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public InterfaceC0774Ba A02;
    public InterfaceC0805Ct A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC0805Ct> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final InterfaceC0803Cr A09;
    public final C0914Hf A0A;
    public final List<C0926Hr> A0B;

    public static String A0D(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-64, -62, -84, -78, -106, -76, -63, -63, -62, -57, 115, -71, -68, -63, -73, 115, -58, -52, -63, -74, 115, -75, -52, -57, -72, -127, 115, -96, -62, -58, -57, 115, -65, -68, -66, -72, -65, -52, 115, -63, -62, -57, 115, -76, 115, -89, -59, -76, -63, -58, -61, -62, -59, -57, 115, -90, -57, -59, -72, -76, -64, -127, 115, 111, 113, 97, -53, -56, -39, -58};
    }

    static {
        A0G();
        A0E = new C1283Vu();
        A0F = C0930Hv.A08(A0D(0, 4, 102));
        A0G = C0930Hv.A08(A0D(62, 4, 21));
        A0H = C0930Hv.A08(A0D(66, 4, 106));
    }

    public C1280Vr() {
        this(0);
    }

    public C1280Vr(int i10) {
        this(1, i10);
    }

    public C1280Vr(int i10, int i11) {
        this(i10, new C0926Hr(0L), new W8(i11));
    }

    public C1280Vr(int i10, C0926Hr c0926Hr, InterfaceC0803Cr interfaceC0803Cr) {
        this.A09 = (InterfaceC0803Cr) HG.A01(interfaceC0803Cr);
        this.A05 = i10;
        if (i10 == 1 || i10 == 2) {
            this.A0B = Collections.singletonList(c0926Hr);
        } else {
            ArrayList arrayList = new ArrayList();
            this.A0B = arrayList;
            arrayList.add(c0926Hr);
        }
        this.A0A = new C0914Hf(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(C1280Vr c1280Vr) {
        int i10 = c1280Vr.A01;
        c1280Vr.A01 = i10 + 1;
        return i10;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC0805Ct> sparseArrayA4Z = this.A09.A4Z();
        int size = sparseArrayA4Z.size();
        for (int i10 = 0; i10 < size; i10++) {
            SparseArray<InterfaceC0805Ct> sparseArray = this.A06;
            int initialPayloadReadersSize = sparseArrayA4Z.keyAt(i10);
            sparseArray.put(initialPayloadReadersSize, sparseArrayA4Z.valueAt(i10));
        }
        this.A06.put(0, new C1285Vw(new C1282Vt(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A8d(InterfaceC0774Ba interfaceC0774Ba) {
        this.A02 = interfaceC0774Ba;
        interfaceC0774Ba.AEm(new C1301Wm(-9223372036854775807L));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d  */
    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX WARN: Code duplicated, block: B:21:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0116  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:52:0x0136  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c A[PHI: r8
  0x013c: PHI (r8v5 'continuityCounter' int) = (r8v2 'continuityCounter' int), (r8v6 'continuityCounter' int) binds: [B:65:0x0167, B:53:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x0155  */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a A[PHI: r8
  0x016a: PHI (r8v3 'continuityCounter' int) = (r8v2 'continuityCounter' int), (r8v6 'continuityCounter' int) binds: [B:65:0x0167, B:53:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x016e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x0183  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0190  */
    /* JADX WARN: Code duplicated, block: B:79:0x0195  */
    /* JADX WARN: Code duplicated, block: B:82:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0057 A[EDGE_INSN: B:84:0x0057->B:12:0x0057 BREAK  A[LOOP:0: B:10:0x0042->B:24:0x00a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x011c, please report this as an issue */
    @Override // com.facebook.ads.redexgen.X.BY
    public final int ADy(BZ bz, C0777Bf c0777Bf) throws InterruptedException, IOException {
        int iA04;
        int iA07;
        int limit;
        int position;
        int pid;
        boolean z10;
        int i10;
        int continuityCounter;
        boolean payloadUnitStartIndicator;
        boolean payloadExists;
        InterfaceC0805Ct interfaceC0805Ct;
        int endOfPacket;
        int i11;
        C0914Hf c0914Hf;
        int iA08;
        String[] strArr;
        int i12;
        int i13;
        byte[] bArr = this.A0A.A00;
        if (9400 - this.A0A.A06() < 188) {
            C0914Hf c0914Hf2 = this.A0A;
            String[] strArr2 = A0D;
            if (strArr2[6].charAt(6) != strArr2[5].charAt(6)) {
                A0D[2] = "ymaFHNFZf9gck8KWGcKKw0IXvc03QQI3";
                int iA05 = c0914Hf2.A04();
                if (iA05 > 0) {
                    System.arraycopy(bArr, this.A0A.A06(), bArr, 0, iA05);
                }
                this.A0A.A0b(bArr, iA05);
                while (true) {
                    iA04 = this.A0A.A04();
                    if (A0D[3].charAt(10) != 'l') {
                        break;
                    }
                    String[] strArr3 = A0D;
                    strArr3[7] = "MGe5GBh04RQe2KloppfecB6ZEIGbEoYE";
                    strArr3[1] = "8AA3i6ilZVOjG9C6pEzYz1yKwgxBoNn5";
                    if (iA04 < 188) {
                        iA08 = this.A0A.A07();
                        strArr = A0D;
                        if (strArr[6].charAt(6) != strArr[5].charAt(6)) {
                            A0D[2] = "eAgKulLwfpKF0SfrtEP0OqsbKpe9pzNg";
                            i12 = bz.read(bArr, iA08, 9400 - iA08);
                            i13 = -1;
                            if (i12 == -1) {
                                return i13;
                            }
                            this.A0A.A0X(iA08 + i12);
                        } else {
                            A0D[2] = "ccJ4V0ZamX9fhOj5uoAuEbTRuDAY2nBM";
                            i12 = bz.read(bArr, iA08, 9400 - iA08);
                            i13 = -1;
                            if (i12 == -1) {
                                return i13;
                            }
                            this.A0A.A0X(iA08 + i12);
                        }
                    } else {
                        iA07 = this.A0A.A07();
                        limit = this.A0A.A06();
                        while (limit < iA07 && bArr[limit] != 71) {
                            limit++;
                        }
                        this.A0A.A0Y(limit);
                        position = limit + 188;
                        if (position > iA07) {
                            int i14 = this.A00 + (limit - limit);
                            this.A00 = i14;
                            if (this.A05 == 2 || i14 <= 376) {
                                return 0;
                            }
                            throw new C07249b(A0D(4, 58, 58));
                        }
                        this.A00 = 0;
                        pid = this.A0A.A08();
                        if ((8388608 & pid) != 0) {
                            c0914Hf = this.A0A;
                            if (A0D[2].charAt(24) != 'y') {
                                throw new RuntimeException();
                            }
                            A0D[2] = "qLJ3C4wpvTds0ZGN514bh2BsPTU2CCIl";
                            c0914Hf.A0Y(position);
                            return 0;
                        }
                        if ((4194304 & pid) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i10 = 2096896 & pid;
                        if (A0D[3].charAt(10) != 'l') {
                            continuityCounter = i10 >> 8;
                            if ((pid & 32) != 0) {
                                payloadUnitStartIndicator = true;
                            } else {
                                payloadUnitStartIndicator = false;
                            }
                        } else {
                            String[] strArr4 = A0D;
                            strArr4[6] = "UZBxTRohCkbmbL8TgZyccBrw6EXqioJ8";
                            strArr4[5] = "skRCCiBSOhxOXswyaciW8E5zJph5e4sW";
                            continuityCounter = i10 >> 8;
                            if ((pid & 32) != 0) {
                                payloadUnitStartIndicator = true;
                            } else {
                                payloadUnitStartIndicator = false;
                            }
                        }
                        payloadExists = (pid & 16) != 0;
                        if (payloadExists) {
                            interfaceC0805Ct = this.A06.get(continuityCounter);
                        } else {
                            interfaceC0805Ct = null;
                        }
                        if (interfaceC0805Ct == null) {
                            if (this.A05 != 2) {
                                endOfPacket = pid & 15;
                                i11 = this.A08.get(continuityCounter, endOfPacket - 1);
                                this.A08.put(continuityCounter, endOfPacket);
                                if (i11 == endOfPacket) {
                                    this.A0A.A0Y(position);
                                    return 0;
                                }
                                if (endOfPacket != ((i11 + 1) & 15)) {
                                    interfaceC0805Ct.AEk();
                                }
                            }
                            if (payloadUnitStartIndicator) {
                                this.A0A.A0Z(this.A0A.A0E());
                            }
                            this.A0A.A0X(position);
                            interfaceC0805Ct.A4O(this.A0A, z10);
                            this.A0A.A0X(iA07);
                            this.A0A.A0Y(position);
                            return 0;
                        }
                        this.A0A.A0Y(position);
                        return 0;
                    }
                }
            }
        } else {
            while (true) {
                iA04 = this.A0A.A04();
                if (A0D[3].charAt(10) != 'l') {
                    break;
                    break;
                }
                String[] strArr5 = A0D;
                strArr5[7] = "MGe5GBh04RQe2KloppfecB6ZEIGbEoYE";
                strArr5[1] = "8AA3i6ilZVOjG9C6pEzYz1yKwgxBoNn5";
                if (iA04 < 188) {
                    iA08 = this.A0A.A07();
                    strArr = A0D;
                    if (strArr[6].charAt(6) != strArr[5].charAt(6)) {
                        A0D[2] = "eAgKulLwfpKF0SfrtEP0OqsbKpe9pzNg";
                        i12 = bz.read(bArr, iA08, 9400 - iA08);
                        i13 = -1;
                        if (i12 == -1) {
                            return i13;
                        }
                        this.A0A.A0X(iA08 + i12);
                    } else {
                        A0D[2] = "ccJ4V0ZamX9fhOj5uoAuEbTRuDAY2nBM";
                        i12 = bz.read(bArr, iA08, 9400 - iA08);
                        i13 = -1;
                        if (i12 == -1) {
                            return i13;
                        }
                        this.A0A.A0X(iA08 + i12);
                    }
                } else {
                    iA07 = this.A0A.A07();
                    limit = this.A0A.A06();
                    while (limit < iA07) {
                        limit++;
                    }
                    this.A0A.A0Y(limit);
                    position = limit + 188;
                    if (position > iA07) {
                        int i15 = this.A00 + (limit - limit);
                        this.A00 = i15;
                        if (this.A05 == 2) {
                        }
                        return 0;
                    }
                    this.A00 = 0;
                    pid = this.A0A.A08();
                    if ((8388608 & pid) != 0) {
                        c0914Hf = this.A0A;
                        if (A0D[2].charAt(24) != 'y') {
                            throw new RuntimeException();
                        }
                        A0D[2] = "qLJ3C4wpvTds0ZGN514bh2BsPTU2CCIl";
                        c0914Hf.A0Y(position);
                        return 0;
                    }
                    if ((4194304 & pid) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i10 = 2096896 & pid;
                    if (A0D[3].charAt(10) != 'l') {
                        continuityCounter = i10 >> 8;
                        if ((pid & 32) != 0) {
                            payloadUnitStartIndicator = true;
                        } else {
                            payloadUnitStartIndicator = false;
                        }
                    } else {
                        String[] strArr6 = A0D;
                        strArr6[6] = "UZBxTRohCkbmbL8TgZyccBrw6EXqioJ8";
                        strArr6[5] = "skRCCiBSOhxOXswyaciW8E5zJph5e4sW";
                        continuityCounter = i10 >> 8;
                        if ((pid & 32) != 0) {
                            payloadUnitStartIndicator = true;
                        } else {
                            payloadUnitStartIndicator = false;
                        }
                    }
                    if ((pid & 16) != 0) {
                    }
                    if (payloadExists) {
                        interfaceC0805Ct = this.A06.get(continuityCounter);
                    } else {
                        interfaceC0805Ct = null;
                    }
                    if (interfaceC0805Ct == null) {
                        if (this.A05 != 2) {
                            endOfPacket = pid & 15;
                            i11 = this.A08.get(continuityCounter, endOfPacket - 1);
                            this.A08.put(continuityCounter, endOfPacket);
                            if (i11 == endOfPacket) {
                                this.A0A.A0Y(position);
                                return 0;
                            }
                            if (endOfPacket != ((i11 + 1) & 15)) {
                                interfaceC0805Ct.AEk();
                            }
                        }
                        if (payloadUnitStartIndicator) {
                            this.A0A.A0Z(this.A0A.A0E());
                        }
                        this.A0A.A0X(position);
                        interfaceC0805Ct.A4O(this.A0A, z10);
                        this.A0A.A0X(iA07);
                        this.A0A.A0Y(position);
                        return 0;
                    }
                    this.A0A.A0Y(position);
                    return 0;
                }
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEl(long j10, long j11) {
        int size = this.A0B.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0B.get(i10).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean AFV(BZ bz) throws InterruptedException, IOException {
        byte[] bArr = this.A0A.A00;
        bz.ADa(bArr, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int j10 = 0;
            while (true) {
                if (j10 == 5) {
                    bz.AFT(i10);
                    return true;
                }
                if (bArr[(j10 * 188) + i10] != 71) {
                    break;
                }
                j10++;
            }
        }
        return false;
    }
}
