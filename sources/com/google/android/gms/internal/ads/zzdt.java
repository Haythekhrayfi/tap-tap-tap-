package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzdt {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzdt(int i10, int i11, float f10, float f11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = f10;
        this.zzd = f11;
        this.zze = i10 / i12;
        this.zzf = i10 / 400;
        int i13 = i10 / 65;
        this.zzg = i13;
        int i14 = i13 + i13;
        this.zzh = i14;
        this.zzi = new short[i14];
        int i15 = i14 * i11;
        this.zzj = new short[i15];
        this.zzl = new short[i15];
        this.zzn = new short[i15];
    }

    private final int zzg(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.zzb;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
            }
            int i19 = iAbs * i16;
            int i20 = i14 * i11;
            if (i19 < i20) {
                i14 = iAbs;
            }
            if (i19 < i20) {
                i16 = i11;
            }
            int i21 = iAbs * i15;
            int i22 = i17 * i11;
            if (i21 > i22) {
                i17 = iAbs;
            }
            if (i21 > i22) {
                i15 = i11;
            }
            i11++;
        }
        this.zzu = i14 / i16;
        this.zzv = i17 / i15;
        return i16;
    }

    private final void zzh(short[] sArr, int i10, int i11) {
        short[] sArrZzl = zzl(this.zzl, this.zzm, i11);
        this.zzl = sArrZzl;
        int i12 = this.zzb;
        System.arraycopy(sArr, i10 * i12, sArrZzl, this.zzm * i12, i12 * i11);
        this.zzm += i11;
    }

    private final void zzi(short[] sArr, int i10, int i11) {
        int i12 = this.zzh / i11;
        int i13 = this.zzb;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.zzi[i16] = (short) (i17 / i14);
        }
    }

    private static void zzj(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i16])) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    private final void zzk() {
        int iZzg;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.zzm;
        float f10 = this.zzc;
        float f11 = this.zzd;
        float f12 = f10 / f11;
        float f13 = this.zze * f11;
        double d10 = f12;
        float f14 = 1.0f;
        int i18 = 1;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i19 = this.zzk;
            if (i19 >= this.zzh) {
                int i20 = 0;
                while (true) {
                    int i21 = this.zzr;
                    if (i21 > 0) {
                        int iMin = Math.min(this.zzh, i21);
                        zzh(this.zzj, i20, iMin);
                        this.zzr -= iMin;
                        i20 += iMin;
                    } else {
                        short[] sArr = this.zzj;
                        int i22 = this.zza;
                        int i23 = i22 > 4000 ? i22 / 4000 : i18;
                        if (this.zzb == i18 && i23 == i18) {
                            iZzg = zzg(sArr, i20, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i20, i23);
                            int iZzg2 = zzg(this.zzi, 0, this.zzf / i23, this.zzg / i23);
                            if (i23 != i18) {
                                int i24 = iZzg2 * i23;
                                int i25 = i23 * 4;
                                int i26 = this.zzf;
                                int i27 = i24 - i25;
                                if (i27 >= i26) {
                                    i26 = i27;
                                }
                                int i28 = i24 + i25;
                                int i29 = this.zzg;
                                if (i28 > i29) {
                                    i28 = i29;
                                }
                                if (this.zzb == i18) {
                                    iZzg = zzg(sArr, i20, i26, i28);
                                } else {
                                    zzi(sArr, i20, i18);
                                    iZzg = zzg(this.zzi, 0, i26, i28);
                                }
                            } else {
                                iZzg = iZzg2;
                            }
                        }
                        int i30 = this.zzu;
                        int i31 = (i30 == 0 || (i12 = this.zzs) == 0 || this.zzv > i30 * 3 || i30 + i30 <= this.zzt * 3) ? iZzg : i12;
                        this.zzt = i30;
                        this.zzs = iZzg;
                        if (d10 > 1.0d) {
                            short[] sArr2 = this.zzj;
                            if (f12 >= 2.0f) {
                                i11 = (int) (i31 / ((-1.0f) + f12));
                            } else {
                                this.zzr = (int) ((i31 * (2.0f - f12)) / ((-1.0f) + f12));
                                i11 = i31;
                            }
                            short[] sArrZzl = zzl(this.zzl, this.zzm, i11);
                            this.zzl = sArrZzl;
                            int i32 = i11;
                            zzj(i11, this.zzb, sArrZzl, this.zzm, sArr2, i20, sArr2, i20 + i31);
                            this.zzm += i32;
                            i20 = i31 + i32 + i20;
                        } else {
                            int i33 = i31;
                            short[] sArr3 = this.zzj;
                            if (f12 < 0.5f) {
                                i10 = (int) ((i33 * f12) / (f14 - f12));
                            } else {
                                this.zzr = (int) ((((f12 + f12) - 1.0f) * i33) / (f14 - f12));
                                i10 = i33;
                            }
                            int i34 = i33 + i10;
                            short[] sArrZzl2 = zzl(this.zzl, this.zzm, i34);
                            this.zzl = sArrZzl2;
                            int i35 = this.zzb;
                            System.arraycopy(sArr3, i20 * i35, sArrZzl2, this.zzm * i35, i35 * i33);
                            zzj(i10, this.zzb, this.zzl, this.zzm + i33, sArr3, i20 + i33, sArr3, i20);
                            this.zzm += i34;
                            i20 += i10;
                        }
                    }
                    if (this.zzh + i20 > i19) {
                        break;
                    }
                    f14 = 1.0f;
                    i18 = 1;
                }
                int i36 = this.zzk - i20;
                short[] sArr4 = this.zzj;
                int i37 = this.zzb;
                System.arraycopy(sArr4, i20 * i37, sArr4, 0, i37 * i36);
                this.zzk = i36;
                f14 = 1.0f;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        if (f13 == f14 || this.zzm == i17) {
            return;
        }
        int i38 = this.zza;
        int i39 = (int) (i38 / f13);
        while (true) {
            if (i39 <= 16384 && i38 <= 16384) {
                break;
            }
            i39 /= 2;
            i38 /= 2;
        }
        int i40 = this.zzm - i17;
        short[] sArrZzl3 = zzl(this.zzn, this.zzo, i40);
        this.zzn = sArrZzl3;
        short[] sArr5 = this.zzl;
        int i41 = this.zzb;
        System.arraycopy(sArr5, i17 * i41, sArrZzl3, this.zzo * i41, i41 * i40);
        this.zzm = i17;
        this.zzo += i40;
        int i42 = 0;
        while (true) {
            i13 = this.zzo;
            i14 = i13 - 1;
            if (i42 >= i14) {
                break;
            }
            while (true) {
                i15 = this.zzp + 1;
                int i43 = i15 * i39;
                i16 = this.zzq;
                if (i43 <= i16 * i38) {
                    break;
                }
                this.zzl = zzl(this.zzl, this.zzm, 1);
                int i44 = 0;
                while (true) {
                    int i45 = this.zzb;
                    if (i44 < i45) {
                        short[] sArr6 = this.zzl;
                        int i46 = this.zzm * i45;
                        short[] sArr7 = this.zzn;
                        int i47 = (i42 * i45) + i44;
                        short s10 = sArr7[i47];
                        short s11 = sArr7[i47 + i45];
                        int i48 = this.zzq * i38;
                        int i49 = this.zzp;
                        int i50 = i49 * i39;
                        int i51 = (i49 + 1) * i39;
                        int i52 = i51 - i48;
                        int i53 = i51 - i50;
                        sArr6[i46 + i44] = (short) ((((i53 - i52) * s11) + (s10 * i52)) / i53);
                        i44++;
                    }
                }
                this.zzq++;
                this.zzm++;
            }
            this.zzp = i15;
            if (i15 == i38) {
                this.zzp = 0;
                zzdy.zzf(i16 == i39);
                this.zzq = 0;
            }
            i42++;
        }
        if (i14 != 0) {
            short[] sArr8 = this.zzn;
            int i54 = this.zzb;
            System.arraycopy(sArr8, i14 * i54, sArr8, 0, (i13 - i14) * i54);
            this.zzo -= i14;
        }
    }

    private final short[] zzl(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.zzb;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int zza() {
        int i10 = this.zzm * this.zzb;
        return i10 + i10;
    }

    public final int zzb() {
        int i10 = this.zzk * this.zzb;
        return i10 + i10;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * iMin);
        int i10 = this.zzm - iMin;
        this.zzm = i10;
        short[] sArr = this.zzl;
        int i11 = this.zzb;
        System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
    }

    public final void zze() {
        int i10;
        int i11 = this.zzk;
        float f10 = this.zzc;
        float f11 = this.zzd;
        int i12 = this.zzm + ((int) ((((i11 / (f10 / f11)) + this.zzo) / (this.zze * f11)) + 0.5f));
        short[] sArr = this.zzj;
        int i13 = this.zzh;
        this.zzj = zzl(sArr, i11, i13 + i13 + i11);
        int i14 = 0;
        while (true) {
            int i15 = this.zzh;
            i10 = i15 + i15;
            int i16 = this.zzb;
            if (i14 >= i10 * i16) {
                break;
            }
            this.zzj[(i16 * i11) + i14] = 0;
            i14++;
        }
        this.zzk += i10;
        zzk();
        if (this.zzm > i12) {
            this.zzm = i12;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i10 = this.zzb;
        int i11 = iRemaining / i10;
        int i12 = i10 * i11;
        short[] sArrZzl = zzl(this.zzj, this.zzk, i11);
        this.zzj = sArrZzl;
        shortBuffer.get(sArrZzl, this.zzk * this.zzb, (i12 + i12) / 2);
        this.zzk += i11;
        zzk();
    }
}
