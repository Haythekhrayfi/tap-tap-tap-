package c3;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f3572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a.InterfaceC0065a f3574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f3575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f3576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public short[] f3577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f3578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f3579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte[] f3580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f3581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f3583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bitmap f3584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3585n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3586o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Boolean f3590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bitmap.Config f3591t;

    public e(a.InterfaceC0065a interfaceC0065a) {
        this.f3573b = new int[256];
        this.f3591t = Bitmap.Config.ARGB_8888;
        this.f3574c = interfaceC0065a;
        this.f3583l = new c();
    }

    public e(a.InterfaceC0065a interfaceC0065a, c cVar, ByteBuffer byteBuffer) {
        this(interfaceC0065a, cVar, byteBuffer, 1);
    }

    public e(a.InterfaceC0065a interfaceC0065a, c cVar, ByteBuffer byteBuffer, int i10) {
        this(interfaceC0065a);
        synchronized (this) {
            try {
                if (i10 <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i10);
                }
                int iHighestOneBit = Integer.highestOneBit(i10);
                this.f3586o = 0;
                this.f3583l = cVar;
                this.f3582k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f3575d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f3575d.order(ByteOrder.LITTLE_ENDIAN);
                this.f3585n = false;
                Iterator<b> it = cVar.f3561e.iterator();
                while (it.hasNext()) {
                    if (it.next().f3552g == 3) {
                        this.f3585n = true;
                        break;
                    }
                }
                this.f3587p = iHighestOneBit;
                int i11 = cVar.f3562f;
                this.f3589r = i11 / iHighestOneBit;
                int i12 = cVar.f3563g;
                this.f3588q = i12 / iHighestOneBit;
                this.f3580i = ((s3.b) this.f3574c).a(i11 * i12);
                a.InterfaceC0065a interfaceC0065a2 = this.f3574c;
                int i13 = this.f3589r * this.f3588q;
                h3.b bVar = ((s3.b) interfaceC0065a2).f35412b;
                this.f3581j = bVar == null ? new int[i13] : (int[]) bVar.d(i13, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // c3.a
    public synchronized Bitmap a() {
        if (this.f3583l.f3559c <= 0 || this.f3582k < 0) {
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "Unable to decode frame, frameCount=" + this.f3583l.f3559c + ", framePointer=" + this.f3582k);
            }
            this.f3586o = 1;
        }
        int i10 = this.f3586o;
        if (i10 != 1 && i10 != 2) {
            this.f3586o = 0;
            if (this.f3576e == null) {
                this.f3576e = ((s3.b) this.f3574c).a(255);
            }
            b bVar = this.f3583l.f3561e.get(this.f3582k);
            int i11 = this.f3582k - 1;
            b bVar2 = i11 >= 0 ? this.f3583l.f3561e.get(i11) : null;
            int[] iArr = bVar.f3556k;
            if (iArr == null) {
                iArr = this.f3583l.f3557a;
            }
            this.f3572a = iArr;
            if (iArr != null) {
                if (bVar.f3551f) {
                    System.arraycopy(iArr, 0, this.f3573b, 0, iArr.length);
                    int[] iArr2 = this.f3573b;
                    this.f3572a = iArr2;
                    iArr2[bVar.f3553h] = 0;
                }
                return j(bVar, bVar2);
            }
            if (Log.isLoggable("e", 3)) {
                Log.d("e", "No valid color table found for frame #" + this.f3582k);
            }
            this.f3586o = 1;
            return null;
        }
        if (Log.isLoggable("e", 3)) {
            Log.d("e", "Unable to decode frame, status=" + this.f3586o);
        }
        return null;
    }

    @Override // c3.a
    public void b() {
        this.f3582k = (this.f3582k + 1) % this.f3583l.f3559c;
    }

    @Override // c3.a
    public int c() {
        return this.f3583l.f3559c;
    }

    @Override // c3.a
    public void clear() {
        h3.b bVar;
        h3.b bVar2;
        h3.b bVar3;
        this.f3583l = null;
        byte[] bArr = this.f3580i;
        if (bArr != null && (bVar3 = ((s3.b) this.f3574c).f35412b) != null) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f3581j;
        if (iArr != null && (bVar2 = ((s3.b) this.f3574c).f35412b) != null) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f3584m;
        if (bitmap != null) {
            ((s3.b) this.f3574c).f35411a.d(bitmap);
        }
        this.f3584m = null;
        this.f3575d = null;
        this.f3590s = null;
        byte[] bArr2 = this.f3576e;
        if (bArr2 == null || (bVar = ((s3.b) this.f3574c).f35412b) == null) {
            return;
        }
        bVar.put(bArr2);
    }

    @Override // c3.a
    public int d() {
        int i10;
        c cVar = this.f3583l;
        int i11 = cVar.f3559c;
        if (i11 <= 0 || (i10 = this.f3582k) < 0) {
            return 0;
        }
        if (i10 < 0 || i10 >= i11) {
            return -1;
        }
        return cVar.f3561e.get(i10).f3554i;
    }

    @Override // c3.a
    public ByteBuffer e() {
        return this.f3575d;
    }

    @Override // c3.a
    public int f() {
        return this.f3582k;
    }

    @Override // c3.a
    public int g() {
        return (this.f3581j.length * 4) + this.f3575d.limit() + this.f3580i.length;
    }

    public final Bitmap h() {
        Boolean bool = this.f3590s;
        Bitmap.Config config = (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f3591t;
        Bitmap bitmapC = ((s3.b) this.f3574c).f35411a.c(this.f3589r, this.f3588q, config);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    public void i(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f3591t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c A[LOOP:1: B:34:0x006a->B:35:0x006c, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v33, types: [short] */
    /* JADX WARN: Type inference failed for: r5v35 */
    public final Bitmap j(b bVar, b bVar2) {
        byte b10;
        Boolean bool;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        short s10;
        int i20;
        Bitmap bitmap;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int[] iArr = this.f3581j;
        byte b11 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f3584m;
            if (bitmap2 != null) {
                ((s3.b) this.f3574c).f35411a.d(bitmap2);
            }
            this.f3584m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f3552g == 3 && this.f3584m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i20 = bVar2.f3552g) > 0) {
            if (i20 == 2) {
                if (!bVar.f3551f) {
                    c cVar = this.f3583l;
                    i21 = cVar.f3567k;
                    if (bVar.f3556k != null && cVar.f3566j == bVar.f3553h) {
                    }
                    int i27 = bVar2.f3549d;
                    int i28 = this.f3587p;
                    int i29 = i27 / i28;
                    int i30 = bVar2.f3547b / i28;
                    i22 = bVar2.f3548c / i28;
                    int i31 = bVar2.f3546a / i28;
                    int i32 = this.f3589r;
                    i23 = (i30 * i32) + i31;
                    i24 = (i29 * i32) + i23;
                    while (i23 < i24) {
                        i25 = i23 + i22;
                        for (i26 = i23; i26 < i25; i26++) {
                            iArr[i26] = i21;
                        }
                        i23 += this.f3589r;
                    }
                } else if (this.f3582k == 0) {
                    this.f3590s = Boolean.TRUE;
                }
                i21 = 0;
                int i210 = bVar2.f3549d;
                int i211 = this.f3587p;
                int i212 = i210 / i211;
                int i33 = bVar2.f3547b / i211;
                i22 = bVar2.f3548c / i211;
                int i34 = bVar2.f3546a / i211;
                int i35 = this.f3589r;
                i23 = (i33 * i35) + i34;
                i24 = (i212 * i35) + i23;
                while (i23 < i24) {
                    i25 = i23 + i22;
                    while (i26 < i25) {
                        iArr[i26] = i21;
                    }
                    i23 += this.f3589r;
                }
            } else if (i20 == 3 && (bitmap = this.f3584m) != null) {
                int i36 = this.f3589r;
                bitmap.getPixels(iArr, 0, i36, 0, 0, i36, this.f3588q);
            }
        }
        this.f3575d.position(bVar.f3555j);
        int i37 = bVar.f3548c * bVar.f3549d;
        byte[] bArr = this.f3580i;
        if (bArr == null || bArr.length < i37) {
            this.f3580i = ((s3.b) this.f3574c).a(i37);
        }
        byte[] bArr2 = this.f3580i;
        if (this.f3577f == null) {
            this.f3577f = new short[4096];
        }
        short[] sArr = this.f3577f;
        if (this.f3578g == null) {
            this.f3578g = new byte[4096];
        }
        byte[] bArr3 = this.f3578g;
        if (this.f3579h == null) {
            this.f3579h = new byte[4097];
        }
        byte[] bArr4 = this.f3579h;
        int i38 = this.f3575d.get() & 255;
        int i39 = 1 << i38;
        int i40 = i39 + 1;
        int i41 = i39 + 2;
        int i42 = i38 + 1;
        int i43 = (1 << i42) - 1;
        for (int i44 = 0; i44 < i39; i44++) {
            sArr[i44] = 0;
            bArr3[i44] = (byte) i44;
        }
        byte[] bArr5 = this.f3576e;
        e eVar = this;
        int i45 = i42;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = i41;
        int i55 = i43;
        int i56 = -1;
        while (true) {
            if (i46 >= i37) {
                iArr = iArr;
                b10 = b11;
                break;
            }
            if (i48 == 0) {
                int i57 = eVar.f3575d.get() & 255;
                if (i57 > 0) {
                    ByteBuffer byteBuffer = eVar.f3575d;
                    byteBuffer.get(eVar.f3576e, 0, Math.min(i57, byteBuffer.remaining()));
                }
                if (i57 <= 0) {
                    eVar.f3586o = 3;
                    b10 = 0;
                    break;
                }
                i48 = i57;
                i49 = 0;
            } else {
                i42 = i42;
                i46 = i46;
                iArr = iArr;
                i56 = i56;
            }
            i51 += (bArr5[i49] & 255) << i50;
            i49++;
            i48--;
            int i58 = i50 + 8;
            int i59 = i54;
            int i60 = i45;
            i46 = i46;
            i56 = i56;
            byte[] bArr6 = bArr5;
            i52 = i52;
            while (true) {
                if (i58 < i60) {
                    eVar = this;
                    break;
                }
                e eVar2 = eVar;
                int i61 = i51 & i55;
                i51 >>= i60;
                i58 -= i60;
                if (i61 == i39) {
                    i18 = i58;
                    i59 = i41;
                    i55 = i43;
                    eVar = eVar2;
                    i60 = i42;
                    i56 = -1;
                    i19 = i52;
                } else {
                    if (i61 == i40) {
                        eVar = eVar2;
                        break;
                    }
                    i18 = i58;
                    if (i56 == -1) {
                        bArr2[i47] = bArr3[i61];
                        i47++;
                        i46++;
                        i52 = i61;
                        i56 = i52;
                        i58 = i18;
                        eVar = this;
                    } else {
                        if (i61 >= i59) {
                            bArr4[i53] = (byte) i52;
                            i53++;
                            s10 = i56;
                        } else {
                            s10 = i61;
                        }
                        while (s10 >= i39) {
                            bArr4[i53] = bArr3[s10];
                            i53++;
                            s10 = sArr[s10];
                        }
                        int i62 = bArr3[s10] & 255;
                        byte b12 = (byte) i62;
                        bArr2[i47] = b12;
                        while (true) {
                            i47++;
                            i46++;
                            if (i53 <= 0) {
                                break;
                            }
                            i53--;
                            bArr2[i47] = bArr4[i53];
                        }
                        i19 = i62;
                        if (i59 < 4096) {
                            sArr[i59] = (short) i56;
                            bArr3[i59] = b12;
                            i59++;
                            if ((i59 & i55) == 0 && i59 < 4096) {
                                i60++;
                                i55 += i59;
                            }
                        }
                        i56 = i61;
                        eVar = this;
                    }
                }
                i52 = i19;
                i58 = i18;
            }
            i45 = i60;
            i54 = i59;
            bArr5 = bArr6;
            i42 = i42;
            b11 = 0;
            i50 = i58;
            iArr = iArr;
        }
        Arrays.fill(bArr2, i47, i37, b10);
        if (bVar.f3550e || this.f3587p != 1) {
            int[] iArr2 = this.f3581j;
            int i63 = bVar.f3549d;
            int i64 = this.f3587p;
            int i65 = i63 / i64;
            int i66 = bVar.f3547b / i64;
            int i67 = bVar.f3548c / i64;
            int i68 = bVar.f3546a / i64;
            boolean z10 = this.f3582k == 0;
            int i69 = this.f3589r;
            int i70 = this.f3588q;
            byte[] bArr7 = this.f3580i;
            int[] iArr3 = this.f3572a;
            Boolean bool2 = this.f3590s;
            int i71 = 8;
            int i72 = 0;
            int i73 = 0;
            int i74 = 1;
            while (true) {
                bool = bool2;
                if (i72 >= i65) {
                    break;
                }
                if (bVar.f3550e) {
                    if (i73 >= i65) {
                        int i75 = i74 + 1;
                        i10 = i65;
                        if (i75 == 2) {
                            i73 = 4;
                            i74 = i75;
                        } else if (i75 != 3) {
                            i74 = i75;
                            if (i75 == 4) {
                                i73 = 1;
                                i71 = 2;
                            }
                        } else {
                            i71 = 4;
                            i74 = i75;
                            i73 = 2;
                        }
                    } else {
                        i10 = i65;
                    }
                    i11 = i73 + i71;
                } else {
                    i10 = i65;
                    i11 = i73;
                    i73 = i72;
                }
                int i76 = i73 + i66;
                boolean z11 = i64 == 1;
                if (i76 < i70) {
                    int i77 = i76 * i69;
                    int i78 = i77 + i68;
                    int i79 = i78 + i67;
                    int i80 = i77 + i69;
                    if (i80 < i79) {
                        i79 = i80;
                    }
                    int i81 = i72 * i64 * bVar.f3548c;
                    if (z11) {
                        bool2 = bool;
                        int i82 = i78;
                        while (true) {
                            i12 = i67;
                            if (i82 >= i79) {
                                break;
                            }
                            int i83 = iArr3[bArr7[i81] & 255];
                            if (i83 != 0) {
                                iArr2[i82] = i83;
                            } else if (z10 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i81 += i64;
                            i82++;
                            i67 = i12;
                        }
                    } else {
                        i12 = i67;
                        int i84 = ((i79 - i78) * i64) + i81;
                        bool2 = bool;
                        int i85 = i78;
                        while (i85 < i79) {
                            int i86 = i79;
                            int i87 = bVar.f3548c;
                            int i88 = i68;
                            int i89 = i69;
                            int i90 = i81;
                            int i91 = 0;
                            int i92 = 0;
                            int i93 = 0;
                            int i94 = 0;
                            int i95 = 0;
                            while (true) {
                                if (i90 >= this.f3587p + i81) {
                                    i16 = i70;
                                    break;
                                }
                                byte[] bArr8 = this.f3580i;
                                i16 = i70;
                                if (i90 >= bArr8.length || i90 >= i84) {
                                    break;
                                }
                                int i96 = this.f3572a[bArr8[i90] & 255];
                                if (i96 != 0) {
                                    i91 += (i96 >> 24) & 255;
                                    i92 += (i96 >> 16) & 255;
                                    i93 += (i96 >> 8) & 255;
                                    i94 += i96 & 255;
                                    i95++;
                                }
                                i90++;
                                i70 = i16;
                            }
                            int i97 = i87 + i81;
                            for (int i98 = i97; i98 < this.f3587p + i97; i98++) {
                                byte[] bArr9 = this.f3580i;
                                if (i98 >= bArr9.length || i98 >= i84) {
                                    break;
                                }
                                int i99 = this.f3572a[bArr9[i98] & 255];
                                if (i99 != 0) {
                                    i91 += (i99 >> 24) & 255;
                                    i92 += (i99 >> 16) & 255;
                                    i93 += (i99 >> 8) & 255;
                                    i94 += i99 & 255;
                                    i95++;
                                }
                            }
                            int i100 = i95 == 0 ? 0 : ((i91 / i95) << 24) | ((i92 / i95) << 16) | ((i93 / i95) << 8) | (i94 / i95);
                            if (i100 != 0) {
                                iArr2[i85] = i100;
                            } else if (z10 && bool2 == null) {
                                bool2 = Boolean.TRUE;
                            }
                            i81 += i64;
                            i85++;
                            i79 = i86;
                            i68 = i88;
                            i69 = i89;
                            i70 = i16;
                        }
                    }
                    i13 = i68;
                    i14 = i69;
                    i15 = i70;
                } else {
                    i12 = i67;
                    i13 = i68;
                    i14 = i69;
                    i15 = i70;
                    bool2 = bool;
                }
                i72++;
                i65 = i10;
                i73 = i11;
                i66 = i66;
                i67 = i12;
                i68 = i13;
                i69 = i14;
                i70 = i15;
            }
            if (this.f3590s == null) {
                this.f3590s = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr4 = this.f3581j;
            int i101 = bVar.f3549d;
            int i102 = bVar.f3547b;
            int i103 = bVar.f3548c;
            int i104 = bVar.f3546a;
            byte b13 = this.f3582k == 0 ? (byte) 1 : b10;
            int i105 = this.f3589r;
            byte[] bArr10 = this.f3580i;
            int[] iArr5 = this.f3572a;
            byte b14 = -1;
            for (int i106 = b10; i106 < i101; i106++) {
                int i107 = (i106 + i102) * i105;
                int i108 = i107 + i104;
                int i109 = i108 + i103;
                int i110 = i107 + i105;
                if (i110 < i109) {
                    i109 = i110;
                }
                int i111 = bVar.f3548c * i106;
                while (true) {
                    int i112 = i101;
                    if (i108 < i109) {
                        byte b15 = bArr10[i111];
                        int i113 = i102;
                        int i114 = b15 & 255;
                        if (i114 != b14) {
                            int i115 = iArr5[i114];
                            if (i115 != 0) {
                                iArr4[i108] = i115;
                            } else {
                                b14 = b15;
                            }
                        }
                        i111++;
                        i108++;
                        i101 = i112;
                        i102 = i113;
                    }
                }
            }
            this.f3590s = Boolean.valueOf((this.f3590s != null || b13 == 0 || b14 == -1) ? false : true);
        }
        if (this.f3585n && ((i17 = bVar.f3552g) == 0 || i17 == 1)) {
            if (this.f3584m == null) {
                this.f3584m = h();
            }
            Bitmap bitmap3 = this.f3584m;
            int i116 = this.f3589r;
            bitmap3.setPixels(iArr, 0, i116, 0, 0, i116, this.f3588q);
        }
        Bitmap bitmapH = h();
        int i117 = this.f3589r;
        bitmapH.setPixels(iArr, 0, i117, 0, 0, i117, this.f3588q);
        return bitmapH;
    }
}
